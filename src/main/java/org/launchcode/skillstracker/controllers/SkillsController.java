package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    @RequestMapping(value = "")
    public String start() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>C#</li>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "</ol>" +
                "</body>" +
                "</html";
        return html;
    }

    @GetMapping(value="form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form method = 'post'>" +

                "<p> Name: </p>" +
                "<input type = 'text' name = 'name'/>" +
                "</br>" +
                "<p> My favorite language: </p>" +
                "</br>" +
                "<select name = 'firstSkills' id='skill'>" +
                "<option value = 'C#'> C# </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Java'> Java </option>" +
                "</select>" +
                "</br>" +

                "<p> My second favorite language: </p>" +
                "</br>" +
                "<select name = 'secondSkills' id='skill'>" +
                "<option value = 'C#'> C# </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Java'> Java </option>" +
                "</select>" +
                "</br>" +

                "<p> My third favorite language: </p>" +
                "</br>" +
                "<select name = 'thirdSkills' id='skill'>" +
                "<option value = 'C#'> C# </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Java'> Java </option>" +
                "</select>" +

                "</br>" +
                "</br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>"  +
                "</body>" +
                "</html>";

    }

    @PostMapping(value="form")
    @ResponseBody
    public static String faveSkills (@RequestParam String name, @RequestParam String firstSkills, @RequestParam String secondSkills, @RequestParam String thirdSkills) {

        String html =
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ firstSkills + "</li>" +
                "<li>" + secondSkills + "</li>" +
                "<li>" + thirdSkills + "</li>" +
                "</ol>";

        return html;

    }
}
