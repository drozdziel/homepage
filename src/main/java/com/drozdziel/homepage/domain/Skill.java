package com.drozdziel.homepage.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Piotr Droździel on 8/16/15.
 */
@Entity
@Table(name = "skill")
@Data
@Builder
@AllArgsConstructor
public class Skill extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;
}
