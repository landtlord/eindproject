package be.hogent.eindproject.model.repositories;

import be.hogent.eindproject.model.Waiter;

import java.util.TreeMap;

public class WaiterRepository {
    private TreeMap<Integer, Waiter> waiters;

    public WaiterRepository() {
        waiters = new TreeMap();
    }

    public void populateRepo() {
        waiters.put(1, new Waiter(1, "Peters", "Wout"));
        waiters.put(2, new Waiter(2, "Segers", "Nathalie"));
        waiters.put(3, new Waiter(3, "Vandenbroeck", "Ilse"));
        waiters.put(4, new Waiter(4, "Desmet", "Patrick"));
    }

    public Waiter getById(int id) {
        return waiters.get(id);
    }
}
