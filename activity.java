package com.sms.todoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
 Button button;
 EditText inputText;
 ListView listView;
 ArrayList<String> list;
 public void onClickAdd(View v){
 String text = inputText.getText().toString();
 list.add(text);
 ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
 listView.setAdapter(adapter);
 inputText.setText("");
 }
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 button= findViewById(R.id.addButton);
 inputText=findViewById(R.id.inputText);
 listView=findViewById(R.id.listView);
 list = new ArrayList<>();
 listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
 @Override
 public boolean onItemLongClick(AdapterView<?> adapterView, View view, 
int i, long l) {
 //Delete a List Item
 list.remove(i);
 Toast.makeText(MainActivity.this, "Long click", 
Toast.LENGTH_SHORT).show();
 return false;
 }
 });
 }
}
