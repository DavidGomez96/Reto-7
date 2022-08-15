package com.mycompany.reto7;

import java.util.ArrayList;

public class Carretera {
    private ArrayList<Tramo> via;
    
    public Carretera(){
        via = new ArrayList<>();
    }
    
    public double longitudTotal(){
        double longitud = 0;
        for(Tramo tramo : via){
            longitud += tramo.longitud();
        }
        return longitud;
    }
    
    public double areaTotal(){
        double area = 0;
        for(Tramo tramo : via){
            area += tramo.area();
        }
        return area;
    }
    
    public double volumenTotal(){
        double volumen = 0;
        for(Tramo tramo : via){
            volumen += tramo.volumen();
        }
        return volumen;
    }
    
    public double volumenTotalAsfalto(){
        double volumenAsfalto = 0;
        for(Tramo tramo : via){
            if(tramo.getClass().getSimpleName().equals("TramoConAsfalto")){
                volumenAsfalto += tramo.volumen();
            }
        }
        return volumenAsfalto;
    }
    
    public double volumenTotalSinAsfalto(){
        double volumenSinAsfalto = 0;
        for(Tramo tramo : via){
            if(tramo.getClass().getSimpleName().equals("TramosSinAsfalto"))
                volumenSinAsfalto += tramo.volumen();
        }
        return volumenSinAsfalto;
    }
    
    public boolean conectados(){
        if(via.isEmpty()){
            return false;
        }
        double cont = 0;
        for(int i = 0; i < (via.size()-1); i ++){
            if(via.get(i).getxFinal() == via.get(i + 1).getxInicial() && via.get(i).getyFinal() == via.get(i + 1).getyInicial()){
                cont ++;
            }
        }
        return cont == (via.size() - 1);
    }
    
    public ArrayList<Tramo> getVia(){
        return via;
    }
    
    public void setVia(ArrayList<Tramo> via){
        this.via = via;
    }   
}
