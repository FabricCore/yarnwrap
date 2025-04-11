package yarnwrap.client.realms.dto;
public class PlayerActivity { public net.minecraft.client.realms.dto.PlayerActivity wrapperContained; public PlayerActivity(net.minecraft.client.realms.dto.PlayerActivity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String profileUuid() { return wrapperContained.profileUuid; }
public void profileUuid(java.lang.String value) { wrapperContained.profileUuid = value; }
public long joinTime() { return wrapperContained.joinTime; }
public void joinTime(long value) { wrapperContained.joinTime = value; }
public long leaveTime() { return wrapperContained.leaveTime; }
public void leaveTime(long value) { wrapperContained.leaveTime = value; }
public yarnwrap.client.realms.dto.PlayerActivity parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.PlayerActivity(wrapperContained.parse(json)); }

}