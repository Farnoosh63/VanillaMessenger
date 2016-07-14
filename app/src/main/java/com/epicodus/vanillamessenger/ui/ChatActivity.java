package com.epicodus.vanillamessenger.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.epicodus.vanillamessenger.R;
import com.epicodus.vanillamessenger.models.User;

import org.parceler.Parcels;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity {
    @Bind(R.id.userNameChat) TextView mUserNameChat;


    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ButterKnife.bind(this);

        mUser = Parcels.unwrap(getIntent().getParcelableExtra("user"));
        mUserNameChat.setText(mUser.getName());


    }


}

