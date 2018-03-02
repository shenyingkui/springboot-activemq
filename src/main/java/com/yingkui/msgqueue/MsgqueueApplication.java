package com.yingkui.msgqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yingkui")
public class MsgqueueApplication {

	public static void main(String[] args) {

		SpringApplication.run(MsgqueueApplication.class, args);

	}
}
