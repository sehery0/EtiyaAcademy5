public class Main {
    public static void main(String[] args) {
        /* BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(),
                new DataBaseLogger(), new FileLogger(), new ConsoleLogger() };
        for(BaseLogger logger : loggers){
            logger.Log("Log mesajı"); */

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
        }
}