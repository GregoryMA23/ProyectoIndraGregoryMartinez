package gmat05;
import java.util.Scanner;

/**
 *
 * @author gregory.michael.mart:Gregory Martinez Andujar
 */
public class GMAt05e02 {
    public static void main(String[] args) {
        char letra;
        double radio,lado,base,altura;
        String cad1="";
        Scanner teclado = new Scanner(System.in);
        do{
         System.out.println(menu(cad1));
         letra= teclado.next().charAt(0);
         if(letra=='a'){
             System.out.println("dame el radio del circulo: ");
             System.out.println("radio: ");
             radio = teclado.nextDouble();
             System.out.println("El area del circulo son: "+ circulo(radio)+" metros cuadrados");
         }
         else if(letra=='b'){
             System.out.println("dame el lado del cuadrado: ");
             System.out.println("lado: ");
             lado = teclado.nextDouble();
             System.out.println("El area del cuadro son: "+ cuadrado(lado)+" metros cuadrados");
                 }
         else if(letra=='c'){
             System.out.println("dame la base y la altura de un triangulo: ");
             System.out.println("Base: ");
             base = teclado.nextDouble();
             System.out.println("Altura: ");
             altura = teclado.nextDouble();
             System.out.println("El area del circulo son: "+ triangulo(base,altura)+" metros cuadrados");
          }
         else if(letra=='d'){
             System.out.println("Gracias por utilizar este programa!!!");
         }
         else{
             System.out.println("Has introducido una letra incorrecta,vulve a inetnatrlo");
         }
         System.out.println("");
        }while(letra!='d');
    }
    
    static double circulo(double r){
        double pi=3.14,a;
        a=pi*(r*r);
        return a;
    }
    static double cuadrado(double l){
        return l*l;
    }
     static double triangulo(double b,double a){
        return (b*a)/2;
    }
     static String menu(String cad1){
     cad1="a) el area de circulo necesitara el radio \n"  
                 + "b) el area de cuadrado,necesitara el lado \n" 
                 + "c) el area de triangulo,necesitara base y altura\n" 
                 + "d) Salir.";
     return cad1;
    }
}
