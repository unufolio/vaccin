package com.unufolio.vaccin.vaccine.service

import com.unufolio.common.ResultEntity
import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineManufactureService {

    fun create(vaccineManufactureDO: VaccineManufactureDO): ResultEntity<Void>;

    fun retrieve(code: String): ResultEntity<VaccineManufactureDO>;

    fun update(vaccineManufactureDO: VaccineManufactureDO): ResultEntity<Void> ;

    fun online(code: String): ResultEntity<Void>;

    fun offline(code: String): ResultEntity<Void>;

    fun delete(code: String): ResultEntity<Void>;

    fun list(vaccineManufactureDO: VaccineManufactureDO): List<VaccineManufactureDO>

    fun page(vaccineManufactureDO: VaccineManufactureDO): IPage<VaccineManufactureDO>
}