package sample.swagger.demo.application.controller;

import lombok.NonNull;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sample.swagger.demo.application.resource.UserBody;
import sample.swagger.demo.domain.object.User;
import sample.swagger.demo.domain.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/users")
public class UserController {

    /**
     *
     *
     *
     **/

    @NonNull
    private final UserService userService;


    /**
     * ユーザ検索
     *
     * @param id 検索したいユーザID
     * @return ユーザ
     */
    @GetMapping("{id}")
    @ResponseStatus( HttpStatus.OK )
    public User findById(@PathVariable("id") String id ) {
        return this.userService.findById(id).orElseThrow(RuntimeException::new);
    }

    /**
     * ユーザ作成、更新
     *
     * @param userBody リクエストボディ
     * @return 更新後のユーザ
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @Validated UserBody userBody) {
        return this.userService.save(userBody.toDomainUser());
    }


    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザID
     */
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("id") String id) {
        this.userService.deleteById(id);
    }




}
