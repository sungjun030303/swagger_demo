package sample.swagger.demo.domain.repository;


import sample.swagger.demo.domain.object.User;

import java.util.Optional;

/**
 * インフラ層とのインタフェース
 */
public interface UserRepository {

    /**
     * ユーザ検索
     *
     * @param id 検索したいユーザID
     * @return ユーザ
     */
    Optional<User> findById(String id);

    /**
     * ユーザ作成、更新
     *
     * @param user 作成、更新したユーザ
     * @return 更新後のユーザ
     */
    User save(User user);

    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザID
     */
    void deleteById(String id);
}
