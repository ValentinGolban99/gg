/**
 * Создать класс program - ввод "class"(это называется снипед)
 * 
 * Снипед точка входа - "main"
 * 
 * Снипед обращение к консоли - "sysout"
 * 
 * F5 - запуск программы(также можно через "run")
 * 
 * 
 */

//Структура простой программы:

import java.util.Scanner;// Импорт для получения данных из терминала

public class program {
   public static void main(String[] args) {
       System.out.println("--Пример текста--");
       //Далее перечесление типов данных:

       // Хранение целых чисел:
       int age = 10;

       // Вещественные числа:
       float f = 123.45f;// Суффикс "f" показывает значение к типу "float"
       double d = 123.333;

       char ch = '1';// Тип данных определяющий конкретный символ

       boolean b = true && false; // Разделение по таблице истиности

       String msg = "Hello";// Строка

       // Неявная типизация:
       var i = 123;

       // Массивы(Одномерные):
       int[] arr = new int[10];
       System.out.println(arr.length);// Вывод длинны массива (10)

       arr = new int[] {1, 2, 3, 4, 5};
       System.out.println(arr.length);// Вывод длинны массива (5)

       System.out.println(arr[3]);// Обращение к массиву

       arr[3] = 13;// Присвоение значения элементу массива

       // Многомерные массивы
       int[] arra[] = new int[3][5];
       for (int[] line : arra) {
           for(int item : line) {
               System.out.printf("%d ", item);
            }
        
        }

        // Получение данных из терминала:
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        // Управляющие конструкции:
        // Если/Иначе
        int ad = 1;
        int ba = 2;
        int c;
        if (ad > ba) {
            c = ad;
        } else {
            c = ba;
        }
        System.out.println(c);


   }
    
}