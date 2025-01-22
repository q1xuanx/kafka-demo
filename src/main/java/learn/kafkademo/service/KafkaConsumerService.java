package learn.kafkademo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private Logger log = LoggerFactory.getLogger(KafkaProducerService.class);

    @KafkaListener(topics = "my-message", groupId = "group_id")
    public void consume(String message) {
        log.info("Receiver message: " + message);
    }
}
