package com.google.gson.internal;

import jbse2.meta.Analysis;

public class Excluder_withExclusionStrategy_Pose_main622 {

    public static void main(String[] args) throws Exception {
        try {
            Excluder excluder_LTA = Analysis.newSymbolObject("excluder_LTA", Excluder.class);
            com.google.gson.ExclusionStrategy exclusionStrategy0 = Analysis.newSymbolObject("exclusionStrategy0", com.google.gson.ExclusionStrategy.class);
            boolean serialization1 = Analysis.newSymbolBoolean("serialization1");
            boolean deserialization2 = Analysis.newSymbolBoolean("deserialization2");
            excluder_LTA.withExclusionStrategy(exclusionStrategy0, serialization1, deserialization2);
        } catch (Exception e) {
        }
    }
}
