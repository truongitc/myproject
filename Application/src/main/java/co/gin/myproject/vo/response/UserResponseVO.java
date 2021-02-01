package co.gin.myproject.vo.response;

import java.util.Date;
import java.util.Set;

import co.gin.myproject.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseVO {

	private String userName;

	private String email;

	private Set<Role> role;

	private Date createdAt;

	private Date updatedAt;

}
