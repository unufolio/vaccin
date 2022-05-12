package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.TableName

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@TableName("vaccine_factory")
data class VaccineFactoryDO(
    var code: String? = null,
    var name: String? = null,
    var nameEn: String? = null,
    var shortName: String? = null,
    var shortNameEn: String? = null,
    var namePinyin: String? = null,
    var shortNamePinyin: String? = null
) : BaseEntity() {
    override fun toString(): String {
        return "VaccineFactoryDO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin) ${super.toString()}"
    }
}