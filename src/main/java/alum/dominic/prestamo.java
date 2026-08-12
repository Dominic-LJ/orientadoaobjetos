package alum.dominic;
/*deje fuera la asignacion de la persona que recibe el prestamopor falta del ambito del proyecto
Deberia asociarlo a personas e historial de pago
 */

public class prestamo {
    String fechaPrestamo;
    int montoPrestamo;
    float tasaPrestamo;
    int cuotas;

    public prestamo() {
    }
    public Prestamo(String fechaPrestamo, int montoPrestamo) {
    }


    public boolean solicitar(){
        return true;
    }
    public int pagarCuota(int cuota){
        return 0;
    }
    public boolean terminarPrestamo(){
        return true;
    }
    }

}
