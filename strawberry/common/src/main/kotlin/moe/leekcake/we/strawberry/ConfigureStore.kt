package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.*

object ConfigureStore {
    val background = EmptyConfigure("background", "ui_background")
    val backgroundFile = FileConfigure("backgroundFile", "ui_backgroundFile")
    val backgroundColor = ColorConfigure("backgroundColor", "ui_backgroundColor", 255, 209, 220)

    val audio = EmptyConfigure("audio", "ui_audio")
    val audioUseLerp = BoolConfigure("audioUseLerp", "ui_audioUseLerp", true)
    val audioLerpPower = SliderConfigure("audioLerpPower", "ui_audioLerpPower", 39, 10, 100, true)

    val strawberry = EmptyConfigure("strawberry", "ui_strawberry")
    val strawberryMargin = SliderConfigure("strawberryMargin", "ui_strawberryMargin", 96, 0, 96*5, true)
    val strawberryUseScale = BoolConfigure("strawberryUseScale", "ui_strawberryUseScale", true)
    val strawberryBaseScale = SliderConfigure("strawberryBaseScale", "ui_strawberryBaseScale", 50, 0, 100, false)
    val strawberryExpandScale = SliderConfigure("strawberryExpandScale", "ui_strawberryExpandScale", 150, 0, 100, false)
}