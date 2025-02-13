
fun main() {

    val msj1 = CorreoElectronico("Juaquines")
    val msj2 = MensajeTexto("Manzana")
    val msj3 = NotificacionPush("Pepe")

    val notis = mutableListOf<Notificable>(msj1, msj2, msj3)

    for (notificacion in notis) {
        notificacion.enviarNotificacion()
    }

}