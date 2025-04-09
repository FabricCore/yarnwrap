package yarnwrap.client.realms.dto;
public class RealmsServerList { public net.minecraft.client.realms.dto.RealmsServerList wrapperContained; public RealmsServerList(net.minecraft.client.realms.dto.RealmsServerList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List servers() { return wrapperContained.servers; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.RealmsServerList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerList(wrapperContained.parse(json)); }

}