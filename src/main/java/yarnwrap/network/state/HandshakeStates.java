package yarnwrap.network.state;
public class HandshakeStates { public net.minecraft.network.state.HandshakeStates wrapperContained; public HandshakeStates(net.minecraft.network.state.HandshakeStates wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public static yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(net.minecraft.network.state.HandshakeStates.C2S); }
// public static void C2S(yarnwrap.network.NetworkState value, ) { net.minecraft.network.state.HandshakeStates.C2S = value.wrapperContained; }

// public Object C2S_FACTORY() { return wrapperContained.C2S_FACTORY; }
// // public void C2S_FACTORY(Object value) { wrapperContained.C2S_FACTORY = value; }
// public static Object C2S_FACTORY() { return net.minecraft.network.state.HandshakeStates.C2S_FACTORY; }
// // public static void C2S_FACTORY(Object value, ) { net.minecraft.network.state.HandshakeStates.C2S_FACTORY = value; }

// public void method_56009(yarnwrap.network.NetworkStateBuilder builder) { wrapperContained.method_56009(builder.wrapperContained); }
// public static void method_56009(yarnwrap.network.NetworkStateBuilder builder, ) { net.minecraft.network.state.HandshakeStates.method_56009(builder.wrapperContained); }

}