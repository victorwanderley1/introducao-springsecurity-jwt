package wanderley.victor.introducaospringsecurityjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sessao {
	private String login;
	private String token;
}
