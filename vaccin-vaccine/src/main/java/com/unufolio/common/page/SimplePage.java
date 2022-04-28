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
public class SimplePage<T> implements IPageable<T> {

    protected long pageSize;
    protected long pageNum;
    protected long total;
    protected long pages;
    protected List<T> rows;

    protected SimplePage(long pageSize, long pageNum, long total, long pages, List<T> rows) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.total = total;
        this.pages = pages;
        this.rows = rows;
    }

    @Override
    public long getPageSize() {
        return pageSize;
    }

    @Override
    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public long getPageNum() {
        return pageNum;
    }

    @Override
    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public long getPages() {
        return pages;
    }

    @Override
    public void setPages(long pages) {
        this.pages = pages;
    }

    @Override
    public List<T> getRows() {
        return rows;
    }

    @Override
    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "SimplePage{" +
                "pageSize=" + pageSize +
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

        public <T> IPageable<T> rows(List<T> rows) {
            if (Objects.isNull(rows)) {
                rows = new ArrayList<>();
            }
            return new SimplePage<>(pageSize, pageNum, total, pages, rows);
        }

        public <T> IPageable<T> build() {
            return new SimplePage<>(pageSize, pageNum, total, pages, new ArrayList<>());
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "pageSize=" + pageSize +
                    ", pageNum=" + pageNum +
                    ", total=" + total +
                    ", pages=" + pages +
                    '}';
        }
    }
}