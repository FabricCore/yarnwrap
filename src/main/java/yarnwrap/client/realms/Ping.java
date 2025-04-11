package yarnwrap.client.realms;
public class Ping { public net.minecraft.client.realms.Ping wrapperContained; public Ping(net.minecraft.client.realms.Ping wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pingAllRegions() { return wrapperContained.pingAllRegions(); }
// public int ping(java.lang.String host) { return wrapperContained.ping(host); }
// public java.util.List ping(Object[] regions) { return wrapperContained.ping(regions); }
// public long now() { return wrapperContained.now(); }

}