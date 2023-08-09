package hoirozn.fakerdata.utlis

import java.security.MessageDigest

class HashUtils {

    /**
     * Hash MessageDigest
     * Support MD5, SHA-256, SHA3-256
     */
    fun hashString(input: String, algorithm: String): String {
        val messageDigest = MessageDigest.getInstance(algorithm)
        val bytes = messageDigest.digest(input.toByteArray())
        return bytesToHex(bytes)
    }

    fun bytesToHex(bytes: ByteArray): String {
        val hexChars = "0123456789ABCDEF"
        val result = StringBuilder(bytes.size * 2)

        for (byte in bytes) {
            val index = byte.toInt() and 0xFF
            result.append(hexChars[index ushr 4])
            result.append(hexChars[index and 0x0F])
        }

        return result.toString()
    }
}