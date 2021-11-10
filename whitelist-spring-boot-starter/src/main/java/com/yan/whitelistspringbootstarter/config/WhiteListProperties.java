package com.yan.whitelistspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hairui
 * @date 2021/11/9
 * @des
 */
@ConfigurationProperties(prefix = "yan.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
