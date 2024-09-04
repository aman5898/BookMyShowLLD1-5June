package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;
    @ManyToOne
    private Theatre theatre;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;
    private int dimn ;
}


//1      :  M
//Theatre   Screen
//1      :  1

//1 : M
//Student : Course
//M:1


//1:M

//Screen will have Theatre ID
