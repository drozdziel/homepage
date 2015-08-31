package com.drozdziel.homepage.skill;

import com.drozdziel.homepage.utils.EntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Piotr Droździel on 8/16/15.
 */
@Data
@Builder
@AllArgsConstructor
public class SkillGroup extends EntityBase {

    private String name;

    private List<Skill> skills;
}
