package observer;

import java.util.*;

import task.Task;

//Observer krok 2 - utworzenie klasy(lub abstrakcji) oraz utworzenie w niej 3 poniższych metod
public class TaskPublisher {
    //Observery są przechowywani na liście poniższej
    private List<Observer> observers;

    public TaskPublisher() {
        observers = new ArrayList<>();
    }

    //Metoda do dodawania obserwatorów
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //Metoda do usuwania obserwatorów
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    //Metoda do notyfikowania obserwatorów
    public void notifyObservers(Task task) {
        Map<String, String> values = new HashMap<>();
        values.put("TaskID", String.valueOf(task.getId()));
        observers.forEach(o -> o.update(values));
    }
}
