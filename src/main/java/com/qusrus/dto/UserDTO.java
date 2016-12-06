package com.qusrus.dto;

/**
 * Created by intern on 2016-12-05.
 */
public class UserDTO {
    public String getUser_id_pk() {
        return user_id_pk;
    }

    public void setUser_id_pk(String user_id_pk) {
        this.user_id_pk = user_id_pk;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String user_id_pk;
    public String user_pw;
    public String user_name;
    public String user_email;

}
