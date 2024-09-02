package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date updatedAt;
}

//H.W.
//Map all the required Classess to @Entity
// Complete all the cardinalities before next session.