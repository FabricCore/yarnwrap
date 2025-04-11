package yarnwrap.entity.raid;
public class RaiderEntity { public net.minecraft.entity.raid.RaiderEntity wrapperContained; public RaiderEntity(net.minecraft.entity.raid.RaiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.raid.Raid raid() { return new yarnwrap.village.raid.Raid(wrapperContained.raid); }
// public void raid(yarnwrap.village.raid.Raid value) { wrapperContained.raid = value.wrapperContained; }
// public java.util.function.Predicate OBTAINABLE_OMINOUS_BANNER_PREDICATE() { return wrapperContained.OBTAINABLE_OMINOUS_BANNER_PREDICATE; }
// public void OBTAINABLE_OMINOUS_BANNER_PREDICATE(java.util.function.Predicate value) { wrapperContained.OBTAINABLE_OMINOUS_BANNER_PREDICATE = value; }
// public int wave() { return wrapperContained.wave; }
// public void wave(int value) { wrapperContained.wave = value; }
// public boolean ableToJoinRaid() { return wrapperContained.ableToJoinRaid; }
// public void ableToJoinRaid(boolean value) { wrapperContained.ableToJoinRaid = value; }
// public int outOfRaidCounter() { return wrapperContained.outOfRaidCounter; }
// public void outOfRaidCounter(int value) { wrapperContained.outOfRaidCounter = value; }
// public yarnwrap.entity.data.TrackedData CELEBRATING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CELEBRATING); }
// public void CELEBRATING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CELEBRATING = value.wrapperContained; }
public void setRaid(yarnwrap.village.raid.Raid raid) { wrapperContained.setRaid(raid.wrapperContained); }
public void setWave(int wave) { wrapperContained.setWave(wave); }
public yarnwrap.village.raid.Raid getRaid() { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid()); }
public void setAbleToJoinRaid(boolean ableToJoinRaid) { wrapperContained.setAbleToJoinRaid(ableToJoinRaid); }
public boolean canJoinRaid() { return wrapperContained.canJoinRaid(); }
public boolean hasActiveRaid() { return wrapperContained.hasActiveRaid(); }
// public boolean method_16483(yarnwrap.entity.ItemEntity itemEntity) { return wrapperContained.method_16483(itemEntity.wrapperContained); }
public void addBonusForWave(yarnwrap.server.world.ServerWorld world,int wave,boolean unused) { wrapperContained.addBonusForWave(world.wrapperContained,wave,unused); }
public int getWave() { return wrapperContained.getWave(); }
public void setOutOfRaidCounter(int outOfRaidCounter) { wrapperContained.setOutOfRaidCounter(outOfRaidCounter); }
public int getOutOfRaidCounter() { return wrapperContained.getOutOfRaidCounter(); }
public yarnwrap.sound.SoundEvent getCelebratingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getCelebratingSound()); }
public boolean isCelebrating() { return wrapperContained.isCelebrating(); }
public void setCelebrating(boolean celebrating) { wrapperContained.setCelebrating(celebrating); }
public boolean isCaptain() { return wrapperContained.isCaptain(); }
public boolean hasRaid() { return wrapperContained.hasRaid(); }

}