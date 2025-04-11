package yarnwrap.block.vault;
public class VaultServerData { public net.minecraft.block.vault.VaultServerData wrapperContained; public VaultServerData(net.minecraft.block.vault.VaultServerData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String SERVER_DATA_KEY() { return wrapperContained.SERVER_DATA_KEY; }
// public void SERVER_DATA_KEY(java.lang.String value) { wrapperContained.SERVER_DATA_KEY = value; }
// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
// public int MAX_STORED_REWARDED_PLAYERS() { return wrapperContained.MAX_STORED_REWARDED_PLAYERS; }
// public void MAX_STORED_REWARDED_PLAYERS(int value) { wrapperContained.MAX_STORED_REWARDED_PLAYERS = value; }
// public java.util.Set rewardedPlayers() { return wrapperContained.rewardedPlayers; }
// public void rewardedPlayers(java.util.Set value) { wrapperContained.rewardedPlayers = value; }
// public long stateUpdatingResumesAt() { return wrapperContained.stateUpdatingResumesAt; }
// public void stateUpdatingResumesAt(long value) { wrapperContained.stateUpdatingResumesAt = value; }
// public java.util.List itemsToEject() { return wrapperContained.itemsToEject; }
// public void itemsToEject(java.util.List value) { wrapperContained.itemsToEject = value; }
// public long lastFailedUnlockTime() { return wrapperContained.lastFailedUnlockTime; }
// public void lastFailedUnlockTime(long value) { wrapperContained.lastFailedUnlockTime = value; }
// public int totalEjectionsNeeded() { return wrapperContained.totalEjectionsNeeded; }
// public void totalEjectionsNeeded(int value) { wrapperContained.totalEjectionsNeeded = value; }
// public long getLastFailedUnlockTime() { return wrapperContained.getLastFailedUnlockTime(); }
// public void setLastFailedUnlockTime(long lastFailedUnlockTime) { wrapperContained.setLastFailedUnlockTime(lastFailedUnlockTime); }
// public boolean hasRewardedPlayer(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.hasRewardedPlayer(player.wrapperContained); }
// public void copyFrom(yarnwrap.block.vault.VaultServerData data) { wrapperContained.copyFrom(data.wrapperContained); }
// public void setItemsToEject(java.util.List itemsToEject) { wrapperContained.setItemsToEject(itemsToEject); }
// public java.util.Set getRewardedPlayers() { return wrapperContained.getRewardedPlayers(); }
// public void setStateUpdatingResumeTime(long stateUpdatingResumesAt) { wrapperContained.setStateUpdatingResumeTime(stateUpdatingResumesAt); }
public void markPlayerAsRewarded(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.markPlayerAsRewarded(player.wrapperContained); }
// public long getStateUpdatingResumeTime() { return wrapperContained.getStateUpdatingResumeTime(); }
// public java.util.List getItemsToEject() { return wrapperContained.getItemsToEject(); }
// public void finishEjecting() { wrapperContained.finishEjecting(); }
// public yarnwrap.item.ItemStack getItemToDisplay() { return new yarnwrap.item.ItemStack(wrapperContained.getItemToDisplay()); }
// public yarnwrap.item.ItemStack getItemToEject() { return new yarnwrap.item.ItemStack(wrapperContained.getItemToEject()); }
public float getEjectSoundPitchModifier() { return wrapperContained.getEjectSoundPitchModifier(); }
// public void markDirty() { wrapperContained.markDirty(); }

}