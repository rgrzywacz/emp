import java.time.LocalDate;

import address.Address;
import address.AddressHolder;
import employee.Employee;

public class Main {
    public static void main(String[] args) {

        Address addressOne = new Address("Łódź","93-100","Pomorska","231");
        Address addressTwo = new Address("Łódź","93-100","Gdańska","22A");

        AddressHolder addressHolder = AddressHolder.getInstance();
        addressHolder.addAddress(addressOne);
        addressHolder.addAddress(addressTwo);

        System.out.println(addressHolder.findAddress(1L));

        Employee adam = Employee.builder("Adam", "Nowak")
                .withAddress(addressHolder.findAddress(1L))
                .withEmail("adam.nowak@wp.pl")
                .withPhoneNumber("600600600")
                .withPosition("Developer")
                .withStartAt(LocalDate.of(2021,11,12))
                .build();

        System.out.println(adam);

        AddressHolder addressHolderTwo = AddressHolder.getInstance();
        addressHolderTwo.addAddress(addressOne);
        addressHolderTwo.addAddress(addressTwo);

        Employee.builder("Jan","Kowalski")
                .withAddress(addressHolderTwo.findAddress(1L))
                .build();


        System.out.println(addressHolderTwo.findAddress(1L));
    }
}
