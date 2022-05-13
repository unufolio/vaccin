package com.unufolio.vaccin.vaccine.objectmapping

import com.unufolio.vaccin.vaccine.dataobject.VaccineFactoryDO
import com.unufolio.vaccin.vaccine.dto.admin.CreateVaccineFactoryRequestDTO
import com.unufolio.vaccin.vaccine.dto.admin.UpdateVaccineFactoryRequestDTO


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
class VaccineFactoryMapping {

    companion object {
        fun fromCreateDTOToDataObject(createVaccineFactoryRequestDTO: CreateVaccineFactoryRequestDTO): VaccineFactoryDO {
            return VaccineFactoryDO().apply {
                code = createVaccineFactoryRequestDTO.code
                name = createVaccineFactoryRequestDTO.name
                nameEn = createVaccineFactoryRequestDTO.nameEn
                namePinyin = createVaccineFactoryRequestDTO.namePinyin
                shortName = createVaccineFactoryRequestDTO.shortName
                shortNameEn = createVaccineFactoryRequestDTO.shortNameEn
                shortNamePinyin = createVaccineFactoryRequestDTO.shortNamePinyin
            }
        }

        fun fromUpdateDTOToDataObject(updateVaccineFactoryRequestDTO: UpdateVaccineFactoryRequestDTO): VaccineFactoryDO {
            return VaccineFactoryDO().apply {
                name = updateVaccineFactoryRequestDTO.name
                nameEn = updateVaccineFactoryRequestDTO.nameEn
                namePinyin = updateVaccineFactoryRequestDTO.namePinyin
                shortName = updateVaccineFactoryRequestDTO.shortName
                shortNameEn = updateVaccineFactoryRequestDTO.shortNameEn
                shortNamePinyin = updateVaccineFactoryRequestDTO.shortNamePinyin
            }
        }
    }

}