package yarnwrap.client.realms;
public class RealmsClientConfig { public net.minecraft.client.realms.RealmsClientConfig wrapperContained; public RealmsClientConfig(net.minecraft.client.realms.RealmsClientConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.net.Proxy proxy() { return wrapperContained.proxy; }
public java.net.Proxy getProxy() { return wrapperContained.getProxy(); }
public void setProxy(java.net.Proxy proxy) { wrapperContained.setProxy(proxy); }

}