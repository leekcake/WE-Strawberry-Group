package moe.leekcake.we.strawberry.manager

import moe.leekcake.we.basekit.get
import moe.leekcake.we.basekit.listen
import moe.leekcake.we.basekit.manager.BaseManager
import moe.leekcake.we.strawberry.ConfigureStore
import moe.leekcake.we.strawberry.StrawberryLeader
import org.w3c.dom.Attr
import org.w3c.dom.HTMLImageElement
import kotlin.browser.document

class BackgroundManager(leader: StrawberryLeader) : BaseManager<StrawberryLeader>(leader) {
    lateinit var background: HTMLImageElement

    override fun init() {
        background = document.getElementById("background") as HTMLImageElement

        updateBackground()

        ConfigureStore.backgroundFile.listen(leader) {
            updateBackground(it, null)
        }

        ConfigureStore.backgroundColor.listen(leader) {
            updateBackground(null, it)
        }
    }

    fun updateBackground(file: String? = null, color: String? = null) {
        val fileSafe = if(file != null) file else ConfigureStore.backgroundFile.get(leader)
        val colorSafe = if(color != null) color else ConfigureStore.backgroundColor.get(leader)

        document.body!!.style.backgroundColor = colorSafe

        if(fileSafe != "") {
            background.setAttribute("src", fileSafe)
            background.style.display = "block"
        } else {
            background.removeAttribute("src")
            background.style.display = "none"
        }
     }

    override fun update() {

    }

    override fun destroy() {

    }
}