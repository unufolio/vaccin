package com.unufolio.vaccin.vaccine.dal.repository

import vaccin.vaccine.dataobject.VaccineDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineRepository {

    fun retrieve(): VaccineDO?

    fun save(vaccineDO: VaccineDO): Int

    fun delete(vaccineDO: VaccineDO): Int
}