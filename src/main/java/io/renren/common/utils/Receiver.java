package io.renren.common.utils;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;



/**
 * 消息接收者
 *
 * @author huyi
 * @create 2017/12/19 17:08
 */
@Component
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @Async("myExecutor")
    @KafkaListener(topics = "hy1")
    public void processMessage(ConsumerRecord<Integer, String> record){
        logger.info("====================topic:"+record.topic()+"___partition:"+record.partition()+"___key:"+record.key()+"___value:"+record.value());
    }

    @KafkaListener(topics = "hy2")
    public void processMessage(String content){
        logger.info("====================topic:hy2"+"___value:"+content);
    }

}
