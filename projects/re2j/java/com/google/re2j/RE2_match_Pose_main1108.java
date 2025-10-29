package com.google.re2j;

import jbse2.meta.Analysis;

public class RE2_match_Pose_main1108 {

    public static void main(String[] args) throws Exception {
        try {
            RE2 re2_LTA = Analysis.newSymbolObject("re2_LTA", RE2.class);
            java.lang.CharSequence input0 = Analysis.newSymbolObject("input0", java.lang.CharSequence.class);
            int start1 = Analysis.newSymbolInt("start1");
            int end2 = Analysis.newSymbolInt("end2");
            int anchor3 = Analysis.newSymbolInt("anchor3");
            int[] group4 = Analysis.newSymbolObject("group4", int[].class);
            int ngroup5 = Analysis.newSymbolInt("ngroup5");
            re2_LTA.match(input0, start1, end2, anchor3, group4, ngroup5);
        } catch (Exception e) {
        }
    }
}
