package org.la4j.linear;

import jbse2.meta.Analysis;

public class GaussianSolver_solve_Pose_main1063 {

    public static void main(String[] args) throws Exception {
        try {
            GaussianSolver gaussiansolver_LTA = Analysis.newSymbolObject("gaussiansolver_LTA", GaussianSolver.class);
            org.la4j.Vector b0 = Analysis.newSymbolObject("b0", org.la4j.Vector.class);
            gaussiansolver_LTA.solve(b0);
        } catch (Exception e) {
        }
    }
}
