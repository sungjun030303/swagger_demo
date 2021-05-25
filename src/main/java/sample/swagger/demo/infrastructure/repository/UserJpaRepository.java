package sample.swagger.demo.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.swagger.demo.infrastructure.entity.UserEntity;

/**
 * JPAを利用するためのインタフェース
 */
public interface UserJpaRepository extends JpaRepository<UserEntity, String> {
}
