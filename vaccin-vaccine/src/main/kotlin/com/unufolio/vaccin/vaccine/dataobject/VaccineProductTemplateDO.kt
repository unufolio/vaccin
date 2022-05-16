package com.unufolio.vaccin.vaccine.dataobject

import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/16
 */
class VaccineProductTemplateDO(
    /**
     * 疫苗 code
     */
    var vaccineCode: String? = null,
    /**
     * 名称
     */
    var name: String? = null,
    /**
     * 疫苗实例 id
     */
    var vaccineInstanceId: Long? = null,
    /**
     * 排序
     */
    var sort: Int? = null,
    /**
     * 疫苗接种起始年龄，年月部分按月存储
     */
    var startMonth: Int? = null,
    /**
     * 疫苗接种截止年龄，年月部分按月存储
     */
    var endMonth: Int? = null,
    /**
     * 疫苗接种起始年龄，周日部分按月存储
     */
    var startDay: Int? = null,
    /**
     * 疫苗接种截止年龄，周日部分按月存储
     */
    var endDay: Int? = null,
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : BaseEntity(id, createTime, modifyTime, isDeleted) {
    override fun toString(): String {
        return "VaccineProductTemplateDO(vaccineCode=$vaccineCode, name=$name, vaccineInstanceId=$vaccineInstanceId, sort=$sort, startMonth=$startMonth, endMonth=$endMonth, startDay=$startDay, endDay=$endDay)"
    }
}