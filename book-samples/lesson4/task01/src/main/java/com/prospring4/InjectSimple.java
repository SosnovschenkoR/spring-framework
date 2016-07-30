package com.prospring4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

@Configuration
@Service ("InjectSimple")
public class InjectSimple {
    @Value("Chris Schaefer Jr")
    private String name;
    @Value("#{InjectSimpleConfig.height}")
    private float height = 1.8f;
    private Long ageInSeconds;
    private boolean programmer;
    private int age;

    public Long getAgeinSeconds() {
        return ageInSeconds;
    }

    public void setAgeinSeconds(Long ageinSeconds) {
        this.ageInSeconds = ageinSeconds;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static Logger log = Logger.getLogger(InjectSimple.class.getName());
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath*:META-INF/spring/app-context.xml");
        ctx.refresh();
        InjectSimple simple = (InjectSimple) ctx.getBean("InjectSimple");
        System.out.println(simple);
    }

    public String toString() {
        return "Name : " + name + "\n"
                + "Age:" + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }
}