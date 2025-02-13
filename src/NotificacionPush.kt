class NotificacionPush(val nombrePersona: String): Notificable {

    override fun enviarNotificacion() {
        println("Notificacion pa pushear la linea")
    }
}