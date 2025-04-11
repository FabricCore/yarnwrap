package yarnwrap.client.realms.dto;
public class RegionPingResult { public net.minecraft.client.realms.dto.RegionPingResult wrapperContained; public RegionPingResult(net.minecraft.client.realms.dto.RegionPingResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String regionName() { return wrapperContained.regionName; }
// public void regionName(java.lang.String value) { wrapperContained.regionName = value; }
// public int ping() { return wrapperContained.ping; }
// public void ping(int value) { wrapperContained.ping = value; }
public int getPing() { return wrapperContained.getPing(); }

}