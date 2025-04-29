package yarnwrap.client.realms.dto;
public class WorldDownload { public net.minecraft.client.realms.dto.WorldDownload wrapperContained; public WorldDownload(net.minecraft.client.realms.dto.WorldDownload wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String downloadLink() { return wrapperContained.downloadLink; }
public void downloadLink(java.lang.String value) { wrapperContained.downloadLink = value; }
// public static java.lang.String downloadLink() { return net.minecraft.client.realms.dto.WorldDownload.downloadLink; }
// public static void downloadLink(java.lang.String value, ) { net.minecraft.client.realms.dto.WorldDownload.downloadLink = value; }

public java.lang.String resourcePackUrl() { return wrapperContained.resourcePackUrl; }
public void resourcePackUrl(java.lang.String value) { wrapperContained.resourcePackUrl = value; }
// public static java.lang.String resourcePackUrl() { return net.minecraft.client.realms.dto.WorldDownload.resourcePackUrl; }
// public static void resourcePackUrl(java.lang.String value, ) { net.minecraft.client.realms.dto.WorldDownload.resourcePackUrl = value; }

public java.lang.String resourcePackHash() { return wrapperContained.resourcePackHash; }
public void resourcePackHash(java.lang.String value) { wrapperContained.resourcePackHash = value; }
// public static java.lang.String resourcePackHash() { return net.minecraft.client.realms.dto.WorldDownload.resourcePackHash; }
// public static void resourcePackHash(java.lang.String value, ) { net.minecraft.client.realms.dto.WorldDownload.resourcePackHash = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.WorldDownload.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.WorldDownload.LOGGER = value; }

// public yarnwrap.client.realms.dto.WorldDownload parse(java.lang.String json) { return new yarnwrap.client.realms.dto.WorldDownload(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.WorldDownload parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.WorldDownload(net.minecraft.client.realms.dto.WorldDownload.parse(json)); }

}