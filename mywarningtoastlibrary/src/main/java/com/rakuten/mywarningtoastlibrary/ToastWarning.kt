package com.rakuten.mywarningtoastlibrary

import android.content.Context
import android.widget.Toast

/**
 * @author Devendra Vaja on September 06, 2023
 *         Copyright (C) 2023 Rakuten Rewards. All rights reserved.
 */
class ToastWarning {
    fun showWarningToast(context: Context, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}