// StoreOneA类，继承自StoreToRent类
public class StoreOneA extends StoreToRent {

    // 定义一个私有布尔变量，表示是否为特殊客户
    private boolean specialCustomer;

    // 定义一个私有双精度变量，表示每月还款金额
    private double monthlyPayment;

    // 定义一个私有双精度常量，表示折扣率，值为0.1
    private static final double DISCOUNT_RATE = 0.1;

    /**
     * 构造函数，调用父类构造函数并初始化specialCustomer
     * @param specialCustomer 是否为特殊客户
     */
    public StoreOneA(boolean specialCustomer) {
        super();
        this.specialCustomer = specialCustomer;
    }

    /**
     * 重写父类的calculateLoanFinancing方法
     * @return 计算后的每月还款金额
     */
    public double calculateLoanFinancing() {
        // 假设这里的贷款金额是租金，贷款期限为12个月
        double loanAmount = getRent();
        int loanPaymentTerm = 12;
        double interestRate = 0.25;
        monthlyPayment = (loanAmount * (1 + interestRate)) / loanPaymentTerm;

        if (specialCustomer) {
            // 如果是特殊客户，计算折扣后的还款金额
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }

    /**
     * 重写toString方法，组合父类和子类的信息
     * @return 包含贷款详情的字符串
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Special Customer: ").append(specialCustomer).append("\n");
        sb.append("Monthly Loan Payment: €").append(calculateLoanFinancing()).append("\n");
        return sb.toString();
    }

    /**
     * 显示商店信息的方法
     */
    public void showStoreInfo() {
        System.out.println(toString());
    }
}    