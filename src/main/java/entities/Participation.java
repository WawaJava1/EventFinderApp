package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARTICIPATION")
public class Participation {

    private Integer idParticipation;
    private String idEvent;
    private String idUser;
}

