package com.example.birthdayapp;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StoryController {

    // In-memory list to store stories
    private final List<Story> stories = new ArrayList<>();

    // Endpoint to receive new stories
    @PostMapping("/submit")
    public String submitStory(@RequestBody Story story) {
        stories.add(story);
        return "Story submitted successfully!";
    }

    // Endpoint to get all stories
    @GetMapping("/stories")
    public List<Story> getStories() {
        return stories;
    }
}
