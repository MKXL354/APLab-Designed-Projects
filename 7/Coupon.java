public abstract class Coupon implements CouponManagement {
    protected String userName;
    protected int expiray;
    protected int uniqueCode;

    public Coupon(String userName, int expiray, int uniqueCode) {
        this.userName = userName;
        this.expiray = expiray;
        this.uniqueCode = uniqueCode;
    }
}
