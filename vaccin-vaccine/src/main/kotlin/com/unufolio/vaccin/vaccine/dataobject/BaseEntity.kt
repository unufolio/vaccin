package com.unufolio.vaccin.vaccine.dataobject

import com.baomidou.mybatisplus.annotation.FieldFill
import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import java.time.Instant

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
open class BaseEntity(
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO) private var id: Long? = null,
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT) private var createTime: Instant? = null,
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE) private var modifyTime: Instant? = null,
    /**
     * 是否删除
     */
    private var isDeleted: Boolean? = null
) {
    override fun toString(): String {
        return "BaseEntity(id=$id, createTime=$createTime, modifyTime=$modifyTime, isDeleted=$isDeleted)"
    }
}

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
open class TenantBaseEntity(private var tenantId: Long? = null) : BaseEntity() {

    override fun toString(): String {
        return "TenantBaseEntity(tenantId=$tenantId) ${super.toString()}"
    }
}