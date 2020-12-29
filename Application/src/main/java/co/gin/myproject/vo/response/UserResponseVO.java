package co.gin.myproject.vo.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseVO {

	private String userName;

	private String email;

	private Integer role;

	private Date createdAt;

	private Date updatedAt;

}
