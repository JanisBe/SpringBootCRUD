package com.websystique.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	public List<Post> findByTitleContaining(String title);

	@Override
	public List<Post> findAll();
}
