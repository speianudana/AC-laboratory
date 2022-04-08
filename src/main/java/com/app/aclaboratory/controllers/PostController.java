package com.app.aclaboratory.controllers;

import com.app.aclaboratory.model.Post;
import com.app.aclaboratory.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addPost() {
        Post post = new Post(4L, "Gasit", "Alba", "Siameza", "Pisica", 2L, "Fata", "0690423904");

        postService.add(post);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void deletePost(@PathVariable("id") Long id) {
        postService.delete(id);
    }
}
