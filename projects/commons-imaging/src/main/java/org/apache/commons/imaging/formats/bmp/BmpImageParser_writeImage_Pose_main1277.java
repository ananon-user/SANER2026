package org.apache.commons.imaging.formats.bmp;

import jbse2.meta.Analysis;

public class BmpImageParser_writeImage_Pose_main1277 {

    public static void main(String[] args) throws Exception {
        try {
            BmpImageParser bmpimageparser_LTA = Analysis.newSymbolObject("bmpimageparser_LTA", BmpImageParser.class);
            java.awt.image.BufferedImage src0 = Analysis.newSymbolObject("src0", java.awt.image.BufferedImage.class);
            java.io.OutputStream os1 = Analysis.newSymbolObject("os1", java.io.OutputStream.class);
            java.util.Map<java.lang.String, java.lang.Object> params2 = Analysis.newSymbolObject("params2", java.util.Map.class);
            bmpimageparser_LTA.writeImage(src0, os1, params2);
        } catch (Exception e) {
        }
    }
}
