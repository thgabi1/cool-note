package com.codecool.CoolNoteApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//responsible for handling all the incoming HTTP requests
@Controller
@RequestMapping("/")
public class NoteController {

    // GET method
    @GetMapping(value = "note")
    // responsible for displaying the existing notes
    // with our possibilities to Add or Edit notes
    public String displayAddNoteForm() {
        return "note";
    }

    //POST methods
    @PostMapping(value = "note")
    public String processAddNoteForm(@RequestParam String newNote) {
        return "redirect:";
    }
}
