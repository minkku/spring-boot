package me.minkku.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.minkku.springbootdeveloper.domain.Article;
import me.minkku.springbootdeveloper.dto.AddArticleRequest;
import me.minkku.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor    // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
