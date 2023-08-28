package com.gamerpay.textgenerator.controller;

import com.gamerpay.textgenerator.data.Text;
import com.gamerpay.textgenerator.service.TextEntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/text")
public class TextController {

    private final TextEntryService textEntryService;

    @PostMapping("/save")
    public ResponseEntity<Text> saveText(@RequestBody Text text) {
        var textEntry = textEntryService.saveText(text);
        return new ResponseEntity<>(textEntry, HttpStatus.CREATED);
    }
}