package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Fragment pager adapter that helps view pager in main activity show correct fragments.
 */

public class CategoryFragPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryFragPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryFragPagerAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new ShoppingFragment();
        } else if (position == 2) {
            return new ChurchesFragment();
        } else {
            return new OutdoorsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurants_category);
        } else if (position == 1) {
            return mContext.getString(R.string.shopping_category);
        } else if (position == 2) {
            return mContext.getString(R.string.churches_category);
        } else {
            return mContext.getString(R.string.outdoors_category);
        }
    }
}
