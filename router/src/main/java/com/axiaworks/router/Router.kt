package com.axiaworks.router

import android.content.Context
import android.content.Intent
import com.axiaworks.main.MainUiRouter
import com.axiaworks.sub.SubActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MainUiImpl @Inject constructor(
    @ApplicationContext val context: Context
) : MainUiRouter {
    override fun navToSubActivity() {
        Intent(context, SubActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(this)
        }
    }
}