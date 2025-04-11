package yarnwrap.client.realms.dto;
public class RealmsServerPlayerList { public net.minecraft.client.realms.dto.RealmsServerPlayerList wrapperContained; public RealmsServerPlayerList(net.minecraft.client.realms.dto.RealmsServerPlayerList wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.Map serverIdToPlayers() { return wrapperContained.serverIdToPlayers; }
public void serverIdToPlayers(java.util.Map value) { wrapperContained.serverIdToPlayers = value; }
// public java.util.List parsePlayers(com.google.gson.JsonArray jsonArray) { return wrapperContained.parsePlayers(jsonArray); }
public yarnwrap.client.realms.dto.RealmsServerPlayerList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerPlayerList(wrapperContained.parse(json)); }
public java.util.List get(long serverId) { return wrapperContained.get(serverId); }

}