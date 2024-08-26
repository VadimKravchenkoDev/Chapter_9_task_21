package com.kravchenkovadim.chapter_9_task_21;

import android.util.Log;

public class Cat {
    int age;
    String name;

    public Cat(){
        age =2 ;
        name = "Vaska";
    }
    public void talk(){
        Log.d("talk", "Meow! My name is " + name + "and I'm " + age + " years old ");
    }
}
