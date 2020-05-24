package com.fudayu.project.rabbitmq;

/**
 * 
 * @author victor
 * @desc 消息队列服务接口
 */
public interface IMessageQueueService {
	
	/**
	 * 发送消息到队列
	 * @param queue 队列名称
	 * @param message 消息内容
	 */
	public void send(String queueName,String message);
	
	
}