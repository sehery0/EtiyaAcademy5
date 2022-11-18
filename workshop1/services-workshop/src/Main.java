public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new MySqlCustomerDal();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        Customer customer1 = new Customer(3,"Seher","Yalçın");
        customerManager.customerDal = new MySqlCustomerDal();
        //customerManager.add(customer1);
        System.out.println(customer1.getFirstName() + " eklendi");


    }
}