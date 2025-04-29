package yarnwrap.network;
public class NetworkSide { public net.minecraft.network.NetworkSide wrapperContained; public NetworkSide(net.minecraft.network.NetworkSide wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.network.NetworkSide.name; }
// public static void name(java.lang.String value, ) { net.minecraft.network.NetworkSide.name = value; }

// public NetworkSide(java.lang.String name) { this.wrapperContained = new net.minecraft.network.NetworkSide(name); }
public yarnwrap.network.NetworkSide getOpposite() { return new yarnwrap.network.NetworkSide(wrapperContained.getOpposite()); }
// public static yarnwrap.network.NetworkSide getOpposite() { return new yarnwrap.network.NetworkSide(net.minecraft.network.NetworkSide.getOpposite()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.network.NetworkSide.getName(); }

}