package yarnwrap.network;
public class NetworkSide { public net.minecraft.network.NetworkSide wrapperContained; public NetworkSide(net.minecraft.network.NetworkSide wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.network.NetworkSide getOpposite() { return new yarnwrap.network.NetworkSide(wrapperContained.getOpposite()); }
public java.lang.String getName() { return wrapperContained.getName(); }

}