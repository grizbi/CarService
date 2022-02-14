package entity;


import javax.persistence.*;

@Entity
public class Admin {

    public Admin(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int adminID;

    @Column(name = "Password")
    String password;

    @Column(name = "Login")
    String login;


    public Admin(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
