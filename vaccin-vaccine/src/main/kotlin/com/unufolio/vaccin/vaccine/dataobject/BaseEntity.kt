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
abstract class BaseEntity(
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    var id: Long? = null,
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    var createTime: Instant? = null,
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    var modifyTime: Instant? = null,
    /**
     * 是否删除
     */
    var isDeleted: Boolean? = null
)

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
abstract class TenantBaseEntity(
    var tenantId: Long? = null,
    /**
     * super
     */
    id: Long?,
    createTime: Instant?,
    modifyTime: Instant?,
    isDeleted: Boolean?
) : BaseEntity(id, createTime, modifyTime, isDeleted) {

    override fun toString(): String {
        return "TenantBaseEntity(tenantId=$tenantId) ${super.toString()}"
    }
}