public class CommandLineArguments {
    public static void main(String[] args) {

//        System.out.println(dev);
//        System.out.println(args[0].hashCode());
//        local,dev,stage,uat,preprod,prod--->environments

        int envIndex = args[0].indexOf("=");
        int memIndex = args[1].indexOf("=");
        String environment = args[0].substring(envIndex + 1);
        String memory = args[1].substring(memIndex + 1);
        System.out.println("environment=" + environment);
//        if (environment.equals("dev")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//        } else if (environment.equals("production")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//
//        } else if (environment.equals("local")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//        } else if (environment.equals("stage")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//        } else if (environment.equals("uat")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//        } else if (environment.equals("prepod")) {
//            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
//        } else {
//            System.out.println("Application running in unknown environment");
//        }
/*

        switch (environment) {
            case "dev", "local":
                System.out.println("Application running in development enviroment with 2GB memory");
                break;
            case "production":
                System.out.println("Application running in production enviroment with 6GB memory");
                break;
//            case "local":
//                System.out.println("Application running in local enviroment with 1GB memory");
//                break;
            case "stage":
                System.out.println("Application running in stage enviroment with 3GB memory");
                break;
            case "uat":
                System.out.println("Application running in uat enviroment with 4GB memory");
                break;
            case "prepod":
                System.out.println("Application running in prepod enviroment with 5GB memory");
                break;
            default:
                System.out.println("Application running in unknown environment");


        }

*/

       /* switch (environment) {
            case "dev","local" -> System.out.println("Application running in development enviroment with 2GB memory");
            case "production" -> System.out.println("Application running in production enviroment with 6GB memory");
//            case "local" -> System.out.println("Application running in local enviroment with 1GB memory");
            case "stage" -> System.out.println("Application running in stage enviroment with 3GB memory");
            case "uat" -> System.out.println("Application running in uat enviroment with 4GB memory");
            case "prepod" -> System.out.println("Application running in prepod enviroment with 5GB memory");
            default -> System.out.println("Unknown environment ");


        }*/


        switch (environment) {
            case "dev", "local","production", "uat","prepod" ->
                    System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");

            /*case "production" ->
                    System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");

//            case "local" ->            System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");
            case "stage" ->
                    System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");

            case "uat" ->
                    System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");

            case "prepod" ->
                    System.out.println("Application running in " + environment + " enviroment with " + memory + " memory");*/

            default -> System.out.println("Unknown environment ");


        }
//        if (environment.equals("dev")) {
//            System.out.println("Application running in development enviroment with 2GB memory");
//        } else if (environment.equals("production")) {
//            System.out.println("Application running in production enviroment with 6GB memory");
//        } else if (environment.equals("local")) {
//            System.out.println("Application running in local enviroment with 1GB memory");
//        } else if (environment.equals("stage")) {
//            System.out.println("Application running in stage enviroment with 3GB memory");
//        } else if (environment.equals("uat")) {
//            System.out.println("Application running in uat enviroment with 4GB memory");
//        } else if (environment.equals("prepod")) {
//            System.out.println("Application running in prepod enviroment with 5GB memory");
//        } else {
//            System.out.println("Application running in unknown environment");
//        }
    }
}