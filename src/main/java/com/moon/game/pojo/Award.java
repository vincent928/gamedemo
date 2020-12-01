package com.moon.game.pojo;

/**
 * @Author : moon
 * @Date : 2020/12/1 15:20
 * @Description : 分数奖励
 */
public interface Award {
    //双倍火力
    int DOUBLE_FIRE = 0;
    //1条命
    int LIFE = 1;

    /**
     * 获得奖励类型(上面的0或1)
     */
    int getType();


}
