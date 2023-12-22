package me.minkku.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.minkku.springbootdeveloper.domain.Article;
import me.minkku.springbootdeveloper.dto.AddArticleRequest;
import me.minkku.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController     //HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class BlogApiController {
    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest req) {
        Article savedArticle = blogService.save(req);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}
