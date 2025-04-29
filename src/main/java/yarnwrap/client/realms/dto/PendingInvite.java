package yarnwrap.client.realms.dto;
public class PendingInvite { public net.minecraft.client.realms.dto.PendingInvite wrapperContained; public PendingInvite(net.minecraft.client.realms.dto.PendingInvite wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String invitationId() { return wrapperContained.invitationId; }
public void invitationId(java.lang.String value) { wrapperContained.invitationId = value; }
// public static java.lang.String invitationId() { return net.minecraft.client.realms.dto.PendingInvite.invitationId; }
// public static void invitationId(java.lang.String value, ) { net.minecraft.client.realms.dto.PendingInvite.invitationId = value; }

public java.lang.String worldName() { return wrapperContained.worldName; }
public void worldName(java.lang.String value) { wrapperContained.worldName = value; }
// public static java.lang.String worldName() { return net.minecraft.client.realms.dto.PendingInvite.worldName; }
// public static void worldName(java.lang.String value, ) { net.minecraft.client.realms.dto.PendingInvite.worldName = value; }

public java.lang.String worldOwnerName() { return wrapperContained.worldOwnerName; }
public void worldOwnerName(java.lang.String value) { wrapperContained.worldOwnerName = value; }
// public static java.lang.String worldOwnerName() { return net.minecraft.client.realms.dto.PendingInvite.worldOwnerName; }
// public static void worldOwnerName(java.lang.String value, ) { net.minecraft.client.realms.dto.PendingInvite.worldOwnerName = value; }

public java.util.UUID worldOwnerUuid() { return wrapperContained.worldOwnerUuid; }
public void worldOwnerUuid(java.util.UUID value) { wrapperContained.worldOwnerUuid = value; }
// public static java.util.UUID worldOwnerUuid() { return net.minecraft.client.realms.dto.PendingInvite.worldOwnerUuid; }
// public static void worldOwnerUuid(java.util.UUID value, ) { net.minecraft.client.realms.dto.PendingInvite.worldOwnerUuid = value; }

public java.util.Date date() { return wrapperContained.date; }
public void date(java.util.Date value) { wrapperContained.date = value; }
// public static java.util.Date date() { return net.minecraft.client.realms.dto.PendingInvite.date; }
// public static void date(java.util.Date value, ) { net.minecraft.client.realms.dto.PendingInvite.date = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.PendingInvite.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.PendingInvite.LOGGER = value; }

// public yarnwrap.client.realms.dto.PendingInvite parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.PendingInvite(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.PendingInvite parse(com.google.gson.JsonObject json, ) { return new yarnwrap.client.realms.dto.PendingInvite(net.minecraft.client.realms.dto.PendingInvite.parse(json)); }

}