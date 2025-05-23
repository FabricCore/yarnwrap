package yarnwrap.network.state;
public class ConfigurationStates { public net.minecraft.network.state.ConfigurationStates wrapperContained; public ConfigurationStates(net.minecraft.network.state.ConfigurationStates wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.state.NetworkState C2S() { return new yarnwrap.network.state.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.state.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public static yarnwrap.network.state.NetworkState C2S() { return new yarnwrap.network.state.NetworkState(net.minecraft.network.state.ConfigurationStates.C2S); }
// public static void C2S(yarnwrap.network.state.NetworkState value, ) { net.minecraft.network.state.ConfigurationStates.C2S = value.wrapperContained; }

// public yarnwrap.network.state.NetworkState S2C() { return new yarnwrap.network.state.NetworkState(wrapperContained.S2C); }
// public void S2C(yarnwrap.network.state.NetworkState value) { wrapperContained.S2C = value.wrapperContained; }
public static yarnwrap.network.state.NetworkState S2C() { return new yarnwrap.network.state.NetworkState(net.minecraft.network.state.ConfigurationStates.S2C); }
// public static void S2C(yarnwrap.network.state.NetworkState value, ) { net.minecraft.network.state.ConfigurationStates.S2C = value.wrapperContained; }

// public yarnwrap.network.state.NetworkStateFactory C2S_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(wrapperContained.C2S_FACTORY); }
// public void C2S_FACTORY(yarnwrap.network.state.NetworkStateFactory value) { wrapperContained.C2S_FACTORY = value.wrapperContained; }
public static yarnwrap.network.state.NetworkStateFactory C2S_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(net.minecraft.network.state.ConfigurationStates.C2S_FACTORY); }
// public static void C2S_FACTORY(yarnwrap.network.state.NetworkStateFactory value, ) { net.minecraft.network.state.ConfigurationStates.C2S_FACTORY = value.wrapperContained; }

// public yarnwrap.network.state.NetworkStateFactory S2C_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(wrapperContained.S2C_FACTORY); }
// public void S2C_FACTORY(yarnwrap.network.state.NetworkStateFactory value) { wrapperContained.S2C_FACTORY = value.wrapperContained; }
public static yarnwrap.network.state.NetworkStateFactory S2C_FACTORY() { return new yarnwrap.network.state.NetworkStateFactory(net.minecraft.network.state.ConfigurationStates.S2C_FACTORY); }
// public static void S2C_FACTORY(yarnwrap.network.state.NetworkStateFactory value, ) { net.minecraft.network.state.ConfigurationStates.S2C_FACTORY = value.wrapperContained; }

// public void method_56512(yarnwrap.network.state.NetworkStateBuilder builder) { wrapperContained.method_56512(builder.wrapperContained); }
// public static void method_56512(yarnwrap.network.state.NetworkStateBuilder builder, ) { net.minecraft.network.state.ConfigurationStates.method_56512(builder.wrapperContained); }
// public void method_56513(yarnwrap.network.state.NetworkStateBuilder builder) { wrapperContained.method_56513(builder.wrapperContained); }
// public static void method_56513(yarnwrap.network.state.NetworkStateBuilder builder, ) { net.minecraft.network.state.ConfigurationStates.method_56513(builder.wrapperContained); }

}