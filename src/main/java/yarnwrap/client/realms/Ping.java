package yarnwrap.client.realms;
public class Ping { public net.minecraft.client.realms.Ping wrapperContained; public Ping(net.minecraft.client.realms.Ping wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pingAllRegions() { return wrapperContained.pingAllRegions(); }
public static java.util.List pingAllRegions() { return net.minecraft.client.realms.Ping.pingAllRegions(); }
// public int ping(java.lang.String host) { return wrapperContained.ping(host); }
// public static int ping(java.lang.String host, ) { return net.minecraft.client.realms.Ping.ping(host); }
// public java.util.List ping(Object[] regions) { return wrapperContained.ping(regions); }
// public static java.util.List ping(Object[] regions, ) { return net.minecraft.client.realms.Ping.ping(regions); }
// public long now() { return wrapperContained.now(); }
// public static long now() { return net.minecraft.client.realms.Ping.now(); }

}