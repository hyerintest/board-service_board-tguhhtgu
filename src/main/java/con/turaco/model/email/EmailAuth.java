package con.turaco.model.email;

import lombok.Data;

@Data
public class EmailAuth {
	String id;
	String password;
	String sessionId;
}
