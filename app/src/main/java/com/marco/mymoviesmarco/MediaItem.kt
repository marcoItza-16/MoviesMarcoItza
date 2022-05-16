package com.marco.mymoviesmarco

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type

) {
    enum class  Type {PHOTO, VIDEO}
}

fun getMedia() = (1..10).map {
    MediaItem(
        id = it,
        title = "Title $it",
        thumb = "https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/styles/480/public/media/image/2019/03/lenguajes_programacion_odiados_amados_2019.jpg?itok=N85E5HTT/$it/",
        type = if (it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO

    )
}
