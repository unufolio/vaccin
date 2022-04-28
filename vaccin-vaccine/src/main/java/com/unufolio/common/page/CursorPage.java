package com.unufolio.common.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public class CursorPage<T> extends SimplePage<T> implements ICursorPageable<T> {

    private String cursor;

    private CursorPage(long pageSize, long pageNum, long total, long pages, String cursor, List<T> rows) {
        super(pageSize, pageNum, total, pages, rows);
        this.cursor = cursor;
    }

    @Override
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String getCursor() {
        return cursor;
    }

    @Override
    public String toString() {
        return "CursorPage{" +
                "cursor='" + cursor + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", total=" + total +
                ", pages=" + pages +
                ", rows=" + rows +
                '}';
    }

    public static class Builder {
        private long pageSize;
        private long pageNum;
        private long total;
        private long pages;
        private String cursor;

        public Builder pageSize(Long pageSize) {
            this.pageSize = Objects.requireNonNullElse(pageSize, 0).longValue();
            return this;
        }

        public Builder pageNum(Long pageNum) {
            this.pageNum = Objects.requireNonNullElse(pageNum, 1).longValue();
            return this;
        }

        public Builder total(Long total) {
            this.total = Objects.requireNonNullElse(total, 0).longValue();
            return this;
        }

        public Builder pages(Long pages) {
            this.pages = Objects.requireNonNullElse(pages, 0).longValue();
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public <T> ICursorPageable<T> rows(List<T> rows) {
            if (Objects.isNull(rows)) {
                rows = new ArrayList<>();
            }
            return new CursorPage<>(pageSize, pageNum, total, pages, cursor, rows);
        }

        public <T> ICursorPageable<T> build() {
            return new CursorPage<>(pageSize, pageNum, total, pages, cursor, new ArrayList<>());
        }
    }
}