package net.eduapps.game;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import android.widget.GridLayout.*;
import android.view.*;
import com.erz.joysticklibrary.*;
import android.util.*;
import android.text.method.*;
import android.text.*;
import android.widget.*;

public class MainActivity extends AndroidApplication implements KeyListener {

	@Override
	public int getInputType() {
		// TODO: Implement this method
		return 0;
	}

	@Override
	public boolean onKeyDown(View p1,Editable p2,int p3,KeyEvent p4) {
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean onKeyUp(View p1,Editable p2,int p3,KeyEvent p4) {
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean onKeyOther(View p1,Editable p2,KeyEvent p3) {
		// TODO: Implement this method
		return false;
	}

	@Override
	public void clearMetaKeyState(View p1,Editable p2,int p3) {
		// TODO: Implement this method
	}

	public static final String TAG = "MainActivity.java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		// important configuration
		config.useImmersiveMode = true;

		initialize(new AndroidGame(),config);
		ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT);
		View controller = getLayoutInflater().inflate(R.layout.main,null,true);
		addContentView(controller,lp);

		JoyStick joystick = findViewById(R.id.joy2);
		ImageView y = findViewById(R.id.Y);
		ImageView x = findViewById(R.id.X);
		ImageView b = findViewById(R.id.B);
		ImageView a = findViewById(R.id.A);
		ImageView l1 = findViewById(R.id.L1);
		ImageView r1 = findViewById(R.id.R1);
		ImageView start = findViewById(R.id.START);
		ImageView select = findViewById(R.id.SELECT);

		joystick.setListener(new JoyStick.JoyStickListener() {
			@Override public void onMove(JoyStick p1,double p2,double p3,int p4) {
				if (p1.getDirection() == p1.DIRECTION_UP) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_UP));
				} else if (p1.getDirection() == p1.DIRECTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_DOWN));
				} else if (p1.getDirection() == p1.DIRECTION_LEFT) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_LEFT));
				} else if (p1.getDirection() == p1.DIRECTION_RIGHT) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_RIGHT));
				} else if (p1.getDirection() == p1.DIRECTION_CENTER) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_CENTER));
				} else if (p1.getDirection() == p1.DIRECTION_UP_RIGHT) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_UP_RIGHT));
				} else if (p1.getDirection() == p1.DIRECTION_LEFT_UP) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_UP_LEFT));
				} else if (p1.getDirection() == p1.DIRECTION_DOWN_LEFT) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_DOWN_LEFT));
				} else if (p1.getDirection() == p1.DIRECTION_RIGHT_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DPAD_DOWN_RIGHT));
				}
			}

			@Override public void onTap() { }
			@Override public void onDoubleTap() { }
		});
		
		a.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_Z));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_Z));
				}
				return false;
			}
		});
		
		b.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_X));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_X));
				}
				return false;
			}
		});

		x.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_S));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_S));
				}
				return false;
			}
		});

		y.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_A));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_A));
				}
				return false;
			}
		});

		l1.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_D));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_D));
				}
				return false;
			}
		});

		r1.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_C));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_C));
				}
				return false;
			}
		});

		start.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_ENTER));
				}
				return false;
			}
		});
		
		select.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1,MotionEvent p2) {
				if (p2.getAction() == p2.ACTION_DOWN) {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_SPACE));
				} else {
					dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP,KeyEvent.KEYCODE_SPACE));
				}
				return false;
			}
		});
    }
}
