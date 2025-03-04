package com.portfolio_yt_src_data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "Experience") // Collection name in MongoDB
public class Experience {

    @Id
    private String id;
    private String title;
    private String company;
    private String startDate;
    private String endDate;
    private List<String> icon;
    private List<String> points;
    private String image;

    public Experience() {}

    public Experience(String title, String company, String startDate, String endDate, List<String> icon, List<String> points, String image) {
        this.title = title;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.icon = icon;
        this.points = points;
        this.image = image;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public List<String> getIcon() { return icon; }
    public void setIcon(List<String> icon) { this.icon = icon; }

    public List<String> getPoints() { return points; }
    public void setPoints(List<String> points) { this.points = points; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
