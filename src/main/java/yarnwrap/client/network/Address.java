package yarnwrap.client.network;
public class Address { public net.minecraft.client.network.Address wrapperContained; public Address(net.minecraft.client.network.Address wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getHostName() { return wrapperContained.getHostName(); }
// public static java.lang.String getHostName() { return net.minecraft.client.network.Address.getHostName(); }
// public yarnwrap.client.network.Address create(java.net.InetSocketAddress address) { return new yarnwrap.client.network.Address(wrapperContained.create(address)); }
// public static yarnwrap.client.network.Address create(java.net.InetSocketAddress address, ) { return new yarnwrap.client.network.Address(net.minecraft.client.network.Address.create(address)); }
public java.lang.String getHostAddress() { return wrapperContained.getHostAddress(); }
// public static java.lang.String getHostAddress() { return net.minecraft.client.network.Address.getHostAddress(); }
public int getPort() { return wrapperContained.getPort(); }
// public static int getPort() { return net.minecraft.client.network.Address.getPort(); }
public java.net.InetSocketAddress getInetSocketAddress() { return wrapperContained.getInetSocketAddress(); }
// public static java.net.InetSocketAddress getInetSocketAddress() { return net.minecraft.client.network.Address.getInetSocketAddress(); }

}