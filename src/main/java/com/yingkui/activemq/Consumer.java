/*
package com.yingkui.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.time.ZonedDateTime;

@Component
public class Consumer {
    @JmsListener(destination = "queue1",containerFactory = "jmsQueueListener")
    public void receiveQueue(final TextMessage text, Session session) throws JMSException{
        try{
            System.out.println("consumer收到报文为:" + text.getText());
            System.out.println(ZonedDateTime.now());
            if("success".equals(text.getText())){
                text.acknowledge();//使用手动签收模式，需要手动的调用，如果不在catch中调用session.recover()消息只会在重启服务后重发

            }else{
                session.recover();//此处不可省略，重发消息使用
            }
        }catch (Exception e){
            session.recover();//此处不可省略，重发消息使用
        }
    }
}





*/
