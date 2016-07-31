package com.prospring4;

import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;
	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
			"You must set the property messageProvider of class:"
			+ StandardOutMessageRenderer.class.getName());
			// Вы должны установить свойство messageProvider класса
		}
		System.out.println(messageProvider.getMessage());
	}
	@Override
	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}
	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}