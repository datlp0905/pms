package pms.com.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String id;

    private String fullname;

    private Date dob;

    private Date joinDate;

    private String email;

    private String phoneNo;

    private boolean isMale;

    private String skill;

    private String role;

    private boolean isActive;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;
}
