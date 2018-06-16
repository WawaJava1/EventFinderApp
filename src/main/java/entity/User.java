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

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinTable (name = "ORGANIZER",
    joinColumns = {@JoinColumn(name = "idUser")})
    private Organizer organizer;

    private User() {
    }

    public User(String login, String email, String displayedName, List<Participation> participation, List<Comment> comments, Organizer organizer) {
        this.login = login;
        this.email = email;
        this.displayedName = displayedName;
        this.participation = participation;
        this.comments = comments;
        this.organizer = organizer;
    }
}
