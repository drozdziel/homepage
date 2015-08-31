package com.drozdziel.homepage.resume;

import com.drozdziel.homepage.education.Course;
import com.drozdziel.homepage.education.Education;
import com.drozdziel.homepage.employment.Employment;
import com.drozdziel.homepage.skill.Skill;
import com.drozdziel.homepage.utils.EntityBase;
import lombok.*;
import org.springframework.data.annotation.Id;

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

    private List<Skill> skillGroups;
}
