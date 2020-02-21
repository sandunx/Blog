package com.blog.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog.entity.Post;
import com.blog.blog.repository.PostRepo;

@Service
public class PostService {

	@Autowired
	private PostRepo postRepo;
	
	public List<Post> getAllPosts(){
		return postRepo.findAll();
	}

	public void insert(Post post) {
		postRepo.save(post);
		
	}
}
