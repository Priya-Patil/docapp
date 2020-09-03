package com.pvp.doctorapp.appointment.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.pvp.doctorapp.R;
import com.pvp.doctorapp.databinding.ActivityBookingAppointmentBinding;
import com.pvp.doctorapp.databinding.ActivityFillAppointmentDetailsBinding;
import com.pvp.doctorapp.home.activities.NewHomepageActivity;
import com.pvp.doctorapp.utils.Utilities;

public class FillAppointmentDetailsActivity extends AppCompatActivity {

    ActivityFillAppointmentDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_appointment_details);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fill_appointment_details);

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( binding.etMobileno.getText().toString().length()<=10 ) {
                    Toast.makeText(FillAppointmentDetailsActivity.this, "Enter proper mobile number", Toast.LENGTH_SHORT).show();
                }

                else {

                        if(Utilities.emailValidate(binding.etEmail.getText().toString()))
                        {
                            binding.layout1.setVisibility(View.GONE);
                            binding.layout2.setVisibility(View.VISIBLE);
                        }

                        else {
                            Toast.makeText(FillAppointmentDetailsActivity.this, "Enter proper email id", Toast.LENGTH_SHORT).show();
                        }

                }
            }
        });


        binding.backAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilities.launchActivity(FillAppointmentDetailsActivity.this, BookingAppointmentActivity.class,true);
            }
        });

    }
}
