package yarnwrap.client.realms.dto;
public class RealmsServerAddress { public net.minecraft.client.realms.dto.RealmsServerAddress wrapperContained; public RealmsServerAddress(net.minecraft.client.realms.dto.RealmsServerAddress wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String address() { return wrapperContained.address; }
public java.lang.String resourcePackUrl() { return wrapperContained.resourcePackUrl; }
public java.lang.String resourcePackHash() { return wrapperContained.resourcePackHash; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.RealmsServerAddress parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.parse(json)); }

}