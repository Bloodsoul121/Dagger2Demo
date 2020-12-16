package com.blood.daggerdemo.mvp.bean;

import java.util.List;

public class LoginResult {

    /**
     * data : {"admin":false,"chapterTops":[],"coinCount":0,"collectIds":[],"email":"","icon":"","id":83510,"nickname":"bloodsoul","password":"","publicName":"bloodsoul","token":"","type":0,"username":"bloodsoul"}
     * errorCode : 0
     * errorMsg :
     */

    /**
     * {
     *     "data": null,
     *     "errorCode": -1,
     *     "errorMsg": "账号密码不匹配！"
     * }
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    @Override
    public String toString() {
        return "LoginResult{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public static class DataBean {
        /**
         * admin : false
         * chapterTops : []
         * coinCount : 0
         * collectIds : []
         * email :
         * icon :
         * id : 83510
         * nickname : bloodsoul
         * password :
         * publicName : bloodsoul
         * token :
         * type : 0
         * username : bloodsoul
         */

        private Boolean admin;
        private int coinCount;
        private String email;
        private String icon;
        private int id;
        private String nickname;
        private String password;
        private String publicName;
        private String token;
        private int type;
        private String username;
        private List<?> chapterTops;
        private List<?> collectIds;

        @Override
        public String toString() {
            return "DataBean{" +
                    "admin=" + admin +
                    ", coinCount=" + coinCount +
                    ", email='" + email + '\'' +
                    ", icon='" + icon + '\'' +
                    ", id=" + id +
                    ", nickname='" + nickname + '\'' +
                    ", password='" + password + '\'' +
                    ", publicName='" + publicName + '\'' +
                    ", token='" + token + '\'' +
                    ", type=" + type +
                    ", username='" + username + '\'' +
                    ", chapterTops=" + chapterTops +
                    ", collectIds=" + collectIds +
                    '}';
        }
    }
}
