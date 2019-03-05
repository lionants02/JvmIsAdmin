package max.jvm.isadmin

import java.util.prefs.Preferences

/**
 * Ref:
 * https://stackoverflow.com/questions/4350356/detect-if-java-application-was-run-as-a-windows-admin
 */

class JvmIsAdmin {
    fun isAdmin(): Boolean {
        val prefs = Preferences.systemRoot()
        val systemErr = System.err
        synchronized(systemErr) {
            // better synchroize to avoid problems with other threads that access System.err
            System.setErr(null)
            return try {
                prefs.put("foo", "bar") // SecurityException on Windows
                prefs.remove("foo")
                prefs.flush() // BackingStoreException on Linux
                true
            } catch (e: Exception) {
                false
            } finally {
                System.setErr(systemErr)
            }
        }
    }
}
