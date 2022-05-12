package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.TableName
import com.unufolio.vaccin.vaccine.annotation.NoArg
import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@NoArg
@TableName("vaccine_factory")
class VaccineFactoryDO(
    var code: String? = null,
    var name: String? = null,
    var nameEn: String? = null,
    var shortName: String? = null,
    var shortNameEn: String? = null,
    var namePinyin: String? = null,
    var shortNamePinyin: String? = null,
    /**
     * super
     */
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : BaseEntity() {
    override fun toString(): String {
        return "VaccineFactoryDO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin) ${super.toString()}"
    }
}