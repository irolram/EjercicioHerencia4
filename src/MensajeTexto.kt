class MensajeTexto(val nombrePersona: String): Notificable{

    override fun enviarNotificacion() {
        println("Tienes una notificacion de carglass")
    }
}