package CustomCollections;

import Flowers.*;

public class LinkedList implements List<Flower>{
 
    Node startNode;     //початковий вузол
    Node currentNode;   //поточний (останній) вузол в колекції
    int size;           //розмір колекції

    /*
     * Порожній конструктор з ініціалізацією всіх параметрів як
     * null або нуль
     */
    public LinkedList()
    {
        startNode = currentNode = null;
        size = 0;
    }

    /*
     * Конструктор копіювання для класу LinkedList з копіюванням
     * колекції
     */
    public LinkedList(final LinkedList other)
    {
        Node current = other.getStartNode();
        int otherSize = other.size();

        for(int i = 0; i < otherSize; i++)
        {
            this.add(current.getValue());
            current = current.getNext();
        }
    }

    /*
     * Конструктор з параметром передачі значення та кількості його
     * дублювання в класі
     */
    public LinkedList(final Flower element, final int times)
    {
        for(int i = 0; i < times; i++)
        {
            this.add(element);
        }
    }

    /*
     * Перевизначений метод додавання елемента
     */
    @Override
    public boolean add(final Flower element)
    {
        if(element == null)
        {
            return false;
        }

        if(startNode == null)
        {
            startNode = new Node(element);
            currentNode = startNode;
        }
        else{
            currentNode.setNext(new Node(element));
            currentNode = currentNode.getNext();
        }
        size++;

        return true;
    }

    /*
     * Перевизначений метод видалення
     */
    @Override
    public boolean remove(final Flower element)
    {
        Node itNode = startNode;
        boolean found = false;
        for(int i = 0; i < size && !(found); i++)
        {
            if(itNode.getNext() != null && itNode.getNext().getValue().equals(element))
            {
                found = true;
            }
            if(!found)
            {
                itNode = itNode.getNext();
            }
            
        }

        if(found)
        {
            Node nodeToDelete = itNode.getNext();
            itNode.setNext(itNode.getNext().getNext());
            nodeToDelete.setNext(null);
            size--;
            return true;
        }

        return false;
    }


    /*
     * Перевизначений метод видалення за індексом
     */
    @Override
    public boolean remove(final int index)
    {
        Node itNode = startNode;

        if(index >= size)
        {
            return false;
        }

        for(int i = 0; i < index - 1; i++)
        {
            if(itNode.getNext() != null)
            {
                itNode = itNode.getNext();
            }
        }

        if(itNode == null || itNode.getNext() == null)
        {
            return false;
        }

        Node nodeToDelete = itNode.getNext();

        itNode.setNext(itNode.getNext().getNext());
        nodeToDelete.setNext(null);

        size--;
        return true;
        
    }

    /*
     * Перевизначений метод перевірки на наявність
     * елемента у колекції
     */
    @Override
    public boolean contains(final Flower element)
    {
        Node itNode = startNode;
        boolean result = false;
        for(int i = 0 ; i < size; i++)
        {
            if(itNode.getValue().equals(element))
            {
                result = true;
            }
            itNode = itNode.getNext();
        }

        return result;
    }

    /*
     * Перевизначення методу toString
     */
    @Override
    public String toString()
    {
        String result = "";
        Node itNode = startNode;
        result += Flower.getSeparator() + "\n" + Flower.getHeader() + "\n" +
        Flower.getSeparator() + "\n";
        while(itNode != null)
        {
            result += itNode.toString() + "\n";
            result += Flower.getSeparator() + "\n";
            itNode = itNode.getNext();
        }
        return result;
    }

    /*
     * Перевизначений метод removeAll для видалення
     * всіх елементів з колекції
     */
    @Override
    public void removeAll()
    {
        this.startNode = null;
        this.currentNode = null;
    }

    /*
     * Перевизначений метод повернення розміру колекції
     */
    @Override
    public final int size()
    {
        return this.size;
    }


    /*
     * Перевизначений метод перевірки на порожню колекцію
     */
    @Override
    public boolean isEmpty()
    {
        return startNode == null;
    }

    /*
     * Приватний метод отримання початкової ноди
     */
    private final Node getStartNode()
    {
        return this.startNode;
    }
}
