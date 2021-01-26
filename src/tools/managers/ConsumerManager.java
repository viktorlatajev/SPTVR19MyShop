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

    public void buyProduct(List<Consumers> listConsumers, List<Parniki> listParniki, ParnikManager parnikManager) {
        System.out.println("---Купить товар---");
        if(listParniki.size()!=0){
            printConsumerArray(listConsumers);
            System.out.println("Выберите номер покупателя: ");
            int consumerNum = scanner.nextInt()-1;
            parnikManager.printParnikArray(listParniki);
            System.out.println("Выберите номер товара: ");
            int productNum = scanner.nextInt()-1;
            if(listConsumers.get(consumerNum).getMoney()>=listParniki.get(productNum).getPrice()) {
                System.out.printf("%s "+"%s купил"+" %s  за "+listParniki.get(productNum).getPrice()+"$ %n"
                        , listConsumers.get(consumerNum).getFirstName()
                        , listConsumers.get(consumerNum).getLastName()
                        , listParniki.get(productNum).getName()


                        );
                listConsumers.get(consumerNum).setMoney(listConsumers.get(consumerNum).getMoney()-listParniki.get(productNum).getPrice());
                Saver saver = new Saver();
                saver.saveToFile(listConsumers, "listConsumers");
                listParniki.get(productNum).setAmount(listParniki.get(productNum).getAmount()-1);
                if(listParniki.get(productNum).getAmount()==0){
                    listParniki.remove(productNum);
                }
                saver.saveToFile(listParniki, "listProducts");

            }else {
                System.out.println("Не достаточно средств");
            }
        }else {
            System.out.println("Нет товара");
        }    
    }

    
}