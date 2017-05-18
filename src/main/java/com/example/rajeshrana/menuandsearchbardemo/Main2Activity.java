package com.example.rajeshrana.menuandsearchbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn_Context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_Context = (Button)findViewById(R.id.button2);

        // Need to give for which view you want to register the context menu
        registerForContextMenu(btn_Context);
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.Edit:
                Toast.makeText(Main2Activity.this , "Edit Menu Clicked" , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Update:
                Toast.makeText(Main2Activity.this , "Update Menu Clicked" , Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Delete:
                Toast.makeText(Main2Activity.this , "Delete Menu Clicked" , Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }


}
