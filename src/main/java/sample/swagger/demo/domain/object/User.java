package sample.swagger.demo.domain.object;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

//@Table(name="users")
@Data
@Builder
public class User {
//    DB create 테스트 했을 뿐임.
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user_id")
//    @SequenceGenerator(name = "seq_user_id", sequenceName = "seq_user_id", allocationSize = 1)
//    @Column(name="userid")
//    private long userId;
//
//    @Column(name="username")
//    private String userName;
//
//    @Column(name="password")
//    private String password;
//
//    @Column(name="email")
//    private String email;
    /**
     * ユーザID
     */
    private String id;

    /**
     * ユーザ情報
     */
    private String value;

}
