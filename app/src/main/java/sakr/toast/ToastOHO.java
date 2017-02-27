package sakr.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastOHO extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_oho);
        Button toastbutton = (Button) findViewById(R.id.PUSH);

        toastbutton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(view.getContext(), "聽說這個顯示時間比較長(´・ω・｀)", Toast.LENGTH_LONG).show();
            }
        });
    }
}
