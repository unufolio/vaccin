package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.TableName
import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
@TableName("vaccine_manufacture")
class VaccineManufactureDO(
    /**
     * 编码
     */
    var code: String? = null,
    /**
     * 厂商名称
     */
    var name: String? = null,
    /**
     * 厂商英文名称
     */
    var nameEn: String? = null,
    /**
     * 厂商名称拼音
     */
    var namePinyin: String? = null,
    /**
     * 厂商缩写
     */
    var shortName: String? = null,
    /**
     * 厂商英文缩写
     */
    var shortNameEn: String? = null,
    /**
     * 厂商缩写拼音
     */
    var shortNamePinyin: String? = null,
    /**
     * 是否上线
     */
    var isOnline: Boolean? = null,
    /**
     * super
     */
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : BaseEntity(id, createTime, modifyTime, isDeleted) {
    override fun toString(): String {
        return "VaccineFactoryDO(code=$code, name=$name, nameEn=$nameEn, shortName=$shortName, shortNameEn=$shortNameEn, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin, isOnline=$isOnline)"
    }
}