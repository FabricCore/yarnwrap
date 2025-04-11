package yarnwrap.client.realms.dto;
public class RealmsServer { public net.minecraft.client.realms.dto.RealmsServer wrapperContained; public RealmsServer(net.minecraft.client.realms.dto.RealmsServer wrapperContained) { this.wrapperContained = wrapperContained; }

public long id() { return wrapperContained.id; }
public void id(long value) { wrapperContained.id = value; }
public java.lang.String remoteSubscriptionId() { return wrapperContained.remoteSubscriptionId; }
public void remoteSubscriptionId(java.lang.String value) { wrapperContained.remoteSubscriptionId = value; }
public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
public java.lang.String description() { return wrapperContained.description; }
public void description(java.lang.String value) { wrapperContained.description = value; }
public Object state() { return wrapperContained.state; }
// public void state(Object value) { wrapperContained.state = value; }
public java.lang.String owner() { return wrapperContained.owner; }
public void owner(java.lang.String value) { wrapperContained.owner = value; }
public java.util.UUID ownerUUID() { return wrapperContained.ownerUUID; }
public void ownerUUID(java.util.UUID value) { wrapperContained.ownerUUID = value; }
public java.util.List players() { return wrapperContained.players; }
public void players(java.util.List value) { wrapperContained.players = value; }
public java.util.Map slots() { return wrapperContained.slots; }
public void slots(java.util.Map value) { wrapperContained.slots = value; }
public boolean expired() { return wrapperContained.expired; }
public void expired(boolean value) { wrapperContained.expired = value; }
public boolean expiredTrial() { return wrapperContained.expiredTrial; }
public void expiredTrial(boolean value) { wrapperContained.expiredTrial = value; }
public int daysLeft() { return wrapperContained.daysLeft; }
public void daysLeft(int value) { wrapperContained.daysLeft = value; }
public Object worldType() { return wrapperContained.worldType; }
// public void worldType(Object value) { wrapperContained.worldType = value; }
public int activeSlot() { return wrapperContained.activeSlot; }
public void activeSlot(int value) { wrapperContained.activeSlot = value; }
public java.lang.String minigameName() { return wrapperContained.minigameName; }
public void minigameName(java.lang.String value) { wrapperContained.minigameName = value; }
public int minigameId() { return wrapperContained.minigameId; }
public void minigameId(int value) { wrapperContained.minigameId = value; }
public java.lang.String minigameImage() { return wrapperContained.minigameImage; }
public void minigameImage(java.lang.String value) { wrapperContained.minigameImage = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public long parentWorldId() { return wrapperContained.parentWorldId; }
public void parentWorldId(long value) { wrapperContained.parentWorldId = value; }
public java.lang.String parentWorldName() { return wrapperContained.parentWorldName; }
public void parentWorldName(java.lang.String value) { wrapperContained.parentWorldName = value; }
public java.lang.String activeVersion() { return wrapperContained.activeVersion; }
public void activeVersion(java.lang.String value) { wrapperContained.activeVersion = value; }
public Object compatibility() { return wrapperContained.compatibility; }
// public void compatibility(Object value) { wrapperContained.compatibility = value; }
// public int NO_PARENT() { return wrapperContained.NO_PARENT; }
// public void NO_PARENT(int value) { wrapperContained.NO_PARENT = value; }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.String getDescription() { return wrapperContained.getDescription(); }
public java.lang.String getWorldName(int slotId) { return wrapperContained.getWorldName(slotId); }
// public java.util.List parseInvited(com.google.gson.JsonArray jsonArray) { return wrapperContained.parseInvited(jsonArray); }
public yarnwrap.client.realms.dto.RealmsServer parse(com.google.gson.JsonObject node) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.parse(node)); }
// public int method_25057(yarnwrap.client.realms.dto.PlayerInfo a,yarnwrap.client.realms.dto.PlayerInfo b) { return wrapperContained.method_25057(a.wrapperContained,b.wrapperContained); }
// public void sortInvited(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.sortInvited(server.wrapperContained); }
public void setName(java.lang.String name) { wrapperContained.setName(name); }
public java.util.Map cloneSlots(java.util.Map slots) { return wrapperContained.cloneSlots(slots); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public java.util.Map parseSlots(com.google.gson.JsonArray json) { return wrapperContained.parseSlots(json); }
public void setDescription(java.lang.String description) { wrapperContained.setDescription(description); }
public java.lang.String getMinigameName() { return wrapperContained.getMinigameName(); }
public yarnwrap.client.realms.dto.RealmsServer parse(java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.parse(json)); }
// public Object getState(java.lang.String state) { return wrapperContained.getState(state); }
// public java.util.Map getEmptySlots() { return wrapperContained.getEmptySlots(); }
// public Object getWorldType(java.lang.String worldType) { return wrapperContained.getWorldType(worldType); }
public yarnwrap.client.network.ServerInfo createServerInfo(java.lang.String address) { return new yarnwrap.client.network.ServerInfo(wrapperContained.createServerInfo(address)); }
public boolean isCompatible() { return wrapperContained.isCompatible(); }
public boolean needsUpgrade() { return wrapperContained.needsUpgrade(); }
public boolean needsDowngrade() { return wrapperContained.needsDowngrade(); }
public Object getCompatibility(java.lang.String compatibility) { return wrapperContained.getCompatibility(compatibility); }
public boolean hasParentWorld() { return wrapperContained.hasParentWorld(); }
public boolean isMinigame() { return wrapperContained.isMinigame(); }

}