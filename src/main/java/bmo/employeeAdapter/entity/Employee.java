package bmo.employeeAdapter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {
    @Id
    private Integer id;
    private String name;
    @Version
    private Integer version; // Used by JPA for optimistic locking

}
