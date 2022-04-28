package com.unufolio.vaccin.vaccine.dal

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler
import org.apache.ibatis.reflection.MetaObject
import org.springframework.stereotype.Component
import java.time.LocalDateTime


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Component
class TimeMetaObjectHandler : MetaObjectHandler {
    override fun insertFill(metaObject: MetaObject?) {
        this.strictInsertFill(
            metaObject, "createTime",
            { LocalDateTime.now() },
            LocalDateTime::class.java
        )
        this.strictInsertFill(
            metaObject, "modifyTime",
            { LocalDateTime.now() },
            LocalDateTime::class.java
        )
    }

    override fun updateFill(metaObject: MetaObject?) {
        this.strictUpdateFill(
            metaObject, "modifyTime",
            { LocalDateTime.now() },
            LocalDateTime::class.java
        )
    }
}