package com.vw.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "laptop")
    private String laptop;

    @Column(name = "tv")
    private String tv;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "watch")
    private String watch;

    @Column(name = "headphone")
    private String headphone;

}
