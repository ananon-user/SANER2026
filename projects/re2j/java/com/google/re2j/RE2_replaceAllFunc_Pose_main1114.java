package com.google.re2j;

import jbse2.meta.Analysis;

public class RE2_replaceAllFunc_Pose_main1114 {

    public static void main(String[] args) throws Exception {
        try {
            RE2 re2_LTA = Analysis.newSymbolObject("re2_LTA", RE2.class);
            java.lang.String src0 = Analysis.newSymbolObject("src0", java.lang.String.class);
            com.google.re2j.RE2.ReplaceFunc repl1 = Analysis.newSymbolObject("repl1", com.google.re2j.RE2.ReplaceFunc.class);
            int maxReplaces2 = Analysis.newSymbolInt("maxReplaces2");
            re2_LTA.replaceAllFunc(src0, repl1, maxReplaces2);
        } catch (Exception e) {
        }
    }
}
