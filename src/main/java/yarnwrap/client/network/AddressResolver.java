package yarnwrap.client.network;
public class AddressResolver { public net.minecraft.client.network.AddressResolver wrapperContained; public AddressResolver(net.minecraft.client.network.AddressResolver wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.AddressResolver.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.AddressResolver.LOGGER = value; }

// public yarnwrap.client.network.AddressResolver DEFAULT() { return new yarnwrap.client.network.AddressResolver(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.network.AddressResolver value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.client.network.AddressResolver DEFAULT() { return new yarnwrap.client.network.AddressResolver(net.minecraft.client.network.AddressResolver.DEFAULT); }
// public static void DEFAULT(yarnwrap.client.network.AddressResolver value, ) { net.minecraft.client.network.AddressResolver.DEFAULT = value.wrapperContained; }

// public java.util.Optional method_36903(yarnwrap.client.network.ServerAddress address) { return wrapperContained.method_36903(address.wrapperContained); }
// public static java.util.Optional method_36903(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.AddressResolver.method_36903(address.wrapperContained); }
public java.util.Optional resolve(yarnwrap.client.network.ServerAddress address) { return wrapperContained.resolve(address.wrapperContained); }
// public static java.util.Optional resolve(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.AddressResolver.resolve(address.wrapperContained); }

}