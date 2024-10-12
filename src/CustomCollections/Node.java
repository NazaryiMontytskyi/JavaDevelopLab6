package CustomCollections;

import Flowers.*;


/*
 * Клас вузла однозв'язного списку
 */
public class Node {
    
    Flower value;   //значення у вузлі
    Node next;      //посилання на наступний вузол

    /*
     * Порожній конструктор з ініціалізацією всіх
     * полів як null
     */
    public Node()
    {
        value = null;
        next = null;
    }

    /*
     * Конструктор з параметром, що ініціалізує значення
     */
    public Node(final Flower value)
    {
        this.value = value;
    }

    /*
     * Метод сетер для встановлення значення у вузлі
     */
    public boolean setValue(final Flower value)
    {
        if(value == null)
        {
            return false;
        }

        this.value = value;
        return true;
    }

    /*
     * Метод сетер для встановлення наступного елементу
     */
    public boolean setNext(final Node nextNode)
    {
        this.next = nextNode;
        return true;
    }

    /*
     * Метод гетер для отримання наступного елементу
     */
    public Node getNext()
    {
        return this.next;
    }

    /*
     * Метод гетер для отримання значення у вузлі
     */
    public final Flower getValue()
    {
        return this.value;
    }

    /*
     * Перевизначення методу toString від базового методу
     * Object
     */
    @Override
    public String toString()
    {
        return this.value.toString();
    }

}
