package com.example.calculator.domain;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

import com.example.calculator.R;

public enum Theme {
    THEME_ONE(R.string.theme_one, R.drawable.ic_baseline_camera_24, R.style.Theme_Calculator_Version2, "one"),
    THEME_TWO(R.string.theme_two, R.drawable.ic_baseline_ac_unit_24, R.style.Theme_Calculator_Version3, "two"),
    THEME_THREE(R.string.theme_three, R.drawable.ic_baseline_brightness_5_24, R.style.Theme_Calculator_Version4, "three");

    @StringRes
    private final int title;
    @DrawableRes
    private final int img;
    @StyleRes
    private final int theme;

    private final String key;

    Theme(int title, int img, int theme, String key) {
        this.title = title;
        this.img = img;
        this.theme = theme;
        this.key = key;
    }

    public int getTitle() {
        return title;
    }

    public int getImg() {
        return img;
    }

    public int getTheme() {
        return theme;
    }

    public String getKey() {
        return key;
    }
}
