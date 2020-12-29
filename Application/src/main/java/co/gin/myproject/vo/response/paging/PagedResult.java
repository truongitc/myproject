package co.gin.myproject.vo.response.paging;

import java.util.List;

public class PagedResult<T> {

	private PagedVO paging;

	private List<T> elements;

	private T total;

	public PagedResult(PagedVO paging, List<T> elements, T total) {
		super();
		this.paging = paging;
		this.elements = elements;
		this.total = total;
	}

	public PagedVO getPaging() {
		return paging;
	}

	public void setPaging(PagedVO paging) {
		this.paging = paging;
	}

	public List<T> getElements() {
		return elements;
	}

	public void setElements(List<T> elements) {
		this.elements = elements;
	}

	public T getTotal() {
		return total;
	}

	public void setTotal(T total) {
		this.total = total;
	}

}