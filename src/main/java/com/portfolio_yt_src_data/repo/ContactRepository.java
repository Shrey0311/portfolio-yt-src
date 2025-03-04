package com.portfolio_yt_src_data.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.portfolio_yt_src_data.entity.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {}
