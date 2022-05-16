package com.unufolio.vaccin.vaccine.objectmapping

import com.unufolio.vaccin.vaccine.dataobject.VaccineManufactureDO
import com.unufolio.vaccin.vaccine.dto.admin.CreateVaccineManufactureRequestDTO
import com.unufolio.vaccin.vaccine.dto.admin.UpdateVaccineManufactureRequestDTO


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
class VaccineFactoryMapping {

    companion object {
        fun fromCreateDTOToDataObject(createVaccineManufactureRequestDTO: CreateVaccineManufactureRequestDTO): VaccineManufactureDO {
            return VaccineManufactureDO().apply {
                code = createVaccineManufactureRequestDTO.code
                name = createVaccineManufactureRequestDTO.name
                nameEn = createVaccineManufactureRequestDTO.nameEn
                namePinyin = createVaccineManufactureRequestDTO.namePinyin
                shortName = createVaccineManufactureRequestDTO.shortName
                shortNameEn = createVaccineManufactureRequestDTO.shortNameEn
                shortNamePinyin = createVaccineManufactureRequestDTO.shortNamePinyin
            }
        }

        fun fromUpdateDTOToDataObject(updateVaccineManufactureRequestDTO: UpdateVaccineManufactureRequestDTO): VaccineManufactureDO {
            return VaccineManufactureDO().apply {
                name = updateVaccineManufactureRequestDTO.name
                nameEn = updateVaccineManufactureRequestDTO.nameEn
                namePinyin = updateVaccineManufactureRequestDTO.namePinyin
                shortName = updateVaccineManufactureRequestDTO.shortName
                shortNameEn = updateVaccineManufactureRequestDTO.shortNameEn
                shortNamePinyin = updateVaccineManufactureRequestDTO.shortNamePinyin
            }
        }
    }

}