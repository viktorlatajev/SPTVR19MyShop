/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.managers;

import entity.Consumers;
import entity.Parniki;
import java.util.List;
import java.util.Scanner;
import tools.savers.Saver;

/**
 *
 * @author user
 */
public class ConsumerManager {
    private Saver saver = new Saver();
    private Scanner scanner = new Scanner(System.in);
    public Consumers createConsumer(){
        
        System.out.println("----- Добавить покупателя -----");
        System.out.println("");
        System.out.println("Имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.println("Деньги: ");
        int money = scanner.nextInt();
        scanner.nextLine();
        Consumers consumer = new Consumers(firstName, lastName, money);
        return consumer;
    }
    public void addConsumerToArray(List<Consumers> listConsumers, Consumers consumer){
        listConsumers.add(consumer);
        saver.saveToFile(listConsumers, "saveConsumers");
    }
    public void printConsumerArray(List<Consumers> listConsumers){
        System.out.println("----- Список покупателей -----");
        System.out.println("");
        for (int i = 0; i < listConsumers.size(); i++) {
            if (listConsumers.get(i) != null) {
                System.out.printf("%d. Имя: %s Фамилия: %s Деньги: %d%n"
                        ,i+1
                        ,listConsumers.get(i).getFirstName()
                        ,listConsumers.get(i).getLastName()
                        ,listConsumers.get(i).getMoney());
                System.out.println("---------------------");
            }
            
        }
    }


}
