package main

import (
	"time"
	"vaccin-order/page"
)

var ResultCode = map[string]string{}

type Result[T interface{}] struct {
	Success bool      `json:"success"`
	Code    string    `json:"code"`
	Message string    `json:"message"`
	Time    time.Time `json:"time"`
	Ext     any       `json:"ext"`
	Data    T         `json:"data"`
}

func (r *Result[T]) Of(success bool, code string, message string, time time.Time, ext any, data T) Result[T] {
	return Result[T]{
		Success: success,
		Code:    code,
		Message: message,
		Time:    time,
		Ext:     ext,
		Data:    data,
	}
}

func (r *Result[T]) Page(data page.SimplePage) Result[page.SimplePage] {
	return Result[T]{
		Success: true,
		Code:    "code",
		Message: "message",
		Time:    time.Time{},
		Ext:     nil,
		Data:    data,
	}
}

func (r *Result[T]) CursorPage(data page.CursorPage) Result[page.CursorPage] {
	return Result[T]{
		Success: true,
		Code:    "code",
		Message: "message",
		Time:    time.Time{},
		Ext:     nil,
		Data:    data,
	}
}
