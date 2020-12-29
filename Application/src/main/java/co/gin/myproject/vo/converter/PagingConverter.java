package co.gin.myproject.vo.converter;

import co.gin.myproject.utils.Constants;
import co.gin.myproject.vo.request.paging.SortingAndPagingRequestVO;

public final class PagingConverter {

	private PagingConverter() {

	}

	public static SortingAndPagingRequestVO getUserPagingRequestVO(SortingAndPagingRequestVO pagingVO) {
		SortingAndPagingRequestVO sortingAndPagingRequestVO = new SortingAndPagingRequestVO();
		sortingAndPagingRequestVO.setPage(pagingVO.getPage() > 0 ? pagingVO.getPage() : Integer.valueOf(Constants.DEFAULT_PAGE));
		sortingAndPagingRequestVO.setSize(pagingVO.getSize() > 0 ? pagingVO.getSize() : Integer.valueOf(Constants.DEFAULT_SIZE));
		sortingAndPagingRequestVO.setSortKey(mapUserSortKey(pagingVO.getSortKey()));
		sortingAndPagingRequestVO.setSortDir(pagingVO.getSortDir());

		return sortingAndPagingRequestVO;
	}

	private static String mapUserSortKey(String sortKey) {
		if (sortKey == null) {
			return "createdAt";
		}

		switch (sortKey) {
		case "username":
			return "username";
		case "email":
			return "email";
		case "role":
			return "role";
		case "createdAt":
			return "created_at";
		case "updatedAt":
			return "updated_at";
		default:
			return null;
		}
	}
}
