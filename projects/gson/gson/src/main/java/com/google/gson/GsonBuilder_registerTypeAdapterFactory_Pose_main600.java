package com.google.gson;

import jbse2.meta.Analysis;

public class GsonBuilder_registerTypeAdapterFactory_Pose_main600 {

    public static void main(String[] args) throws Exception {
        try {
            GsonBuilder gsonbuilder_LTA = Analysis.newSymbolObject("gsonbuilder_LTA", GsonBuilder.class);
            com.google.gson.TypeAdapterFactory factory0 = Analysis.newSymbolObject("factory0", com.google.gson.TypeAdapterFactory.class);
            gsonbuilder_LTA.registerTypeAdapterFactory(factory0);
        } catch (Exception e) {
        }
    }
}
