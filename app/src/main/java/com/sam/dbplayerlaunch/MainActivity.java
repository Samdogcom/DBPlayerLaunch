package com.sam.dbplayerlaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * ic_banner 要使用24bit的颜色,否则显示时会被放大
 *
 * @author Sam
 * @date 2022/05/02
 */
public class MainActivity extends Activity {

    String a = "com.dangbei.lerad.videoposter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.a);
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        } else {
            Intent leanbackLaunchIntentForPackage = getPackageManager().getLeanbackLaunchIntentForPackage(this.a);
            if (leanbackLaunchIntentForPackage != null) {
                startActivity(leanbackLaunchIntentForPackage);
            } else {
                Toast.makeText(this, "App \"" + this.a + "\" not found!", Toast.LENGTH_LONG).show();
            }
        }
        finish();
    }
}