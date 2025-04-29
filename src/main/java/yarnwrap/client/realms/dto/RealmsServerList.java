package yarnwrap.client.realms.dto;
public class RealmsServerList { public net.minecraft.client.realms.dto.RealmsServerList wrapperContained; public RealmsServerList(net.minecraft.client.realms.dto.RealmsServerList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List servers() { return wrapperContained.servers; }
public void servers(java.util.List value) { wrapperContained.servers = value; }
// public static java.util.List servers() { return net.minecraft.client.realms.dto.RealmsServerList.servers; }
// public static void servers(java.util.List value, ) { net.minecraft.client.realms.dto.RealmsServerList.servers = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.RealmsServerList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.RealmsServerList.LOGGER = value; }

// public yarnwrap.client.realms.dto.RealmsServerList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerList(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.RealmsServerList parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.RealmsServerList(net.minecraft.client.realms.dto.RealmsServerList.parse(json)); }

}