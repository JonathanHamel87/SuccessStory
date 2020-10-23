package fr.jhamel.sucessstory.controller;

import fr.jhamel.sucessstory.dao.StoryDao;
import fr.jhamel.sucessstory.entity.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/story")
public class StoryController {
    @Autowired
    StoryDao storyDao;

    @GetMapping("")
    public Iterable<Story> getStories(){
        return storyDao.findAll();
    }
}
