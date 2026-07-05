package com.restcompany.restdev.repository;
import com.restcompany.restdev.entity.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Entry,String> {
}
