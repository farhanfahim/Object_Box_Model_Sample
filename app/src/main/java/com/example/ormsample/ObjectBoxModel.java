package com.example.ormsample;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class ObjectBoxModel {

    private BoxStore boxStore = BaseApplication.getApp().getBoxStore();
    private Box<UserModel> userBox = boxStore.boxFor(UserModel.class);


}
