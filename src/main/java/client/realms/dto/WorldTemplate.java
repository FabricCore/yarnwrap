package yarnwrap.client.realms.dto;
public class WorldTemplate { public net.minecraft.client.realms.dto.WorldTemplate wrapperContained; public WorldTemplate(net.minecraft.client.realms.dto.WorldTemplate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String id() { return wrapperContained.id; }
public java.lang.String name() { return wrapperContained.name; }
public java.lang.String version() { return wrapperContained.version; }
public java.lang.String author() { return wrapperContained.author; }
public java.lang.String link() { return wrapperContained.link; }
public java.lang.String image() { return wrapperContained.image; }
public java.lang.String trailer() { return wrapperContained.trailer; }
public java.lang.String recommendedPlayers() { return wrapperContained.recommendedPlayers; }
public Object type() { return wrapperContained.type; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.WorldTemplate parse(com.google.gson.JsonObject node) { return new yarnwrap.client.realms.dto.WorldTemplate(wrapperContained.parse(node)); }

}