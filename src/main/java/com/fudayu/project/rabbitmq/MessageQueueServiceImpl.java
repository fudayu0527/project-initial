package com.fudayu.project.rabbitmq;
 
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

/**
 * 
 * @author victor
 * @desc 消息队列服务接口实现
 */
@Service("messageQueueService")
public class MessageQueueServiceImpl implements IMessageQueueService{
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
 
	@Override
	public void send(String queueName, String msg) {
		rabbitTemplate.convertAndSend(MQConstant.DEFAULT_EXCHANGE,queueName, msg);
	}
 
 
 
}