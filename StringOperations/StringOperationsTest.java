public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations stringOperations=new StringOperations();
        stringOperations.operations("production");
        stringOperations.operations(null);
        stringOperations.operations("dev");
//        stringOperations.reverse("dev");
    }
}