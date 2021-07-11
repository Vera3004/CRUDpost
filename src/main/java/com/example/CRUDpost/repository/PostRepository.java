package com.example.CRUDpost.repository;

import com.example.CRUDpost.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
