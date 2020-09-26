package com.yulibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;

public class ViewHolderDemo extends BaseViewHolder<DemoModel>{


    public static class Factory extends BaseViewHolder.Factory{ //繼承大工廠的小工廠

        public Factory(@Nullable ClickFuncBuilder clickFuncBuilder) {
            super(clickFuncBuilder);
        }
        @NonNull
        public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.normal_viewholder, parent, false);
            return new ViewHolderDemo(view,clickFuncMap);
        }
        @Override
        public String getType() {
            return DemoModel.TYPE;
        }
    }

    protected ViewHolderDemo(View itemView, final Map<Integer, ClickHandler> clickHandlerMap) {
        super(itemView);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandlerMap.get(v.getId()).onClick(getLayoutPosition()); //會回傳他是第幾個ViewHolder
            }
        });
    }

    @Override
    public void bind(DemoModel demoModel) {

    }
}
