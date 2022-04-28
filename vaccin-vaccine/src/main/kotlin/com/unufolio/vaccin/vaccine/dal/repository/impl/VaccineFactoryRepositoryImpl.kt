package com.unufolio.vaccin.vaccine.dal.repository.impl

import com.baomidou.mybatisplus.core.toolkit.Wrappers
import com.unufolio.vaccin.vaccine.dal.mapper.VaccineFactoryMapper
import com.unufolio.vaccin.vaccine.dal.repository.VaccineFactoryRepository
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import org.springframework.stereotype.Repository

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Repository
class VaccineFactoryRepositoryImpl(val vaccineFactoryMapper: VaccineFactoryMapper) : VaccineFactoryRepository {

    override fun delete(vaccineFactoryDO: VaccineFactoryDO): Int {
        val queryWrapper = Wrappers.lambdaQuery<VaccineFactoryDO>()
            .eq(VaccineFactoryDO::getCode, vaccineFactoryDO.code)
        return vaccineFactoryMapper.delete(queryWrapper)
    }

    override fun save(vaccineFactoryDO: VaccineFactoryDO): Int {
        return vaccineFactoryMapper.insert(vaccineFactoryDO);
    }

    override fun update(vaccineFactoryDO: VaccineFactoryDO): Int {
        return vaccineFactoryMapper.updateById(vaccineFactoryDO)
    }

    override fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO> {


        vaccineFactoryMapper.selectPage()
        return vaccineFactoryMapper.selectList();
    }

}