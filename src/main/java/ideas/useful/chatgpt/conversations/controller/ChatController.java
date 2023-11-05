package ideas.useful.chatgpt.conversations.controller;

import ideas.useful.chatgpt.conversations.service.chatgpt.ChatGptCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {
    private final ChatGptCaller caller;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        return caller.callChatGpt(prompt);
    }
}