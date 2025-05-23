package yarnwrap.network.state;
public class ContextAwareNetworkStateFactory { public net.minecraft.network.state.ContextAwareNetworkStateFactory wrapperContained; public ContextAwareNetworkStateFactory(net.minecraft.network.state.ContextAwareNetworkStateFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.state.NetworkState bind(java.util.function.Function registryBinder,java.lang.Object context) { return new yarnwrap.network.state.NetworkState(wrapperContained.bind(registryBinder,context)); }
// public static yarnwrap.network.state.NetworkState bind(java.util.function.Function registryBinder,java.lang.Object context, ) { return new yarnwrap.network.state.NetworkState(net.minecraft.network.state.ContextAwareNetworkStateFactory.bind(registryBinder,context)); }

}