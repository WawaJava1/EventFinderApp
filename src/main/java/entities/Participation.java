package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PARTICIPATION")
public class Participation {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idParticipation")
    private Integer idParticipation;

    @Column(name = "idEvent")
    private String idEvent;

    @Column(name = "idUser")
    private String idUser;
}

