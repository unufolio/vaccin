package com.unufolio.vaccin.vaccine.service

import com.unufolio.common.ResultEntity
import com.unufolio.common.page.IPage
import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineFactoryService {

    fun create(vaccineFactoryDO: VaccineFactoryDO): ResultEntity<Void>;

    fun retrieve(code: String): ResultEntity<VaccineFactoryDO>;

    fun update(vaccineFactoryDO: VaccineFactoryDO): ResultEntity<Void> ;

    fun online(code: String): ResultEntity<Void>;

    fun offline(code: String): ResultEntity<Void>;

    fun delete(code: String): ResultEntity<Void>;

    fun list(vaccineFactoryDO: VaccineFactoryDO): List<VaccineFactoryDO>

    fun page(vaccineFactoryDO: VaccineFactoryDO): IPage<VaccineFactoryDO>
}