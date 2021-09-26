package address;

import java.util.*;
//Singleton
public class AddressHolder {

    //krok 1 - utworzenie zmiennej do samej siebie
    private static AddressHolder instance = null;

    private Map<Long,Address> addresses;

    //krok 2 - zablokowanie możliwości tworzenia instancji poza klasą
    private AddressHolder() {
        addresses = new HashMap<>();
    }

    //krok 3 - utorzenie metody getInstance, która zwraca samą siebie
    synchronized public static AddressHolder getInstance() {
        if (instance == null) {
            instance = new AddressHolder();
        }
        return instance;
    }

    public void addAddress(Address address) {
        addresses.put(address.getId(),address);
    }

    public Address findAddress(Long id) {
        return addresses.get(id);
    }
}
