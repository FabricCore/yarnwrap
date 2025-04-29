package yarnwrap.advancement;
public class PlayerAdvancementTracker { public net.minecraft.advancement.PlayerAdvancementTracker wrapperContained; public PlayerAdvancementTracker(net.minecraft.advancement.PlayerAdvancementTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry currentDisplayTab() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.currentDisplayTab); }
// public void currentDisplayTab(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.currentDisplayTab = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementEntry currentDisplayTab() { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.advancement.PlayerAdvancementTracker.currentDisplayTab); }
// public static void currentDisplayTab(yarnwrap.advancement.AdvancementEntry value, ) { net.minecraft.advancement.PlayerAdvancementTracker.currentDisplayTab = value.wrapperContained; }

// public java.util.Set progressUpdates() { return wrapperContained.progressUpdates; }
// public void progressUpdates(java.util.Set value) { wrapperContained.progressUpdates = value; }
// public static java.util.Set progressUpdates() { return net.minecraft.advancement.PlayerAdvancementTracker.progressUpdates; }
// public static void progressUpdates(java.util.Set value, ) { net.minecraft.advancement.PlayerAdvancementTracker.progressUpdates = value; }

// public java.util.Set visibleAdvancements() { return wrapperContained.visibleAdvancements; }
// public void visibleAdvancements(java.util.Set value) { wrapperContained.visibleAdvancements = value; }
// public static java.util.Set visibleAdvancements() { return net.minecraft.advancement.PlayerAdvancementTracker.visibleAdvancements; }
// public static void visibleAdvancements(java.util.Set value, ) { net.minecraft.advancement.PlayerAdvancementTracker.visibleAdvancements = value; }

// public yarnwrap.server.network.ServerPlayerEntity owner() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.owner); }
// public void owner(yarnwrap.server.network.ServerPlayerEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.server.network.ServerPlayerEntity owner() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.advancement.PlayerAdvancementTracker.owner); }
// public static void owner(yarnwrap.server.network.ServerPlayerEntity value, ) { net.minecraft.advancement.PlayerAdvancementTracker.owner = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.advancement.PlayerAdvancementTracker.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.advancement.PlayerAdvancementTracker.LOGGER = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.advancement.PlayerAdvancementTracker.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.advancement.PlayerAdvancementTracker.GSON = value; }

// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public static boolean dirty() { return net.minecraft.advancement.PlayerAdvancementTracker.dirty; }
// public static void dirty(boolean value, ) { net.minecraft.advancement.PlayerAdvancementTracker.dirty = value; }

// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public static yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(net.minecraft.advancement.PlayerAdvancementTracker.playerManager); }
// public static void playerManager(yarnwrap.server.PlayerManager value, ) { net.minecraft.advancement.PlayerAdvancementTracker.playerManager = value.wrapperContained; }

// public java.nio.file.Path filePath() { return wrapperContained.filePath; }
// public void filePath(java.nio.file.Path value) { wrapperContained.filePath = value; }
// public static java.nio.file.Path filePath() { return net.minecraft.advancement.PlayerAdvancementTracker.filePath; }
// public static void filePath(java.nio.file.Path value, ) { net.minecraft.advancement.PlayerAdvancementTracker.filePath = value; }

// public java.util.Map progress() { return wrapperContained.progress; }
// public void progress(java.util.Map value) { wrapperContained.progress = value; }
// public static java.util.Map progress() { return net.minecraft.advancement.PlayerAdvancementTracker.progress; }
// public static void progress(java.util.Map value, ) { net.minecraft.advancement.PlayerAdvancementTracker.progress = value; }

// public java.util.Set updatedRoots() { return wrapperContained.updatedRoots; }
// public void updatedRoots(java.util.Set value) { wrapperContained.updatedRoots = value; }
// public static java.util.Set updatedRoots() { return net.minecraft.advancement.PlayerAdvancementTracker.updatedRoots; }
// public static void updatedRoots(java.util.Set value, ) { net.minecraft.advancement.PlayerAdvancementTracker.updatedRoots = value; }

// public yarnwrap.advancement.AdvancementManager advancementManager() { return new yarnwrap.advancement.AdvancementManager(wrapperContained.advancementManager); }
// public void advancementManager(yarnwrap.advancement.AdvancementManager value) { wrapperContained.advancementManager = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementManager advancementManager() { return new yarnwrap.advancement.AdvancementManager(net.minecraft.advancement.PlayerAdvancementTracker.advancementManager); }
// public static void advancementManager(yarnwrap.advancement.AdvancementManager value, ) { net.minecraft.advancement.PlayerAdvancementTracker.advancementManager = value.wrapperContained; }

// public com.mojang.serialization.Codec progressMapCodec() { return wrapperContained.progressMapCodec; }
// public void progressMapCodec(com.mojang.serialization.Codec value) { wrapperContained.progressMapCodec = value; }
// public static com.mojang.serialization.Codec progressMapCodec() { return net.minecraft.advancement.PlayerAdvancementTracker.progressMapCodec; }
// public static void progressMapCodec(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.PlayerAdvancementTracker.progressMapCodec = value; }

public PlayerAdvancementTracker(com.mojang.datafixers.DataFixer dataFixer,yarnwrap.server.PlayerManager playerManager,yarnwrap.server.ServerAdvancementLoader advancementLoader,java.nio.file.Path filePath,yarnwrap.server.network.ServerPlayerEntity owner) { this.wrapperContained = new net.minecraft.advancement.PlayerAdvancementTracker(dataFixer,playerManager.wrapperContained,advancementLoader.wrapperContained,filePath,owner.wrapperContained); }
// public void rewardEmptyAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.rewardEmptyAdvancements(advancementLoader.wrapperContained); }
// public static void rewardEmptyAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader, ) { net.minecraft.advancement.PlayerAdvancementTracker.rewardEmptyAdvancements(advancementLoader.wrapperContained); }
// public void load(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.load(advancementLoader.wrapperContained); }
// public static void load(yarnwrap.server.ServerAdvancementLoader advancementLoader, ) { net.minecraft.advancement.PlayerAdvancementTracker.load(advancementLoader.wrapperContained); }
// public void beginTracking(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.beginTracking(advancement.wrapperContained); }
// public static void beginTracking(yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.advancement.PlayerAdvancementTracker.beginTracking(advancement.wrapperContained); }
public void setOwner(yarnwrap.server.network.ServerPlayerEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
// public static void setOwner(yarnwrap.server.network.ServerPlayerEntity owner, ) { net.minecraft.advancement.PlayerAdvancementTracker.setOwner(owner.wrapperContained); }
public void sendUpdate(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendUpdate(player.wrapperContained); }
// public static void sendUpdate(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.advancement.PlayerAdvancementTracker.sendUpdate(player.wrapperContained); }
public boolean grantCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName) { return wrapperContained.grantCriterion(advancement.wrapperContained,criterionName); }
// public static boolean grantCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName, ) { return net.minecraft.advancement.PlayerAdvancementTracker.grantCriterion(advancement.wrapperContained,criterionName); }
// public void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.endTrackingCompleted(advancement.wrapperContained); }
// public static void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.advancement.PlayerAdvancementTracker.endTrackingCompleted(advancement.wrapperContained); }
public void clearCriteria() { wrapperContained.clearCriteria(); }
// public static void clearCriteria() { net.minecraft.advancement.PlayerAdvancementTracker.clearCriteria(); }
public yarnwrap.advancement.AdvancementProgress getProgress(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.getProgress(advancement.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementProgress getProgress(yarnwrap.advancement.AdvancementEntry advancement, ) { return new yarnwrap.advancement.AdvancementProgress(net.minecraft.advancement.PlayerAdvancementTracker.getProgress(advancement.wrapperContained)); }
public boolean revokeCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName) { return wrapperContained.revokeCriterion(advancement.wrapperContained,criterionName); }
// public static boolean revokeCriterion(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterionName, ) { return net.minecraft.advancement.PlayerAdvancementTracker.revokeCriterion(advancement.wrapperContained,criterionName); }
// public void initProgress(yarnwrap.advancement.AdvancementEntry advancement,yarnwrap.advancement.AdvancementProgress progress) { wrapperContained.initProgress(advancement.wrapperContained,progress.wrapperContained); }
// public static void initProgress(yarnwrap.advancement.AdvancementEntry advancement,yarnwrap.advancement.AdvancementProgress progress, ) { net.minecraft.advancement.PlayerAdvancementTracker.initProgress(advancement.wrapperContained,progress.wrapperContained); }
public void reload(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.reload(advancementLoader.wrapperContained); }
// public static void reload(yarnwrap.server.ServerAdvancementLoader advancementLoader, ) { net.minecraft.advancement.PlayerAdvancementTracker.reload(advancementLoader.wrapperContained); }
public void setDisplayTab(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.setDisplayTab(advancement.wrapperContained); }
// public static void setDisplayTab(yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.advancement.PlayerAdvancementTracker.setDisplayTab(advancement.wrapperContained); }
// public void beginTrackingAllAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader) { wrapperContained.beginTrackingAllAdvancements(advancementLoader.wrapperContained); }
// public static void beginTrackingAllAdvancements(yarnwrap.server.ServerAdvancementLoader advancementLoader, ) { net.minecraft.advancement.PlayerAdvancementTracker.beginTrackingAllAdvancements(advancementLoader.wrapperContained); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.advancement.PlayerAdvancementTracker.save(); }
// public void calculateDisplay(yarnwrap.advancement.PlacedAdvancement root,java.util.Set added,java.util.Set removed) { wrapperContained.calculateDisplay(root.wrapperContained,added,removed); }
// public static void calculateDisplay(yarnwrap.advancement.PlacedAdvancement root,java.util.Set added,java.util.Set removed, ) { net.minecraft.advancement.PlayerAdvancementTracker.calculateDisplay(root.wrapperContained,added,removed); }
// public void method_48027(java.util.Set advancement,java.util.Set displayed) { wrapperContained.method_48027(advancement,displayed); }
// public static void method_48027(java.util.Set advancement,java.util.Set displayed, ) { net.minecraft.advancement.PlayerAdvancementTracker.method_48027(advancement,displayed); }
// public void onStatusUpdate(yarnwrap.advancement.AdvancementEntry advancement) { wrapperContained.onStatusUpdate(advancement.wrapperContained); }
// public static void onStatusUpdate(yarnwrap.advancement.AdvancementEntry advancement, ) { net.minecraft.advancement.PlayerAdvancementTracker.onStatusUpdate(advancement.wrapperContained); }
// public boolean method_48029(yarnwrap.advancement.PlacedAdvancement advancement) { return wrapperContained.method_48029(advancement.wrapperContained); }
// public static boolean method_48029(yarnwrap.advancement.PlacedAdvancement advancement, ) { return net.minecraft.advancement.PlayerAdvancementTracker.method_48029(advancement.wrapperContained); }
// public void method_53637(yarnwrap.advancement.AdvancementEntry display) { wrapperContained.method_53637(display.wrapperContained); }
// public static void method_53637(yarnwrap.advancement.AdvancementEntry display, ) { net.minecraft.advancement.PlayerAdvancementTracker.method_53637(display.wrapperContained); }
// public void beginTracking(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion) { wrapperContained.beginTracking(advancement.wrapperContained,id,criterion.wrapperContained); }
// public static void beginTracking(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion, ) { net.minecraft.advancement.PlayerAdvancementTracker.beginTracking(advancement.wrapperContained,id,criterion.wrapperContained); }
// public void method_53639(yarnwrap.server.ServerAdvancementLoader id,yarnwrap.util.Identifier progress) { wrapperContained.method_53639(id.wrapperContained,progress.wrapperContained); }
// public static void method_53639(yarnwrap.server.ServerAdvancementLoader id,yarnwrap.util.Identifier progress, ) { net.minecraft.advancement.PlayerAdvancementTracker.method_53639(id.wrapperContained,progress.wrapperContained); }
// public void loadProgressMap(yarnwrap.server.ServerAdvancementLoader loader,Object progressMap) { wrapperContained.loadProgressMap(loader.wrapperContained,progressMap); }
// public static void loadProgressMap(yarnwrap.server.ServerAdvancementLoader loader,Object progressMap, ) { net.minecraft.advancement.PlayerAdvancementTracker.loadProgressMap(loader.wrapperContained,progressMap); }
// public void method_53641(java.util.Map entry,yarnwrap.advancement.AdvancementEntry progress) { wrapperContained.method_53641(entry,progress.wrapperContained); }
// public static void method_53641(java.util.Map entry,yarnwrap.advancement.AdvancementEntry progress, ) { net.minecraft.advancement.PlayerAdvancementTracker.method_53641(entry,progress.wrapperContained); }
// public void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion) { wrapperContained.endTrackingCompleted(advancement.wrapperContained,id,criterion.wrapperContained); }
// public static void endTrackingCompleted(yarnwrap.advancement.AdvancementEntry advancement,java.lang.String id,yarnwrap.advancement.AdvancementCriterion criterion, ) { net.minecraft.advancement.PlayerAdvancementTracker.endTrackingCompleted(advancement.wrapperContained,id,criterion.wrapperContained); }
// public Object createProgressMap() { return wrapperContained.createProgressMap(); }
// public static Object createProgressMap() { return net.minecraft.advancement.PlayerAdvancementTracker.createProgressMap(); }

}