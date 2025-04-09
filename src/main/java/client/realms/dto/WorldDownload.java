package yarnwrap.client.realms.dto;
public class WorldDownload { public net.minecraft.client.realms.dto.WorldDownload wrapperContained; public WorldDownload(net.minecraft.client.realms.dto.WorldDownload wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String downloadLink() { return wrapperContained.downloadLink; }
public java.lang.String resourcePackUrl() { return wrapperContained.resourcePackUrl; }
public java.lang.String resourcePackHash() { return wrapperContained.resourcePackHash; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.WorldDownload parse(java.lang.String json) { return new yarnwrap.client.realms.dto.WorldDownload(wrapperContained.parse(json)); }

}