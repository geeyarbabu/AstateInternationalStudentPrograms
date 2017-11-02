package students.astateinternationalstudentprograms;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ActionBar actionBar;
    private DrawerLayout drawerLayout;
    private ListView navList;
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        navList = (ListView)findViewById(R.id.navlist);
        ArrayList<String> navArray = new ArrayList<String>();
        navArray.add("Home");
        navArray.add("About US");
        navArray.add("Degree");
        navArray.add("Cost");
        navArray.add("Admission");
        navArray.add("Immigration");
        navArray.add("Arrivals");
        navArray.add("Orientation");
        navArray.add("Campus Life");
        navArray.add("Services");
        navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,navArray);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer,R.string.closedrawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        fragmentManager = getSupportFragmentManager();
        loadSelection(0);
    }

    private void loadSelection(int i){
        navList.setItemChecked(i,true);
        switch (i){
            case 0:
                MyFragment myFragment = new MyFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment);
                fragmentTransaction.commit();
                break;
            case 1:
                MyFragment2 myFragment2 = new MyFragment2();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment2);
                fragmentTransaction.commit();
                break;
            case 2:
                MyFragment3 myFragment3 = new MyFragment3();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment3);
                fragmentTransaction.commit();
                break;
            case 3:
                MyFragment4 myFragment4 = new MyFragment4();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment4);
                fragmentTransaction.commit();
                break;
            case 4:
                MyFragment5 myFragment5 = new MyFragment5();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment5);
                fragmentTransaction.commit();
                break;
            case 5:
                MyFragment6 myFragment6 = new MyFragment6();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment6);
                fragmentTransaction.commit();
                break;
            case 6:
                MyFragment7 myFragment7 = new MyFragment7();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment7);
                fragmentTransaction.commit();
                break;
            case 7:
                MyFragment8 myFragment8 = new MyFragment8();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment8);
                fragmentTransaction.commit();
                break;
            case 8:
                MyFragment9 myFragment9 = new MyFragment9();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment9);
                fragmentTransaction.commit();
                break;
            case 9:
                MyFragment10 myFragment10 = new MyFragment10();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentholder,myFragment10);
                fragmentTransaction.commit();
                break;
        }
    }

    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_list,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }else if(id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(navList)) {
                drawerLayout.closeDrawer(navList);
            } else {
                drawerLayout.openDrawer(navList);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        loadSelection(position);
        drawerLayout.closeDrawer(navList);
    }
}

