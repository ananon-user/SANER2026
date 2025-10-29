package org.apache.commons.jxpath.ri.compiler;

import jbse2.meta.Analysis;

public class Path_createContextForStep_Pose_main354 {

    public static void main(String[] args) throws Exception {
        try {
            Path path_LTA = Analysis.newSymbolObject("path_LTA", Path.class);
            org.apache.commons.jxpath.ri.EvalContext context0 = Analysis.newSymbolObject("context0", org.apache.commons.jxpath.ri.EvalContext.class);
            int axis1 = Analysis.newSymbolInt("axis1");
            org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = Analysis.newSymbolObject("nodeTest2", org.apache.commons.jxpath.ri.compiler.NodeTest.class);
            path_LTA.createContextForStep(context0, axis1, nodeTest2);
        } catch (Exception e) {
        }
    }
}
