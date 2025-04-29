package yarnwrap.client.realms.dto;
public class RealmsServerPlayerList { public net.minecraft.client.realms.dto.RealmsServerPlayerList wrapperContained; public RealmsServerPlayerList(net.minecraft.client.realms.dto.RealmsServerPlayerList wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.RealmsServerPlayerList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.RealmsServerPlayerList.LOGGER = value; }

public java.util.Map serverIdToPlayers() { return wrapperContained.serverIdToPlayers; }
public void serverIdToPlayers(java.util.Map value) { wrapperContained.serverIdToPlayers = value; }
// public static java.util.Map serverIdToPlayers() { return net.minecraft.client.realms.dto.RealmsServerPlayerList.serverIdToPlayers; }
// public static void serverIdToPlayers(java.util.Map value, ) { net.minecraft.client.realms.dto.RealmsServerPlayerList.serverIdToPlayers = value; }

// public java.util.List parsePlayers(com.google.gson.JsonArray jsonArray) { return wrapperContained.parsePlayers(jsonArray); }
// public static java.util.List parsePlayers(com.google.gson.JsonArray jsonArray, ) { return net.minecraft.client.realms.dto.RealmsServerPlayerList.parsePlayers(jsonArray); }
// public yarnwrap.client.realms.dto.RealmsServerPlayerList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServerPlayerList(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.RealmsServerPlayerList parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.RealmsServerPlayerList(net.minecraft.client.realms.dto.RealmsServerPlayerList.parse(json)); }
public java.util.List get(long serverId) { return wrapperContained.get(serverId); }
// public static java.util.List get(long serverId, ) { return net.minecraft.client.realms.dto.RealmsServerPlayerList.get(serverId); }

}