package com.reward.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gjason on 2017/1/27.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private Integer age;
    private String height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
