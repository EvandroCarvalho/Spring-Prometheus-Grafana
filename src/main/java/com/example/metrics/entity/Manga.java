package com.example.metrics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "manga")
public class Manga extends AuditModel {

    @Column(name = "name")
    private String name;
    @Column(name = "year")
    private String year;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
