/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19latajevparniki;

import entity.Consumers;
import entity.Parniki;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.managers.ConsumerManager;
import tools.managers.ParnikManager;
import tools.savers.Saver;

/**
 *
 * @author user
 */
class App {
    private List<Parniki> listParniki = new ArrayList<>();
    private ParnikManager parnikManager = new ParnikManager();
    private List<Consumers> listConsumers = new ArrayList<>();
    private ConsumerManager consumerManager = new ConsumerManager();
    
    public App(){
        Saver saver = new Saver();
        this.listParniki = saver.loadFromFile("saveParniki");
        this.listConsumers = saver.loadFromFile("saveConsumers");
    }
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
                    Parniki parnik = parnikManager.createParnik();
                    parnikManager.addParnikToArray(listParniki, parnik);
                    break;
                case "2":
                    parnikManager.printParnikArray(listParniki);
                    break;
                case "3":
                    Consumers consumer = consumerManager.createConsumer();
                    consumerManager.addConsumerToArray(listConsumers, consumer);
                    break;
                case "4":
                    consumerManager.printConsumerArray(listConsumers);
                    break;
                case "5":
                    consumerManager.buyProduct(listConsumers, listParniki, parnikManager);
                    break;
                default:
                    System.out.println("Нет такой задачи!");
            }
        }while(repeat);
    }
    
}
