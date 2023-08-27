package navigation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioManager

class VolumeButtonReceiver(
    private val onVolumeUp: () -> Unit,
    private val onVolumeDown: () -> Unit
) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "android.media.VOLUME_CHANGED_ACTION") {
            val audioManager =
                context?.getSystemService(Context.AUDIO_SERVICE) as? AudioManager

            audioManager?.let {
                val currentVolume = it.getStreamVolume(AudioManager.STREAM_MUSIC)
                val previousVolume = it.getStreamVolume(
                    AudioManager.FLAG_REMOVE_SOUND_AND_VIBRATE
                )
                if (currentVolume > previousVolume) {
                    onVolumeUp()
                } else if (currentVolume < previousVolume) {
                    onVolumeDown()
                }
            }
        }
    }

    fun register(context: Context) {
        val intentFilter = IntentFilter("android.media.VOLUME_CHANGED_ACTION")
        context.registerReceiver(this, intentFilter)
    }

    fun unregister(context: Context) {
        context.unregisterReceiver(this)
    }
}
