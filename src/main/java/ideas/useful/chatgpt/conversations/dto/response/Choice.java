package ideas.useful.chatgpt.conversations.dto.response;

import lombok.Data;

import ideas.useful.chatgpt.conversations.dto.request.CustomMessage;

@Data
public class Choice {
    private int index;
    private CustomMessage message;
    private String finish_reason;
}
