package wanderley.victor.introducaospringsecurityjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {
	private String username;
	private String password;
}
