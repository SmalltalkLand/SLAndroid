package com.smalltalkland.slandroid

import android.content.Intent
import android.webkit.JavascriptInterface

class WebInterface(private val mContext: MainActivity,private val mIntent: Intent?) {
    @JavascriptInterface
    fun showAppBar(){mContext.show()}

    @JavascriptInterface
    fun hideAppBar(){mContext.hide()}
}
