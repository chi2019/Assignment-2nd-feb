package com.example.tinku.assignment_2nd_feb;

// 3 classes
// MainActivity which extends AppCompatActivity which is responsible for creating bitmaps and passing it to adapter.
// Main activity has 2 methods like OnCreate() and getBitmaps();
// MyAdapter class which extends RecyclerView<Gridholder> Which is resposnsible for placing the images in the particular position
// MyAdapter has 3 methods
// 1.onCreateViewHolder();(This method is responsible for attaching the gridview to adapter)
// 2.onBindViewHolder();(This is the method used to select specific picture and place in specific position)
// 3.getItemCount(); which returns the count of images and its constructor
// GridHolder which extends RecyclerView which returns the path of the image to be placed.
// GridHolder has its own constructor.

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rvMain = (RecyclerView) findViewById(R.id.rvMain);// Recycler View is Created and Initalized.
                                            // After this I created View Holder  named GridHolder
        Bitmap[] bitmaps = getBitmaps();
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(bitmaps);// Before creating it create array of bitmaps
        rvMain.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL) );// This is very important if we dont set this recycler view will not work.
        // In the above we used staggerd view manager which will take two arguments first is no.of coloumns needed and and Vertical or Horizontal
        rvMain.setAdapter(myRecyclerAdapter);// we setted up adapter
    }
    private Bitmap[] getBitmaps() {// This is created to send bitmaps to My recycler adapter
        Bitmap[] tempBitmaps = new Bitmap[5];
        tempBitmaps[0] = (Bitmap) BitmapFactory.decodeResource(getResources(),R.drawable.america);
        tempBitmaps[1] = (Bitmap) BitmapFactory.decodeResource(getResources(),R.drawable.china);
        tempBitmaps[2] = (Bitmap) BitmapFactory.decodeResource(getResources(),R.drawable.dubai);
        tempBitmaps[3] = (Bitmap) BitmapFactory.decodeResource(getResources(),R.drawable.india);
        tempBitmaps[4] = (Bitmap) BitmapFactory.decodeResource(getResources(),R.drawable.malasya);
        return tempBitmaps;
    }



    private class MyRecyclerAdapter extends RecyclerView.Adapter<GridHolder>{
        // We need to display Images with Captions so create Bitmap array.
        Bitmap[] bitmaps;
        public MyRecyclerAdapter(Bitmap[] bitmaps) {
            this.bitmaps = bitmaps;
        }
            // onCreateViewHolder is the method where we pass this grid_rv(gridview) to gridholder
        @Override
        public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.grid_rv,parent,false);//This is parent of grid inside the recyclar view Its false because we can not attach grid_rv(gridview) to the parent Because it is already attached to recycler view.
            return new GridHolder(view);// This view is gridHolder class gridHolder() methods itemview.
        }
        @Override
        public void onBindViewHolder(GridHolder holder, int position) {
            holder.imageView.setImageBitmap(bitmaps[position]);//This is the position where Item will be displayed
            holder.textView.setText("Tourism "+position);// this position is where the Text view is displayed.
            // After this move to main Activity class and on create method to create object of this class.
        }

        @Override
        public int getItemCount() {
            return bitmaps.length; // This provides the number of elements in tha bitmap
        }
    }

    private class GridHolder extends RecyclerView.ViewHolder{ // create a class for View Holder

        ImageView imageView;// These are from grid_rv.xml
        TextView textView;

        public GridHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.ivmainimage);// initiating Gridview Items
            textView = (TextView) itemView.findViewById(R.id.tvcaption);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
                }
            });

        }// We Pass these Items to Adapter which is binding all the data named MyRecyclerAdapter This is nested class in the same page
    }
}
