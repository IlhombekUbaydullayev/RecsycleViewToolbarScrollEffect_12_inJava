package com.example.recsycleviewtoolbarscrolleffect_12_injava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recsycleviewtoolbarscrolleffect_12_injava.R;
import com.example.recsycleviewtoolbarscrolleffect_12_injava.adapter.CustomAdapter;
import com.example.recsycleviewtoolbarscrolleffect_12_injava.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }
    private void initView() {
        context = this;
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members) {

        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMemberList() {

        List<Member> members = new ArrayList<>();

        for (int i = 0;i<30;i++) {
            members.add(new Member("Ilhombek" + i , "Ubaydullayev" + i));
        }
        return members;
    }
}