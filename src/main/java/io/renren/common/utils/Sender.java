package io.renren.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 *
 * @author huyi
 * @create 2017/12/19 16:56
 */
@Component
public class Sender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String topic,int partition,String key,String data){
        kafkaTemplate.send(topic,partition,key,data);
    }
}
