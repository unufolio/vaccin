package com.unufolio.common.page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public interface IPageable<E> {

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
    default <U> IPageable<U> convert(Function<? super E, ? extends U> converter) {
        List<U> collect = this.getRows().stream().map(converter).collect(Collectors.toList());
        ((IPageable<U>) this).setRows(collect);
        return ((IPageable<U>) this);
    }
}