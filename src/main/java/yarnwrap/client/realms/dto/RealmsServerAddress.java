package yarnwrap.client.realms.dto;
public class RealmsServerAddress { public net.minecraft.client.realms.dto.RealmsServerAddress wrapperContained; public RealmsServerAddress(net.minecraft.client.realms.dto.RealmsServerAddress wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String address() { return wrapperContained.address; }
public void address(java.lang.String value) { wrapperContained.address = value; }
// public static java.lang.String address() { return net.minecraft.client.realms.dto.RealmsServerAddress.address; }
// public static void address(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsServerAddress.address = value; }

public java.lang.String resourcePackUrl() { return wrapperContained.resourcePackUrl; }
public void resourcePackUrl(java.lang.String value) { wrapperContained.resourcePackUrl = value; }
// public static java.lang.String resourcePackUrl() { return net.minecraft.client.realms.dto.RealmsServerAddress.resourcePackUrl; }
// public static void resourcePackUrl(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsServerAddress.resourcePackUrl = value; }

public java.lang.String resourcePackHash() { return wrapperContained.resourcePackHash; }
public void resourcePackHash(java.lang.String value) { wrapperContained.resourcePackHash = value; }
// public static java.lang.String resourcePackHash() { return net.minecraft.client.realms.dto.RealmsServerAddress.resourcePackHash; }
// public static void resourcePackHash(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsServerAddress.resourcePackHash = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.RealmsServerAddress.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.RealmsServerAddress.LOGGER = value; }

// public yarnwrap.client.realms.dto.RealmsServerAddress parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerAddress(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.RealmsServerAddress parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.RealmsServerAddress(net.minecraft.client.realms.dto.RealmsServerAddress.parse(json)); }

}