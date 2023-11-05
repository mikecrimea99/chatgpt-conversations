package ideas.useful.chatgpt.conversations.service.chatgpt;

import ideas.useful.chatgpt.conversations.dto.request.ChatRequest;
import ideas.useful.chatgpt.conversations.dto.request.CustomMessage;
import ideas.useful.chatgpt.conversations.dto.response.ChatCompletionDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class ChatGptCaller {
    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    public String callChatGpt(String userMessage) {
        List<CustomMessage> messages = List.of(new CustomMessage(userMessage));
        ChatRequest request = new ChatRequest(model, messages, 100);
        HttpEntity<ChatRequest> requestEntity = new HttpEntity<>(request);
        ResponseEntity<ChatCompletionDTO> responseEntity =
                restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, ChatCompletionDTO.class);
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            log.info(responseEntity.getBody().toString());
            return responseEntity.getBody().getChoices().get(0).getMessage().getContent();
        } else {
            return "Error: Unable to get a response from ChatGPT API";
        }
    }
}
