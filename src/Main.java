public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        StoreOneA storeOneA = new StoreOneA(true, 100000, 12, true);
        // 调用父类的enterStoreDetails方法（文档中未提及此方法实现，假设为空实现）
        storeOneA.enterStoreDetails();
        // 调用showStoreInfo方法显示商店信息
        storeOneA.showStoreInfo();
    }
}    