public class Main {
    public static void main(String[] args){
        Customer customer= new Customer("Midhun",100.0);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(500.00);
        System.out.println("The balance for the customer "+customer.getName()+" is "+customer.getBalance());
    }
}
