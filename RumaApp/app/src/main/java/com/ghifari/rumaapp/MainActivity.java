package com.ghifari.rumaapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /**
     * To open page 1
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * To open page 2
     */
    private SectionsPagerAdapter2 mSectionsPagerAdapter2;

    /**
     * To open page 3
     */
    private SectionsPagerAdapter3 mSectionsPagerAdapter3;

    /**
     * To manage addOnPageChangeListener
     */
    private FragmentManager manager = getSupportFragmentManager();

    /**
     * The ViewPager that will host the section contents.
     */
    private ViewPager mViewPager;

    /**
     * this button is used for left pane
     */
    private Button buttonPaneLeft;

    /**
     * this button is used for center pane
     */
    private Button buttonPaneCenter;

    /**
     * this button is used for right pane
     */
    private Button buttonPaneRight;

    /**
     * boolean button left
     */
    private boolean isButtonLeftTouch;

    /**
     * boolean button center
     */
    private boolean isButtonCenterTouch;

    /**
     * boolean button right
     */
    private boolean isButtonRightTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();


        isButtonLeftTouch = true;
        isButtonCenterTouch = false;
        isButtonRightTouch = false;

        buttonPaneLeft = (Button)findViewById(R.id.buttonPanel);
        buttonPaneLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!isButtonLeftTouch) {
                        buttonPaneLeft.setBackgroundColor(Color.TRANSPARENT);
                        buttonPaneCenter.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        buttonPaneRight.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        isButtonLeftTouch = true;
                        isButtonCenterTouch = false;
                        isButtonRightTouch = false;

                        // Set up the ViewPager with the sections adapter.
                        mViewPager = (ViewPager) findViewById(R.id.container);
                        mViewPager.setAdapter(mSectionsPagerAdapter);
                        setTab2(2);
                        setTab(1);
                    }
                } catch (Exception e) {
                    System.out.println("eror1");
                }
            }
        });

        buttonPaneCenter = (Button)findViewById(R.id.buttonPane2);
        buttonPaneCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!isButtonCenterTouch) {
                        buttonPaneLeft.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        buttonPaneCenter.setBackgroundColor(Color.TRANSPARENT);
                        buttonPaneRight.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        isButtonLeftTouch = false;
                        isButtonCenterTouch = true;
                        isButtonRightTouch = false;

                        mSectionsPagerAdapter2 = new SectionsPagerAdapter2(getSupportFragmentManager());

                        // Set up the ViewPager with the sections adapter.
                        mViewPager = (ViewPager) findViewById(R.id.container);
                        mViewPager.setAdapter(mSectionsPagerAdapter2);
                        setTab(2);
                        setTab2(1);
                    }
                } catch (Exception e) {
                    System.out.println("eror2");
                }
            }
        });

        buttonPaneRight = (Button)findViewById(R.id.buttonPane3);
        buttonPaneRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (!isButtonRightTouch) {
                        buttonPaneLeft.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        buttonPaneCenter.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                        buttonPaneRight.setBackgroundColor(Color.TRANSPARENT);
                        isButtonLeftTouch = false;
                        isButtonCenterTouch = false;
                        isButtonRightTouch = true;

                        mSectionsPagerAdapter3 = new SectionsPagerAdapter3(getSupportFragmentManager());

                        // Set up the ViewPager with the sections adapter.
                        mViewPager = (ViewPager) findViewById(R.id.container);
                        mViewPager.setAdapter(mSectionsPagerAdapter3);
                        setTab(2);
                        setTab2(2);
                    }
                } catch (Exception e) {
                    System.out.println("eror3");
                }
            }
        });

    }

    private void setUpView(){
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        setTab(1);
    }

    /**
     * this procedure is used for control circle image sign tab 1
     * @param condition condition 1 : set the circle, condition 2 : unset the circle
     */
    public void setTab(int condition) {
        final bottomFragment bottomfragments;
        bottomfragments = (bottomFragment) manager.findFragmentById(R.id.containerbottom);
        final bottomFragment2 bottomfragments2;
        bottomfragments2 = (bottomFragment2) manager.findFragmentById(R.id.containerbottom2);

        switch (condition) {
            case 1:
                bottomfragments.updateImage(1);
                bottomfragments2.updateImage(4);

                mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        bottomfragments.updateImage(position + 1);
                        bottomfragments2.updateImage(4);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                break;
            default:
                bottomfragments.updateImage(4);
                break;
        }
    }

    /**
     * this procedure is used for control circle image sign tab 2
     * @param condition condition 1 : set the circle, condition 2 : unset the circle
     */
    public void setTab2(int condition) {
        final bottomFragment bottomfragments;
        bottomfragments = (bottomFragment) manager.findFragmentById(R.id.containerbottom);
        final bottomFragment2 bottomfragments2;
        bottomfragments2 = (bottomFragment2) manager.findFragmentById(R.id.containerbottom2);

        switch (condition) {
            case 1:
                bottomfragments.updateImage(4);
                bottomfragments2.updateImage(1);

                mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        bottomfragments.updateImage(4);
                        bottomfragments2.updateImage(position + 1);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                break;
            default:
                bottomfragments2.updateImage(4);
                break;
        }
    }

}
