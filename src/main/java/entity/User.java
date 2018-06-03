package entity;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "displayedName")
    private String displayedName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PARTICIPATION",
            joinColumns = {@JoinColumn(name = "idUser")})
    private List<Participation> participation;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "COMMENT",
            joinColumns = {@JoinColumn(name = "idUser")})
    private List<Comment> comments;
}
