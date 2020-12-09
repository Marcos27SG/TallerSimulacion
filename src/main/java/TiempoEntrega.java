
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCOS
 */
public class TiempoEntrega {
    public int calcular(){
        int res;
        Random rand = new Random();
        float r =  rand.nextFloat();
        //tiempo de entrega de los pedidos
        if(r>= 0 && r< 0.3){
            res = 1;
        }else{
            if(r < 0.7){
                res = 2 ;
            }else{
               
                    res =3;
                
            }
        }
        return res;
        
    }
}
