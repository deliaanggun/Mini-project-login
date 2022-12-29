package idistbootcamptima.miniproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*; //diganti from table

import java.util.Set;

import static javax.persistence.GenerationType.*; //from AUTO

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="role_tabel")
public class Role {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name; //name of the role
//    @JsonIgnore
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> user;
}
