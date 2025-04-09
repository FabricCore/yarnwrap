package yarnwrap.entity.raid;
public class RaiderEntity { public net.minecraft.entity.raid.RaiderEntity wrapperContained; public RaiderEntity(net.minecraft.entity.raid.RaiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.raid.Raid raid() { return new yarnwrap.village.raid.Raid(wrapperContained.raid); }
// public java.util.function.Predicate OBTAINABLE_OMINOUS_BANNER_PREDICATE() { return wrapperContained.OBTAINABLE_OMINOUS_BANNER_PREDICATE; }
// public int wave() { return wrapperContained.wave; }
// public boolean ableToJoinRaid() { return wrapperContained.ableToJoinRaid; }
// public int outOfRaidCounter() { return wrapperContained.outOfRaidCounter; }
// public yarnwrap.entity.data.TrackedData CELEBRATING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CELEBRATING); }
public void setRaid(yarnwrap.village.raid.Raid raid) { wrapperContained.setRaid(raid.wrapperContained); }
public void setWave(int wave) { wrapperContained.setWave(wave); }
public yarnwrap.village.raid.Raid getRaid() { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid()); }
public void setAbleToJoinRaid(boolean ableToJoinRaid) { wrapperContained.setAbleToJoinRaid(ableToJoinRaid); }
public boolean canJoinRaid() { return wrapperContained.canJoinRaid(); }
public boolean hasActiveRaid() { return wrapperContained.hasActiveRaid(); }
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