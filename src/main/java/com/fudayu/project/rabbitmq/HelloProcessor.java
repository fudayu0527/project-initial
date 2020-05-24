package com.fudayu.project.rabbitmq;
 
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 

/**
 * 
 * @author victor
 * @desc hello 消息队列消费者
 */
@Component
@RabbitListener(queues = MQConstant.HELLO_QUEUE_NAME)
public class HelloProcessor {

	
	@RabbitHandler
    public void process(String content) {
		System.out.println("接受消息:" + content);
    }


}