public class CourseFeeDiscount{
    public static void main(String[] args) {
        float fee = 125000f;
        float discountPercent=10f;

        float discount = (discountPercent/100)*fee;
        float discountedfee = fee-discount;

        System.out.println("Fess to be paid is: "+discountedfee);
    }
}