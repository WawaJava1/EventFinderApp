package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Column(name = "idComment")
    private Integer idComment;

    private String contnents;

    private Integer idUser;

    private Integer idEvent;

}
