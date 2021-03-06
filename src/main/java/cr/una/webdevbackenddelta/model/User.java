package cr.una.webdevbackenddelta.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Entity for the user
 */
@Entity
@Table( name = "users" )
public class User {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    @Getter @Setter
    private Long idUser;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private Date createDate;
    @Getter @Setter
    private boolean enabled;
    @Getter @Setter
    private boolean tokenExpired;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    @Getter @Setter
    private List<Role> roleList;

    @ManyToOne
    @JoinColumn(name = "id_department", nullable = true)
    @Getter
    @Setter
    private Department department;

    @OneToMany(mappedBy = "user")
    @Getter @Setter
    private List<TimesheetDetails> timesheetDetailsList;
}
