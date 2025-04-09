package yarnwrap.client.realms.dto;
public class PlayerActivities { public net.minecraft.client.realms.dto.PlayerActivities wrapperContained; public PlayerActivities(net.minecraft.client.realms.dto.PlayerActivities wrapperContained) { this.wrapperContained = wrapperContained; }

public long periodInMillis() { return wrapperContained.periodInMillis; }
public java.util.List playerActivityDto() { return wrapperContained.playerActivityDto; }
public yarnwrap.client.realms.dto.PlayerActivities parse(java.lang.String json) { return new yarnwrap.client.realms.dto.PlayerActivities(wrapperContained.parse(json)); }

}