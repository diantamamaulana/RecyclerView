package space.diantama.recyclerviewhandphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPhone;
    private ArrayList<Phone> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPhone = findViewById(R.id.rv_phone);
        rvPhone.setHasFixedSize(true);

        list.addAll(PhoneData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvPhone.setLayoutManager(new LinearLayoutManager(this));
        CardPhoneAdapter cardPhoneAdapter = new CardPhoneAdapter(list);
        rvPhone.setAdapter(cardPhoneAdapter);

    }

}
