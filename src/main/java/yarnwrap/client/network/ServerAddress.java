package yarnwrap.client.network;
public class ServerAddress { public net.minecraft.client.network.ServerAddress wrapperContained; public ServerAddress(net.minecraft.client.network.ServerAddress wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ServerAddress.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ServerAddress.LOGGER = value; }

// public com.google.common.net.HostAndPort hostAndPort() { return wrapperContained.hostAndPort; }
// public void hostAndPort(com.google.common.net.HostAndPort value) { wrapperContained.hostAndPort = value; }
// public static com.google.common.net.HostAndPort hostAndPort() { return net.minecraft.client.network.ServerAddress.hostAndPort; }
// public static void hostAndPort(com.google.common.net.HostAndPort value, ) { net.minecraft.client.network.ServerAddress.hostAndPort = value; }

// public yarnwrap.client.network.ServerAddress INVALID() { return new yarnwrap.client.network.ServerAddress(wrapperContained.INVALID); }
// public void INVALID(yarnwrap.client.network.ServerAddress value) { wrapperContained.INVALID = value.wrapperContained; }
// public static yarnwrap.client.network.ServerAddress INVALID() { return new yarnwrap.client.network.ServerAddress(net.minecraft.client.network.ServerAddress.INVALID); }
// public static void INVALID(yarnwrap.client.network.ServerAddress value, ) { net.minecraft.client.network.ServerAddress.INVALID = value.wrapperContained; }

// public ServerAddress(com.google.common.net.HostAndPort hostAndPort) { this.wrapperContained = new net.minecraft.client.network.ServerAddress(hostAndPort); }
public ServerAddress(java.lang.String host,int port) { this.wrapperContained = new net.minecraft.client.network.ServerAddress(host,port); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.network.ServerAddress.equals(o); }
// public yarnwrap.client.network.ServerAddress parse(java.lang.String address) { return new yarnwrap.client.network.ServerAddress(wrapperContained.parse(address)); }
// public static yarnwrap.client.network.ServerAddress parse(java.lang.String address, ) { return new yarnwrap.client.network.ServerAddress(net.minecraft.client.network.ServerAddress.parse(address)); }
// public int portOrDefault(java.lang.String port) { return wrapperContained.portOrDefault(port); }
// public static int portOrDefault(java.lang.String port, ) { return net.minecraft.client.network.ServerAddress.portOrDefault(port); }
public java.lang.String getAddress() { return wrapperContained.getAddress(); }
// public static java.lang.String getAddress() { return net.minecraft.client.network.ServerAddress.getAddress(); }
public int getPort() { return wrapperContained.getPort(); }
// public static int getPort() { return net.minecraft.client.network.ServerAddress.getPort(); }
// public boolean isValid(java.lang.String address) { return wrapperContained.isValid(address); }
// public static boolean isValid(java.lang.String address, ) { return net.minecraft.client.network.ServerAddress.isValid(address); }

}