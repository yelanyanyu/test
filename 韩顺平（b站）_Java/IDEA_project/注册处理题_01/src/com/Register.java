package com;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Register {
    private String username;
    private String password;
    private String mail;

    public Register(String username, String password, String mail) {
        setUsername(username);
        setPassword(password);
        setMail(mail);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() <= 4 && username.length() >= 2) {
            this.username = username;
        } else {
            throw new RuntimeException("用户名不合法！");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                throw new RuntimeException("您输入的不是数字");
            }
        }
        if (password.length() == 6) {
            this.password = password;
        } else {
            throw new RuntimeException("密码长度必须为6位");
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail.indexOf('@') < mail.indexOf('.') && mail.indexOf('@') != -1) {
            this.mail = mail;
        } else {
            throw new RuntimeException("请输入正确的邮箱地址");
        }
    }
}
