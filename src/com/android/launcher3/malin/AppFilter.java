package com.android.launcher3.malin;

import android.content.ComponentName;
import android.content.Context;

import com.android.launcher3.malin.R;

public class AppFilter {

    public static AppFilter newInstance(Context context) {
        return Utilities.getOverrideObject(AppFilter.class, context, R.string.app_filter_class);
    }

    public boolean shouldShowApp(ComponentName app) {
        return true;
    }
}
