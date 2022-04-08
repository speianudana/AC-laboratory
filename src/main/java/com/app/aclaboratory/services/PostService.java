package com.app.aclaboratory.services;

import com.app.aclaboratory.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private List<Post> postList = new ArrayList<>(Arrays.asList(
            new Post(1L, "Pierdut", "Cafeniu", "Cocker spaniel", "Caine", 10L, "Baiat", "069023904"),
            new Post(2L, "Gasit", "ALb", "Cocker spaniel", "Caine", 4L, "Fata", "069023304"),
            new Post(3L, "Pierdut", "Negru", "Labrador", "Caine", 2L, "Baiat", "0690423904")));


    public List<Post> getAllPosts() {
        return postList;
    }

    public void add(Post post) {
        postList.add(post);
    }

    public  void delete(Long id) {
        Optional<Post> post = postList.stream().filter(u -> u.getId().equals(id)).findFirst();
        if (post.isPresent()) {
            Post deletePost = post.get();
        postList.remove(deletePost);}
    }
}
