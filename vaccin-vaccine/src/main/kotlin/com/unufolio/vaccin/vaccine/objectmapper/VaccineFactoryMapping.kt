package com.unufolio.vaccin.vaccine.objectmapper

import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin.CreateVaccineFactoryRequestDTO
import ma.glasnost.orika.MapperFactory
import ma.glasnost.orika.impl.ConfigurableMapper
import org.springframework.context.annotation.Configuration


/**
 * @author yeke yeke@healthych.com
 * @since 2022/04/28
 */
@Configuration
class VaccineFactoryMapping : ConfigurableMapper() {

    override fun configure(factory: MapperFactory?) {
        super.configure(factory)
        factory!!.classMap(VaccineFactoryDO::class.java, CreateVaccineFactoryRequestDTO::class.java)
            .mapNulls(false);
    }
}