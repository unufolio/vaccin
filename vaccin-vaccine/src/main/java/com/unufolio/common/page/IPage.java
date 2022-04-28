package com.unufolio.common.page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public interface IPage<E> {

    long getPageSize();

    void setPageSize(long pageSize);

    long getPageNum();

    void setPageNum(long pageNum);

    long getTotal();

    void setTotal(long total);

    long getPages();

    void setPages(long pages);

    List<E> getRows();

    void setRows(List<E> rows);

    @SuppressWarnings("unchecked")
    default <U> IPage<U> convert(Function<? super E, ? extends U> converter) {
        List<U> collect = this.getRows().stream().map(converter).collect(Collectors.toList());
        ((IPage<U>) this).setRows(collect);
        return ((IPage<U>) this);
    }
}