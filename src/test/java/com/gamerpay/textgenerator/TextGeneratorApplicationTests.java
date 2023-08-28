package com.gamerpay.textgenerator;

import com.gamerpay.textgenerator.data.Text;
import com.gamerpay.textgenerator.repository.TextEntryRepository;
import com.gamerpay.textgenerator.service.TextEntryService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class TextGeneratorApplicationTests {

	@Mock
	private TextEntryRepository textEntryRepository;

	@InjectMocks
	private TextEntryService textEntryService;

	@Test
	public void testSaveText() {
		Text text = new Text();
		text.setText("Sample text");

		when(textEntryRepository.save(text)).thenReturn(text);

		Text savedText = textEntryService.saveText(text);

		verify(textEntryRepository, times(1)).save(text);
		assertEquals(text, savedText);
	}
}
