package com.example.purvajoshi.a_z;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new A();
            }
            if (position == 1) {
                return new B();
            }
            if (position == 2) {
                return new C();
            }
            if (position == 3) {
                return new D();
            }
            if (position == 4) {
                return new E();
            }
            if (position == 5) {
                return new F();

            }
            if (position == 6) {
                return new G();
            }
            if (position == 7) {
                return new H();
            }
            if (position == 8) {
                return new I();
            }
            if (position == 9) {
                return new J();
            }
            if (position == 10) {
                return new K();
            }
            if (position == 11) {
                return new L();
            }
            if (position == 12) {
                return new M();
            }
            if (position == 13) {
                return new N();
            }
            if (position == 14) {
                return new O();
            }
            if (position == 15) {
                return new P();
            }
            if (position == 16) {
                return new Q();
            }
            if (position == 17) {
                return new R1();
            }
            if (position == 18) {
                return new S();
            }
            if (position == 19) {
                return new T();
            }
            if (position == 20) {
                return new U();
            }
            if (position == 21) {
                return new V();
            }
            if (position == 22) {
                return new W();
            }
            if (position == 23) {
                return new X();
            }
            if (position == 24) {
                return new Y();
            }
            if (position == 25) {
                return new Z();
            }
            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }
}


