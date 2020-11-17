/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.managers;

import entity.Parniki;
import java.util.List;
import java.util.Scanner;
import tools.savers.Saver;

/**
 *
 * @author user
 */
public class ParnikManager {
    private Saver saver = new Saver();
    private Scanner scanner = new Scanner(System.in);
    public Parniki createParnik(){
        Parniki parnik = new Parniki();
        System.out.println("----- Добавить парник -----");
        System.out.println("");
        System.out.println("Название: ");
        String name = scanner.nextLine();
        parnik.setName(name);
        System.out.println("Размер: ");
        String size = scanner.nextLine();
        parnik.setSize(size);
        System.out.println("Количество: ");
        int amount = scanner.nextInt();
        parnik.setAmount(amount);
        System.out.println("Цена: ");
        int price = scanner.nextInt();
        parnik.setPrice(price);
        scanner.nextLine();
        return parnik;
    }
    public void addParnikToArray(List<Parniki> listParniki, Parniki parnik){
        listParniki.add(parnik);
        saver.saveToFile(listParniki, "saveParniki");
    }
    public void printParnikArray(List<Parniki> listParniki){
        System.out.println("----- Список парников -----");
        System.out.println("");
        for (int i = 0; i < listParniki.size(); i++) {
            if (listParniki.get(i) != null) {
                System.out.printf("%d. Название: %s Размер: %s Количество: %d Цена: %d%n"
                        ,i+1
                        ,listParniki.get(i).getName()
                        ,listParniki.get(i).getSize()
                        ,listParniki.get(i).getAmount()
                        ,listParniki.get(i).getPrice());
                System.out.println("---------------------");
            }
            
        }
    }
}
