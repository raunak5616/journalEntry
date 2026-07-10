package com.restcompany.restdev.entity;

import com.mongodb.client.model.Collation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection ="/users")
    @Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
        @Id
        private ObjectId id;
        @Indexed(unique = true)
        private String userName;
        private String password;
        @DBRef
        private List<Entry> entries = new ArrayList<>();
}
