package com.organisationmicroservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table( name="organisation_tab" )
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organisation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(nullable = false)
    private String organisationName;
    private String organisationDescription;
    @Column(nullable = false, unique = true)
    private String organisationCode;
    @CreationTimestamp
    private LocalDateTime createdDate;
}