package CustomCollections;

/*
 * Інтерфейс, який визначає функціонал однозв'язного списку
 */

public interface List<T> {
    
    /*
     * Метод додавання
     */
    public boolean add(final T element);

    /*
     * Метод видалення за елементом
     */
    public boolean remove(final T element);

    /*
     * Метод видалення за індексом
     */
    public boolean remove(final int index);

    /*
     * Метод перевірки на наявність у колекції
     */
    public boolean contains(final T element);

    /*
     * Метод видалення колекції
     */
    public void removeAll();

    /*
     * Метод отримання розміру колекції
     */
    public int size();

    /*
     * Метод перевірки колекції на пустоту
     */
    public boolean isEmpty();

}
