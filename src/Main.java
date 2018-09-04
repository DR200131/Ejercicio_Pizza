/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Pizza p1 = new Pizza ("", 0, 0);
        Pizza p2 = new Pizza ("", 0 ,0);
        Pizza [] pizzas = new Pizza [10];
        
        String ingrediente;
        double diametro;
        double precio;
        
        /*System.out.println("Digite los ingredientes para la primera pizza: ");
        p1.setToppings(entrada.next());
        
        System.out.println("Digite el diametro para la primera pizza: ");
        p1.setDiameter(entrada.nextDouble());
        
        System.out.println("Digite el precio para la primera pizza: ");
        p1.setPrice(entrada.nextDouble());
        
        System.out.println("Digite los ingredientes para la segunda pizza: ");
        p2.setToppings(entrada.next());
        
        System.out.println("Digite el diametro para la segunda pizza: ");
        p2.setDiameter(entrada.nextDouble());
        
        System.out.println("Digite el precio para la segunda pizza: ");
        p2.setPrice(entrada.nextDouble());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        */
        
        for(int i = 0; i < pizzas.length; i++ )
        {
            System.out.println("Ingrediente");
            ingrediente = entrada.next();
            
            System.out.println("Diametro");
            diametro = entrada.nextDouble();
            
            System.out.println("Precio");
            precio = entrada.nextDouble();
            
            Pizza pizza = new Pizza (ingrediente, diametro, precio);
            pizzas[i] = pizza;
        }
        
        for (int i = 0; i < pizzas.length; i++) 
        {
            System.out.println(pizzas[i]);
        }
    }
}
