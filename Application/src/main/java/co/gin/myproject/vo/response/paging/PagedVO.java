package co.gin.myproject.vo.response.paging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagedVO {

	@JsonProperty("page")
	private int currentPage;

	private int totalPage;

	private long totalRecord;

	@JsonProperty("size")
	private int pageSize;

	public PagedVO(int currentPage, int totalPage, long totalRecord, int pageSize) {
		super();
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.totalRecord = totalRecord;
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
