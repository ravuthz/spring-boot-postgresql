package com.springboot.tutorial.controllers;

import com.springboot.tutorial.models.Category;
import com.springboot.tutorial.models.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    private List<Post> postList = new ArrayList<>(){{
        add(new Post(1, "post-1"));
        add(new Post(2, "post-2"));
        add(new Post(3,  "post-3"));
    }};

    // GET List / Show
    // @RequestMapping(value = "/", method = RequestMethod.GET) alias to @GetMapping("/")
    @GetMapping("/posts")
    List<Post> listPost() {
        return postList;
    }

    @GetMapping("/posts/{id}")
    String viewPost(@PathVariable("id") long id) {
        Post post = postList.get(0);
        post.setName("hello");

        Category cate = new Category(1, "hello");
        System.out.println(cate);

        System.out.println(post);

        return "Post name: " + post.getName();
    }

    // POST - Create
    // @RequestMapping(value = "/", method = RequestMethod.POST) alias to @PostMapping("/posts")
    @PostMapping("/posts")
    Post createPost() {
        Post post = new Post(4, "post-4");
        postList.add(post);
        return post;
    }

    // PUT / PATCH - Update
    @PutMapping("/posts/{id}")
    // @RequestMapping(value = "/", method = RequestMethod.Put) alias to @PutMapping("/posts/{id}")
    String updatePost(@PathVariable("id") long id) {
        return "Update Post" + id;
    }

    // DELETE - Detele
    // @RequestMapping(value = "/", method = RequestMethod.Put) alias to @DeleteMapping("/posts/{id}")
    @DeleteMapping("/posts/{id}")
    String deletePost(@PathVariable("id") long id) {
        return "Delete Post" + id;
    }

}
