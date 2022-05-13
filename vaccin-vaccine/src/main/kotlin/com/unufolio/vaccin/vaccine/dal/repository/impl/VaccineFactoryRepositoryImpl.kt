package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.conditions.Wrapper
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
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
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>()
            .eq(VaccineFactoryDO::code, vaccineFactoryDO.code)
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
        return vaccineFactoryMapper.exists(queryWrapperNotThisCode(vaccineFactoryDO))
    }

    private fun queryWrapper(vaccineFactoryDO: VaccineFactoryDO): LambdaQueryWrapper<VaccineFactoryDO> {
        return Wrappers.lambdaQuery<VaccineFactoryDO>()
            .eq(
                Objects.nonNull(vaccineFactoryDO.code),
                VaccineFactoryDO::code,
                vaccineFactoryDO.code
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.name),
                VaccineFactoryDO::name,
                vaccineFactoryDO.name
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.nameEn),
                VaccineFactoryDO::nameEn,
                vaccineFactoryDO.nameEn
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.namePinyin),
                VaccineFactoryDO::namePinyin,
                vaccineFactoryDO.namePinyin
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortName),
                VaccineFactoryDO::shortName,
                vaccineFactoryDO.shortName
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortNameEn),
                VaccineFactoryDO::shortNameEn,
                vaccineFactoryDO.shortNameEn
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortNamePinyin),
                VaccineFactoryDO::shortNamePinyin,
                vaccineFactoryDO.shortNamePinyin
            )
    }

    private fun queryWrapperNotThisCode(vaccineFactoryDO: VaccineFactoryDO): Wrapper<VaccineFactoryDO> {
        return Wrappers.lambdaQuery<VaccineFactoryDO>()
            .eq(
                Objects.nonNull(vaccineFactoryDO.name),
                VaccineFactoryDO::name,
                vaccineFactoryDO.name
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.nameEn),
                VaccineFactoryDO::nameEn,
                vaccineFactoryDO.nameEn
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.namePinyin),
                VaccineFactoryDO::namePinyin,
                vaccineFactoryDO.namePinyin
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortName),
                VaccineFactoryDO::shortName,
                vaccineFactoryDO.shortName
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortNameEn),
                VaccineFactoryDO::shortNameEn,
                vaccineFactoryDO.shortNameEn
            )
            .eq(
                Objects.nonNull(vaccineFactoryDO.shortNamePinyin),
                VaccineFactoryDO::shortNamePinyin,
                vaccineFactoryDO.shortNamePinyin
            )
            .not(
                Objects.nonNull(vaccineFactoryDO.code)
            ) {
                it.eq(
                    VaccineFactoryDO::code,
                    vaccineFactoryDO.code
                )
            }
    }


    override fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO> {
        return vaccineFactoryMapper.selectList(queryWrapper(vaccineFactoryDO))
    }

    override fun page(vaccineFactoryDO: VaccineFactoryDO): IPage<VaccineFactoryDO> {
        val page = Page.of<VaccineFactoryDO>(1, 1)
        val selectPage = vaccineFactoryMapper.selectPage(page, queryWrapper(vaccineFactoryDO))
        return PageUtils.toIPage(selectPage)
    }

}