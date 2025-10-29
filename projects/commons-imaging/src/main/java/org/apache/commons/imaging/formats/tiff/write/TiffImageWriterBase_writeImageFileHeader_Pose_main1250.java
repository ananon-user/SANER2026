package org.apache.commons.imaging.formats.tiff.write;

import jbse2.meta.Analysis;

public class TiffImageWriterBase_writeImageFileHeader_Pose_main1250 {

    public static void main(String[] args) throws Exception {
        try {
            TiffImageWriterBase tiffimagewriterbase_LTA = Analysis.newSymbolObject("tiffimagewriterbase_LTA", TiffImageWriterBase.class);
            org.apache.commons.imaging.common.BinaryOutputStream bos0 = Analysis.newSymbolObject("bos0", org.apache.commons.imaging.common.BinaryOutputStream.class);
            long offsetToFirstIFD1 = Analysis.newSymbolLong("offsetToFirstIFD1");
            tiffimagewriterbase_LTA.writeImageFileHeader(bos0, offsetToFirstIFD1);
        } catch (Exception e) {
        }
    }
}
