package com.sliit.interviewapp1_t1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.sliit.interviewapp1_t1.Task1.Task1Fragment;
import com.sliit.interviewapp1_t1.Task2.Task2Fragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    //initiate bottom navigator

    //instantiate fragments



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            bottomNavigationView = findViewById(R.id.bottom_navigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(this);
            bottomNavigationView.setSelectedItemId(R.id.home);

        HomeFragment homeFragment = new HomeFragment();
        Task1Fragment task1Fragment = new Task1Fragment();
        Task2Fragment task2Fragment = new Task2Fragment();

        //find view of bottom navigator
        //set listener for bottom navigation_view
        //set default view to home fragment


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // set action bar title according to completed app
        //Implement fragment transitions

//        switch (item.getItemId()) {
//            case R.id.home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.container,HomeFragment).commit();
//                return true;
//
//            case R.id.page_1:
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, Task1Fragment).commit();
//                return true;
//
//            case R.id.page_2:
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, Task2Fragment).commit();
//                return true;
//        }
        return false;

    }
}

