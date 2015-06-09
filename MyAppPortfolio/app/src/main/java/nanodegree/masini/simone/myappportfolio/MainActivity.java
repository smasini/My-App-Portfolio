package nanodegree.masini.simone.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify = (Button) findViewById(R.id.btnSpotify);
        Button score = (Button) findViewById(R.id.btnScore);
        Button library = (Button) findViewById(R.id.btnLibrary);
        Button build = (Button) findViewById(R.id.btnBuild);
        Button reader = (Button) findViewById(R.id.btnReader);
        Button capstone = (Button) findViewById(R.id.btnCapstone);

        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        };
        spotify.setOnClickListener(myListener);
        score.setOnClickListener(myListener);
        library.setOnClickListener(myListener);
        build.setOnClickListener(myListener);
        reader.setOnClickListener(myListener);
        capstone.setOnClickListener(myListener);

    }

    public void makeToast(View v) {
        String app = "";
        switch (v.getId()) {
            case R.id.btnSpotify:
                app = "Spotify Streamer App";
                break;
            case R.id.btnScore:
                app = "Football Scores App";
                break;
            case R.id.btnLibrary:
                app = "Library App";
                break;
            case R.id.btnBuild:
                app = "Build It Bigger App";
                break;
            case R.id.btnReader:
                app = "XYZ Reader App";
                break;
            case R.id.btnCapstone:
                app = "Capstone  App";
                break;
        }
        Toast.makeText(this,
                "This button will launch my " + app, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
