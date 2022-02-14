package user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String email;

    private Date created_at;
    private Date updated_at;
}


