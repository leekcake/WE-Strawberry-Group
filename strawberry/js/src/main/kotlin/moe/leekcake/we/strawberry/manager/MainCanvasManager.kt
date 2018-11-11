package moe.leekcake.we.strawberry.manager

import moe.leekcake.we.basekit.manager.CanvasManager
import moe.leekcake.we.strawberry.StrawberryLeader
import org.w3c.dom.HTMLImageElement

class MainCanvasManager(leader: StrawberryLeader) : CanvasManager<StrawberryLeader>(leader) {
    override val canvasName: String
        get() = "mainCanvas"

    val strawBerry = js("new Image()") as HTMLImageElement

    override fun init() {
        super.init()
        strawBerry.src = "res/strawberry-2850845-lower.png"
    }

    var ox = 0
    var oy = 0

    fun drawStrawberryGroup() {
        ox += 1
        oy += 1
        if(ox == 96) {
            ox = 0;
        }
        if(oy == 96) {
            oy = 0;
        }
        for(y in -200..canvas.height+200 step 96) {
            for(x in -200..canvas.width+200 step 96) {
                canvasCtx.drawImage(strawBerry, x+ox.toDouble(), y+oy.toDouble())
            }
        }
    }

    override fun update() {
        canvasCtx.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())
        drawStrawberryGroup()
    }
}