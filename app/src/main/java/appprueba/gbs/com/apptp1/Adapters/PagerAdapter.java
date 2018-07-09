package appprueba.gbs.com.apptp1.Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import appprueba.gbs.com.apptp1.Fragments.CuartoFragment;
import appprueba.gbs.com.apptp1.Fragments.PrimerFragment;
import appprueba.gbs.com.apptp1.Fragments.SegundoFragment;
import appprueba.gbs.com.apptp1.Fragments.TercerFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberTabs;

    public PagerAdapter(FragmentManager fm, int numberTabs) {
        super(fm);
        this.numberTabs = numberTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PrimerFragment();
            case 1:
                return new SegundoFragment();
            case 2:
                return new TercerFragment();
            case 3:
                return new CuartoFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberTabs;
    }
}
