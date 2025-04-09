package yarnwrap.client.network;
public class ServerAddress { public net.minecraft.client.network.ServerAddress wrapperContained; public ServerAddress(net.minecraft.client.network.ServerAddress wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.common.net.HostAndPort hostAndPort() { return wrapperContained.hostAndPort; }
// public yarnwrap.client.network.ServerAddress INVALID() { return new yarnwrap.client.network.ServerAddress(wrapperContained.INVALID); }
public yarnwrap.client.network.ServerAddress parse(java.lang.String address) { return new yarnwrap.client.network.ServerAddress(wrapperContained.parse(address)); }
// public int portOrDefault(java.lang.String port) { return wrapperContained.portOrDefault(port); }
public java.lang.String getAddress() { return wrapperContained.getAddress(); }
public int getPort() { return wrapperContained.getPort(); }
public boolean isValid(java.lang.String address) { return wrapperContained.isValid(address); }

}