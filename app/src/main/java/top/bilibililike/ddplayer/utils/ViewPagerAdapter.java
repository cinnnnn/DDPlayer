package top.bilibililike.ddplayer.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import top.bilibililike.ddplayer.base.BaseFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> list;

    public ViewPagerAdapter(FragmentManager fm, List<BaseFragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
