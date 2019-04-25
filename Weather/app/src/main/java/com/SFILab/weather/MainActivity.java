package com.SFILab.weather;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class MainActivity extends AppCompatActivity {
    public static String BaseUrl = "https://api.weatherbit.io/";
    public static String key = "4aba77828b904a4c966b2d220d08f730";
    public static String units = "M";
    public static String days = "7";
    RecyclerView recyclerView;
    public FusedLocationProviderClient client;
    public static String lat = "24.88";
    public static String lon = "91";
    TextView Temp,TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Temp = findViewById(R.id.Temp);
        TV=findViewById(R.id.TV);
        client = LocationServices.getFusedLocationProviderClient(this);
        getlocation();


        getCurrentData();

    }

    void  getlocation() {
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{ACCESS_FINE_LOCATION},1);
        if (ActivityCompat.checkSelfPermission(MainActivity.this, ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ) {

            return;
        }

        client.getLastLocation().addOnSuccessListener(MainActivity.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location!=null)
                {
                    //Toast.makeText(MainActivity.this, ""+location.toString().substring(15,21)+" "+location.toString().substring(location.toString().indexOf(",")+1,location.toString().indexOf(",")+7), Toast.LENGTH_LONG).show();
                    lat= location.toString().substring(15,21);
                    lon=location.toString().substring(location.toString().indexOf(",")+1,location.toString().indexOf(",")+3);

                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(BaseUrl)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    WeatherService service = retrofit.create(WeatherService.class);
                    Call<WeatherResponse> call = service.getCurrentWeatherData(units,days,lat, lon, key);
                    call.enqueue(new Callback<WeatherResponse>() {
                        @Override
                        public void onResponse(@NonNull Call<WeatherResponse> call, @NonNull Response<WeatherResponse> response) {
                            if (response.code() == 200) {
                                WeatherResponse weatherResponse = response.body();
                                assert weatherResponse != null;


                                recyclerView=findViewById(R.id.RV);
                                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
                                recyclerView.setLayoutManager(mLayoutManager);
                                Recyler recyler=new Recyler(MainActivity.this,weatherResponse.getData());
                                recyclerView.setAdapter(recyler);
                            }
                        }

                        @Override
                        public void onFailure(@NonNull Call<WeatherResponse> call, @NonNull Throwable t) {
                            Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });





    }
    void getCurrentData() {

    }
}
