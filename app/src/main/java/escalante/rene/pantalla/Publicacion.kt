package escalante.rene.pantalla

data class Publicacion(
    val id: Int,
    val titulo: String,
    val descripcion: String,
    val esEvento: Boolean = false
)

val publicaciones: List<Publicacion> = listOf(
    Publicacion(id = 1, titulo = "Publicación 1", descripcion = "Texto"),
    Publicacion(id = 2, titulo = "Publicación 2", descripcion = "Texto"),
    Publicacion(id = 3, titulo = "Publicación 3", descripcion = "Texto", esEvento = true),
    Publicacion(id = 4, titulo = "Publicación 4", descripcion = "Texto", esEvento = true),
    Publicacion(id = 5, titulo = "Publicación 5", descripcion = "Texto"),
    Publicacion(id = 6, titulo = "Publicación 6", descripcion = "Texto"),
    Publicacion(id = 7, titulo = "Publicación 7", descripcion = "Texto", esEvento = true),
    Publicacion(id = 8, titulo = "Publicación 8", descripcion = "Texto"),
    Publicacion(id = 9, titulo = "Publicación 9", descripcion = "Texto"),
    Publicacion(id = 10, titulo = "Publicación 10", descripcion = "Texto", esEvento = true),
    Publicacion(id = 11, titulo = "Publicación 11", descripcion = "Texto"),
    Publicacion(id = 12, titulo = "Publicación 12", descripcion = "Texto"),
    Publicacion(id = 13, titulo = "Publicación 13", descripcion = "Texto", esEvento = true),
    Publicacion(id = 14, titulo = "Publicación 14", descripcion = "Texto"),
    Publicacion(id = 15, titulo = "Publicación 15", descripcion = "Texto"),
    Publicacion(id = 16, titulo = "Publicación 16", descripcion = "Texto", esEvento = true),
    Publicacion(id = 17, titulo = "Publicación 17", descripcion = "Texto"),
    Publicacion(id = 18, titulo = "Publicación 18", descripcion = "Texto"),
    Publicacion(id = 19, titulo = "Publicación 19", descripcion = "Texto", esEvento = true),
    Publicacion(id = 20, titulo = "Publicación 20", descripcion = "Texto")
)