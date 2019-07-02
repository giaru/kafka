package de.hsReutlingen.Kafka.consumer;

import java.io.IOException;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TempConsumer
{
    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "temperature", groupId = "group_id")
    public void consume( String message ) throws IOException
    {
        int message1 = Integer.parseInt(message);

        if (message1 >= 41)
        {
            this.logger.info(String.format("# ->Status nicht in Ordnung Temperatur ist >= 40 Grad", message1 + "Grad"));
        }
        else
        {
            this.logger.info(String.format("# ->Status in Ordnung Temperatur ist <= 40 Grad", message1 + "Grad"));
        }
    }

}
