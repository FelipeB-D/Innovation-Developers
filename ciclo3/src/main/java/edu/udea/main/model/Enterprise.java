package edu.udea.main.model;

import lombok.*;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Unique
    private String name;
    @Unique
    private String document;
    private String phone;
    private String address;
    @ManyToOne
    @JoinColumn
    private Transaction[] transactions;
    private Date createdAt;
    private Date updatedAt;

}
