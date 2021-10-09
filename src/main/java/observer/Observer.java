package observer;

import java.util.*;
//Observer krok 1 - utworzenie abstrakcji Observer z metodą upadate która będzie wywołana w implentacji
public interface Observer {
    //Mapa jest tylko dodatkiem, który pozwala przekazać wartości do metody update. Nie jest konieczna.
    void update(Map<String, String> values);
}
