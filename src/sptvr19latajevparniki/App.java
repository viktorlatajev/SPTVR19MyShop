/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19latajevparniki;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {

    public void run() {
        System.out.println("----- Парники для садового участка -----");
        boolean repeat = true;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("0. Выход из магазина");
            System.out.println("1. Добавить парник");
            System.out.println("2. Список парников");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Купить парник");
            System.out.println("Выберите задачу: ");
            
            String task = scanner.nextLine();
            switch(task){
                case "0":
                    repeat = false;
                    System.out.println("Вы вышли из магазина!");
                    break;
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }while(repeat);
    }
    
}
