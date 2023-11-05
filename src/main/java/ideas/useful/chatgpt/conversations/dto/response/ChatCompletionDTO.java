package ideas.useful.chatgpt.conversations.dto.response;

import ideas.useful.chatgpt.conversations.dto.request.CustomMessage;
import lombok.Data;

import java.util.List;
import java.util.Objects;

//{
//  "id": "chatcmpl-8HVkICMeieFTfoXOLfAhU95ospVIE",
//  "object": "chat.completion",
//  "created": 1699184298,
//  "model": "gpt-3.5-turbo-0613",
//  "choices": [
//    {
//      "index": 0,
//      "message": {
//        "role": "assistant",
//        "content": "Hello! How can I assist you today?"
//      },
//      "finish_reason": "stop"
//    }
//  ],
//  "usage": {
//    "prompt_tokens": 8,
//    "completion_tokens": 9,
//    "total_tokens": 17
//  }
//}
@Data
public class ChatCompletionDTO {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choice> choices;
    private Usage usage;
}