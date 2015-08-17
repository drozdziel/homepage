package com.drozdziel.homepage.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

/**
 * Created by Piotr Droździel on 7/26/15.
 */
@Data
@Builder
@AllArgsConstructor
public class Resume extends EntityBase {

    @Id
    private String id;

    private String fullName;

    private Date dateOfBirth;

    private List<Education> educations;

    private List<Employment> employments;

    private List<Course> courses;

    private List<SkillGroup> skillGroups;
}
