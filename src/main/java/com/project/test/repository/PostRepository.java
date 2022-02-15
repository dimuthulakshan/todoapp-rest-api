package com.project.test.repository;

import java.util.List;
import com.project.test.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByPublished(boolean published);

}
