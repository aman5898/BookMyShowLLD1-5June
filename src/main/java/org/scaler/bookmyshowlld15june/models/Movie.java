package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String title;
    private String director;
    private String year;
    private String genre;

    @ElementCollection
    private List<String> actors;

//    @Enumerated(value = EnumType.STRING)
//    private Language language;

    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<Language> languages;

    private Date releastDate;
    private double length;
}

//Movie
//id title director year genre releatsdate leng actors

//Movie_actors
//1
//Movie_Lanugea
//movie_id langString
//      1 eng
//1 hin


