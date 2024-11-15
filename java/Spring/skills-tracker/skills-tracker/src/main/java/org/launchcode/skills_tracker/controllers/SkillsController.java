package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String skills(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few Skills We Would like to learn. Here is the list!</h2>" +
                        "<ol><li>Java</li><li>Python</li><li>Salesforce</li></ol>"+
                        "</body>" +
                        "</html>";
        return html;
    }
    @GetMapping("form")
    public String skillsform(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method='POST' action='/form'>" +
                        "<div>Name: </div><div><input type='text' name='username' ></div>" +
                        "<div>My Favorite Language: </div><div><select name='firstpreference'><option>Python</option><option>Java</option><option>Salesforce</option></select></div>"+
                        "<div>My Second Favorite Language: </div><div><select name='secondpreference'><option>Python</option><option>Java</option><option>Salesforce</option></select></div>"+
                        "<div>My Third Favorite Language: </div><div><select name='thirdpreference'><option>Python</option><option>Java</option><option>Salesforce</option></select></div>"+
                        "<input type='submit'/>"+
                        "</form>"+
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    public String skillsformhandler(@RequestParam String username, String firstpreference, String secondpreference, String thirdpreference){
        return "<html><body>" +
                username +
                "<table style='border:1px solid red'>" +
                "<tr><td>1. </td><td>" +
                firstpreference +
                "</td></tr>" +
                "<tr><td>2. </td><td>" +
                secondpreference +
                "</td></tr>" +
                "<tr><td>3. </td><td>" +
                thirdpreference +
                "</td></tr>" +
                "</table>" +
                "</body</html>" ;
    }






}
