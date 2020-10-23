package fr.jhamel.sucessstory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "Story")
public class Story implements Serializable {
    @Id
    private String id;

    private String content;

    private String category;

    public Story() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
