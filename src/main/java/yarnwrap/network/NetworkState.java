package yarnwrap.network;
public class NetworkState { public net.minecraft.network.NetworkState wrapperContained; public NetworkState(net.minecraft.network.NetworkState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side()); }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.NetworkState.side()); }
public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler()); }
// public static yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(net.minecraft.network.NetworkState.bundleHandler()); }

}