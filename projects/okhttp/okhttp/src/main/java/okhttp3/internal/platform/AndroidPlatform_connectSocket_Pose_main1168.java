package okhttp3.internal.platform;

import jbse2.meta.Analysis;

public class AndroidPlatform_connectSocket_Pose_main1168 {

    public static void main(String[] args) throws Exception {
        try {
            AndroidPlatform androidplatform_LTA = Analysis.newSymbolObject("androidplatform_LTA", AndroidPlatform.class);
            java.net.Socket socket0 = Analysis.newSymbolObject("socket0", java.net.Socket.class);
            java.net.InetSocketAddress address1 = Analysis.newSymbolObject("address1", java.net.InetSocketAddress.class);
            int connectTimeout2 = Analysis.newSymbolInt("connectTimeout2");
            androidplatform_LTA.connectSocket(socket0, address1, connectTimeout2);
        } catch (Exception e) {
        }
    }
}
