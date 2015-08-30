package com.drozdziel.homepage.web.controller;

import com.drozdziel.homepage.domain.Resume;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Piotr Droździel on 7/26/15.
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "ITS ALIVE!!!";
    }
}
