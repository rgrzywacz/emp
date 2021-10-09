import java.time.LocalDate;

import address.Address;
import address.AddressHolder;
import employee.Employee;
import observer.TaskPublisher;
import task.Task;
import task.TaskPriority;
import task.TaskService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //test
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

        Employee jan = Employee.builder("Jan", "Kowalski")
                                 .withAddress(addressHolderTwo.findAddress(1L))
                                 .build();
        //Observer - utworzenie instancji oraz zarejstrowanie 2 obserwatorów
        TaskPublisher taskPublisher = new TaskPublisher();
        taskPublisher.registerObserver(adam);
        taskPublisher.registerObserver(jan);

        TaskService taskService = new TaskService(taskPublisher);
        //Observer demo - utworzenie zadania w klasie TaskService, a w niej wywołanie publishera, który znotyfikuje obserwatorów
        Task criticalTask = taskService.createTask("Title 1", "Description 1", TaskPriority.CRITICAL);
        Thread.sleep(1000);
        Task majorTask = taskService.createTask("Title 2", "Description 2", TaskPriority.MAJOR);
        System.out.println(criticalTask.toString());

        System.out.println(jan.getMessages());


        System.out.println(addressHolderTwo.findAddress(1L));
    }
}
