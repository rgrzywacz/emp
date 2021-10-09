package employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import address.Address;
import observer.Observer;

public class Employee implements Observer {

    private static long counter = 1;
    private Long id;

    private String firstName;
    private String secondName;
    private String lastName;
    private String title;
    private LocalDate birthDate;
    private Address address;
    private String phoneNumber;
    private String email;
    private LocalDate startAt;
    private LocalDate endAt;
    private String position;
    private String notes;
    private List<Message> messages;

    private Employee() {
        this.id = counter++;
    }

    public static EmployeeBuilder builder(String firstName, String lastName) {
        return new EmployeeBuilder(firstName, lastName);
    }

    public List<Message> getMessages() {
        return messages;
    }

    //Observer krok 3 - implementacja metody update z abstrakcji Observer.
    @Override
    public void update(Map<String, String> values) {
        String taskID = values.get("TaskID");
        String messageContent = "New task with id: " + taskID+ " with priority Critical has been created at: " + LocalDateTime.now();
        Message message = new Message(messageContent, LocalDateTime.now());
        messages.add(message);
    }


    //Fluent Builder
    public static class EmployeeBuilder {
        private Long id;
        private String firstName;
        private String secondName;
        private String lastName;
        private String title;
        private LocalDate birthDate;
        private Address address;
        private String phoneNumber;
        private String email;
        private LocalDate startAt;
        private LocalDate endAt;
        private String position;
        private String notes;
        private List<String> messages;

        public EmployeeBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /*public EmployeeBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }*/

        public EmployeeBuilder withSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

       /* public EmployeeBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }*/

        public EmployeeBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public EmployeeBuilder withBirthDate(LocalDate birthDate) {
            this.birthDate = this.birthDate;
            return this;
        }

        public EmployeeBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder withStartAt(LocalDate startAt) {
            this.startAt = startAt;
            return this;
        }

        public EmployeeBuilder withEndAt(LocalDate endAt) {
            this.endAt = endAt;
            return this;
        }

        public EmployeeBuilder withNote(String note) {
            this.notes = note;
            return this;
        }

        public EmployeeBuilder withPosition(String position) {
            this.position = position;
            return this;
        }


        public Employee build() {
            Employee employee = new Employee();
            employee.messages = new ArrayList<>();
            employee.firstName = this.firstName;
            employee.secondName = this.secondName;
            employee.lastName = this.lastName;
            employee.position = this.position;
            employee.startAt = this.startAt;
            employee.endAt = this.endAt;
            employee.phoneNumber = this.phoneNumber;
            employee.email = this.email;
            employee.title = this.title;
            employee.notes = this.notes;
            employee.birthDate = this.birthDate;
            employee.address = this.address;

            return employee;
        }

    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ", secondName='" +
               secondName + '\'' + ", lastName='" + lastName + '\'' + ", title='" + title + '\'' +
               ", birthDate=" + birthDate + ", address=" + address + ", phoneNumber='" +
               phoneNumber + '\'' + ", email='" + email + '\'' + ", startAt=" + startAt +
               ", endAt=" + endAt + ", position='" + position + '\'' + ", notes='" + notes + '\'' +
               '}';
    }
}
