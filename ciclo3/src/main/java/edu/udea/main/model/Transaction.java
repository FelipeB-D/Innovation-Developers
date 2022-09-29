package edu.udea.main.model;

import edu.udea.main.enums.Enum_Concept;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "concept")
    private Enum_Concept concept;
    private float amount;
    @ManyToOne
    @JoinColumn(name = "enterprise_ID")
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
