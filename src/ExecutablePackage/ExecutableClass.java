package ExecutablePackage;

import CustomCollections.*;
import Flowers.*;

/*
 * Виконавчий клас із усією логікою програми
 */
public class ExecutableClass {
    
    public ExecutableClass()
    {

    }

    public void run()
    {
        LinkedList list = initList();
        System.out.println("LIST TO WORK WITH: ");
        System.out.println(list);

        list = this.testAdd(list);

        System.out.println("LIST AFTER ADDITION: ");
        System.out.println(list);

        System.out.println("TEST SEARCHING");

        this.testSearchByElement(list);

        list = this.testRemoveByElement(list);
        System.out.println("List after removing: ");
        System.out.println(list);

        list = this.testRemoveByIndex(list);
        System.out.println("List after removing: ");
        System.out.println(list);

        System.out.println("Let's define the size of our current list");
        this.sizeOfList(list);

        this.testConstructor();
    }

    private LinkedList initList()
    {
        LinkedList list = new LinkedList();

        list.add(new LocationFlower("Rose", 30, "Red", 10, 5, "Garden"));
        list.add(new LocationFlower("Tulip", 20, "Yellow", 6, 4, "Field"));
        list.add(new LocationFlower("Lily", 35, "White", 8, 3, "Forest"));
        list.add(new LocationFlower("Daisy", 15, "Pink", 12, 5, "Meadow"));
        list.add(new LocationFlower("Sunflower", 150, "Yellow", 20, 2, "Farm"));

        list.add(new SeasonFlower("Snowdrop", 5, "White", 3, 5, "Winter"));
        list.add(new SeasonFlower("Daffodil", 25, "Yellow", 6, 4, "Spring"));
        list.add(new SeasonFlower("Peony", 45, "Pink", 12, 3, "Summer"));
        list.add(new SeasonFlower("Chrysan.", 50, "Purple", 8, 4, "Autumn"));
        list.add(new SeasonFlower("Iris", 40, "Blue", 7, 4, "Spring"));

        list.add(new TemporaryFlower("Poppy", 25, "Red", 4, 2, 7));
        list.add(new TemporaryFlower("Marigold", 20, "Orange", 10, 3, 14));
        list.add(new TemporaryFlower("Dahlia", 30, "Purple", 15, 5, 10));
        list.add(new TemporaryFlower("Gladiolus", 90, "Pink", 6, 4, 20));
        list.add(new TemporaryFlower("Carnation", 25, "Red", 8, 4, 10));
    
        return list;

    }

    private LinkedList testAdd(LinkedList list)
    {
        Flower flowerToAdd = new SeasonFlower(
            "Flower_N",
            15.25,
            "Red",
            14,
            4,
            "Winter"
        );

        System.out.println("\nLet's try to add to list next element: ");
        System.out.println(Flower.getSeparator());
        System.out.println(flowerToAdd);
        System.out.println(Flower.getSeparator());

        list.add(flowerToAdd);

        return list;
    }


    private void testSearchByElement(LinkedList list)
    {
        Flower flowerToFind = new LocationFlower("Daisy", 15, "Pink", 12, 5, "Meadow");
        System.out.println("\nLet's try to find following element: ");
        System.out.println(Flower.getSeparator());
        System.out.println(flowerToFind);
        System.out.println(Flower.getSeparator());

        System.out.println("Result of research: " + list.contains(flowerToFind));
        
        Flower flowerToFind2 = new SeasonFlower("Flower_test", 10.25, "Purple", 12, 5, "Spring");
        System.out.println("Let's try to find this element: ");
        System.out.println(Flower.getSeparator());
        System.out.println(flowerToFind2);
        System.out.println(Flower.getSeparator());

        System.out.println("Result of research: " + list.contains(flowerToFind2));
    }


    private LinkedList testRemoveByElement(LinkedList list)
    {
        Flower flowerToDelete = new SeasonFlower("Peony", 45, "Pink", 12, 3, "Summer");

        System.out.println("Let's try to delete following element: ");
        System.out.println(Flower.getSeparator());
        System.out.println(flowerToDelete);
        System.out.println(Flower.getSeparator());

        System.out.println("First of all let's check whether it exists in list");
        System.out.println("Existance: " + list.contains(flowerToDelete));

        System.out.println("Status of removing: " + list.remove(flowerToDelete));
    
        return list;
    }

    private void sizeOfList(LinkedList list)
    {
        System.out.println("SIZE OF LIST: " + list.size());
    }

    private LinkedList testRemoveByIndex(LinkedList list)
    {
        System.out.println("Let's try delete element by index");
        System.out.println("We will use index '3'");
        System.out.println("Status of removing: " + list.remove(3));
        return list;
    }

    private void testConstructor()
    {
        System.out.println("Let's test constructor with copying of single element");
        Flower flowerToCopy = new SeasonFlower(
            "Flower-a",
            15.0,
            "Magenta",
            25,
            8,
            "Spring"
        );

        System.out.println("We have following object: ");
        System.out.println(Flower.getSeparator());
        System.out.println(flowerToCopy);
        System.out.println(Flower.getSeparator());

        System.out.print("Initialize our list with this object and give it 8 times.");
        System.out.println("Our collection looks like: ");
        System.out.println(new LinkedList(flowerToCopy, 8));
    }

}
