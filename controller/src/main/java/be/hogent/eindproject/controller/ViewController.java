package be.hogent.eindproject.controller;

import be.hogent.eindproject.model.repositories.BeverageRepository;
import be.hogent.eindproject.model.repositories.OrderRepository;
import be.hogent.eindproject.model.repositories.WaiterRepository;

public class ViewController {
    private final BeverageRepository beverageRepository;
    private final WaiterRepository waiterRepository;
    private final OrderRepository orderRepository;

    public ViewController() {
        beverageRepository = new BeverageRepository();
        waiterRepository = new WaiterRepository();
        orderRepository = new OrderRepository(beverageRepository,waiterRepository);
        populateRepos();
    }

    private void populateRepos() {
        beverageRepository.populateRepo();
        waiterRepository.populateRepo();
        orderRepository.populateRepo();
    }
}
