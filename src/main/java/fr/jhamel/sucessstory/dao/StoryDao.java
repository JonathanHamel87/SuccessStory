package fr.jhamel.sucessstory.dao;

import fr.jhamel.sucessstory.entity.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryDao extends CrudRepository<Story, String> {
}
