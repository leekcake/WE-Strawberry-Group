package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.Leader
import moe.leekcake.we.basekit.Project
import moe.leekcake.we.basekit.manager.AudioManager
import moe.leekcake.we.strawberry.manager.BackgroundManager
import moe.leekcake.we.strawberry.manager.MainCanvasManager

class StrawberryLeader(project: Project) : Leader(project) {
    val audioManager = addManager(AudioManager(this))
    val mainCanvasManager = addManager(MainCanvasManager(this))
    val backgroundManager = addManager(BackgroundManager(this))

    init {
        audioManager.useLerpProperty = ConfigureStore.audioUseLerp
        audioManager.lerpPowerProperty = ConfigureStore.audioLerpPower
    }
}