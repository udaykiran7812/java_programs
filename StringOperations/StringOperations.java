public class StringOperations {
    public void operations(String str1, String... arr) {
        printGivenString(str1);
        if (str1 != null) {
            System.out.println("The length is:" + str1.length());
            printcharAt(str1, 3);
            reverse(str1);
        }
    }

    private void printGivenString(String str1) {
        if ("dev".equals(str1)) {// string constant can compare with null but null.equals(string const) throws null pointer exception
            System.out.println("Given string is dev");
        } else {
            System.out.println("Given string is " + str1);
        }
    }

    private void printcharAt(String str1, int index) {
        if (str1.length() > index) {
            System.out.println(str1.charAt(index));
        }
    }

    private void reverse(String str1) {
        System.out.println("reverse string");
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
    }
//        char[] arr = new char[str1.length()];
//        for(int i=(str1.length()-1),j=0;i>=0,j<(str1.length());i--,j++){
//            arr[j]=str1.charAt(i);
//        }
//        for(i=o;i<str1.length();i++){
//            System.out.print("elements are:  "+ arr[i]);
//        }
}