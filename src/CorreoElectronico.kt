class CorreoElectronico(val nombrePersona: String): Notificable {

    override fun enviarNotificacion() {
        println("Te ha llegado una notificacion al correo")
    }
}