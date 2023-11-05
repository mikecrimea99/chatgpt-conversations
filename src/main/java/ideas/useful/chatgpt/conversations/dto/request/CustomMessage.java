package ideas.useful.chatgpt.conversations.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class CustomMessage {
    private final String role = "user";
    private String content;
}
