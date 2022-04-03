package com.unufolio.vaccin.common.rpc.page;

import java.util.List;
import java.util.function.Function;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public interface IPageable<E> {
    long getPageSize();

    long getPageNum();

    long getTotal();

    long getPages();

    List<E> getRows();

    <U> IPageable<U> convert(Function<? super E, ? extends U> converter);
}