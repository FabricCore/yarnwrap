package yarnwrap.client.realms;
public class RealmsClientConfig { public net.minecraft.client.realms.RealmsClientConfig wrapperContained; public RealmsClientConfig(net.minecraft.client.realms.RealmsClientConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.Proxy proxy() { return wrapperContained.proxy; }
// public void proxy(java.net.Proxy value) { wrapperContained.proxy = value; }
// public static java.net.Proxy proxy() { return net.minecraft.client.realms.RealmsClientConfig.proxy; }
// public static void proxy(java.net.Proxy value, ) { net.minecraft.client.realms.RealmsClientConfig.proxy = value; }

// public java.net.Proxy getProxy() { return wrapperContained.getProxy(); }
public static java.net.Proxy getProxy() { return net.minecraft.client.realms.RealmsClientConfig.getProxy(); }
// public void setProxy(java.net.Proxy proxy) { wrapperContained.setProxy(proxy); }
// public static void setProxy(java.net.Proxy proxy, ) { net.minecraft.client.realms.RealmsClientConfig.setProxy(proxy); }

}