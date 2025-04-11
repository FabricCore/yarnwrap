package yarnwrap.network;
public class NetworkPhase { public net.minecraft.network.NetworkPhase wrapperContained; public NetworkPhase(net.minecraft.network.NetworkPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
public java.lang.String getId() { return wrapperContained.getId(); }

}