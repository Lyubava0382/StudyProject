package ru.project.NewsWebsite.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.NewsWebsite.models.Person;
import ru.project.NewsWebsite.models.Post;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllByOrderByCreatedAtDesc();
    void deleteById(int id);

}