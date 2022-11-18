import java.util.List;

public interface ICustomerDal {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    List<Customer> getAll();
    void getById(int id);
}
