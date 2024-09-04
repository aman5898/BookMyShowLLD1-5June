package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
//    private List<Screen> screens;

    @ManyToMany
    private List<Movie> movies;
//    @ManyToOne
//    1 : 1
//    T     : R
//    M:1
    @ManyToOne
    private Region region;
}



//1 : M
//T : M
//M : 1

//1      :  M
//Theatre   Screen
//1      :  1


//1:M

//Screen table will have Theatre ID
//select * from Screen where theatre_id = 5;

//Theatre
//id created_At updated_At name address movies
//List<Screen>
// Screen
// id created_At updated_At theatre id