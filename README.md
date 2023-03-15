# Задачи решаемые в рамках курса знакомство с Java

## task_1
* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
***

## task_2
* Вывести все простые числа от 1 до 1000
***

## task_3
* Реализовать простой калькулятор
***

## task_4
* Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
например 2? + ?5 = 69.  * Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
***

## Seminar_2_task_1
* Дано четное число N(>0) и символы C1 и C2.
Написать метод, который вернет строку длины N, которая
сотоит из чередующихся символов C1 и C2, начиная с C1
***

## Seminar_2_task_2
* Напишите метод, который сжимает строку.

***например: вход aaaabbbcdd***

***выход: a4b3c1d2***
***

## Seminar_2_task_3
* Напишите метод, который принимает на вход строку (String) и определяет является ли строка 
палиндромом (возвращает boolean значение)

***(пример строки) "А роза упала на лапу азора"***
***

##  Seminar_2_HomeWork_task_1
* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
  используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
  Если значение null, то параметр не должен попадать в запрос.
  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
***

##  Seminar_2_HomeWork_task_2
* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
***

##  Seminar_2_HomeWork_task_2
* Дана json строка (можно сохранить в файл и читать из файла) [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
* Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:

***Студент Иванов получил 5 по предмету Математика.***

***Студент Петрова получил 4 по предмету Информатика.***

***Студент Краснов получил 5 по предмету Физика.***

***

## Seminar_3_task_1
* Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
***

## Seminar_3_task_2
* Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
* Вывести названия каждой планеты и количество его повторений в списке
* Пройти по списку из планет и удалить повторяющиеся элементы
 ***

### Seminar_3_task_3
* Создать список типа ArrayList<String>
* Поместить в него как строки, так и целые числа.
* Пройти по списку, найти и удалить целые числа.
***

### Seminar_3_HomeWork_task_1
* Реализовать алгоритм сортировки слиянием
***

### Seminar_3_HomeWork_task_2 
* Пусть дан произвольный список целых чисел, удалить из него чётные числа
***

### Seminar_3_HomeWork_task_3
* Задан целочисленный список ArrayList. Найти минимальное,
  максимальное и среднее из этого списка.
*** 

### Seminar_4_task_0
* Замерьте время, за которое в Arraylist добавятся 10000 элементов.
* Замерьте время, за которое в Linkedlist добавятся 10000 элементов.
* Сравните с предыдущим.
***

### Seminar_4_task_1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по~, сохранить text в связный список на позицию num.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
***

### Seminar_4_task_1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~ , сохранить text в связный список на позицию num.
3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
***

### Seminar_4_task_2
Реализовать консольное приложение, которое:
1. Принимает от пользователя и "запоминает" строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
***

