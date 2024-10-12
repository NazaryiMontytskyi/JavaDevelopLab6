package Flowers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Клас букет, який має в якості атрибуту список квітів
 */

public class Bouqette {
    
    List<Flower> bouqette;

    /*
     * Конструктор з ініціалізацією атрибуту
     */
    public Bouqette()
    {
        this.bouqette = new ArrayList<>();
    }

    /*
     * Конструктор з параметром
     */
    public Bouqette(final List<Flower> bouqette)
    {
        this.bouqette = bouqette;
    }

    /*
     * Додавання квітки до букету
     */
    public void addFlower(final Flower flowerToAdd)
    {
        this.bouqette.add(flowerToAdd);
    }

    /*
     * Видалення квітки з букету
     */
    public void removeFlower(final Flower flowerToRemove)
    {
        this.bouqette.remove(flowerToRemove);
    }

    /*
     * Сортування за свіжістю з використанням лямбда-виразів
     */
    public void sortByFreshness()
    {
        this.bouqette.sort(Comparator.comparingInt(fl -> fl.getLevelOfFreshnes()));
    }

    /*
     * Перевизначений метод toString
     * Виводить табличку з квітами у консоль
     */
    @Override
    public String toString()
    {
        String result = "";
        result += Flower.getSeparator() + "\n";
        result += Flower.getHeader() + "\n";
        for(Flower flower : this.bouqette)
        {
            result += Flower.getSeparator() + "\n";
            result += flower.toString() + "\n";
        }
        result += Flower.getSeparator();
        return result;
    }

}
