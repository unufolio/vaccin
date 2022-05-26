package result

import (
	"time"
	"vaccin-order/page"
)

type Result[T any] struct {
	Success   bool      `json:"success"`
	Code      string    `json:"code"`
	Message   string    `json:"message"`
	Timestamp time.Time `json:"timestamp"`
	Ext       any       `json:"ext"`
	Data      T         `json:"data"`
}

func Of[T any](success bool, code string, message string, timestamp time.Time, ext any, data T) Result[T] {
	return Result[T]{
		Success:   success,
		Code:      code,
		Message:   message,
		Timestamp: timestamp,
		Ext:       ext,
		Data:      data,
	}
}

func Success[T any](data T) Result[T] {
	return Of(true, "", "", time.Time{}, nil, data)
}

func Page[T any](data page.SimplePage[T]) Result[page.SimplePage[T]] {
	return Result[page.SimplePage[T]]{
		Success:   true,
		Code:      "code",
		Message:   "message",
		Timestamp: time.Time{},
		Ext:       nil,
		Data:      data,
	}
}

func CursorPage[T any](data page.CursorPage[T]) Result[page.CursorPage[T]] {
	return Result[page.CursorPage[T]]{
		Success:   true,
		Code:      "code",
		Message:   "message",
		Timestamp: time.Time{},
		Ext:       nil,
		Data:      data,
	}
}
