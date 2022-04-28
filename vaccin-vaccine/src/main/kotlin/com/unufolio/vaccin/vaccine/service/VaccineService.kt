package com.unufolio.vaccin.vaccine.service

import com.unufolio.vaccin.vaccine.dataobject.VaccineDO


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
interface VaccineService {

    fun retrieve(): VaccineDO?

    fun saveVaccine(): Int

    fun delete(): Int;
}