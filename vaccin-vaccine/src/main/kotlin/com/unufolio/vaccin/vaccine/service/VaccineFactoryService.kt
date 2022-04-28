package com.unufolio.vaccin.vaccine.service

import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineFactoryService {

    fun create(vaccineFactoryDO: VaccineFactoryDO);

    fun retrieve();

    fun update();

    fun online();

    fun offline();

    fun delete();
}