package moe.leekcake.we.strawberry.manager

import moe.leekcake.we.basekit.Utils
import moe.leekcake.we.basekit.get
import moe.leekcake.we.basekit.manager.AudioManager
import moe.leekcake.we.basekit.manager.CanvasManager
import moe.leekcake.we.strawberry.ConfigureStore
import moe.leekcake.we.strawberry.StrawberryLeader
import org.w3c.dom.HTMLImageElement
import kotlin.math.roundToInt

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

    fun getAudioArrayAt(index: Int): Double {
        if(leader.audioManager.audioArrayInited) {
            if(index < 0 || index >= leader.audioManager.audioArray.size)
                return 0.0

            return leader.audioManager.audioArray[index]
        } else {
            return 0.0
        }
    }

    fun drawStrawberryGroup() {
        val useScale = ConfigureStore.strawberryUseScale.get(leader)
        val margin = ConfigureStore.strawberryMargin.get(leader)
        val baseScale = ConfigureStore.strawberryBaseScale.get(leader) / 100.0
        val expandScale = ConfigureStore.strawberryExpandScale.get(leader) / 100.0

        ox += 1
        oy += 1

        //Handle for margin change
        while(ox >= margin) {
            ox -= margin
        }

        while(oy >= margin) {
            oy -= margin
        }

        val marginWidth = canvas.width+margin
        val marginHeight = canvas.height+margin
        val min = -margin + (-margin * marginWidth.toDouble())
        val max = marginWidth + (marginWidth * (marginHeight)).toDouble()

        for(y in -margin..marginHeight step margin) {
            for(x in -margin..marginWidth step margin) {
                val inx = if(leader.audioManager.audioArrayInited)
                    (Utils.normalize(x+(y*marginWidth.toDouble()), min, max) * leader.audioManager.audioArray.size-1).roundToInt()
                else
                    0

                if(useScale) {
                    val scale = baseScale + (expandScale * getAudioArrayAt(inx))
                    canvasCtx.drawImage(strawBerry, x+ox.toDouble(), y+oy.toDouble(), strawBerry.width*scale,strawBerry.height*scale)
                } else {
                    canvasCtx.drawImage(strawBerry, x+ox.toDouble(), y+oy.toDouble())
                }
            }
        }
    }

    override fun update() {
        canvasCtx.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())
        drawStrawberryGroup()
    }
}