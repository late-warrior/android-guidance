package jandhu.land.guidance;

import com.google.android.maps.MapActivity;

import android.os.Bundle;

public class LandGuidanceActivity extends MapActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landmapview);
    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}