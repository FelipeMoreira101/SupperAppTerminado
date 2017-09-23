package com.example.felipe.superapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class shine extends AppCompatActivity {

    ImageButton lant;
    boolean hasFlash;
    boolean isFlashOn;
    Camera.Parameters prm;
    Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shine);

        lant = (ImageButton) findViewById(R.id.lanterna);
        hasFlash = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if (!hasFlash) {
            Toast.makeText(this, "Não possui flash", Toast.LENGTH_SHORT).show();
            return;
        }
        getCamera();
        lant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isFlashOn) {
                    turnOffFlash();
                } else {
                    turnOnFlash();
                }

            }
        });
    }
    private void getCamera() {

        if (camera == null) {
            try {
                camera = Camera.open();
                prm = camera.getParameters();
            } catch (Exception e) {

            }
        }
    }
    private void turnOnFlash() {
        if (!isFlashOn) {
            if (camera == null || prm == null) {
                camera = Camera.open();
                return;
            }
            prm = camera.getParameters();
            prm.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(prm);
            camera.startPreview();
            isFlashOn = true;
            Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
        }
    }
    private void turnOffFlash() {
        if (isFlashOn) {
            if (camera == null || prm == null) {
                camera = Camera.open();
                return;
            }

            prm = camera.getParameters();
            prm.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            camera.setParameters(prm);
            camera.stopPreview();
            isFlashOn = false;
            Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }

}
