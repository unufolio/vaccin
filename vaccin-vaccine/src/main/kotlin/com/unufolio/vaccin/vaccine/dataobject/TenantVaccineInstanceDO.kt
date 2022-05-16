package com.unufolio.vaccin.vaccine.dataobject

import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/16
 */
class TenantVaccineInstanceDO(
    var vaccineCode: String? = null,
    tenantId: Long? = null,
    id: Long? = null,
    createTime: Instant? = null,
    modifyTime: Instant? = null,
    isDeleted: Boolean? = null
) : TenantBaseEntity(tenantId, id, createTime, modifyTime, isDeleted) {
    override fun toString(): String {
        return "TenantVaccineInstanceDO(vaccineCode=$vaccineCode)"
    }
}