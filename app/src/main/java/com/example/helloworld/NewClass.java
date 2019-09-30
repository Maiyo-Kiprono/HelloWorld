package com.example.helloworld;

import androidx.annotation.NonNull;

public class NewClass {
    public NewClass() {
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
