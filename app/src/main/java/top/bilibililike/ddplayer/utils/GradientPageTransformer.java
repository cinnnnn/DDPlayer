package top.bilibililike.ddplayer.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

import top.bilibililike.ddplayer.R;

public class GradientPageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        Animation animation = AnimationUtils.loadAnimation(page.getContext(),R.anim.anim_gradient_transform);
        page.startAnimation(animation);
    }
}
