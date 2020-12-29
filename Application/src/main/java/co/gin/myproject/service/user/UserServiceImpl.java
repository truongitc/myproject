package co.gin.myproject.service.user;

import org.springframework.stereotype.Service;

import co.gin.myproject.vo.request.paging.SortingAndPagingRequestVO;
import co.gin.myproject.vo.response.CommonResponse;
import co.gin.myproject.vo.response.UserResponseVO;
import co.gin.myproject.vo.response.paging.PagedResult;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public CommonResponse<PagedResult<UserResponseVO>> getPagingUsers(SortingAndPagingRequestVO pagingRequestVO) {
		return null;
	}

}
