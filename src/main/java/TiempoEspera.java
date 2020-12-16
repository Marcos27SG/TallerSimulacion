
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
public class TiempoEspera {

    public int clienteEspera() {
        int res;
        Random rand = new Random();
        float r = rand.nextFloat();
        if (r >= 0 && r <= 0.5) {
            res = 1;
        } else {
            res = 2;
        }
        return res;

    }

    public int tiempoDeEspera() {
        int res;
        Random rand = new Random();
        float r = rand.nextFloat();
        //tiempo de espera de los clientes
        if (r >= 0 && r < 0.4) {
            res = 1;
        } else {
            if (r < 0.6) {
                res = 2;
            } else {
                if (r < 0.8) {

                    res = 3;
                } else {
                    res = 4;
                }
            }
        }
        return res;

    }
}
