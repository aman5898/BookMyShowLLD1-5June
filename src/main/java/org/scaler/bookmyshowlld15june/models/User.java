package org.scaler.bookmyshowlld15june.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel{
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany
    private List<Booking> bookings;
}

//h.w.
// In unidirectional Relationship
// one to many cardinality is creating an extra table, how to stop that
//

//Break -> 10:46pm - 10:52pm