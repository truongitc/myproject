package co.gin.myproject.service.user;

import co.gin.myproject.vo.request.paging.SortingAndPagingRequestVO;
import co.gin.myproject.vo.response.CommonResponse;
import co.gin.myproject.vo.response.UserResponseVO;
import co.gin.myproject.vo.response.paging.PagedResult;

public interface UserService {

	CommonResponse<PagedResult<UserResponseVO>> getPagingUsers(SortingAndPagingRequestVO pagingRequestVO);

}
