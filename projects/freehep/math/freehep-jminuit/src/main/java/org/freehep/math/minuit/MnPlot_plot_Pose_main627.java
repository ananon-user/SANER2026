package org.freehep.math.minuit;

import jbse2.meta.Analysis;

public class MnPlot_plot_Pose_main627 {

    public static void main(String[] args) throws Exception {
        try {
            MnPlot mnplot_LTA = Analysis.newSymbolObject("mnplot_LTA", MnPlot.class);
            double xmin0 = Analysis.newSymbolDouble("xmin0");
            double ymin1 = Analysis.newSymbolDouble("ymin1");
            java.util.List<org.freehep.math.minuit.Point> points2 = Analysis.newSymbolObject("points2", java.util.List.class);
            mnplot_LTA.plot(xmin0, ymin1, points2);
        } catch (Exception e) {
        }
    }
}
