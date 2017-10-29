package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.Post;

public interface PostService {
	Post findById(long id);

	List<Post> findAll();

	void savePost(Post post);

	List<Post> findByTitleContaining(String title);

	void updatePost(Post post);

	void deletePost(long id);

}
