package co.touchlab.kampstarter

import android.util.Log

actual fun currentTimeMillis(): Long = System.currentTimeMillis()

internal actual fun printThrowable(t: Throwable) {
    t.printStackTrace()
}

internal const val TAG = "PlatformAndroid"

actual fun loadLibrary(): Boolean {
  try {
    System.loadLibrary("zenroom")
    Log.d(TAG, "Loaded zenroom native library")
    return true
  } catch (exc: Throwable) {
    Log.d(TAG,"Could not load zenroom native library: " + exc.localizedMessage)
    return false
  }
}
