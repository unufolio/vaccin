package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.toolkit.Wrappers
import com.unufolio.vaccin.vaccine.dal.mapper.VaccineFactoryMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
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
            .eq(VaccineFactoryDO::getCode, vaccineFactoryDO.code)
        return vaccineFactoryMapper.delete(queryWrapper)
    }

    override fun update(vaccineFactoryDO: VaccineFactoryDO): Int {
        return vaccineFactoryMapper.updateById(vaccineFactoryDO)
    }

    fun selectOne(vaccineFactoryDO: VaccineFactoryDO): VaccineFactoryDO {
        val queryWrapper = Wrappers.query(vaccineFactoryDO)
        return vaccineFactoryMapper.selectOne(queryWrapper)
    }

    override fun selectFirst(vaccineFactoryDO: VaccineFactoryDO): VaccineFactoryDO? {
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>()
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.code),
            VaccineFactoryDO::getCode,
            vaccineFactoryDO.code
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.name),
            VaccineFactoryDO::getName,
            vaccineFactoryDO.name
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.nameEn),
            VaccineFactoryDO::getNameEn,
            vaccineFactoryDO.nameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.namePinyin),
            VaccineFactoryDO::getNamePinyin,
            vaccineFactoryDO.namePinyin
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortName),
            VaccineFactoryDO::getShortName,
            vaccineFactoryDO.shortName
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNameEn),
            VaccineFactoryDO::getShortNameEn,
            vaccineFactoryDO.shortNameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin),
            VaccineFactoryDO::getShortNamePinyin,
            vaccineFactoryDO.shortNamePinyin
        )
        queryWrapper.last("LIMIT 1")
        return vaccineFactoryMapper.selectOne(queryWrapper)
    }

    override fun exist(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>()
        queryWrapper.not(
            Objects.nonNull(vaccineFactoryDO.code)
        ) {
            it.eq(
                VaccineFactoryDO::getCode,
                vaccineFactoryDO.code
            )
        }
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.name),
            VaccineFactoryDO::getName,
            vaccineFactoryDO.name
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.nameEn),
            VaccineFactoryDO::getNameEn,
            vaccineFactoryDO.nameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.namePinyin),
            VaccineFactoryDO::getNamePinyin,
            vaccineFactoryDO.namePinyin
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortName),
            VaccineFactoryDO::getShortName,
            vaccineFactoryDO.shortName
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNameEn),
            VaccineFactoryDO::getShortNameEn,
            vaccineFactoryDO.shortNameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin),
            VaccineFactoryDO::getShortNamePinyin,
            vaccineFactoryDO.shortNamePinyin
        )
        return vaccineFactoryMapper.exists(queryWrapper)
    }

    override fun existWithinThisCode(vaccineFactoryDO: VaccineFactoryDO): Boolean {
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>()
        queryWrapper.not(
            Objects.nonNull(vaccineFactoryDO.code)
        ) {
            it.eq(
                VaccineFactoryDO::getCode,
                vaccineFactoryDO.code
            )
        }
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.name),
            VaccineFactoryDO::getName,
            vaccineFactoryDO.name
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.nameEn),
            VaccineFactoryDO::getNameEn,
            vaccineFactoryDO.nameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.namePinyin),
            VaccineFactoryDO::getNamePinyin,
            vaccineFactoryDO.namePinyin
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortName),
            VaccineFactoryDO::getShortName,
            vaccineFactoryDO.shortName
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNameEn),
            VaccineFactoryDO::getShortNameEn,
            vaccineFactoryDO.shortNameEn
        )
        queryWrapper.eq(
            Objects.nonNull(vaccineFactoryDO.shortNamePinyin),
            VaccineFactoryDO::getShortNamePinyin,
            vaccineFactoryDO.shortNamePinyin
        )
        return vaccineFactoryMapper.exists(queryWrapper)
    }

    override fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO> {
        return ArrayList()
    }

}