package itkido.me.itemdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView yellow1,yellow2,red2,red1,blue2,blue1,green2,green1;

    ImageView plus,minus;
    TextView sizeno;
    int counter = 0;
    RatingBar ratingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        sizeno = findViewById(R.id.sizeno);

        final int[] number = {0};
        sizeno.setText(""+ number[0]);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 0){
                    sizeno.setText("" + number[0]);
                }

                if (number[0] > 0){

                    number[0] = number[0] -1;
                    sizeno.setText(""+ number[0]);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 9) {
                    sizeno.setText("" + number[0]);
                }

                if (number[0] < 9) {

                    number[0] = number[0] + 1;
                    sizeno.setText("" + number[0]);

                }
            }
        });



        ratingbar = (RatingBar) findViewById(R.id.ratingbar);
        LayerDrawable stars = (LayerDrawable) ratingbar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.yellow), PorterDuff.Mode.SRC_ATOP);



        yellow1 = (ImageView)findViewById(R.id.yellow1);
        yellow2 = (ImageView)findViewById(R.id.yellow2);


        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickOfColor("1");

            }
        });


        red1 = (ImageView)findViewById(R.id.red1);
        red2 = (ImageView)findViewById(R.id.red2);


        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                clickOfColor("3");

            }
        });

        blue1 = (ImageView)findViewById(R.id.blue1);
        blue2 = (ImageView)findViewById(R.id.blue2);


        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                clickOfColor("4");

            }
        });


        green1 = (ImageView)findViewById(R.id.green1);
        green2 = (ImageView)findViewById(R.id.green2);


        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 clickOfColor("2");

            }
        });

    }

    private void clickOfColor(String s) {

        yellow2.setVisibility(View.GONE);
        green2.setVisibility(View.GONE);
        blue2.setVisibility(View.GONE);
        red2.setVisibility(View.GONE);


        if(s.equalsIgnoreCase("1")){
            yellow2.setVisibility(View.VISIBLE);
        }

        if(s.equalsIgnoreCase("2")){
            green2.setVisibility(View.VISIBLE);
        }

        if(s.equalsIgnoreCase("3")){
            red2.setVisibility(View.VISIBLE);
        }
        if(s.equalsIgnoreCase("4")){
            blue2.setVisibility(View.VISIBLE);
        }






    }

}
