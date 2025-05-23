package yarnwrap.network.state;
public class NetworkState { public net.minecraft.network.state.NetworkState wrapperContained; public NetworkState(net.minecraft.network.state.NetworkState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side()); }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.state.NetworkState.side()); }
public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler()); }
// public static yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(net.minecraft.network.state.NetworkState.bundleHandler()); }

}