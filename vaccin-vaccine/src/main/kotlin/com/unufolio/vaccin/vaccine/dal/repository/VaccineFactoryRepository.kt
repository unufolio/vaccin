package com.unufolio.vaccin.vaccine.dal.repository

import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineFactoryRepository {

    fun save(vaccineManufactureDO: VaccineManufactureDO): Int

    fun delete(vaccineManufactureDO: VaccineManufactureDO): Int

    fun update(vaccineManufactureDO: VaccineManufactureDO): Int

    fun selectFirstByCode(code: String): VaccineManufactureDO?

    fun selectFirst(vaccineManufactureDO: VaccineManufactureDO): VaccineManufactureDO?

    fun exist(vaccineManufactureDO: VaccineManufactureDO): Boolean

    fun existNotThisCode(vaccineManufactureDO: VaccineManufactureDO): Boolean

    fun list(vaccineManufactureDO: VaccineManufactureDO): List<VaccineManufactureDO>

    fun page(vaccineManufactureDO: VaccineManufactureDO): IPage<VaccineManufactureDO>
}