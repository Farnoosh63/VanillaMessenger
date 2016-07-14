package com.epicodus.vanillamessenger.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.epicodus.vanillamessenger.R;
import com.epicodus.vanillamessenger.models.User;
import com.epicodus.vanillamessenger.ui.ChatActivity;

import org.parceler.Parcels;


public class FirebaseUserListViewHolder extends RecyclerView.ViewHolder {

    View mView;
    Context mContext;

    public FirebaseUserListViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mContext = itemView.getContext();
    }

    public void bindUser(final User user) {
        TextView userName = (TextView) mView.findViewById(R.id.userName);
        TextView userEmail = (TextView) mView.findViewById(R.id.userEmail);

        userName.setText(user.getName());
        userEmail.setText(user.getEmail());

        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, ChatActivity.class);
                intent.putExtra("user", Parcels.wrap(user));

                mContext.startActivity(intent);
            }
        });
    }
}
