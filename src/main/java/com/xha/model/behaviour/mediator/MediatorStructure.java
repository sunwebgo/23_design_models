package com.xha.model.behaviour.mediator;

/**
 * 具体中介者
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class MediatorStructure extends Mediator {
    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
