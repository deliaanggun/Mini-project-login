package idistbootcamptima.miniproject.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 7/10/2021
 */
@Entity
@Data
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Table(name="user_tabel") //create table in database
public class User {
    @Id
    @GeneratedValue(strategy = AUTO) //id to be generated
    private Long id; //perlu nanya bisa diganti nik gak?
    private String name;
    private String username;
    private String password;
    private String mpin;
    private String phone;
    private String email;
    private String rek;
    private LocalDate dob;
    private Integer balance;
    private String bank;
    @ManyToMany(cascade = CascadeType.ALL,
            fetch = EAGER) //to load all roles when you load users
    private Collection<Role> roles = new ArrayList<>();


}
