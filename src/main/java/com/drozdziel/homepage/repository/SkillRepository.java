package com.drozdziel.homepage.repository;

import com.drozdziel.homepage.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Piotr Droździel on 8/16/15.
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
