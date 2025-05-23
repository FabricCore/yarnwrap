package yarnwrap.network.state;
public class NetworkStateFactory { public net.minecraft.network.state.NetworkStateFactory wrapperContained; public NetworkStateFactory(net.minecraft.network.state.NetworkStateFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.state.NetworkState bind(java.util.function.Function registryBinder) { return new yarnwrap.network.state.NetworkState(wrapperContained.bind(registryBinder)); }
// public static yarnwrap.network.state.NetworkState bind(java.util.function.Function registryBinder, ) { return new yarnwrap.network.state.NetworkState(net.minecraft.network.state.NetworkStateFactory.bind(registryBinder)); }

}