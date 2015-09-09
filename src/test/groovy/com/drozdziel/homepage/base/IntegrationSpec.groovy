package com.drozdziel.homepage.base

import com.drozdziel.homepage.MainConfig
import com.drozdziel.homepage.utils.Profiles
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ActiveProfiles
import org.springframework.transaction.annotation.Transactional
import spock.lang.Ignore
import spock.lang.Specification

@Rollback
@Transactional
@SpringApplicationConfiguration(classes = MainConfig)
@ActiveProfiles(Profiles.TEST)
@Ignore
class IntegrationSpec extends Specification {
}
