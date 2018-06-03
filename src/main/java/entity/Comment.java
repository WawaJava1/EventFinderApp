package entity;

import lombok.Getter;
import lombok.Setter;

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
    private User user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "EVENT",
            joinColumns = {@JoinColumn(name = "idEvent")})
    private Event event;
}
