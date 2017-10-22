package com.example.justyna.its_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        EditText confirmPasswordeditText = (EditText) findViewById(R.id.confirmPasswordeditText);
        Button registerBtn = (Button) findViewById(R.id.registerBtn);

        Spinner departmentDdl = (Spinner)findViewById(R.id.departmntDdl);
        String[] departments = new String[]{"Select Department", "Department 1", " Department 2"};
        ArrayAdapter<String> adapterDepartment = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, departments);
        departmentDdl.setAdapter(adapterDepartment);

        Spinner courseDdl = (Spinner)findViewById(R.id.courseDdl);
        String[] courses = new String[]{"Select Course", "Web", "Software"};
        ArrayAdapter<String> adapterCourse = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, courses);
        courseDdl.setAdapter(adapterCourse);




    }
}
