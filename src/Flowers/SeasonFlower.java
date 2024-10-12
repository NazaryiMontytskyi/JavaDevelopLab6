package Flowers;

/*
 * Клас квітки, що росте у певний сезон (пору року),
 * успадковується від базового класу Flower
 */
public class SeasonFlower extends Flower {
    
    private String season; //поле сезон

    /*
     * Конструктор з параметрами із викликом супер-класу
     * та ініціалізацією додаткового параметру
     */
    public SeasonFlower(
        final String name,
        final double length,
        final String color,
        final int amountOfPetals,
        final int levelOfFreshness,
        final String season
    )
    {
        super(name, length, color, amountOfPetals, levelOfFreshness);
        this.season = season;
    }

    
    /*
     * Методи сетер і гетер для нового атрибуту класу
     */
    public void setSeason(final String season)
    {
        this.season = season;
    }

    public final String getSeason()
    {
        return this.season;
    }

    /*
     * Успадкований перевизначений метод toString
     */
    @Override
    public String toString()
    {
        return super.toString() +
        String.format("|%10s|", this.getSeason());
    }

    @Override
    public boolean equals(Object other)
    {
        if(other == null || !(other instanceof SeasonFlower))
        {
            return false;
        }

        if(this == other)
        {
            return true;
        }

        SeasonFlower otherFlower = (SeasonFlower) other;
        boolean result = true;
        result = result & this.getName().equals(otherFlower.getName());
        result = result & this.getLength() == otherFlower.getLength();
        result = result & this.getColor().equals(otherFlower.getColor());
        result = result & this.getAmountOfPetals() == otherFlower.getAmountOfPetals();
        result = result & this.getLevelOfFreshnes() == otherFlower.getLevelOfFreshnes();
        result = result & this.getSeason().equals(otherFlower.getSeason());
        return result;
    }

}
