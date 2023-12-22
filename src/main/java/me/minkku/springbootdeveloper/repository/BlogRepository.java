package me.minkku.springbootdeveloper.repository;

import me.minkku.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

// JpaRepository 클래스를 상속받을 때 엔티티 Article과 엔티티의 PK 타입 Long을 인수로 넣는다.
// 이 레포를 사용할 떄 JpaRepository에서 제공하는 여러 메서드를 사용 가능
