package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.*

class StrawberryProject : Project {
    override val configures: Array<Configure>
        get() = arrayOf(
            ConfigureStore.background,
            ConfigureStore.backgroundColor,
            ConfigureStore.backgroundFile
        )
    override val localizations: Array<Localization>
        get() = arrayOf(
            Localization("ui_background")
                .put("en-us", "<h4>Background</h4>")
                .put("ko-kr", "<h4>배경</h4>"),
            Localization("ui_backgroundColor")
                .put("en-us", "Background color")
                .put("ko-kr", "배경 색"),
            Localization("ui_backgroundFile")
                .put("en-us", "Background Image")
                .put("ko-kr", "배경 이미지")
        )
    override val supportAudioProcessing: Boolean
        get() = false
    override val title: String
        get() = "Strawberry group"

}