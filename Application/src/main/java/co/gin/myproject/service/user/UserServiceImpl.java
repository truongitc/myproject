package co.gin.myproject.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gin.myproject.repository.UserRepository;
import co.gin.myproject.vo.converter.PagingConverter;
import co.gin.myproject.vo.request.paging.SortingAndPagingRequestVO;
import co.gin.myproject.vo.response.CommonResponse;
import co.gin.myproject.vo.response.UserResponseVO;
import co.gin.myproject.vo.response.paging.PagedResult;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository; 

	@Override
	public CommonResponse<PagedResult<UserResponseVO>> getPagingUsers(SortingAndPagingRequestVO pagingRequestVO) {
		
		CommonResponse<PagedResult<UserResponseVO>> result = new CommonResponse<>();
		PagedResult<UserResponseVO> pagedResult = new PagedResult<>();
		
		result.setData(pagedResult);
		
		SortingAndPagingRequestVO sortingAndPagingRequestVO = PagingConverter.getUserPagingRequestVO(pagingRequestVO);

		return result;
	}

}
