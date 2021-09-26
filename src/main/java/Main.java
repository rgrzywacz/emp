import java.time.LocalDate;

import address.Address;
import employee.Employee;

public class Main {
    public static void main(String[] args) {
        /*Employee jan = new Employee("Jan", null, "Kowalski", null, LocalDate.of(1989, 10, 20),
                                    new Address(), "500500500", "jan.kowalski@gmail.com", null,
                                    null, "Tester", null);*/

        Employee adam = Employee.builder("Adam", "Nowak")
                .withAddress(new Address())
                .withEmail("adam.nowak@wp.pl")
                .withPhoneNumber("600600600")
                .withPosition("Developer")
                .withStartAt(LocalDate.of(2021,11,12))
                .build();

        System.out.println(adam);
    }
}
