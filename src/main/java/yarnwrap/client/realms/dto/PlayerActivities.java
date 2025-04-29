package yarnwrap.client.realms.dto;
public class PlayerActivities { public net.minecraft.client.realms.dto.PlayerActivities wrapperContained; public PlayerActivities(net.minecraft.client.realms.dto.PlayerActivities wrapperContained) { this.wrapperContained = wrapperContained; }

public long periodInMillis() { return wrapperContained.periodInMillis; }
public void periodInMillis(long value) { wrapperContained.periodInMillis = value; }
// public static long periodInMillis() { return net.minecraft.client.realms.dto.PlayerActivities.periodInMillis; }
// public static void periodInMillis(long value, ) { net.minecraft.client.realms.dto.PlayerActivities.periodInMillis = value; }

public java.util.List playerActivityDto() { return wrapperContained.playerActivityDto; }
public void playerActivityDto(java.util.List value) { wrapperContained.playerActivityDto = value; }
// public static java.util.List playerActivityDto() { return net.minecraft.client.realms.dto.PlayerActivities.playerActivityDto; }
// public static void playerActivityDto(java.util.List value, ) { net.minecraft.client.realms.dto.PlayerActivities.playerActivityDto = value; }

// public yarnwrap.client.realms.dto.PlayerActivities parse(java.lang.String json) { return new yarnwrap.client.realms.dto.PlayerActivities(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.PlayerActivities parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.PlayerActivities(net.minecraft.client.realms.dto.PlayerActivities.parse(json)); }

}