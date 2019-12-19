package be.hogent.eindproject.model.repositories;

import be.hogent.eindproject.model.Order;

import java.time.LocalDate;
import java.util.TreeMap;

public class OrderRepository {
    private TreeMap<Integer, Order> beverages;
    private BeverageRepository beverageRepository;
    private WaiterRepository waiterRepository;

    public OrderRepository(BeverageRepository beverageRepository, WaiterRepository waiterRepository) {
        this.beverageRepository = beverageRepository;
        this.waiterRepository = waiterRepository;

        beverages = new TreeMap();
    }

    public void populateRepo(){
        beverages.put(1, new Order(1,1,beverageRepository.getById(1),5,LocalDate.of(2019,12,13),waiterRepository.getById(1)));
        beverages.put(2, new Order(2,1,beverageRepository.getById(3),2,LocalDate.of(2019,12,13),waiterRepository.getById(1)));
        beverages.put(3, new Order(3,1,beverageRepository.getById(8),3,LocalDate.of(2019,12,13),waiterRepository.getById(1)));
        beverages.put(4, new Order(4,1,beverageRepository.getById(5),1,LocalDate.of(2019,12,13),waiterRepository.getById(1)));
        beverages.put(5, new Order(5,12,beverageRepository.getById(12),4,LocalDate.of(2019,12,15),waiterRepository.getById(1)));
        beverages.put(6, new Order(6,13,beverageRepository.getById(1),4,LocalDate.of(2019,12,21),waiterRepository.getById(1)));
        beverages.put(7, new Order(7,13,beverageRepository.getById(3),4,LocalDate.of(2019,12,21),waiterRepository.getById(1)));
        beverages.put(8, new Order(8,13,beverageRepository.getById(8),4,LocalDate.of(2019,12,21),waiterRepository.getById(1)));
        beverages.put(9, new Order(9,14,beverageRepository.getById(12),5,LocalDate.of(2019,12,21),waiterRepository.getById(1)));
        beverages.put(10, new Order(10,14,beverageRepository.getById(1),15,LocalDate.of(2019,12,21),waiterRepository.getById(1)));
        beverages.put(11, new Order(11,16,beverageRepository.getById(10),2,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(12, new Order(12,16,beverageRepository.getById(3),2,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(13, new Order(13,16,beverageRepository.getById(8),3,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(14, new Order(14,16,beverageRepository.getById(7),3,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(15, new Order(15,17,beverageRepository.getById(12),1,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(16, new Order(16,17,beverageRepository.getById(1),1,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(17, new Order(17,17,beverageRepository.getById(4),1,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(18, new Order(18,17,beverageRepository.getById(9),1,LocalDate.of(2019,12,21),waiterRepository.getById(2)));
        beverages.put(19, new Order(19,18,beverageRepository.getById(10),21,LocalDate.of(2019,12,21),waiterRepository.getById(4)));
        beverages.put(20, new Order(20,18,beverageRepository.getById(7),18,LocalDate.of(2019,12,21),waiterRepository.getById(4)));
        beverages.put(21, new Order(21,19,beverageRepository.getById(11),10,LocalDate.of(2019,12,22),waiterRepository.getById(2)));
        beverages.put(22, new Order(22,19,beverageRepository.getById(6),5,LocalDate.of(2019,12,22),waiterRepository.getById(2)));
        beverages.put(23, new Order(23,22,beverageRepository.getById(9),2,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(24, new Order(24,22,beverageRepository.getById(4),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(25, new Order(25,22,beverageRepository.getById(11),9,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(26, new Order(26,22,beverageRepository.getById(12),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(27, new Order(27,22,beverageRepository.getById(1),6,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(28, new Order(28,28,beverageRepository.getById(10),7,LocalDate.of(2019,12,23),waiterRepository.getById(3)));
        beverages.put(29, new Order(29,20,beverageRepository.getById(1),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(30, new Order(30,20,beverageRepository.getById(4),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(31, new Order(31,20,beverageRepository.getById(9),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(32, new Order(32,20,beverageRepository.getById(2),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(33, new Order(33,29,beverageRepository.getById(1),1,LocalDate.of(2019,12,24),waiterRepository.getById(1)));
        beverages.put(34, new Order(34,29,beverageRepository.getById(3),1,LocalDate.of(2019,12,24),waiterRepository.getById(1)));
        beverages.put(35, new Order(35,29,beverageRepository.getById(7),1,LocalDate.of(2019,12,24),waiterRepository.getById(1)));
        beverages.put(36, new Order(36,29,beverageRepository.getById(6),4,LocalDate.of(2019,12,24),waiterRepository.getById(1)));
        beverages.put(37, new Order(37,29,beverageRepository.getById(4),1,LocalDate.of(2019,12,24),waiterRepository.getById(1)));
        beverages.put(38, new Order(38,24,beverageRepository.getById(9),8,LocalDate.of(2019,12,23),waiterRepository.getById(1)));
        beverages.put(39, new Order(39,24,beverageRepository.getById(11),7,LocalDate.of(2019,12,23),waiterRepository.getById(1)));
        beverages.put(40, new Order(40,24,beverageRepository.getById(12),1,LocalDate.of(2019,12,23),waiterRepository.getById(1)));
        beverages.put(41, new Order(41,49,beverageRepository.getById(1),1,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(42, new Order(42,49,beverageRepository.getById(10),1,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(43, new Order(43,49,beverageRepository.getById(3),1,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(44, new Order(44,49,beverageRepository.getById(7),1,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(45, new Order(45,49,beverageRepository.getById(8),6,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(46, new Order(46,49,beverageRepository.getById(13),1,LocalDate.of(2019,12,26),waiterRepository.getById(1)));
        beverages.put(47, new Order(47,27,beverageRepository.getById(12),8,LocalDate.of(2019,12,23),waiterRepository.getById(2)));
        beverages.put(48, new Order(48,52,beverageRepository.getById(1),3,LocalDate.of(2019,12,27),waiterRepository.getById(1)));
        beverages.put(49, new Order(49,52,beverageRepository.getById(2),2,LocalDate.of(2019,12,27),waiterRepository.getById(4)));
        beverages.put(50, new Order(50,55,beverageRepository.getById(1),3,LocalDate.of(2019,12,28),waiterRepository.getById(4)));
        beverages.put(51, new Order(51,55,beverageRepository.getById(2),2,LocalDate.of(2019,12,28),waiterRepository.getById(1)));
        beverages.put(52, new Order(52,57,beverageRepository.getById(1),3,LocalDate.of(2019,12,28),waiterRepository.getById(1)));
        beverages.put(53, new Order(53,57,beverageRepository.getById(2),2,LocalDate.of(2019,12,28),waiterRepository.getById(1)));
        beverages.put(54, new Order(54,64,beverageRepository.getById(1),3,LocalDate.of(2019,12,29),waiterRepository.getById(1)));
        beverages.put(55, new Order(55,64,beverageRepository.getById(2),2,LocalDate.of(2019,12,29),waiterRepository.getById(1)));
        beverages.put(56, new Order(56,67,beverageRepository.getById(1),3,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(57, new Order(57,67,beverageRepository.getById(2),2,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(58, new Order(58,70,beverageRepository.getById(2),2,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(59, new Order(59,70,beverageRepository.getById(11),2,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(60, new Order(60,69,beverageRepository.getById(12),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(61, new Order(61,69,beverageRepository.getById(10),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(62, new Order(62,69,beverageRepository.getById(3),5,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(63, new Order(63,69,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(64, new Order(64,71,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(65, new Order(65,71,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(66, new Order(66,71,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(67, new Order(67,71,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(68, new Order(68,71,beverageRepository.getById(7),1,LocalDate.of(2019,12,30),waiterRepository.getById(1)));
        beverages.put(69, new Order(69,1,beverageRepository.getById(9),5,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(70, new Order(70,1,beverageRepository.getById(2),1,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(71, new Order(71,1,beverageRepository.getById(13),6,LocalDate.of(2019,12,22),waiterRepository.getById(1)));
        beverages.put(72, new Order(72,2,beverageRepository.getById(11),3,LocalDate.of(2019,12,31),waiterRepository.getById(1)));
        beverages.put(73, new Order(73,1,beverageRepository.getById(11),6,LocalDate.of(2019,12,31),waiterRepository.getById(2)));
        beverages.put(74, new Order(74,5,beverageRepository.getById(8),5,LocalDate.of(2019,1,3),waiterRepository.getById(1)));
        beverages.put(75, new Order(75,7,beverageRepository.getById(8),1,LocalDate.of(2019,1,3),waiterRepository.getById(1)));
        beverages.put(76, new Order(76,6,beverageRepository.getById(7),1,LocalDate.of(2019,1,3),waiterRepository.getById(2)));
        beverages.put(77, new Order(77,6,beverageRepository.getById(7),1,LocalDate.of(2019,1,3),waiterRepository.getById(2)));
        beverages.put(78, new Order(78,6,beverageRepository.getById(7),1,LocalDate.of(2019,1,3),waiterRepository.getById(2)));
        beverages.put(79, new Order(79,6,beverageRepository.getById(7),1,LocalDate.of(2019,1,3),waiterRepository.getById(2)));
        beverages.put(80, new Order(80,10,beverageRepository.getById(7),1,LocalDate.of(2019,1,6),waiterRepository.getById(2)));
        beverages.put(81, new Order(81,9,beverageRepository.getById(8),2,LocalDate.of(2019,1,6),waiterRepository.getById(1)));
        beverages.put(82, new Order(82,11,beverageRepository.getById(5),2,LocalDate.of(2019,1,6),waiterRepository.getById(3)));
        beverages.put(83, new Order(83,11,beverageRepository.getById(3),1,LocalDate.of(2019,1,6),waiterRepository.getById(3)));
        beverages.put(84, new Order(84,12,beverageRepository.getById(16),1,LocalDate.of(2019,1,6),waiterRepository.getById(3)));
        beverages.put(85, new Order(85,12,beverageRepository.getById(13),3,LocalDate.of(2019,1,6),waiterRepository.getById(3)));
        beverages.put(86, new Order(86,1,beverageRepository.getById(9),3,LocalDate.of(2019,12,15),waiterRepository.getById(1)));
        beverages.put(87, new Order(87,7,beverageRepository.getById(3),1, LocalDate.of(2019,2,26),waiterRepository.getById(1)));
    }
}
