package sample.swagger.demo.domain.service;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sample.swagger.demo.domain.object.User;
import sample.swagger.demo.domain.repository.UserRepository;

import java.util.Optional;

/**
 * ユーザ操作のロジック
 */
@Service
@RequiredArgsConstructor
public class UserService {

    @NonNull
    private final UserRepository userRepository;

    /**
     * ユーザ検索
     *
     * @param id 検索したいユーザID
     * @return ユーザ
     */
    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

    /**
     * ユーザ作成、更新
     *
     * @param user 作成、更新したユーザ
     * @return 更新後のユーザ
     */
    public User save(User user) {
        return this.userRepository.save(user);
    }

    /**
     * ユーザ削除
     *
     * @param id 削除したいユーザID
     */
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }
}
