package okhttp3.internal.platform;

import jbse2.meta.Analysis;

public class AndroidPlatform_configureTlsExtensions_Pose_main1170 {

    public static void main(String[] args) throws Exception {
        try {
            AndroidPlatform androidplatform_LTA = Analysis.newSymbolObject("androidplatform_LTA", AndroidPlatform.class);
            javax.net.ssl.SSLSocket sslSocket0 = Analysis.newSymbolObject("sslSocket0", javax.net.ssl.SSLSocket.class);
            java.lang.String hostname1 = Analysis.newSymbolObject("hostname1", java.lang.String.class);
            java.util.List<okhttp3.Protocol> protocols2 = Analysis.newSymbolObject("protocols2", java.util.List.class);
            androidplatform_LTA.configureTlsExtensions(sslSocket0, hostname1, protocols2);
        } catch (Exception e) {
        }
    }
}
