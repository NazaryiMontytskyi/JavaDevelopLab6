package Flowers;

/*
 * Абстрактний клас Flower, від якого успадкуються всі інші класи
 * квітів
 */

public abstract class Flower {
    
    private String name;            //назва квітки
    private double length;          //довжина квітки
    private String color;           //колір квітки
    private int amountOfPetals;     //кількість пелюсток
    private int levelOfFreshness;   //рівень свіжості


    /*
     * Порожній конструктор, що обумовлює можливість створення
     * порожнього екземпляру класу
     */
    public Flower()
    {

    }

    /*
     * Конструктор з параметрами, що ініціалізує поля всіх атрибутів
     */
    public Flower(final String name, final double length, final String color, final int amountOfPetals, final int levelOfFreshness)
    {
        this.length = length;
        this.color = color;
        this.amountOfPetals = amountOfPetals;
        this.name = name;
        this.levelOfFreshness = levelOfFreshness;
    }

    /*
     * Нижче наведені всі методи сетери
     */
    public void setLength(final double length)
    {
        this.length = length;
    }

    public void setColor(final String color)
    {
        this.color = color;
    }

    public void setAmountOfPetals(final int amountOfPetals)
    {
        this.amountOfPetals = amountOfPetals;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setLevelOfFreshness(final int levelOfFreshness)
    {
        this.levelOfFreshness = levelOfFreshness;
    }

    /*
     * Нижче наведені всі методи гетери
     */
    public final int getLevelOfFreshnes()
    {
        return this.levelOfFreshness;
    }

    public final double getLength()
    {
        return this.length;
    }

    public final String getColor()
    {
        return this.color;
    }

    public final int getAmountOfPetals()
    {
        return this.amountOfPetals;
    }

    public final String getName()
    {
        return this.name;
    }

    /*
     * Метод toString успадкований від класу Object.
     * Перевизначається з адаптацією під форматований вивід 
     * об'єкту класу.
     */
    @Override
    public String toString()
    {
        String result = "";
        result += String.format("|%10s", this.getName());
        result += String.format("|%10.2f", this.getLength());
        result += String.format("|%10s", this.getColor());
        result += String.format("|%10d", this.getAmountOfPetals());
        result += String.format("|%10d", this.getLevelOfFreshnes());
        return result;
    }

    /*
     * Статичний метод отримання заголовку таблиці
     * Оскільки заголовок спільний для всіх квітів, то такий
     * метод потрібно робити статичним
     */
    public static String getHeader()
    {
        return String.format(
            "|%10s|%10s|%10s|%10s|%10s|%10s|",
            "Name", "Length", "Color", "Petals", "Freshness", "Additional"
        );
    }

    /*
     * Роздільник таблиці використовується між рядками. Також спільний, тому
     * використовується статичність
     */
    public static String getSeparator()
    {
        String result = "";
        for(int i = 0; i < 6; i++)
        {
            result += "+----------";
        }
        result += "+";
        return result;
    }

}
