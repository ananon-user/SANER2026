package com.google.re2j;

import jbse2.meta.Analysis;

public class Machine_match_Pose_main1091 {

    public static void main(String[] args) throws Exception {
        try {
            Machine machine_LTA = Analysis.newSymbolObject("machine_LTA", Machine.class);
            com.google.re2j.MachineInput in0 = Analysis.newSymbolObject("in0", com.google.re2j.MachineInput.class);
            int pos1 = Analysis.newSymbolInt("pos1");
            int anchor2 = Analysis.newSymbolInt("anchor2");
            machine_LTA.match(in0, pos1, anchor2);
        } catch (Exception e) {
        }
    }
}
