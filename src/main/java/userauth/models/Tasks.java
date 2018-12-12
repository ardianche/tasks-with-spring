package userauth.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tasks {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String title;
    private String description;
    private Date created_date;
    private Number status;
    private long user_id;

    public long getUser() {
        return user_id;
    }

    public void setUser(long user) {
        this.user_id = user;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Number getStatus() {
        return status;
    }

    public void setStatus(Number status) {
        this.status = status;
    }
    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
