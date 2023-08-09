package hoirozn.fakerdata.utlis

import jakarta.servlet.http.HttpServletRequest

class NetworkUtils {

    /***
     * Get Request Source IP Address
     */
    fun getRealIP(request: HttpServletRequest): String {
        val forwardedForHeader = request.getHeader("X-Forwarded-For")
        val realIPHeader = request.getHeader("X-Real-IP")

        // Choose the appropriate header based on your proxy or CDN setup
        val ipAddress = when {
            !forwardedForHeader.isNullOrBlank() -> forwardedForHeader.split(",")[0].trim()
            !realIPHeader.isNullOrBlank() -> realIPHeader
            else -> request.remoteAddr
        }

        return ipAddress
    }


}