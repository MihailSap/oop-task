package ru.oop.task2;

/**
 * Машина
 * Реализация интерфейса Transport (в том числе, интерфейса Positioned)
 *
 * @author MihailSap
 * @since 17.10.2025
 */
public class Car implements Transport{

    /**
     * При создании машины мы садим в неё человека
     * Местоположение машины можно получить из человека
     */
    public Car(Person person){

    }

    @Override
    public void moveToAndRemovePerson(Position destination) {

    }

    @Override
    public Position getPosition() {
        return null;
    }
}
