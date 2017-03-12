package com.rejimalson.collegeportal.helper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rejimalson.collegeportal.fragment.StudentLoginFragment;
import com.rejimalson.collegeportal.fragment.TeacherLoginFragment;

/**
 * Created by REJIMALson on 3/12/2017.
 */

public class HomePageAdapter extends FragmentPagerAdapter {

    public HomePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new StudentLoginFragment();
            case 1:
                return new TeacherLoginFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
