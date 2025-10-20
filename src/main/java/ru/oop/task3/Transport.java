package ru.oop.task3;

/**
 * Транспорт
 *
 * @author MihailSap
 * @since 17.10.2025
 */
public interface Transport extends Positioned{

    /**
     * Проехать до указанного места назначения из текущего и высадить человека
     * Если транспорт не может доехать до указанного места назначения,
     * то он едет до наиболее близкого места назначения, насколько это возможно.
     *
     * @param destination место назначения
     */
    void moveTo(Position destination);
}
