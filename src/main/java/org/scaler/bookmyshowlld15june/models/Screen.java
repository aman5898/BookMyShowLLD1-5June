package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;
    @ManyToOne
    private Theatre theatre;
    @OneToMany
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
