package entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComment")
    private Integer idComment;

    @Column(name = "contents")
    private String contnents;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "idEvent")
    private Integer idEvent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "USER",
            joinColumns = {@JoinColumn(name = "idUser")})
    private List<User> user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private List<Event> event;
}
