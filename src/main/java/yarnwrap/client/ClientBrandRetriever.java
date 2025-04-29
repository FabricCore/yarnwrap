package yarnwrap.client;
public class ClientBrandRetriever { public net.minecraft.client.ClientBrandRetriever wrapperContained; public ClientBrandRetriever(net.minecraft.client.ClientBrandRetriever wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String VANILLA() { return wrapperContained.VANILLA; }
// public void VANILLA(java.lang.String value) { wrapperContained.VANILLA = value; }
public static java.lang.String VANILLA() { return net.minecraft.client.ClientBrandRetriever.VANILLA; }
// public static void VANILLA(java.lang.String value, ) { net.minecraft.client.ClientBrandRetriever.VANILLA = value; }


}