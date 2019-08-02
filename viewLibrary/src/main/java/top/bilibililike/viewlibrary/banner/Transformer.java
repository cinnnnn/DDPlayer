package top.bilibililike.viewlibrary.banner;


import androidx.viewpager.widget.ViewPager;

import top.bilibililike.viewlibrary.banner.transformer.AccordionTransformer;
import top.bilibililike.viewlibrary.banner.transformer.BackgroundToForegroundTransformer;
import top.bilibililike.viewlibrary.banner.transformer.CubeInTransformer;
import top.bilibililike.viewlibrary.banner.transformer.CubeOutTransformer;
import top.bilibililike.viewlibrary.banner.transformer.DefaultTransformer;
import top.bilibililike.viewlibrary.banner.transformer.DepthPageTransformer;
import top.bilibililike.viewlibrary.banner.transformer.FlipHorizontalTransformer;
import top.bilibililike.viewlibrary.banner.transformer.FlipVerticalTransformer;
import top.bilibililike.viewlibrary.banner.transformer.ForegroundToBackgroundTransformer;
import top.bilibililike.viewlibrary.banner.transformer.RotateDownTransformer;
import top.bilibililike.viewlibrary.banner.transformer.RotateUpTransformer;
import top.bilibililike.viewlibrary.banner.transformer.ScaleInOutTransformer;
import top.bilibililike.viewlibrary.banner.transformer.StackTransformer;
import top.bilibililike.viewlibrary.banner.transformer.TabletTransformer;
import top.bilibililike.viewlibrary.banner.transformer.ZoomInTransformer;
import top.bilibililike.viewlibrary.banner.transformer.ZoomOutSlideTransformer;
import top.bilibililike.viewlibrary.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
