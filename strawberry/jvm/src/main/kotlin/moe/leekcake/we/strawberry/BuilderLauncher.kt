package moe.leekcake.we.strawberry

import moe.leekcake.we.basekit.Builder
import java.io.File

fun main(args: Array<String>) {
    val builder = Builder(StrawberryProject())
    builder.build( File(args[0]) )
}