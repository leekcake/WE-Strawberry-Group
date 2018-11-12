package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.*

object ConfigureStore {
    val background = EmptyConfigure("background", "ui_background")
    val backgroundFile = FileConfigure("backgroundFile", "ui_backgroundFile")
    val backgroundColor = ColorConfigure("backgroundColor", "ui_backgroundColor", 255, 209, 220)
}