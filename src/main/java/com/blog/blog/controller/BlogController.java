package com.blog.blog.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.entity.Post;
import com.blog.blog.service.PostService;

@RestController
public class BlogController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/post")
	public List<Post> posts() {
		return postService.getAllPosts();
	}
	
	@PostMapping(value="/post")
	public void publishPost(@RequestBody Post post) {
		if(post.getDateCreated()==null)
			post.setDateCreated(new Date());
		postService.insert(post);
	}

}
