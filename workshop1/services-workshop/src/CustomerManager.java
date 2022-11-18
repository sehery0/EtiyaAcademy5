import java.util.List;

public class CustomerManager {
    ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(Customer customer) {

        customerDal.add(customer);
    }

    public void delete(Customer customer) {
        customerDal.delete(customer);
    }

    public void update(Customer customer) {
        customerDal.update(customer);

    }

    public List<Customer> getAll() {
        return customerDal.getAll();
    }

    public void getById(int id) {
        customerDal.getById(id);
    }
}
