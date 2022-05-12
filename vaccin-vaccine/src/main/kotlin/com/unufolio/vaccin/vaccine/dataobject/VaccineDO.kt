package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.TableName
import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
@TableName("vaccine")
class VaccineDO(
    /**
     * 疫苗编码（国标码）
     */
    private var code: String? = null,
    /**
     * 疫苗全称
     */
    private var fullName: String? = null,
    /**
     * 疫苗名称
     */
    private var name: String? = null,
    /**
     * 疫苗简称
     */
    private var shortName: String? = null,
    /**
     * 疫苗全称拼音
     */
    private var fullNamePinyin: String? = null,
    /**
     * 疫苗名称拼音
     */
    private var namePinyin: String? = null,
    /**
     * 疫苗简称拼音
     */
    private var shortNamePinyin: String? = null,

    /**
     * 疫苗类型，1:一类疫苗，2:二类疫苗
     */
    private var classification: String? = null,
    /**
     * 疫苗简介
     */
    private var instruction: String? = null,
    /**
     * 包装盒图片
     */
    private var packagingBoxImage: String? = null,
    /**
     * 疫苗接种起始年龄
     */
    private var minAge: Int? = null,
    /**
     * 疫苗接种截止年龄
     */
    private var maxAge: Int? = null,
    /**
     * 禁忌症
     */
    private var contraindications: String? = null,
    /**
     * 接种须知
     */
    private var inoculationInformation: String? = null,
    /**
     * 接种部位
     */
    private var inoculationSite: String? = null,
    /**
     * 不良反应
     */
    private var adverseEffects: String? = null,
    /**
     * super
     */
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : BaseEntity(id, createTime, modifyTime, isDeleted) {

    override fun toString(): String {
        return "VaccineDO(code=$code, fullName=$fullName, name=$name, shortName=$shortName, fullNamePinyin=$fullNamePinyin, namePinyin=$namePinyin, shortNamePinyin=$shortNamePinyin, classification=$classification, instruction=$instruction, packagingBoxImage=$packagingBoxImage, minAge=$minAge, maxAge=$maxAge, contraindications=$contraindications, inoculationInformation=$inoculationInformation, inoculationSite=$inoculationSite, adverseEffects=$adverseEffects) ${super.toString()}"
    }
}