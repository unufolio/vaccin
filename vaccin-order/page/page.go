package page

type SimplePage[T any] struct {
	PageSize int64 `json:"pageSize"`
	PageNum  int64 `json:"pageNum"`
	Total    int64 `json:"total"`
	Pages    int64 `json:"pages"`
	Rows     []T   `json:"rows"`
}

type CursorPage[T any] struct {
	SimplePage[T]
	Cursor string `json:"cursor"`
}
