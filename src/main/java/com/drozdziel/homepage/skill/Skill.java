package com.drozdziel.homepage.skill;

import com.drozdziel.homepage.utils.EntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Piotr Droździel on 8/16/15.
 */
@Entity
@Table(name = "skill")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Skill extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;
}
