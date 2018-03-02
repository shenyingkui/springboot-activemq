/*
package com.yingkui.activemq;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;


@EnableJms
@Configuration
public class ActiveMqConfig {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("queue1");
    }

    @Bean
    public RedeliveryPolicy redeliveryPolicy(){
        RedeliveryPolicy redeliveryPolicy = new RedeliveryPolicy();
        //是否在每次尝试重新发送失败后,增长等待时间
        redeliveryPolicy.setUseExponentialBackOff(true);
        //重发次数，默认6次，这里设置为10次
        redeliveryPolicy.setMaximumRedeliveries(10);
        //重发时间间隔,默认为1秒
        redeliveryPolicy.setInitialRedeliveryDelay(2000);
        //第一次失败后重新发送之前等待500毫秒,第二次失败在等待500* 2 毫秒
        redeliveryPolicy.setBackOffMultiplier(2);
        //是否避免消息碰撞
        redeliveryPolicy.setUseCollisionAvoidance(true);

        //设置重发最大拖延时间， -1 表示没有拖延，只有setUseExponentialBackOff(true) 时生效
        redeliveryPolicy.setMaximumRedeliveryDelay(-1);
        return redeliveryPolicy;

    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(
            @Value("${activemq.url}") String url,
            RedeliveryPolicy redeliveryPolicy){
        ActiveMQConnectionFactory activeMQConnectionFactory =
                new ActiveMQConnectionFactory("admin","admin",url);
        activeMQConnectionFactory.setRedeliveryPolicy(redeliveryPolicy);
        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate(ActiveMQConnectionFactory activeMQConnectionFactory,
                                   Queue queue){
                JmsTemplate jmsTemplate = new JmsTemplate();
                jmsTemplate.setDeliveryMode(2); //持久化配置，1 非持久化，2 表示持久化
                jmsTemplate.setConnectionFactory(activeMQConnectionFactory);
                jmsTemplate.setSessionAcknowledgeMode(4); //客户端签收模式
        jmsTemplate.setDefaultDestination(queue); //默认。也可不设置，在发送消息时设置队列
        return jmsTemplate;
    }

    //定义一个消息监听器连接工厂,这里定义的是点对点模式的监听器连接工厂
    @Bean(name="jmsQueueListener")
    public DefaultJmsListenerContainerFactory jmsQueueListenerContainerFactory(ActiveMQConnectionFactory activeMQConnectionFactory){
        DefaultJmsListenerContainerFactory factory =
                new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(activeMQConnectionFactory);
        //设置连接数
        factory.setConcurrency("1-10");
        //重连间隔时间
        factory.setReceiveTimeout(1000L);
        factory.setSessionAcknowledgeMode(4);

        return factory;

    }


}
*/
