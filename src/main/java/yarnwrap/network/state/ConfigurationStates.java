package yarnwrap.network.state;
public class ConfigurationStates { public net.minecraft.network.state.ConfigurationStates wrapperContained; public ConfigurationStates(net.minecraft.network.state.ConfigurationStates wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(wrapperContained.C2S); }
// public void C2S(yarnwrap.network.NetworkState value) { wrapperContained.C2S = value.wrapperContained; }
public static yarnwrap.network.NetworkState C2S() { return new yarnwrap.network.NetworkState(net.minecraft.network.state.ConfigurationStates.C2S); }
// public static void C2S(yarnwrap.network.NetworkState value, ) { net.minecraft.network.state.ConfigurationStates.C2S = value.wrapperContained; }

// public yarnwrap.network.NetworkState S2C() { return new yarnwrap.network.NetworkState(wrapperContained.S2C); }
// public void S2C(yarnwrap.network.NetworkState value) { wrapperContained.S2C = value.wrapperContained; }
public static yarnwrap.network.NetworkState S2C() { return new yarnwrap.network.NetworkState(net.minecraft.network.state.ConfigurationStates.S2C); }
// public static void S2C(yarnwrap.network.NetworkState value, ) { net.minecraft.network.state.ConfigurationStates.S2C = value.wrapperContained; }

// public Object C2S_FACTORY() { return wrapperContained.C2S_FACTORY; }
// // public void C2S_FACTORY(Object value) { wrapperContained.C2S_FACTORY = value; }
// public static Object C2S_FACTORY() { return net.minecraft.network.state.ConfigurationStates.C2S_FACTORY; }
// // public static void C2S_FACTORY(Object value, ) { net.minecraft.network.state.ConfigurationStates.C2S_FACTORY = value; }

// public Object S2C_FACTORY() { return wrapperContained.S2C_FACTORY; }
// // public void S2C_FACTORY(Object value) { wrapperContained.S2C_FACTORY = value; }
// public static Object S2C_FACTORY() { return net.minecraft.network.state.ConfigurationStates.S2C_FACTORY; }
// // public static void S2C_FACTORY(Object value, ) { net.minecraft.network.state.ConfigurationStates.S2C_FACTORY = value; }

// public void method_56512(yarnwrap.network.NetworkStateBuilder builder) { wrapperContained.method_56512(builder.wrapperContained); }
// public static void method_56512(yarnwrap.network.NetworkStateBuilder builder, ) { net.minecraft.network.state.ConfigurationStates.method_56512(builder.wrapperContained); }
// public void method_56513(yarnwrap.network.NetworkStateBuilder builder) { wrapperContained.method_56513(builder.wrapperContained); }
// public static void method_56513(yarnwrap.network.NetworkStateBuilder builder, ) { net.minecraft.network.state.ConfigurationStates.method_56513(builder.wrapperContained); }

}