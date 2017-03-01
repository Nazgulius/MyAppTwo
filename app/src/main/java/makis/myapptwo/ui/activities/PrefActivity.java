package makis.myapptwo.ui.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import makis.myapptwo.R;

public class PrefActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstenceState){
        super.onCreate(savedInstenceState);
        addPreferencesFromResource(R.layout.pref_screen);
    }
}
