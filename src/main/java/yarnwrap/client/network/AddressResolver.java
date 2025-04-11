package yarnwrap.client.network;
public class AddressResolver { public net.minecraft.client.network.AddressResolver wrapperContained; public AddressResolver(net.minecraft.client.network.AddressResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.network.AddressResolver DEFAULT() { return new yarnwrap.client.network.AddressResolver(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.network.AddressResolver value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public java.util.Optional method_36903(yarnwrap.client.network.ServerAddress address) { return wrapperContained.method_36903(address.wrapperContained); }
public java.util.Optional resolve(yarnwrap.client.network.ServerAddress address) { return wrapperContained.resolve(address.wrapperContained); }

}