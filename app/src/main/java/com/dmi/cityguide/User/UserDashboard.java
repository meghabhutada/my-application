package com.dmi.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;

import com.dmi.cityguide.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.dmi.cityguide.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.dmi.cityguide.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.dmi.cityguide.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.dmi.cityguide.HelperClasses.HomeAdapter.MostViewedAdapter;
import com.dmi.cityguide.HelperClasses.HomeAdapter.MostViewedHelperClass;
import com.dmi.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler,mostViewedRecycler,categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient1,gradient2,gradient3,gradient4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //Hooks

        featuredRecycler = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.most_viewed_recycler);
        categoriesRecycler = findViewById(R.id.categories_recycler);

        //Functions will be executed automatically when this activity will be created
        
        featuredRecycler();
        mostViewedRecycler();
        categoriesRecycler();
        
    }

    private void mostViewedRecycler() {

        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.mcdonald_img, "McDonald's","abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.city_2, "Nashik","abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.city_1, "Jaypur.","abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.mcdonald_img, "Walmart","abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop"));

        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);

    }

    private void categoriesRecycler() {
        categoriesRecycler.setHasFixedSize(true);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});

        ArrayList<CategoriesHelperClass> categoriesLocations = new ArrayList<>();
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.education1,"Education"));
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.hospital, "HOSPITAL"));
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.restaurant_image, "Restaurant"));
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.shopping, "Shopping"));
        categoriesLocations.add(new CategoriesHelperClass(R.drawable.transport, "Transport"));

        adapter = new CategoriesAdapter(categoriesLocations);
        categoriesRecycler.setAdapter(adapter);
    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.mcdonald_img,"Mcdonald's", "abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop "));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.city_1,"Jaypur", "abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop "));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.city_2,"Nashik's", "abcd efgh ijkl mnop qrst uvwx yz asdfhjkl mnop "));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}