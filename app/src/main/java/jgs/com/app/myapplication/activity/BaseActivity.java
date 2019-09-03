package jgs.com.app.myapplication.activity;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public void basicToast(String message) {

        Toast toast = Toast.makeText(BaseActivity.this, message, Toast.LENGTH_LONG);
        toast.show();
    }

}
