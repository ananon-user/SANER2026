package org.apache.commons.jxpath.ri.compiler;

import jbse2.meta.Analysis;

public class Path_buildContextChain_Pose_main353 {

    public static void main(String[] args) throws Exception {
        try {
            Path path_LTA = Analysis.newSymbolObject("path_LTA", Path.class);
            org.apache.commons.jxpath.ri.EvalContext context0 = Analysis.newSymbolObject("context0", org.apache.commons.jxpath.ri.EvalContext.class);
            int stepCount1 = Analysis.newSymbolInt("stepCount1");
            boolean createInitialContext2 = Analysis.newSymbolBoolean("createInitialContext2");
            path_LTA.buildContextChain(context0, stepCount1, createInitialContext2);
        } catch (Exception e) {
        }
    }
}
