package com.unufolio.common;

import com.unufolio.common.page.ICursorPageable;
import com.unufolio.common.page.IPageable;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/24
 */
public class ResultEntity<T> {

    private Boolean success;
    private String code;
    private String message;
    private Instant timestamp;
    private Object ext;
    private T data;

    private ResultEntity(boolean success, String code, String message, Instant timestamp, Object ext, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
        this.ext = ext;
        this.data = data;
    }

    private static <T> ResultEntity<T> of(boolean success, String code, String message, Instant timestamp, Object ext, T data) {
        return new ResultEntity<>(success, code, message, timestamp, ext, data);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", ext=" + ext +
                ", data=" + data +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private boolean success;
        private String code;
        private String message;
        private Instant timestamp;
        private Object ext;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder timestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder ext(Object ext) {
            this.ext = ext;
            return this;
        }

        public <T> ResultEntity<T> data(T data) {
            return ResultEntity.of(success, code, message, timestamp, ext, data);
        }

        public <T> ResultEntity<T> build() {
            return this.data(null);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "success=" + success +
                    ", code='" + code + '\'' +
                    ", message='" + message + '\'' +
                    ", timestamp=" + timestamp +
                    ", ext=" + ext +
                    '}';
        }
    }

    public static ResultEntity<Void> succeed() {
        return ResultEntity.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.value())
                .message(ResultCodeEnum.SUCCESS.message())
                .timestamp(Instant.now())
                .build();
    }

    public static <T> ResultEntity<T> succeed(T data) {
        return ResultEntity.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.value())
                .message(ResultCodeEnum.SUCCESS.message())
                .timestamp(Instant.now())
                .data(data);
    }

    public static <T> ResultEntity<T> succeed(T data, Object ext) {
        return ResultEntity.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.value())
                .message(ResultCodeEnum.SUCCESS.message())
                .timestamp(Instant.now())
                .ext(ext)
                .data(data);
    }

    public static <T> ResultEntity<T> succeed(IResultCode resultCode, T data) {
        return ResultEntity.builder()
                .success(true)
                .code(resultCode.value())
                .message(resultCode.message())
                .timestamp(Instant.now())
                .data(data);
    }

    public static <T> ResultEntity<T> succeed(IResultCode resultCode, T data, Object ext) {
        return ResultEntity.builder()
                .success(true)
                .code(resultCode.value())
                .message(resultCode.message())
                .timestamp(Instant.now())
                .ext(ext)
                .data(data);
    }

    public static <T> ResultEntity<IPageable<T>> succeed(IPageable<T> page) {
        return ResultEntity.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.value())
                .message(ResultCodeEnum.SUCCESS.message())
                .timestamp(Instant.now())
                .data(page);
    }

    public static <T> ResultEntity<IPageable<T>> succeed(ICursorPageable<T> page) {
        return ResultEntity.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.value())
                .message(ResultCodeEnum.SUCCESS.message())
                .timestamp(Instant.now())
                .data(page);
    }

    public static <T> ResultEntity<IPageable<T>> page(IPageable<T> page) {
        return succeed(page);
    }

    public static <T> ResultEntity<IPageable<T>> page(ICursorPageable<T> page) {
        return succeed(page);
    }

    public static <T> ResultEntity<Collection<T>> collect(Collection<T> coll) {
        return succeed(coll);
    }

    public static <T> ResultEntity<T[]> arrays(T[] arrays) {
        return succeed(arrays);
    }

    public static ResultEntity<Void> error() {
        return ResultEntity.builder()
                .success(false)
                .code(ResultCodeEnum.ERROR.value())
                .message(ResultCodeEnum.ERROR.message())
                .timestamp(Instant.now())
                .build();
    }

    public static ResultEntity<Void> error(Object ext) {
        return ResultEntity.builder()
                .success(false)
                .code(ResultCodeEnum.ERROR.value())
                .message(ResultCodeEnum.ERROR.message())
                .timestamp(Instant.now())
                .ext(ext)
                .build();
    }

    public static ResultEntity<Void> error(IResultCode resultCode) {
        return ResultEntity.builder()
                .success(false)
                .code(resultCode.value())
                .message(resultCode.message())
                .timestamp(Instant.now())
                .build();
    }

    public static ResultEntity<Void> error(IResultCode resultCode, Object ext) {
        return ResultEntity.builder()
                .success(false)
                .code(resultCode.value())
                .message(resultCode.message())
                .timestamp(Instant.now())
                .ext(ext)
                .build();
    }

    public static ResultEntity<Void> error(String code, String message) {
        return ResultEntity.builder()
                .success(false)
                .code(code)
                .message(message)
                .timestamp(Instant.now())
                .build();
    }

    public static ResultEntity<Void> error(String code, String message, Object ext) {
        return ResultEntity.builder()
                .success(false)
                .code(code)
                .message(message)
                .timestamp(Instant.now())
                .ext(ext)
                .build();
    }
}