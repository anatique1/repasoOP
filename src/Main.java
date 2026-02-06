//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("1",  100);
        cuenta1.consignar(150);
        cuenta1.retirar(100);
        System.out.println("El saldo de la cuenta es : " + cuenta1.getSaldo());
        Notificacion[] notificaciones = new Notificacion[2];
        notificaciones [1] = new NotificacionSms("maria");
        notificaciones [0] = new NotificacionCorreo("ana");

        notificaciones [0].enviarMensaje ("mensaje");
        notificaciones [1].enviarMensaje ("mensaje");
    }
}


