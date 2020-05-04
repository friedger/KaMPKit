package co.touchlab.kmp

import org.junit.Test
import kotlin.test.fail

class NativeLibraryTest  {

  @Test
  fun loadLibrary() {
    try {
      System.loadLibrary("zenroom")
      System.out.println("Loaded zenroom native library")
    } catch (exc: Throwable) {
      fail("Could not load zenroom native library: " + exc.localizedMessage)
    }
  }
}
