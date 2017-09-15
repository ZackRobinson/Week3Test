package com.zackeryrobinson.week3test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zackeryrobinson.week3test.CarFragment.OnListFragmentInteractionListener;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyCarRecyclerViewAdapter extends RecyclerView.Adapter<MyCarRecyclerViewAdapter.ViewHolder> {

    private final List<com.zackeryrobinson.week3test.dummy.CarContent.Car> cars;
    private final OnListFragmentInteractionListener listener;



    public MyCarRecyclerViewAdapter(List<com.zackeryrobinson.week3test.dummy.CarContent.Car> cars, OnListFragmentInteractionListener mListener) {
        this.cars = cars;
        this.listener = mListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_car, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.car = cars.get(position);
        holder.mModelView.setText(cars.get(position).model);
      //  holder.mTypeView.setText(cars.get(position).type());
        //holder.mYearView.setText(cars.get(position).year());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != listener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    listener.onListFragmentInteraction(holder.car);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mModelView;
        public final TextView mTypeView;
        public final TextView mYearView;

        public com.zackeryrobinson.week3test.dummy.CarContent.Car car;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mModelView = (TextView) view.findViewById(R.id.model);
            mTypeView = (TextView) view.findViewById(R.id.type);
            mYearView = (TextView) view.findViewById(R.id.year);

        }

        @Override
        public String toString() {
            return super.toString() + " " + mTypeView.getText() + "'";
        }
    }
}
