package sample.swagger.demo.application.resource;


import lombok.Data;
import sample.swagger.demo.domain.object.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;

/**
 * リクエストボディのマッピング用クラス
 */
@Data
public class UserBody {

    @NotBlank
    @Size(max = 18)
    private String id;

    @NotBlank
    private String value;

    /**
     * ドメインオブジェクトへ変換
     *
     * @return ドメインオブジェクト
     */
    public User toDomainUser() {

        return User.builder()
                .id(this.id)
                .value(this.value)
                .build();
    }

}
