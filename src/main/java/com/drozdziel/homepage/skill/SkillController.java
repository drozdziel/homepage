package com.drozdziel.homepage.skill;

import com.drozdziel.homepage.skill.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Piotr Droździel on 8/16/15.
 */
@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public long count() {
        return skillRepository.count();
    }
}
