package yarnwrap.advancement;
public class PlayerAdvancementTracker { public net.minecraft.advancement.PlayerAdvancementTracker wrapperContained; public PlayerAdvancementTracker(net.minecraft.advancement.PlayerAdvancementTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry currentDisplayTab() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.currentDisplayTab); }
// public java.util.Set progressUpdates() { return wrapperContained.progressUpdates; }
// public java.util.Set visibleAdvancements() { return wrapperContained.visibleAdvancements; }
// public yarnwrap.server.network.ServerPlayerEntity owner() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.owner); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public boolean dirty() { return wrapperContained.dirty; }
// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public java.nio.file.Path filePath() { return wrapperContained.filePath; }
// public java.util.Map progress() { return wrapperContained.progress; }
// public java.util.Set updatedRoots() { return wrapperContained.updatedRoots; }
// public yarnwrap.advancement.AdvancementManager advancementManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.advancementManager); }
// public com.mojang.serialization.Codec progressMapCodec() { return wrapperContained.progressMapCodec; }
// public void rewardEmptyAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.rewardEmptyAdvancements(advancementLoader.wrapperContained); }
// public void load(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.load(advancementLoader.wrapperContained); }
// public void beginTracking(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.beginTracking(advancement.wrapperContained); }
public void setOwner(yarnwrap.server.network.ServerPlayerEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
public void sendUpdate(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendUpdate(player.wrapperContained); }
public boolean grantCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName) { return wrapperContained.grantCriterion(advancement.wrapperContained,criterionName); }
// public void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.endTrackingCompleted(advancement.wrapperContained); }
public void clearCriteria() { wrapperContained.clearCriteria(); }
public yarnwrap.advancement.AdvancementProgress getProgress(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.getProgress(advancement.wrapperContained)); }
public boolean revokeCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName) { return wrapperContained.revokeCriterion(advancement.wrapperContained,criterionName); }
// public void initProgress(yarnwrap.advancement.AdvancementEntry advancement,yarnwrap.advancement.AdvancementProgress progress) { wrapperContained.initProgress(advancement.wrapperContained,progress.wrapperContained); }
public void reload(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.reload(advancementLoader.wrapperContained); }
public void setDisplayTab(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.setDisplayTab(advancement.wrapperContained); }
// public void beginTrackingAllAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.beginTrackingAllAdvancements(advancementLoader.wrapperContained); }
public void save() { wrapperContained.save(); }
// public void calculateDisplay(yarnwrap.advancement.PlacedAdvancement root,java.util.Set added,java.util.Set removed) { wrapperContained.calculateDisplay(root.wrapperContained,added,removed); }
// public void onStatusUpdate(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.onStatusUpdate(advancement.wrapperContained); }
// public void beginTracking(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion) { wrapperContained.beginTracking(advancement.wrapperContained,id,criterion.wrapperContained); }
// public void loadProgressMap(yarnwrap.server.ServerAdvancementLoader loader,Object progressMap) { wrapperContained.loadProgressMap(loader.wrapperContained,progressMap); }
// public void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion) { wrapperContained.endTrackingCompleted(advancement.wrapperContained,id,criterion.wrapperContained); }
// public Object createProgressMap() { return wrapperContained.createProgressMap(); }

}