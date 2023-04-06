package com.training.smartfarm.farmdataservice.event.producer;

import com.training.smartfarm.farmdataservice.event.SensorEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.training.smartfarm.farmdataservice.config.KafkaProducerConfig.SENSOR_CONFIGURATION_UPDATE_TOPIC;

@Slf4j
@Component
@RequiredArgsConstructor
public class SensorEventProducer {

    private final KafkaTemplate<String, SensorEvent> kafkaTemplate;

    public void sendMessage(SensorEvent sensorEvent) {
        kafkaTemplate.send(SENSOR_CONFIGURATION_UPDATE_TOPIC, sensorEvent);
    }
}
