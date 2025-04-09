package yarnwrap.network.state;
public class LoginStates { public net.minecraft.network.state.LoginStates wrapperContained; public LoginStates(net.minecraft.network.state.LoginStates wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(wrapperContained.C2S); }
public yarnwrap.network.NetworkState S2C() { return new yarnwrap.network.NetworkState(wrapperContained.S2C); }
public Object C2S_FACTORY() { return wrapperContained.C2S_FACTORY; }
public Object S2C_FACTORY() { return wrapperContained.S2C_FACTORY; }

}