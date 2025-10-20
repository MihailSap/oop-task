package ru.oop.task3;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     * Если человек уже находится в указанной позиции, то метод завершает свою работу
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Человек садится в указанный транспорт
     *
     * @param transport
     */
    void setTransport(Transport transport);

    /**
     * Человек выходит из транспорта
     */
    void removeTransport();
}
