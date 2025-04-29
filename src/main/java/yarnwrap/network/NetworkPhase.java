package yarnwrap.network;
public class NetworkPhase { public net.minecraft.network.NetworkPhase wrapperContained; public NetworkPhase(net.minecraft.network.NetworkPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.network.NetworkPhase.id; }
// public static void id(java.lang.String value, ) { net.minecraft.network.NetworkPhase.id = value; }

// public NetworkPhase(java.lang.String id) { this.wrapperContained = new net.minecraft.network.NetworkPhase(id); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.network.NetworkPhase.getId(); }

}