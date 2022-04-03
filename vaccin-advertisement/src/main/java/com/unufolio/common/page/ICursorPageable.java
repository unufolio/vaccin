package com.unufolio.common.page;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public interface ICursorPageable<T> extends IPageable<T> {

    String getCursor();

}
