package com.example.reddy.viewpagerpiccasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso;

class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private String[] imageUrl;
    ViewPagerAdapter(Context context,String[] imageUrl)
    {
        this.context=context;
        this.imageUrl=imageUrl;
    }

    @Override
    public int getCount() {
        return imageUrl.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        Picasso.get().load(imageUrl[position])
                .fit()
                .centerCrop()
                .into(imageView);
        container.addView(imageView);

        return imageView;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
