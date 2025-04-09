package yarnwrap.client.realms.dto;
public class PendingInvitesList { public net.minecraft.client.realms.dto.PendingInvitesList wrapperContained; public PendingInvitesList(net.minecraft.client.realms.dto.PendingInvitesList wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pendingInvites() { return wrapperContained.pendingInvites; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.client.realms.dto.PendingInvitesList parse(java.lang.String json) { return new yarnwrap.client.realms.dto.PendingInvitesList(wrapperContained.parse(json)); }

}