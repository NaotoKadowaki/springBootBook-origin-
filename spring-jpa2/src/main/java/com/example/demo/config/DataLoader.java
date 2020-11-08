package com.example.demo.config;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final CommentRepository repository;

    @Override
    public void run(String... args)throws Exception {
        Comment comment = new Comment();
        comment.setContent("こんにちは");
        repository.save(comment);

        comment = new Comment();
        comment.setContent("テストコメント");
        repository.save(comment);
    }
}
