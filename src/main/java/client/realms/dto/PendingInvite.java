package yarnwrap.client.realms.dto;
public class PendingInvite { public net.minecraft.client.realms.dto.PendingInvite wrapperContained; public PendingInvite(net.minecraft.client.realms.dto.PendingInvite wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String invitationId() { return wrapperContained.invitationId; }
public java.lang.String worldName() { return wrapperContained.worldName; }
public java.lang.String worldOwnerName() { return wrapperContained.worldOwnerName; }
public java.util.UUID worldOwnerUuid() { return wrapperContained.worldOwnerUuid; }
public java.util.Date date() { return wrapperContained.date; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.PendingInvite parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.PendingInvite(wrapperContained.parse(json)); }

}