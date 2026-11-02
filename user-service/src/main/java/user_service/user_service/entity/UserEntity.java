package user_service.user_service.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb-user")
public class UserEntity {
    private String id;
    private String username;
    private String email;
    private String password;
}
