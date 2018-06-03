package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComment")
    private Integer idComment;

    @Column (name = "contents")
    private String contnents;

    @Column (name = "idUser")
    private Integer idUser;

    @Column (name = "idEvent")
    private Integer idEvent;

}