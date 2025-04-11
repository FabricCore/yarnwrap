package yarnwrap.client.network;
public class Address { public net.minecraft.client.network.Address wrapperContained; public Address(net.minecraft.client.network.Address wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getHostName() { return wrapperContained.getHostName(); }
// public yarnwrap.client.network.Address create(java.net.InetSocketAddress address) { return new yarnwrap.client.network.Address(wrapperContained.create(address)); }
public java.lang.String getHostAddress() { return wrapperContained.getHostAddress(); }
public int getPort() { return wrapperContained.getPort(); }
public java.net.InetSocketAddress getInetSocketAddress() { return wrapperContained.getInetSocketAddress(); }

}