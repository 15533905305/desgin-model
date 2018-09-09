package com.example.designmodel.singleton;


/**
 * 静态内部类实现单例模式
 *
 * @author junli wang
 * @date 2018/8/9
 */
public class Singleton {

    private String userName;

    /**
     * 私有
     */
    private Singleton() {
    }

    /**
     * 静态内部类加载解决安全问题
     */
    private static class Entity {
        private static final Singleton singletom = new Singleton();
    }

    /**
     * 创建实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return Entity.singletom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
