package yarnwrap.network.state;
public class HandshakeStates { public net.minecraft.network.state.HandshakeStates wrapperContained; public HandshakeStates(net.minecraft.network.state.HandshakeStates wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.state.NetworkState C2S() { return new yarnwrap.network.state.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.state.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public static yarnwrap.network.state.NetworkState C2S() { return new yarnwrap.network.state.NetworkState(net.minecraft.network.state.HandshakeStates.C2S); }
// public static void C2S(yarnwrap.network.state.NetworkState value, ) { net.minecraft.network.state.HandshakeStates.C2S = value.wrapperContained; }

// public yarnwrap.network.state.NetworkStateFactory C2S_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(wrapperContained.C2S_FACTORY); }
// public void C2S_FACTORY(yarnwrap.network.state.NetworkStateFactory value) { wrapperContained.C2S_FACTORY = value.wrapperContained; }
public static yarnwrap.network.state.NetworkStateFactory C2S_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(net.minecraft.network.state.HandshakeStates.C2S_FACTORY); }
// public static void C2S_FACTORY(yarnwrap.network.state.NetworkStateFactory value, ) { net.minecraft.network.state.HandshakeStates.C2S_FACTORY = value.wrapperContained; }

// public void method_56009(yarnwrap.network.state.NetworkStateBuilder builder) { wrapperContained.method_56009(builder.wrapperContained); }
// public static void method_56009(yarnwrap.network.state.NetworkStateBuilder builder, ) { net.minecraft.network.state.HandshakeStates.method_56009(builder.wrapperContained); }

}