package yarnwrap.client.realms.dto;
public class PlayerActivity { public net.minecraft.client.realms.dto.PlayerActivity wrapperContained; public PlayerActivity(net.minecraft.client.realms.dto.PlayerActivity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String profileUuid() { return wrapperContained.profileUuid; }
public void profileUuid(java.lang.String value) { wrapperContained.profileUuid = value; }
// public static java.lang.String profileUuid() { return net.minecraft.client.realms.dto.PlayerActivity.profileUuid; }
// public static void profileUuid(java.lang.String value, ) { net.minecraft.client.realms.dto.PlayerActivity.profileUuid = value; }

public long joinTime() { return wrapperContained.joinTime; }
public void joinTime(long value) { wrapperContained.joinTime = value; }
// public static long joinTime() { return net.minecraft.client.realms.dto.PlayerActivity.joinTime; }
// public static void joinTime(long value, ) { net.minecraft.client.realms.dto.PlayerActivity.joinTime = value; }

public long leaveTime() { return wrapperContained.leaveTime; }
public void leaveTime(long value) { wrapperContained.leaveTime = value; }
// public static long leaveTime() { return net.minecraft.client.realms.dto.PlayerActivity.leaveTime; }
// public static void leaveTime(long value, ) { net.minecraft.client.realms.dto.PlayerActivity.leaveTime = value; }

// public yarnwrap.client.realms.dto.PlayerActivity parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.PlayerActivity(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.PlayerActivity parse(com.google.gson.JsonObject json, ) { return new yarnwrap.client.realms.dto.PlayerActivity(net.minecraft.client.realms.dto.PlayerActivity.parse(json)); }

}