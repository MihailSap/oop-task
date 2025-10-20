package ru.oop.task2;

/**
 * Транспорт
 *
 * @author MihailSap
 * @since 17.10.2025
 */
public interface Transport extends Positioned{

    /**
     * Транспорт довозит человека до определенной позиции и высаживает
     * Если транспорт не может доехать до нужной позиции,
     * то он подъезжает к ней близко, насколько возможно, и высаживает человека
     *
     * @param destination место назначения
     */
    void moveToAndRemovePerson(Position destination);
}