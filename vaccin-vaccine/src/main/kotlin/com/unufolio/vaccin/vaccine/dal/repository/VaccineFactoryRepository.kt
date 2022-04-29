package com.unufolio.vaccin.vaccine.dal.repository

import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineFactoryRepository {

    fun save(vaccineFactoryDO: VaccineFactoryDO): Int

    fun delete(vaccineFactoryDO: VaccineFactoryDO): Int

    fun update(vaccineFactoryDO: VaccineFactoryDO): Int

    fun selectFirst(vaccineFactoryDO: VaccineFactoryDO): VaccineFactoryDO?

    fun exist(vaccineFactoryDO: VaccineFactoryDO): Boolean

    fun existWithinThisCode(vaccineFactoryDO: VaccineFactoryDO): Boolean

    fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO>
}