package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.*

class StrawberryProject : Project {
    override val configures: Array<Configure>
        get() = arrayOf(
            ConfigureStore.background,
            ConfigureStore.backgroundColor,
            ConfigureStore.backgroundFile,

            ConfigureStore.audio,
            ConfigureStore.audioUseLerp,
            ConfigureStore.audioLerpPower,

            ConfigureStore.strawberry,
            ConfigureStore.strawberryMargin,
            ConfigureStore.strawberryUseScale,
            ConfigureStore.strawberryBaseScale,
            ConfigureStore.strawberryExpandScale
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
                .put("ko-kr", "배경 이미지"),
            Localization("ui_audio")
                .put("en-US", "<h4>Spectrum</h4>")
                .put("ko-KR", "<h4>오디오</h4>"),
            Localization("ui_audioUseLerp")
                .put("en-US", "Use lerp")
                .put("ko-KR", "스펙트럼 부드럽게 하기"),
            Localization("ui_audioLerpPower")
                .put("en-US", "Lerp power")
                .put("ko-KR", "스펙트럼의 부드럽지 않은 정도"),
            Localization("ui_strawberry")
                .put("en-us", "<h4>Strawberry</h4>")
                .put("ko-kr", "<h4>딸기</h4>"),
            Localization("ui_strawberryMargin")
                .put("en-us", "Margin between strawberry")
                .put("ko-kr", "딸기 사이의 간격"),
            Localization("ui_strawberryUseScale")
                .put("en-us", "Scale strawberry with audio")
                .put("ko-kr", "소리에 맞추어 딸기 크기 조절하기"),
            Localization("ui_strawberryBaseScale")
                .put("en-us", "Base scale for strawberry")
                .put("ko-kr", "딸기의 최소 크기"),
            Localization("ui_strawberryExpandScale")
                .put("en-us", "Expandable scale for strawberry")
                .put("en-us", "딸기가 커질수 있는 크기")
        )
    override val supportAudioProcessing: Boolean
        get() = true
    override val title: String
        get() = "Strawberry group"

}