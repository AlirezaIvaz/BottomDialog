package ir.android.bottomdialog.demo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import ir.android.bottomdialog.BottomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void sample(View view) {
        new BottomDialog.Builder(this)
                .setTitle("Awesome!")
                .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
                .setPositiveText("Google Play")
                .setNegativeText("Close")
                .show();
    }
    public void sampleCustomView(View view) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflater.inflate(R.layout.bottomdialog_layout, null);
        new BottomDialog.Builder(this)
                .setTitle("Awesome!")
                .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
                .setCustomView(customView)
                .setPositiveText("Google Play")
                .setNegativeText("Close")
                .show();
    }
    public void toGithub(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/javiersantos/BottomDialogs")));
    }
}