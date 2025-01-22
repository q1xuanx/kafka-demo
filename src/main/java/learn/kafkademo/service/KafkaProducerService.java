package learn.kafkademo.service;


import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private static final String topic = "my-message";
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Logger log = LoggerFactory.getLogger(KafkaProducerService.class);
    public void sendMessage(String message){
        System.out.println(message);
        kafkaTemplate.send(topic, message);
        log.info("Send message topic: " + topic);
    }
}
