package com.homerianreyes.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class CyrptoAdapter extends RecyclerView.Adapter<CyrptoAdapter.ViewHolder> {

    //ill be creating the variables needed for the context
    private Context context;
    private ArrayList<Crypto> mCryptoData;

    //create constructor
    public CyrptoAdapter(Context context, ArrayList<Crypto> mCryptoData) {
        this.context = context;
        this.mCryptoData = mCryptoData;
    }
    //here ill be inflating the list view
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_view, parent, false));
    }

    @Override
    public void onBindViewHolder(CyrptoAdapter.ViewHolder holder, int position) {
        //ill be getting the crypto object
        Crypto currentCrypto = mCryptoData.get(position);
        holder.mCryptoName.setText(currentCrypto.getCryptoName());
        holder.mCryptoInfo.setText(currentCrypto.getCryptoinfo());
    }

    @Override
    public int getItemCount() {
        return mCryptoData.size();
    }

    //ill create the viewholder of the data
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mCryptoName;
        private TextView mCryptoInfo;


        public ViewHolder( View itemView) {
            super(itemView);

            //initialize the views.
            mCryptoName = itemView.findViewById(R.id.crypto_name);
            mCryptoInfo = itemView.findViewById(R.id.crypto_info);
        }
    }
}
