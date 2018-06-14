package query;

public class ParticipationQuery {

    private Integer idEvent;
    private Integer idUser;

//    po nazwie eventu
    private String name;

    public ParticipationQuery() {
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }
}
