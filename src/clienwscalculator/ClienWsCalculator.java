
package clienwscalculator;


public class ClienWsCalculator {

    
    public static void main(String[] args) {
        System.out.println("Suma de dos números enteros: " + suma(4,5));
        System.out.println("6 - 7 = " + resta(6,7));
        System.out.println("La división entre 2435 y 232 es: " + div(10,2));
        System.out.println("Si multiplicamos 5 por 5 la solución es: " + mul(5,5));
    }

    private static int suma(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.suma(n1, n2);
    }

    private static int resta(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.resta(n1, n2);
    }

    private static double div(double n1, double n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.div(n1, n2);
    }

    private static int mul(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.mul(n1, n2);
    }
    
}
