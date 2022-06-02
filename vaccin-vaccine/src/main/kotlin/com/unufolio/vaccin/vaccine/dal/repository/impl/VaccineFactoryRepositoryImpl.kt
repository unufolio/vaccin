package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.toolkit.Wrappers
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dal.mapper.VaccineFactoryMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO
import com.unufolio.vaccin.vaccine.util.PageUtils
import org.springframework.stereotype.Repository
import java.util.*

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Repository
class VaccineFactoryRepositoryImpl(val vaccineFactoryMapper: VaccineFactoryMapper) : VaccineFactoryRepository {

    override fun save(vaccineManufactureDO: VaccineManufactureDO): Int {
        return vaccineFactoryMapper.insert(vaccineManufactureDO);
    }

    override fun delete(vaccineManufactureDO: VaccineManufactureDO): Int {
        val queryWrapper = Wrappers.emptyWrapper<VaccineManufactureDO>()
            .eq("code", vaccineManufactureDO.code);
        return vaccineFactoryMapper.delete(queryWrapper)
    }

    override fun update(vaccineManufactureDO: VaccineManufactureDO): Int {
        return vaccineFactoryMapper.updateById(vaccineManufactureDO)
    }

    override fun selectFirstByCode(code: String): VaccineManufactureDO? {
        return selectFirst(VaccineManufactureDO(code = code))
    }

    fun selectOne(vaccineManufactureDO: VaccineManufactureDO): VaccineManufactureDO {
        val queryWrapper = Wrappers.query(vaccineManufactureDO)
        return vaccineFactoryMapper.selectOne(queryWrapper)
    }

    override fun selectFirst(vaccineManufactureDO: VaccineManufactureDO): VaccineManufactureDO? {
        return vaccineFactoryMapper.selectOne(queryWrapper(vaccineManufactureDO).last("LIMIT 1"))
    }

    override fun exist(vaccineManufactureDO: VaccineManufactureDO): Boolean {
        return vaccineFactoryMapper.exists(queryWrapper(vaccineManufactureDO))
    }

    override fun existNotThisCode(vaccineManufactureDO: VaccineManufactureDO): Boolean {
        return vaccineFactoryMapper.exists(queryNotThisCodeWrapper(vaccineManufactureDO))
    }

    private fun queryWrapper(vaccineManufactureDO: VaccineManufactureDO): QueryWrapper<VaccineManufactureDO> {
        return Wrappers.emptyWrapper<VaccineManufactureDO>().eq(
            Objects.nonNull(vaccineManufactureDO.code),
            "code",
            vaccineManufactureDO.code
        ).eq(
            Objects.nonNull(vaccineManufactureDO.name),
            "name",
            vaccineManufactureDO.name
        ).eq(
            Objects.nonNull(vaccineManufactureDO.nameEn),
            "name_en",
            vaccineManufactureDO.nameEn
        ).eq(
            Objects.nonNull(vaccineManufactureDO.namePinyin),
            "name_pinyin",
            vaccineManufactureDO.namePinyin
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortName),
            "short_name",
            vaccineManufactureDO.shortName
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortNameEn),
            "short_name_en",
            vaccineManufactureDO.shortNameEn
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
            "short_name_pinyin",
            vaccineManufactureDO.shortNamePinyin
        )
    }

    private fun queryLikeWrapper(vaccineManufactureDO: VaccineManufactureDO): QueryWrapper<VaccineManufactureDO> {
        return Wrappers.emptyWrapper<VaccineManufactureDO>().like(
            Objects.nonNull(vaccineManufactureDO.code),
            "code",
            vaccineManufactureDO.code
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.name),
            "name",
            vaccineManufactureDO.name
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.nameEn),
            "name_en",
            vaccineManufactureDO.nameEn
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.namePinyin),
            "name_pinyin",
            vaccineManufactureDO.namePinyin
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.shortName),
            "short_name",
            vaccineManufactureDO.shortName
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.shortNameEn),
            "short_name_en",
            vaccineManufactureDO.shortNameEn
        ).or().like(
            Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
            "short_name_pinyin",
            vaccineManufactureDO.shortNamePinyin
        )
    }

    private fun queryNotThisCodeWrapper(vaccineManufactureDO: VaccineManufactureDO): QueryWrapper<VaccineManufactureDO> {
        return Wrappers.emptyWrapper<VaccineManufactureDO>().eq(
            Objects.nonNull(vaccineManufactureDO.name),
            "name",
            vaccineManufactureDO.name
        ).eq(
            Objects.nonNull(vaccineManufactureDO.nameEn),
            "name_en",
            vaccineManufactureDO.nameEn
        ).eq(
            Objects.nonNull(vaccineManufactureDO.namePinyin),
            "name_pinyin",
            vaccineManufactureDO.namePinyin
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortName),
            "short_name",
            vaccineManufactureDO.shortName
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortNameEn),
            "short_name_en",
            vaccineManufactureDO.shortNameEn
        ).eq(
            Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
            "short_name_pinyin",
            vaccineManufactureDO.shortNamePinyin
        ).not(
            Objects.nonNull(vaccineManufactureDO.code)
        ) {
            it.eq(
                "code", vaccineManufactureDO.code
            )
        }
    }


    override fun list(vaccineManufactureDO: VaccineManufactureDO): List<VaccineManufactureDO> {
        return vaccineFactoryMapper.selectList(queryLikeWrapper(vaccineManufactureDO))
    }

    override fun page(vaccineManufactureDO: VaccineManufactureDO): IPage<VaccineManufactureDO> {
        val page = Page.of<VaccineManufactureDO>(1, 1)
        val selectPage = vaccineFactoryMapper.selectPage(page, queryLikeWrapper(vaccineManufactureDO))
        return PageUtils.toIPage(selectPage)
    }

}