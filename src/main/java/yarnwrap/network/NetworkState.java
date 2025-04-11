package yarnwrap.network;
public class NetworkState { public net.minecraft.network.NetworkState wrapperContained; public NetworkState(net.minecraft.network.NetworkState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side()); }
public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler()); }

}