package seamonster.kraken.androidep6.util

import android.text.Html
import android.text.Spanned

object BindingUtils {

    @JvmStatic
    fun fromHtml(htmlText: String) : Spanned {
        return Html.fromHtml(htmlText, Html.FROM_HTML_MODE_LEGACY)
    }
}