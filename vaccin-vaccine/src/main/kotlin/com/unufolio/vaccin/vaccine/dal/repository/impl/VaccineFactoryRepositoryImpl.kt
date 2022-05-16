package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.conditions.Wrapper
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
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
        val queryWrapper = Wrappers.lambdaQuery<VaccineManufactureDO>()
            .eq(VaccineManufactureDO::code, vaccineManufactureDO.code)
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

    private fun queryWrapper(vaccineManufactureDO: VaccineManufactureDO): LambdaQueryWrapper<VaccineManufactureDO> {
        return Wrappers.lambdaQuery<VaccineManufactureDO>()
            .eq(
                Objects.nonNull(vaccineManufactureDO.code),
                VaccineManufactureDO::code,
                vaccineManufactureDO.code
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.name),
                VaccineManufactureDO::name,
                vaccineManufactureDO.name
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.nameEn),
                VaccineManufactureDO::nameEn,
                vaccineManufactureDO.nameEn
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.namePinyin),
                VaccineManufactureDO::namePinyin,
                vaccineManufactureDO.namePinyin
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortName),
                VaccineManufactureDO::shortName,
                vaccineManufactureDO.shortName
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortNameEn),
                VaccineManufactureDO::shortNameEn,
                vaccineManufactureDO.shortNameEn
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
                VaccineManufactureDO::shortNamePinyin,
                vaccineManufactureDO.shortNamePinyin
            )
    }

    private fun queryLikeWrapper(vaccineManufactureDO: VaccineManufactureDO): LambdaQueryWrapper<VaccineManufactureDO> {
        return Wrappers.lambdaQuery<VaccineManufactureDO>()
            .like(
                Objects.nonNull(vaccineManufactureDO.code),
                VaccineManufactureDO::code,
                vaccineManufactureDO.code
            ).or().like(
                Objects.nonNull(vaccineManufactureDO.name),
                VaccineManufactureDO::name,
                vaccineManufactureDO.name
            )
            .or().like(
                Objects.nonNull(vaccineManufactureDO.nameEn),
                VaccineManufactureDO::nameEn,
                vaccineManufactureDO.nameEn
            )
            .or().like(
                Objects.nonNull(vaccineManufactureDO.namePinyin),
                VaccineManufactureDO::namePinyin,
                vaccineManufactureDO.namePinyin
            )
            .or().like(
                Objects.nonNull(vaccineManufactureDO.shortName),
                VaccineManufactureDO::shortName,
                vaccineManufactureDO.shortName
            )
            .or().like(
                Objects.nonNull(vaccineManufactureDO.shortNameEn),
                VaccineManufactureDO::shortNameEn,
                vaccineManufactureDO.shortNameEn
            )
            .or().like(
                Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
                VaccineManufactureDO::shortNamePinyin,
                vaccineManufactureDO.shortNamePinyin
            )
    }

    private fun queryNotThisCodeWrapper(vaccineManufactureDO: VaccineManufactureDO): Wrapper<VaccineManufactureDO> {
        return Wrappers.lambdaQuery<VaccineManufactureDO>()
            .eq(
                Objects.nonNull(vaccineManufactureDO.name),
                VaccineManufactureDO::name,
                vaccineManufactureDO.name
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.nameEn),
                VaccineManufactureDO::nameEn,
                vaccineManufactureDO.nameEn
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.namePinyin),
                VaccineManufactureDO::namePinyin,
                vaccineManufactureDO.namePinyin
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortName),
                VaccineManufactureDO::shortName,
                vaccineManufactureDO.shortName
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortNameEn),
                VaccineManufactureDO::shortNameEn,
                vaccineManufactureDO.shortNameEn
            )
            .eq(
                Objects.nonNull(vaccineManufactureDO.shortNamePinyin),
                VaccineManufactureDO::shortNamePinyin,
                vaccineManufactureDO.shortNamePinyin
            )
            .not(
                Objects.nonNull(vaccineManufactureDO.code)
            ) {
                it.eq(
                    VaccineManufactureDO::code,
                    vaccineManufactureDO.code
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