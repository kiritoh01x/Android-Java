package example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloWorld extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.helloworld, menu);
        return true;
    }
}
