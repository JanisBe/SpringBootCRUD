package com.websystique.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.model.Post;
import com.websystique.springboot.service.PostService;

@RestController
@RequestMapping("/post")
public class PostRestService {
	@Autowired
	private PostService postService;

	public List<Post> findAll() {
		return postService.findAll();
	}

	@RequestMapping("/{id}")
	public Post findOne(@PathVariable("id") long id) {
		return postService.findById(id);
	}

	@RequestMapping()
	public List<Post> findByTitleContaining(@RequestParam("title") String title) {
		return postService.findByTitleContaining(title);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createPost(@RequestParam("post") Post post) {
		postService.savePost(post);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updatePost(@RequestParam("post") Post post) {
		postService.updatePost(post);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void deletePost(@PathVariable("id") long id) {
		postService.deletePost(id);
	}
}
