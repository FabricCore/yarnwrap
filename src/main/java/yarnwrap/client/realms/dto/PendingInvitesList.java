package yarnwrap.client.realms.dto;
public class PendingInvitesList { public net.minecraft.client.realms.dto.PendingInvitesList wrapperContained; public PendingInvitesList(net.minecraft.client.realms.dto.PendingInvitesList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pendingInvites() { return wrapperContained.pendingInvites; }
public void pendingInvites(java.util.List value) { wrapperContained.pendingInvites = value; }
// public static java.util.List pendingInvites() { return net.minecraft.client.realms.dto.PendingInvitesList.pendingInvites; }
// public static void pendingInvites(java.util.List value, ) { net.minecraft.client.realms.dto.PendingInvitesList.pendingInvites = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.dto.PendingInvitesList.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.dto.PendingInvitesList.LOGGER = value; }

// public yarnwrap.client.realms.dto.PendingInvitesList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.PendingInvitesList(wrapperContained.parse(json)); }
// public static yarnwrap.client.realms.dto.PendingInvitesList parse(java.lang.String json, ) { return new yarnwrap.client.realms.dto.PendingInvitesList(net.minecraft.client.realms.dto.PendingInvitesList.parse(json)); }

}