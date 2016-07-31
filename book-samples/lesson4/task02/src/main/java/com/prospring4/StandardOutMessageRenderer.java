package com.prospring4;

import org.springframework.stereotype.Service;

@Service("MessageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider MessageProvider;

    @Override
    public void render() {
        if (MessageProvider == null) {
            throw new RuntimeException(
                    "You  ust set the property  essageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        // Вы должны установить свойство MessageProvider класса
        }
        System.out.println(MessageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.MessageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.MessageProvider;
    }
}