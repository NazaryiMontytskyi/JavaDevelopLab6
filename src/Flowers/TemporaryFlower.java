package Flowers;

/*
 * Клас квітки, що росте лише певний період
 * Успадковується від базового класу Flower
 * 
 */
public class TemporaryFlower extends Flower{
    
    private int termOfLife; //атрибут тривалості життя

    /*
     * Конструктор із параметрами для ініціалізацією супер-класу та
     * додаткового параметру
     */
    public TemporaryFlower(final String name, final double length, final String color, final int amountOfPetals, final int levelOfFreshness, final int termOfLife)
    {
        super(name, length, color, amountOfPetals, levelOfFreshness);
        this.termOfLife = termOfLife;
    }

    /*
     * Методи гетер і сетер для нового атрибуту
     */
    public void setTerm(final int termOfLife)
    {
        this.termOfLife = termOfLife;
    }

    public final int getTerm()
    {
        return this.termOfLife;
    }

    /*
     * Перевизначений метод toString
     */
    @Override
    public String toString()
    {
        return super.toString() + 
        String.format("|%10d|", this.getTerm());
    }


    @Override
    public boolean equals(Object other)
    {
        if(other == null || !(other instanceof TemporaryFlower))
        {
            return false;
        }

        if(this == other)
        {
            return true;
        }

        TemporaryFlower otherFlower = (TemporaryFlower) other;
        boolean result = true;
        result = result & this.getName().equals(otherFlower.getName());
        result = result & this.getLength() == otherFlower.getLength();
        result = result & this.getColor().equals(otherFlower.getColor());
        result = result & this.getAmountOfPetals() == otherFlower.getAmountOfPetals();
        result = result & this.getLevelOfFreshnes() == otherFlower.getLevelOfFreshnes();
        result = result & this.getTerm() == otherFlower.getTerm();
        return result;
    }

}
