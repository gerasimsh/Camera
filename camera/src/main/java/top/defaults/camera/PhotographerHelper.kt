package top.defaults.camera

import top.defaults.camera.Values.*

class PhotographerHelper(private val photographer: Photographer) {

    fun switchMode() {
        photographer.mode = when (photographer.mode) {
            MODE_IMAGE -> MODE_VIDEO
            MODE_VIDEO -> MODE_IMAGE_AND_VIDEO
            MODE_IMAGE_AND_VIDEO -> MODE_IMAGE
            else -> MODE_IMAGE_AND_VIDEO
        }
    }

    fun flip() {
        val newFacing = if (photographer.facing == FACING_BACK) FACING_FRONT else FACING_BACK
        photographer.facing = newFacing
    }

    fun setFileDir(fileDir: String) {
        Utils.setFileDir(fileDir)
    }
}
