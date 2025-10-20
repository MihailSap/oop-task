package ru.oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code List.of(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 *   <li>Все добавленные интерфейсы, классы и методы должны иметь JavaDoc!</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * <b>Переехать из текущего места в заданную точку на любом транспорте.</b>
     * <ul>
     *     <li>Сначала человек идёт до первого транспорта.</li>
     *     <li>Он садится в первый транспорт, едет до следующей остановки (то есть до второго транспорта) и выходит.
     *     Затем человек садится во второй транспорт и так далее, пока транспорт из transports не закончится.</li>
     *     <li>В последнем транспорте в качестве destination указывается итоговое местоположение, которое нужно человеку.</li>
     *     <li>Последний элемент списка обрабатывается  отдельно, чтобы не выйти за границы и не получить ошибку.</li>
     *     <li>После того, как человек высаживается из последнего транспорта, он идёт до конечной цели.</li>
     * </ul>
     */
    public void moveTo(Person person, Position destination, List<Transport> transports){
        person.walk(transports.getFirst().getPosition());
        for(int i = 0; i < transports.size() - 1; i++){
            Transport currentTransport = transports.get(i);
            person.setTransport(currentTransport);
            currentTransport.moveTo(transports.get(i+1).getPosition());
            person.removeTransport();
        }
        person.setTransport(transports.getLast());
        transports.getLast().moveTo(destination);
        person.removeTransport();
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
