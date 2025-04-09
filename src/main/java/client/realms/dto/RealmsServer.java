package yarnwrap.client.realms.dto;
public class RealmsServer { public net.minecraft.client.realms.dto.RealmsServer wrapperContained; public RealmsServer(net.minecraft.client.realms.dto.RealmsServer wrapperContained) { this.wrapperContained = wrapperContained; }

public long id() { return wrapperContained.id; }
public java.lang.String remoteSubscriptionId() { return wrapperContained.remoteSubscriptionId; }
public java.lang.String name() { return wrapperContained.name; }
public java.lang.String description() { return wrapperContained.description; }
public Object state() { return wrapperContained.state; }
public java.lang.String owner() { return wrapperContained.owner; }
public java.util.UUID ownerUUID() { return wrapperContained.ownerUUID; }
public java.util.List players() { return wrapperContained.players; }
public java.util.Map slots() { return wrapperContained.slots; }
public boolean expired() { return wrapperContained.expired; }
public boolean expiredTrial() { return wrapperContained.expiredTrial; }
public int daysLeft() { return wrapperContained.daysLeft; }
public Object worldType() { return wrapperContained.worldType; }
public int activeSlot() { return wrapperContained.activeSlot; }
public java.lang.String minigameName() { return wrapperContained.minigameName; }
public int minigameId() { return wrapperContained.minigameId; }
public java.lang.String minigameImage() { return wrapperContained.minigameImage; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public long parentWorldId() { return wrapperContained.parentWorldId; }
public java.lang.String parentWorldName() { return wrapperContained.parentWorldName; }
public java.lang.String activeVersion() { return wrapperContained.activeVersion; }
public Object compatibility() { return wrapperContained.compatibility; }
// public int NO_PARENT() { return wrapperContained.NO_PARENT; }
public java.lang.String getDescription() { return wrapperContained.getDescription(); }
public java.lang.String getWorldName(int slotId) { return wrapperContained.getWorldName(slotId); }
// public java.util.List parseInvited(com.google.gson.JsonArray jsonArray) { return wrapperContained.parseInvited(jsonArray); }
public yarnwrap.client.realms.dto.RealmsServer parse(com.google.gson.JsonObject node) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.parse(node)); }
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