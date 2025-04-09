package yarnwrap.client.network;
public class AddressResolver { public net.minecraft.client.network.AddressResolver wrapperContained; public AddressResolver(net.minecraft.client.network.AddressResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.network.AddressResolver DEFAULT() { return new yarnwrap.client.network.AddressResolver(wrapperContained.DEFAULT); }

}