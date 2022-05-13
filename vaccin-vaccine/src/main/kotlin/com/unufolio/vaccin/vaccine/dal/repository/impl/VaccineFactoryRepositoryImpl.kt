package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.conditions.Wrapper
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.toolkit.Wrappers
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dal.mapper.VaccineFactoryMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.util.PageUtils
import org.springframework.stereotype.Repository
import java.util.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Repository
class VaccineFactoryRepositoryImpl(val vaccineFactoryMapper: VaccineFactoryMapper) : VaccineFactoryRepository {

    override fun save(vaccineFactoryDO: VaccineFactoryDO): Int {
        return vaccineFactoryMapper.insert(vaccineFactoryDO);
    }

    override fun delete(vaccineFactoryDO: VaccineFactoryDO): Int {
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>().eq(VaccineFactoryDO::code, vaccineFactoryDO.code)
        return vaccineFactoryMapper.delete(queryWrapper)
    }

    override fun update(vaccineFactoryDO: VaccineFactoryDO): Int {
        return vaccineFactoryMapper.updateById(vaccineFactoryDO)
    }

    override fun selectFirstByCode(code: String): VaccineFactoryDO? {
        return selectFirst(VaccineFactoryDO(code = code))
    }

    fun selectOne(vaccineFactoryDO: VaccineFactoryDO): VaccineFactoryDO {
        val queryWrapper = Wrappers.query(vaccineFactoryDO)
        return vaccineFactoryMapper.selectOne(queryWrapper)
    }

    override fun selectFirst(vaccineFactoryDO: VaccineFactoryDO): VaccineFactoryDO? {
        return vaccineFactoryMapper.selectOne(queryWrapper(vaccineFactoryDO).last("LIMIT 1"))
    }

    override fun exist(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        return vaccineFactoryMapper.exists(queryWrapper(vaccineFactoryDO))
    }

    override fun existNotThisCode(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        return vaccineFactoryMapper.exists(queryNotThisCodeWrapper(vaccineFactoryDO))
    }

    private fun queryWrapper(vaccineFactoryDO: VaccineFactoryDO): QueryWrapper<VaccineFactoryDO> {
        return Wrappers.query<VaccineFactoryDO>().eq(
            Objects.nonNull(vaccineFactoryDO.code), "code", vaccineFactoryDO.code
        ).eq(
            Objects.nonNull(vaccineFactoryDO.name), "name", vaccineFactoryDO.name
        ).eq(
            Objects.nonNull(vaccineFactoryDO.nameEn), "name_en", vaccineFactoryDO.nameEn
        ).eq(
            Objects.nonNull(vaccineFactoryDO.namePinyin), "name_pinyin", vaccineFactoryDO.namePinyin
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortName), "short_name", vaccineFactoryDO.shortName
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortNameEn), "short_name_en", vaccineFactoryDO.shortNameEn
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin), "short_name_pinyin", vaccineFactoryDO.shortNamePinyin
        )
    }

    private fun queryLikeWrapper(vaccineFactoryDO: VaccineFactoryDO): QueryWrapper<VaccineFactoryDO> {
        return Wrappers.query<VaccineFactoryDO>().like(
            Objects.nonNull(vaccineFactoryDO.code), "code", vaccineFactoryDO.code
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.name), "name", vaccineFactoryDO.name
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.nameEn), "name_en", vaccineFactoryDO.nameEn
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.namePinyin), "name_pinyin", vaccineFactoryDO.namePinyin
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.shortName), "short_name", vaccineFactoryDO.shortName
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.shortNameEn), "short_name_nn", vaccineFactoryDO.shortNameEn
        ).or().like(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin), "short_name_pinyin", vaccineFactoryDO.shortNamePinyin
        )
    }

    private fun queryNotThisCodeWrapper(vaccineFactoryDO: VaccineFactoryDO): QueryWrapper<VaccineFactoryDO> {
        return Wrappers.query<VaccineFactoryDO>().eq(
            Objects.nonNull(vaccineFactoryDO.name), "name", vaccineFactoryDO.name
        ).eq(
            Objects.nonNull(vaccineFactoryDO.nameEn), "name_en", vaccineFactoryDO.nameEn
        ).eq(
            Objects.nonNull(vaccineFactoryDO.namePinyin), "name_pinyin", vaccineFactoryDO.namePinyin
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortName), "short_name", vaccineFactoryDO.shortName
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortNameEn), "short_name_en", vaccineFactoryDO.shortNameEn
        ).eq(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin), "short_name_pinyin", vaccineFactoryDO.shortNamePinyin
        ).not(Objects.nonNull(vaccineFactoryDO.code)) {
            it.eq("code", vaccineFactoryDO.code)
        }
    }


    override fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO> {
        return vaccineFactoryMapper.selectList(queryLikeWrapper(vaccineFactoryDO))
    }

    override fun page(vaccineFactoryDO: VaccineFactoryDO): IPage<VaccineFactoryDO> {
        val page = Page.of<VaccineFactoryDO>(1, 1)
        val selectPage = vaccineFactoryMapper.selectPage(page, queryLikeWrapper(vaccineFactoryDO))
        return PageUtils.toIPage(selectPage)
    }

}