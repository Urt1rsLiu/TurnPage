package com.royole.demo.utils;

import android.view.View;



public class ViewUtils {

    /**
     * 测量、设置View默认宽高
     *
     * @param defaultSize
     * @param measureSpec
     * @return
     */
    public static int measureSize(int defaultSize, int measureSpec) {
        int result = defaultSize;
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);

        if (specMode == View.MeasureSpec.EXACTLY) {
            result = specSize;
        } else if (specMode == View.MeasureSpec.AT_MOST) {
            result = Math.min(result, specSize);
        }
        return result;
    }
}
