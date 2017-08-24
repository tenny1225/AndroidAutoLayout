package com.xz.autoLayout.attr;

import android.view.View;

import com.xz.autoLayout.AutoLayoutManager;


/**
 * Created by noahkong on 17-8-23.
 */

public class PaddingRightAttr extends AutoAttr {
    public PaddingRightAttr(boolean isDefault, int baseWidth, int baseHeight, float size) {
        super(isDefault, baseWidth, baseHeight, size);
    }

    @Override
    public void auto(View v) {

        if (isDefault || baseWidth == SELF) {
            return;
        }
        int right = 0;
        right = (int) (size * AutoLayoutManager.getWidthPercent());

        if (baseWidth == HEIGHT) {
            right = (int) (size * AutoLayoutManager.getHeightPercent());
        }else if(baseWidth==SELF){
            right =v.getPaddingRight();
        }
        v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), right, v.getPaddingBottom());
    }
}