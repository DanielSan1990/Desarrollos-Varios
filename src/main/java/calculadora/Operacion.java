
package calculadora;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operacion {
    
    double n1;
    double n2;
    double res;
    char simbolo;
    protected double resultado;
    Logger logger = LoggerFactory.getLogger(Operacion.class);

    public Operacion(double n1, double n2, char simbolo) {

        this.n1 = n1;
        this.n2 = n2;
        this.simbolo = simbolo;
    }
        
    public void mostrarResultado(){
        logger.info(this.n1+" "+this.simbolo +" "+this.n2+" = "+this.res);
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

}
