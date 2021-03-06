package jgs.com.app.myapplication.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import jgs.com.app.myapplication.R;
import jgs.com.app.myapplication.adapter.ViewPagerAdapter;
import jgs.com.app.myapplication.fragment.tabFragment1;
import jgs.com.app.myapplication.fragment.tabFragment2;
import jgs.com.app.myapplication.fragment.tabFragment3;
import jgs.com.app.myapplication.fragment.tabFragment4;
import jgs.com.app.myapplication.helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    //    text
    //    mainactivity
    //    buyac
    //    rkdlqmain

    private BottomNavigationView navigation;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private MenuItem prevMenuItem;

    public static tabFragment1 tab1 = new tabFragment1();
    public static tabFragment2 tab2 = new tabFragment2();
    public static tabFragment3 tab3 = new tabFragment3();
    public static tabFragment4 tab4 = new tabFragment4();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_1:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_2:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_3:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_4:
                    viewPager.setCurrentItem(3);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        BottomNavigationViewHelper.disableShiftMode(navigation);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(tab1, getText(R.string.tab_1).toString());
        adapter.AddFragment(tab2, getText(R.string.tab_2).toString());
        adapter.AddFragment(tab3, getText(R.string.tab_3).toString());
        adapter.AddFragment(tab4, getText(R.string.tab_4).toString());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    navigation.getMenu().getItem(0).setChecked(false);
                }

                navigation.getMenu().getItem(position).setChecked(true);
                prevMenuItem = navigation.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}

