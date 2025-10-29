package org.apache.commons.imaging.formats.tiff.write;

import jbse2.meta.Analysis;

public class TiffImageWriterBase_writeImage_Pose_main1246 {

    public static void main(String[] args) throws Exception {
        try {
            TiffImageWriterBase tiffimagewriterbase_LTA = Analysis.newSymbolObject("tiffimagewriterbase_LTA", TiffImageWriterBase.class);
            java.awt.image.BufferedImage src0 = Analysis.newSymbolObject("src0", java.awt.image.BufferedImage.class);
            java.io.OutputStream os1 = Analysis.newSymbolObject("os1", java.io.OutputStream.class);
            java.util.Map<java.lang.String, java.lang.Object> params2 = Analysis.newSymbolObject("params2", java.util.Map.class);
            tiffimagewriterbase_LTA.writeImage(src0, os1, params2);
        } catch (Exception e) {
        }
    }
}
