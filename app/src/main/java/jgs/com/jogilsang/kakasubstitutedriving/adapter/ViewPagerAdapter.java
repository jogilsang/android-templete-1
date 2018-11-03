package jgs.com.jogilsang.kakasubstitutedriving.adapter;

/**
 * Created by user on 2018-10-17.
 */


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> stringList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Nullable

    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }


    public void AddFragment(Fragment fragment, String title){

        fragmentList.add(fragment);
        stringList.add(title);
    }
}

