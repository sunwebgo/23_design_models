package com.xha.principles.lod;

/**
 * lod应用程序
 *
 * @author Xu huaiang
 * @date 2023/07/12
 */
public class LodApplication {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.setStar(new Star("马修·范德普尔"));
        broker.setFans(new Fans("Xu huaiang"));
        broker.setCompany(new Company("欧贝青公司"));
        broker.meeting();
        broker.business();
    }
}
