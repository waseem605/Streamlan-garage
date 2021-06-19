package com.example.streamlangarage.Common.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.streamlangarage.R;

import Common.BankAccount;
import Common.Chat;
import Common.PromoCodeHistory;
import Common.PromoCodeRequest;
import Common.Review;
import Common.Services;
import Common.TermsandPrivacyPolicy;
import Common.VerifySuccessfully;


public class UserProfile extends Fragment {

private RelativeLayout mPromotion,mMessage,mServices,mReview,mTerms,mBankAccount;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);
        mPromotion = (RelativeLayout)view.findViewById(R.id.promotionRL);
        mMessage = (RelativeLayout)view.findViewById(R.id.messageRL);
        mServices = (RelativeLayout)view.findViewById(R.id.servicesRL);
        mReview = (RelativeLayout)view.findViewById(R.id.reviewRL);
        mTerms = (RelativeLayout)view.findViewById(R.id.termRL);
        mBankAccount = (RelativeLayout)view.findViewById(R.id.bankRL);
        callScreen();

        return view;
    }

    public void callScreen()
    {
        mPromotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), PromoCodeHistory.class));
            }
        });

        mServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), Services.class));
            }
        });

        mMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), Chat.class));
            }
        });

        mReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), Review.class));
            }
        });

        mBankAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), BankAccount.class));
            }
        });

        mTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this.getActivity(), TermsandPrivacyPolicy.class));
            }
        });


    }
}