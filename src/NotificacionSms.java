public class NotificacionSms extends Notificacion {
    protected NotificacionSms(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio el sms:" + mensaje + "a:" + receptorNotificacion);
    }
}
