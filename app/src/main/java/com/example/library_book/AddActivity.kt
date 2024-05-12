User
package com.example.library_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddActivity : AppCompatActivity() {

    EditText title_input,author_input,pages_input;
    Button add_button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_title);
        pages_input = findViewById(R.id.pages_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(title_input.getText().toString().trim(),
                    author_input.getText().toString().trim(),
                    Integer.valueOf(pages_input.getText().toString().trim())

                );
            }
        });
    }

