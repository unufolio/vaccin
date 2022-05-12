package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.TableName

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
@TableName("vaccine")
class VaccineDO(
    /**
     * 疫苗编码（国标码）
     */
    var code: String? = null,
    /**
     * 疫苗全称
     */
    var fullName: String? = null,

    /**
     * 疫苗名称
     */
    var name: String? = null,
    /**
     * 疫苗简称
     */
    var shortName: String? = null,
    /**
     * 疫苗全称拼音
     */
    var fullNamePinyin: String? = null,
    /**
     * 疫苗名称拼音
     */
    var namePinyin: String? = null,
    /**
     * 疫苗简称拼音
     */
    var shortNamePinyin: String? = null,

    /**
     * 疫苗类型，1:一类疫苗，2:二类疫苗
     */
    var classification: String? = null,
    /**
     * 疫苗简介
     */
    var instruction: String? = null,
    /**
     * 包装盒图片
     */
    var packagingBoxImage: String? = null,
    /**
     * 疫苗接种起始年龄
     */
    var minAge: Int? = null,
    /**
     * 疫苗接种截止年龄
     */
    var maxAge: Int? = null,
    /**
     * 禁忌症
     */
    var contraindications: String? = null,
    /**
     * 接种须知
     */
    var inoculationInformation: String? = null,
    /**
     * 接种部位
     */
    var inoculationSite: String? = null,
    /**
     * 不良反应
     */
    var AdverseEffects: String? = null
) : BaseEntity() {
    override fun toString(): String {
        return "VaccineDO(code=$code, fullName=$fullName, name=$name, shortName=$shortName, fullNamePinyin=$fullNamePinyin, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin, classification=$classification, instruction=$instruction, packagingBoxImage=$packagingBoxImage, minAge=$minAge, maxAge=$maxAge, contraindications=$contraindications, inoculationInformation=$inoculationInformation, inoculationSite=$inoculationSite, AdverseEffects=$AdverseEffects) ${super.toString()}"
    }
}