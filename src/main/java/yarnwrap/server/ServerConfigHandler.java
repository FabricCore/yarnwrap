package yarnwrap.server;
public class ServerConfigHandler { public net.minecraft.server.ServerConfigHandler wrapperContained; public ServerConfigHandler(net.minecraft.server.ServerConfigHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.io.File BANNED_IPS_FILE() { return wrapperContained.BANNED_IPS_FILE; }
// public void BANNED_IPS_FILE(java.io.File value) { wrapperContained.BANNED_IPS_FILE = value; }
public java.io.File WHITE_LIST_FILE() { return wrapperContained.WHITE_LIST_FILE; }
// public void WHITE_LIST_FILE(java.io.File value) { wrapperContained.WHITE_LIST_FILE = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.io.File OPERATORS_FILE() { return wrapperContained.OPERATORS_FILE; }
// public void OPERATORS_FILE(java.io.File value) { wrapperContained.OPERATORS_FILE = value; }
public java.io.File BANNED_PLAYERS_FILE() { return wrapperContained.BANNED_PLAYERS_FILE; }
// public void BANNED_PLAYERS_FILE(java.io.File value) { wrapperContained.BANNED_PLAYERS_FILE = value; }
public boolean convertWhitelist(yarnwrap.server.MinecraftServer server) { return wrapperContained.convertWhitelist(server.wrapperContained); }
// public void createDirectory(java.io.File directory) { wrapperContained.createDirectory(directory); }
// public java.util.Date parseDate(java.lang.String dateString,java.util.Date fallback) { return wrapperContained.parseDate(dateString,fallback); }
// public java.io.File getLevelPlayersFolder(yarnwrap.server.MinecraftServer server) { return wrapperContained.getLevelPlayersFolder(server.wrapperContained); }
// public void lookupProfile(yarnwrap.server.MinecraftServer server,java.util.Collection bannedPlayers,com.mojang.authlib.ProfileLookupCallback callback) { wrapperContained.lookupProfile(server.wrapperContained,bannedPlayers,callback); }
public boolean convertOperators(yarnwrap.server.MinecraftServer server) { return wrapperContained.convertOperators(server.wrapperContained); }
public boolean checkSuccess(yarnwrap.server.MinecraftServer server) { return wrapperContained.checkSuccess(server.wrapperContained); }
// public boolean checkListConversionSuccess() { return wrapperContained.checkListConversionSuccess(); }
// public boolean checkPlayerConversionSuccess(yarnwrap.server.MinecraftServer server) { return wrapperContained.checkPlayerConversionSuccess(server.wrapperContained); }
// public java.util.List processSimpleListFile(java.io.File file,java.util.Map valueMap) { return wrapperContained.processSimpleListFile(file,valueMap); }
public boolean convertBannedIps(yarnwrap.server.MinecraftServer server) { return wrapperContained.convertBannedIps(server.wrapperContained); }
public java.util.UUID getPlayerUuidByName(yarnwrap.server.MinecraftServer server,java.lang.String name) { return wrapperContained.getPlayerUuidByName(server.wrapperContained,name); }
public boolean convertBannedPlayers(yarnwrap.server.MinecraftServer server) { return wrapperContained.convertBannedPlayers(server.wrapperContained); }
// public void markFileConverted(java.io.File file) { wrapperContained.markFileConverted(file); }
public boolean convertPlayerFiles(yarnwrap.server.dedicated.MinecraftDedicatedServer minecraftServer) { return wrapperContained.convertPlayerFiles(minecraftServer.wrapperContained); }

}