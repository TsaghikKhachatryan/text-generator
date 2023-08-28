package com.gamerpay.textgenerator.service;

import com.gamerpay.textgenerator.data.Text;
import com.gamerpay.textgenerator.repository.TextEntryRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TextEntryService {

    private final static Logger log = LoggerFactory.getLogger(TextEntryService.class);
    private final TextEntryRepository textEntryRepository;

    public Text saveText(Text text) {
        log.info("Saving text {}", text);
        return textEntryRepository.save(text);
    }
}
