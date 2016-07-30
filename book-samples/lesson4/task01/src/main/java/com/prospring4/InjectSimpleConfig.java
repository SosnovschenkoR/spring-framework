package com.prospring4;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("InjectSimpleConfig")
public class InjectSimpleConfig {
    private Long ageInSeconds;
    private int age = 39;
    private float height = 1.778f;
    private String name = "Chris Schaefer";
    private boolean programmer = true;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
