package edu.udea.main.model;

import edu.udea.main.enums.Enum_RoleName;
import lombok.*;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Unique
   private String email;
   @Enumerated(EnumType.STRING)
   @Column( name = "role")
   private Enum_RoleName role;
   @ManyToOne
   @JoinColumn(name = "enterprise_ID")
   private Enterprise enterprise;
   @ManyToOne
   @JoinColumn(name = "transaction_ID")
   private Transaction[] transactions;
   private Date updatedAt;
   private Date createdAt;

   public Enterprise getEnterprise() {
      return enterprise;
   }

   public void setEnterprise(Enterprise enterprise) {
      this.enterprise = enterprise;
   }
}
