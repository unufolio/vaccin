package com.unufolio.vaccin.vaccine.service

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
interface VaccineFactoryService {

    fun create();

    fun retrieve();

    fun update();

    fun online();

    fun offline();

    fun delete();
}