package page

type SimplePage[T interface{}] struct {
	PageSize int64 `json:"pageSize"`
	PageNum  int64 `json:"pageNum"`
	Total    int64 `json:"total"`
	Pages    int64 `json:"pages"`
	Rows     []T   `json:"rows"`
}

type CursorPage[T interface{}] struct {
	SimplePage
	Cursor string `json:"cursor"`
}
