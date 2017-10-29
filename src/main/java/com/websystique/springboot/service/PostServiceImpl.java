package com.websystique.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springboot.model.Post;

@Service
@Transactional

public class PostServiceImpl implements PostService {

	@Autowired
	private com.websystique.springboot.repositories.PostRepository postDao;

	@Override
	public Post findById(long id) {
		return postDao.findOne(id);
	}

	@Override
	public List<Post> findAll() {
		return postDao.findAll();
	}

	@Override
	public void savePost(Post post) {
		postDao.save(post);
	}

	@Override
	public List<Post> findByTitleContaining(String title) {
		return postDao.findByTitleContaining(title);
	}

	@Override
	public void updatePost(Post post) {
		postDao.save(post);
	}

	@Override
	public void deletePost(long id) {
		postDao.delete(id);
	}

}
