package com.masashi.hamaguchi.fragment_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // View Pager
    private ViewPager viewPager;

    //
    private String shareValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setTitle("Fragment Sample");

        FragmentManager fragmentManager = getSupportFragmentManager();
        OriginalFragmentPagerAdapter adapter = new OriginalFragmentPagerAdapter(fragmentManager);
        viewPager.setAdapter(adapter);

    }

    public static class Fragment1 extends Fragment {

        // View
        private EditText editText;
        private Button getBtn, putBtn;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle avedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment1, container, false);

            editText = view.findViewById(R.id.editText);
            getBtn = view.findViewById(R.id.getBtn);
            putBtn = view.findViewById(R.id.putBtn);

            final MainActivity mainActivity = (MainActivity)getActivity();

            getBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(mainActivity.shareValue);
                }
            });

            putBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.shareValue = editText.getText().toString();
                }
            });

            return view;
        }

    }

    public static class Fragment2 extends Fragment {

        // View
        private EditText editText;
        private Button getBtn, putBtn;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle avedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment2, container, false);

            editText = view.findViewById(R.id.editText);
            getBtn = view.findViewById(R.id.getBtn);
            putBtn = view.findViewById(R.id.putBtn);

            final MainActivity mainActivity = (MainActivity)getActivity();

            getBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(mainActivity.shareValue);
                }
            });

            putBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.shareValue = editText.getText().toString();
                }
            });

            return view;
        }
    }

    public static class Fragment3 extends Fragment {

        // View
        private EditText editText;
        private Button getBtn, putBtn;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle avedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment3, container, false);

            editText = view.findViewById(R.id.editText);
            getBtn = view.findViewById(R.id.getBtn);
            putBtn = view.findViewById(R.id.putBtn);

            final MainActivity mainActivity = (MainActivity)getActivity();

            getBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(mainActivity.shareValue);
                }
            });

            putBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.shareValue = editText.getText().toString();
                }
            });

            return view;
        }
    }
}
