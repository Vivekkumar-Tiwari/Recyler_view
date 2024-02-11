package com.example.persons_id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.media.RouteListingPreference;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;

    ArrayList<AnimeModel> arranime = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView.clearFocus();


        RecyclerView recyclerView = findViewById(R.id.RCY);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arranime.add(new AnimeModel(R.drawable.taniro, "Kamado Tanjirō", "(10/6.7)   (💚___---___💚)"));
        arranime.add(new AnimeModel(R.drawable.ita, "Yuji Itadori", "(10/7.9)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.hashirama, "Hashirama Senju", "(10/9.91)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.madera, "Madera Uchiha", "(10/9.9)   (🖤___---___🖤)"));
        arranime.add(new AnimeModel(R.drawable.narotoo, "Naruto Uzumaki", "(10/8)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.kakashi, "Kakashi Hatake", "(10/8.09)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.saske, "Sasuke Uchiha", "(10/8.01)   (🩷___---___🩷)"));
        arranime.add(new AnimeModel(R.drawable.gagooo, "Satoru Gojo", "(10/9.8)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.sukuuunaa, "Ryomen Sukuna", "(10/9.89)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.taniro, "Kamado Tanjirō", "(10/6.7)   (💚___---___💚)"));
        arranime.add(new AnimeModel(R.drawable.ita, "Yuji Itadori", "(10/7.9)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.hashirama, "Hashirama Senju", "(10/9.91)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.madera, "Madera Uchiha", "(10/9.9)   (🖤___---___🖤)"));
        arranime.add(new AnimeModel(R.drawable.narotoo, "Naruto Uzumaki", "(10/8)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.kakashi, "Kakashi Hatake", "(10/8.09)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.saske, "Sasuke Uchiha", "(10/8.01)   (🩷___---___🩷)"));
        arranime.add(new AnimeModel(R.drawable.gagooo, "Satoru Gojo", "(10/9.8)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.sukuuunaa, "Ryomen Sukuna", "(10/9.89)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.taniro, "Kamado Tanjirō", "(10/6.7)   (💚___---___💚)"));
        arranime.add(new AnimeModel(R.drawable.ita, "Yuji Itadori", "(10/7.9)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.hashirama, "Hashirama Senju", "(10/9.91)   (💛___---___💛)"));
        arranime.add(new AnimeModel(R.drawable.madera, "Madera Uchiha", "(10/9.9)   (🖤___---___🖤)"));
        arranime.add(new AnimeModel(R.drawable.narotoo, "Naruto Uzumaki", "(10/8)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.kakashi, "Kakashi Hatake", "(10/8.09)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.saske, "Sasuke Uchiha", "(10/8.01)   (🩷___---___🩷)"));
        arranime.add(new AnimeModel(R.drawable.gagooo, "Satoru Gojo", "(10/9.8)   (💙___---___💙)"));
        arranime.add(new AnimeModel(R.drawable.sukuuunaa, "Ryomen Sukuna", "(10/9.89)   (❤️___---___❤️)"));
        arranime.add(new AnimeModel(R.drawable.sukuuunaa, "Ryomen Sukuna", "(10/9.89)   (❤️___---___❤️)"));
        AnimeAdapter adapter = new AnimeAdapter(this, arranime);
        recyclerView.setAdapter(adapter);
    }

}