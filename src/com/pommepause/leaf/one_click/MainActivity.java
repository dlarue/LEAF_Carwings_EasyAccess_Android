package com.pommepause.leaf.one_click;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.leaf_url_base) + "?id=" + getString(R.string.leaf_url_guid)));
    	startActivity(browserIntent);

    	finish();
    }
}
