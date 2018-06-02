package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

    private Integer id;

    private String login;

    private String email;

    private String displayedName;
}
