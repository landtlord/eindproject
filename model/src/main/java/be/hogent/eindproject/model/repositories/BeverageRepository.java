package be.hogent.eindproject.model.repositories;

import be.hogent.eindproject.model.Beverage;

import java.util.TreeMap;

public class BeverageRepository {
    private TreeMap<Integer, Beverage> beverages;

    public BeverageRepository() {
        beverages = new TreeMap();
    }

    public void populateRepo(){
      beverages.put( 1,new Beverage (1,"Cola",2.40));
      beverages.put( 2,new Beverage (2,"Leffe",3.00));
      beverages.put( 3,new Beverage (3,"Koffie",2.40));
      beverages.put( 4,new Beverage (4,"Cola-Light",2.40));
      beverages.put( 5,new Beverage (5,"Whisky",12.00));
      beverages.put( 6,new Beverage (6,"Thee",2.40));
      beverages.put( 7,new Beverage (7,"Spa",2.40));
      beverages.put( 8,new Beverage (8,"Westmalle",3.00));
      beverages.put( 9,new Beverage (9,"Hoegaarden",2.70));
      beverages.put( 10,new Beverage (10,"Duvel",3.20));
      beverages.put( 11,new Beverage (11,"Stella",2.20));
      beverages.put( 12,new Beverage (12,"Chocomelk",2.50));
      beverages.put( 13,new Beverage (13,"Tonic",2.40));
      beverages.put( 14,new Beverage (14,"Latte",2.80));
      beverages.put( 15,new Beverage (15,"Fanta",2.40));
      beverages.put( 16,new Beverage (16,"Sprite",2.40));
      beverages.put( 17,new Beverage (17,"Minute Maid",2.80));
    }


    public Beverage getById(int id) {
        return beverages.get(id);
    }
}
