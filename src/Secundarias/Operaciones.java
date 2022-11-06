/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secundarias;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    
    double capital = 0;
    
    double tiempo = 0;
    
    double interes = 0;
    
    double interesSimple = 0;
    
    double interesCompuesto = 0;
    
    String ids = "";
    
    double años = 0;
    
   
    

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteresSimple() {
        return interesSimple;
    }

    public void setInteresSimple(double interesSimple) {
        this.interesSimple = interesSimple;
    }

    public double getInteresCompuesto() {
        return interesCompuesto;
    }

    public void setInteresCompuesto(double interesCompuesto) {
        this.interesCompuesto = interesCompuesto;
    }


     public double InteresSimpleResolucion( double c, double i,double t){
        
        double dci = i / 100;
        
        double is = ( c * dci * t); 
        
        double redondeo = Math.round(is*100.0)/100.0;
        
        interesSimple = redondeo;
        
        return interesSimple;
    }
     
     public double InteresSimple( double c, double i,double t){
        
        double dci = i / 100;
        
        double is = ( c * ( 1 + dci * t) ); 
        
        double redondeo = Math.round(is*100.0)/100.0;
        
        interesSimple = redondeo;
        
        return interesSimple;
    } 
     
    public double InteresCompResol(double c,double i, double t ){
    
        double dci = i / 100;
        
        double n1 = ( 1 + dci  );
        
        double cuadrado = Math.pow(n1, t );
        
        double n2 = c * cuadrado;
        
        double redondeo = Math.round(n2*100.0)/100.0;
        
        interesCompuesto = redondeo;
        
        return interesCompuesto;    
    }
    
    public double InteresCompuesto(double c, double i,double t){
        
        double dci = i / 100;
        
        double n1 = ( 1 + dci  );
        
        double cuadrado = Math.pow(n1, t );
        
        double n2 = c * cuadrado;
        
        double n3 = n2 - c;
        
        double redondeo = Math.round(n3*100.0)/100.0;
        
        return redondeo;
    }
    
    
    
    

   


   
}
