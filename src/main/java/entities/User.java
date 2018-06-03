package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Getter
    @Setter
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "displayedName")
    private String displayedName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PARTICIPATION",
                joinColumns = {@JoinColumn(name = "idUser")},
                inverseJoinColumns = {@JoinColumn(name = "idEvent")})
    private List<Event> events;
}
