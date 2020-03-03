package com.masashi.hamaguchi.fragment_demo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by Masashi Hamaguchi on 2020/03/03.
 */

public class OriginalFragmentPagerAdapter extends FragmentPagerAdapter {

    // Constructor
    public OriginalFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new MainActivity.Fragment1();

            case 1:
                return new MainActivity.Fragment2();

            case 2:
                return new MainActivity.Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Fragment1";

            case 1:
                return "Fragment2";

            case 2:
                return "Fragment3";

        }
        return null;
    }

}
