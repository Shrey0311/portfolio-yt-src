package com.portfolio_yt_src_data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Skills") // Collection name in MongoDB
public class Skill {

    @Id
    private String id;
    private String imageUrl;
    private String proficiency;

    public Skill() {}

    public Skill(String imageUrl, String proficiency) {
        this.imageUrl = imageUrl;
        this.proficiency = proficiency;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getProficiency() { return proficiency; }
    public void setProficiency(String proficiency) { this.proficiency = proficiency; }
}
