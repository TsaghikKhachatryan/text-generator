package com.gamerpay.textgenerator.controller;

import com.gamerpay.textgenerator.data.Text;
import com.gamerpay.textgenerator.service.TextEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/text")
public class TextController {

    @Autowired
    private TextEntryService textEntryService;

    @PostMapping("/save")
    public ResponseEntity<Text> saveText(@RequestBody Text text) {
        var textEntry = textEntryService.saveText(text);
        return new ResponseEntity<>(textEntry, HttpStatus.CREATED);
    }
}