package yarnwrap.client.realms.dto;
public class RegionPingResult { public net.minecraft.client.realms.dto.RegionPingResult wrapperContained; public RegionPingResult(net.minecraft.client.realms.dto.RegionPingResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String regionName() { return wrapperContained.regionName; }
// public int ping() { return wrapperContained.ping; }
public int getPing() { return wrapperContained.getPing(); }

}