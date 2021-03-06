package com.lyl.boon.ui.superboon;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.lyl.boon.ui.base.fragment.BaseMenuFragment;

import java.util.List;

/**
 * Wing_Li
 * 2016/4/1.
 */
public class SuperBoonFragment extends BaseMenuFragment {

    public static final String SUPER_TYPE = "type";

    @Override
    protected void setFragment(List<String> titles, List<Fragment> fragments) {
        addFragment(titles, fragments, "萌女", 595);
        addFragment(titles, fragments, "粉嫩", 625);
        addFragment(titles, fragments, "婚纱", 596);
        addFragment(titles, fragments, "车模", 600);
        addFragment(titles, fragments, "明星", 599);
        addFragment(titles, fragments, "街拍", 596);
        addFragment(titles, fragments, "cosplay", 598);
    }

    private void addFragment(List<String> titles, List<Fragment> fragments, String title, int id) {
        titles.add( title );

        Fragment fragment = new SuperBoonListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt( SUPER_TYPE, id );
        fragment.setArguments( bundle );
        fragments.add( fragment );
    }
}
