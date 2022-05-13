package com.unufolio.vaccin.vaccine.util

import com.unufolio.common.page.SimplePage


/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/05/13
 */
class PageUtils {

    companion object {
        fun <T> toIPage(page: com.baomidou.mybatisplus.core.metadata.IPage<T>): com.unufolio.common.page.IPage<T> {
            return SimplePage.Builder()
                .total(page.total)
                .pageNum(page.current)
                .pages(page.pages)
                .pageSize(page.size)
                .rows(page.records)
        }
    }
}