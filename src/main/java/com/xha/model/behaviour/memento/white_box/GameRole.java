package com.xha.model.behaviour.memento.white_box;

/**
 * 发起人
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class GameRole {
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

//    初始化内部状态
    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

//    战斗
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

//    保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

//    恢复角色状态
    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

//    显示角色状态
    public void displayState(){
        System.out.println("角色当前状态：");
        System.out.println("生命力：" + this.vit);
        System.out.println("攻击力：" + this.atk);
        System.out.println("防御力：" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
