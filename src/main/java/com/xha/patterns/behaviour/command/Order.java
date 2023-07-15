package com.xha.patterns.behaviour.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单
 *
 * @author Xu huaiang
 * @date 2023/07/14
 */
public class Order {
    // 桌号
    private int diningTable;
    // 餐品及份数
    private Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFood(String name, int num) {
        foodDic.put(name, num);
    }
}
