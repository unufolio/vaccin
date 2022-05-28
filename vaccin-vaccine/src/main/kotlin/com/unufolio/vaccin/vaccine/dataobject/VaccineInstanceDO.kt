package com.unufolio.vaccin.vaccine.dataobject

import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/16
 */
class VaccineInstanceDO(
    /**
     * 疫苗 codo
     */
    private var vaccineCode: String? = null,
    /**
     * 剂型
     */
    private var dosageForm: String? = null,
    /**
     * 规格
     */
    private var specification: String? = null,
    /**
     * 单位
     */
    private var unit: String? = null,
    /**
     * 批准编号
     */
    private var approvalNumber: String? = null,
    /**
     * 包装盒图片
     */
    private var packagingBoxImage: String? = null,
    /**
     * 疫苗接种起始年龄，年月部分按月存储
     */
    private var startMonth: Int? = null,
    /**
     * 疫苗接种截止年龄，年月部分按月存储
     */
    private var endMonth: Int? = null,
    /**
     * 疫苗接种起始年龄，周日部分按月存储
     */
    private var startDay: Int? = null,
    /**
     * 疫苗接种截止年龄，周日部分按月存储
     */
    private var endDay: Int? = null,
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
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : BaseEntity(id, createTime, modifyTime, isDeleted) {
    override fun toString(): String {
        return "VaccineInstanceDO(vaccineCode=$vaccineCode, dosageForm=$dosageForm, specification=$specification, unit=$unit, approvalNumber=$approvalNumber, packagingBoxImage=$packagingBoxImage, minMonth=$startMonth, maxMonth=$endMonth, minDay=$startDay, maxDay=$endDay, contraindications=$contraindications, inoculationInformation=$inoculationInformation, inoculationSite=$inoculationSite, adverseEffects=$adverseEffects)"
    }
}