public class Main {
    public static void main(String[] args) {

//        BaseLogger[] loggers = new BaseLogger[]{new ConsoleLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()};
//        for (BaseLogger logger : loggers){
//            logger.Log("Log Mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();


    }
}