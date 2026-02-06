public abstract class Notificacion {
    protected final String receptorNotificacion;

     protected Notificacion(String receptorNotificacion ){
        if(receptorNotificacion == null || receptorNotificacion.isBlank()){
            throw new IllegalArgumentException("El receptor es invalido");
        }
        this.receptorNotificacion = receptorNotificacion;
    }

    public abstract void enviarMensaje(String mensaje);


}
