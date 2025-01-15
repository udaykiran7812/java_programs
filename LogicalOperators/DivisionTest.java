public class DivisionTest {
    public static void main(String[] args) {
        int[] arr={12,8,16,34,21,3,5,654,89,98,54,24};
        TargetSum obj1=new TargetSum();
        obj1.printTargetSumElements(arr,10000);
        Division obj=new Division();
        obj.division(arr);
    }
}