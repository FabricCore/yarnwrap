package yarnwrap.network.state;
public class LoginStates { public net.minecraft.network.state.LoginStates wrapperContained; public LoginStates(net.minecraft.network.state.LoginStates wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public yarnwrap.network.NetworkState S2C() { return new yarnwrap.network.NetworkState(wrapperContained.S2C); }
// public void S2C(yarnwrap.network.NetworkState value) { wrapperContained.S2C = value.wrapperContained; }
public Object C2S_FACTORY() { return wrapperContained.C2S_FACTORY; }
// // public void C2S_FACTORY(Object value) { wrapperContained.C2S_FACTORY = value; }
public Object S2C_FACTORY() { return wrapperContained.S2C_FACTORY; }
// // public void S2C_FACTORY(Object value) { wrapperContained.S2C_FACTORY = value; }

}