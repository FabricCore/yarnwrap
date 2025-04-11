package yarnwrap.network.state;
public class HandshakeStates { public net.minecraft.network.state.HandshakeStates wrapperContained; public HandshakeStates(net.minecraft.network.state.HandshakeStates wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public Object C2S_FACTORY() { return wrapperContained.C2S_FACTORY; }
// // public void C2S_FACTORY(Object value) { wrapperContained.C2S_FACTORY = value; }

}