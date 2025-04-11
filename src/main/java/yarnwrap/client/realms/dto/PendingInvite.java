package yarnwrap.client.realms.dto;
public class PendingInvite { public net.minecraft.client.realms.dto.PendingInvite wrapperContained; public PendingInvite(net.minecraft.client.realms.dto.PendingInvite wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String invitationId() { return wrapperContained.invitationId; }
public void invitationId(java.lang.String value) { wrapperContained.invitationId = value; }
public java.lang.String worldName() { return wrapperContained.worldName; }
public void worldName(java.lang.String value) { wrapperContained.worldName = value; }
public java.lang.String worldOwnerName() { return wrapperContained.worldOwnerName; }
public void worldOwnerName(java.lang.String value) { wrapperContained.worldOwnerName = value; }
public java.util.UUID worldOwnerUuid() { return wrapperContained.worldOwnerUuid; }
public void worldOwnerUuid(java.util.UUID value) { wrapperContained.worldOwnerUuid = value; }
public java.util.Date date() { return wrapperContained.date; }
public void date(java.util.Date value) { wrapperContained.date = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.client.realms.dto.PendingInvite parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.PendingInvite(wrapperContained.parse(json)); }

}