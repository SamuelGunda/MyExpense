package kasv.gunda.myexpense.models.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RegisterRequest {
    private String email;
    private String fullName;
    private String password;
}
