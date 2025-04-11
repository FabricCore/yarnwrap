package yarnwrap.client.realms.dto;
public class WorldTemplate { public net.minecraft.client.realms.dto.WorldTemplate wrapperContained; public WorldTemplate(net.minecraft.client.realms.dto.WorldTemplate wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String id() { return wrapperContained.id; }
public void id(java.lang.String value) { wrapperContained.id = value; }
public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
public java.lang.String version() { return wrapperContained.version; }
public void version(java.lang.String value) { wrapperContained.version = value; }
public java.lang.String author() { return wrapperContained.author; }
public void author(java.lang.String value) { wrapperContained.author = value; }
public java.lang.String link() { return wrapperContained.link; }
public void link(java.lang.String value) { wrapperContained.link = value; }
public java.lang.String image() { return wrapperContained.image; }
public void image(java.lang.String value) { wrapperContained.image = value; }
public java.lang.String trailer() { return wrapperContained.trailer; }
public void trailer(java.lang.String value) { wrapperContained.trailer = value; }
public java.lang.String recommendedPlayers() { return wrapperContained.recommendedPlayers; }
public void recommendedPlayers(java.lang.String value) { wrapperContained.recommendedPlayers = value; }
public Object type() { return wrapperContained.type; }
// public void type(Object value) { wrapperContained.type = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.realms.dto.WorldTemplate parse(com.google.gson.JsonObject node) { return new yarnwrap.client.realms.dto.WorldTemplate(wrapperContained.parse(node)); }

}