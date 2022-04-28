package com.unufolio.common.page;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public interface ICursorPage<T> extends IPage<T> {

    String getCursor();

    void setCursor(String cursor);

}
