package co.gin.myproject.vo.request.paging;

public class SortingAndPagingRequestVO {

	private int page;

	private int size;

	private String sortKey;

	private String sortDir;

	public SortingAndPagingRequestVO(int page, int size, String sortKey, String sortDir) {
		super();
		this.page = page;
		this.size = size;
		this.sortKey = sortKey;
		this.sortDir = sortDir;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getSortDir() {
		return sortDir;
	}

	public void setSortDir(String sortDir) {
		this.sortDir = sortDir;
	}

}