package com.portfolio_yt_src_data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Contact")
public class Contact {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String contactDetails;
    private String query;

    public Contact() {}

    public Contact(String firstName, String lastName, String contactDetails, String query) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactDetails = contactDetails;
        this.query = query;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getContactDetails() { return contactDetails; }
    public void setContactDetails(String contactDetails) { this.contactDetails = contactDetails; }

    public String getQuery() { return query; }
    public void setQuery(String query) { this.query = query; }
}
