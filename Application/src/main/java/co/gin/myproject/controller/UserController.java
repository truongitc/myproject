package co.gin.myproject.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.gin.myproject.service.user.UserService;
import co.gin.myproject.utils.Constants;
import co.gin.myproject.utils.ResponseUtil;
import co.gin.myproject.vo.request.paging.SortingAndPagingRequestVO;
import co.gin.myproject.vo.response.CommonResponse;
import co.gin.myproject.vo.response.UserResponseVO;
import co.gin.myproject.vo.response.paging.PagedResult;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(Constants.API_DOMAIN + "users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<Map<String, Object>> getPagingUsers(
			@RequestParam(required = false, defaultValue = Constants.DEFAULT_PAGE) Integer page,
			@RequestParam(required = false, defaultValue = Constants.DEFAULT_SIZE) Integer size,
			@RequestParam(required = false) String sortKey, @RequestParam(required = false) String sortDir) {

		// Get paging request VO
		SortingAndPagingRequestVO pagingRequestVO = new SortingAndPagingRequestVO(page, size, sortKey, sortDir);

		CommonResponse<PagedResult<UserResponseVO>> userPagedResponse = userService.getPagingUsers(pagingRequestVO);

		// logger.info("Response get users: {}", userPagedResponse);
		return ResponseUtil.setResponseData(userPagedResponse.getStatusCode(), userPagedResponse.getData(),
				userPagedResponse.getMessage());
	}
}
