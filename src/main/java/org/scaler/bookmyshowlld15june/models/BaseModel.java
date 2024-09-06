package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date createdAt;
    private Date updatedAt;
}

//H.W.
//Map all the required Classess to @Entity
// Complete all the cardinalities before next session.