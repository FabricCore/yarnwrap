package yarnwrap.entity.raid;
public class RaiderEntity { public net.minecraft.entity.raid.RaiderEntity wrapperContained; public RaiderEntity(net.minecraft.entity.raid.RaiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.raid.Raid raid() { return new yarnwrap.village.raid.Raid(wrapperContained.raid); }
// public void raid(yarnwrap.village.raid.Raid value) { wrapperContained.raid = value.wrapperContained; }
// public static yarnwrap.village.raid.Raid raid() { return new yarnwrap.village.raid.Raid(net.minecraft.entity.raid.RaiderEntity.raid); }
// public static void raid(yarnwrap.village.raid.Raid value, ) { net.minecraft.entity.raid.RaiderEntity.raid = value.wrapperContained; }

// public java.util.function.Predicate OBTAINABLE_OMINOUS_BANNER_PREDICATE() { return wrapperContained.OBTAINABLE_OMINOUS_BANNER_PREDICATE; }
// public void OBTAINABLE_OMINOUS_BANNER_PREDICATE(java.util.function.Predicate value) { wrapperContained.OBTAINABLE_OMINOUS_BANNER_PREDICATE = value; }
// public static java.util.function.Predicate OBTAINABLE_OMINOUS_BANNER_PREDICATE() { return net.minecraft.entity.raid.RaiderEntity.OBTAINABLE_OMINOUS_BANNER_PREDICATE; }
// public static void OBTAINABLE_OMINOUS_BANNER_PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.raid.RaiderEntity.OBTAINABLE_OMINOUS_BANNER_PREDICATE = value; }

// public int wave() { return wrapperContained.wave; }
// public void wave(int value) { wrapperContained.wave = value; }
// public static int wave() { return net.minecraft.entity.raid.RaiderEntity.wave; }
// public static void wave(int value, ) { net.minecraft.entity.raid.RaiderEntity.wave = value; }

// public boolean ableToJoinRaid() { return wrapperContained.ableToJoinRaid; }
// public void ableToJoinRaid(boolean value) { wrapperContained.ableToJoinRaid = value; }
// public static boolean ableToJoinRaid() { return net.minecraft.entity.raid.RaiderEntity.ableToJoinRaid; }
// public static void ableToJoinRaid(boolean value, ) { net.minecraft.entity.raid.RaiderEntity.ableToJoinRaid = value; }

// public int outOfRaidCounter() { return wrapperContained.outOfRaidCounter; }
// public void outOfRaidCounter(int value) { wrapperContained.outOfRaidCounter = value; }
// public static int outOfRaidCounter() { return net.minecraft.entity.raid.RaiderEntity.outOfRaidCounter; }
// public static void outOfRaidCounter(int value, ) { net.minecraft.entity.raid.RaiderEntity.outOfRaidCounter = value; }

// public yarnwrap.entity.data.TrackedData CELEBRATING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CELEBRATING); }
// public void CELEBRATING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CELEBRATING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CELEBRATING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.raid.RaiderEntity.CELEBRATING); }
// public static void CELEBRATING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.raid.RaiderEntity.CELEBRATING = value.wrapperContained; }

// public int DEFAULT_WAVE() { return wrapperContained.DEFAULT_WAVE; }
// public void DEFAULT_WAVE(int value) { wrapperContained.DEFAULT_WAVE = value; }
// public static int DEFAULT_WAVE() { return net.minecraft.entity.raid.RaiderEntity.DEFAULT_WAVE; }
// public static void DEFAULT_WAVE(int value, ) { net.minecraft.entity.raid.RaiderEntity.DEFAULT_WAVE = value; }

// public boolean DEFAULT_ABLE_TO_JOIN_RAID() { return wrapperContained.DEFAULT_ABLE_TO_JOIN_RAID; }
// public void DEFAULT_ABLE_TO_JOIN_RAID(boolean value) { wrapperContained.DEFAULT_ABLE_TO_JOIN_RAID = value; }
// public static boolean DEFAULT_ABLE_TO_JOIN_RAID() { return net.minecraft.entity.raid.RaiderEntity.DEFAULT_ABLE_TO_JOIN_RAID; }
// public static void DEFAULT_ABLE_TO_JOIN_RAID(boolean value, ) { net.minecraft.entity.raid.RaiderEntity.DEFAULT_ABLE_TO_JOIN_RAID = value; }

public void setRaid(yarnwrap.village.raid.Raid raid) { wrapperContained.setRaid(raid.wrapperContained); }
// public static void setRaid(yarnwrap.village.raid.Raid raid, ) { net.minecraft.entity.raid.RaiderEntity.setRaid(raid.wrapperContained); }
public void setWave(int wave) { wrapperContained.setWave(wave); }
// public static void setWave(int wave, ) { net.minecraft.entity.raid.RaiderEntity.setWave(wave); }
public yarnwrap.village.raid.Raid getRaid() { return new yarnwrap.village.raid.Raid(wrapperContained.getRaid()); }
// public static yarnwrap.village.raid.Raid getRaid() { return new yarnwrap.village.raid.Raid(net.minecraft.entity.raid.RaiderEntity.getRaid()); }
public void setAbleToJoinRaid(boolean ableToJoinRaid) { wrapperContained.setAbleToJoinRaid(ableToJoinRaid); }
// public static void setAbleToJoinRaid(boolean ableToJoinRaid, ) { net.minecraft.entity.raid.RaiderEntity.setAbleToJoinRaid(ableToJoinRaid); }
public boolean canJoinRaid() { return wrapperContained.canJoinRaid(); }
// public static boolean canJoinRaid() { return net.minecraft.entity.raid.RaiderEntity.canJoinRaid(); }
public boolean hasActiveRaid() { return wrapperContained.hasActiveRaid(); }
// public static boolean hasActiveRaid() { return net.minecraft.entity.raid.RaiderEntity.hasActiveRaid(); }
// public boolean method_16483(yarnwrap.entity.ItemEntity itemEntity) { return wrapperContained.method_16483(itemEntity.wrapperContained); }
// public static boolean method_16483(yarnwrap.entity.ItemEntity itemEntity, ) { return net.minecraft.entity.raid.RaiderEntity.method_16483(itemEntity.wrapperContained); }
public void addBonusForWave(yarnwrap.server.world.ServerWorld world,int wave,boolean unused) { wrapperContained.addBonusForWave(world.wrapperContained,wave,unused); }
// public static void addBonusForWave(yarnwrap.server.world.ServerWorld world,int wave,boolean unused, ) { net.minecraft.entity.raid.RaiderEntity.addBonusForWave(world.wrapperContained,wave,unused); }
public int getWave() { return wrapperContained.getWave(); }
// public static int getWave() { return net.minecraft.entity.raid.RaiderEntity.getWave(); }
public void setOutOfRaidCounter(int outOfRaidCounter) { wrapperContained.setOutOfRaidCounter(outOfRaidCounter); }
// public static void setOutOfRaidCounter(int outOfRaidCounter, ) { net.minecraft.entity.raid.RaiderEntity.setOutOfRaidCounter(outOfRaidCounter); }
public int getOutOfRaidCounter() { return wrapperContained.getOutOfRaidCounter(); }
// public static int getOutOfRaidCounter() { return net.minecraft.entity.raid.RaiderEntity.getOutOfRaidCounter(); }
public yarnwrap.sound.SoundEvent getCelebratingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getCelebratingSound()); }
// public static yarnwrap.sound.SoundEvent getCelebratingSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.raid.RaiderEntity.getCelebratingSound()); }
public boolean isCelebrating() { return wrapperContained.isCelebrating(); }
// public static boolean isCelebrating() { return net.minecraft.entity.raid.RaiderEntity.isCelebrating(); }
public void setCelebrating(boolean celebrating) { wrapperContained.setCelebrating(celebrating); }
// public static void setCelebrating(boolean celebrating, ) { net.minecraft.entity.raid.RaiderEntity.setCelebrating(celebrating); }
public boolean isCaptain() { return wrapperContained.isCaptain(); }
// public static boolean isCaptain() { return net.minecraft.entity.raid.RaiderEntity.isCaptain(); }
public boolean hasRaid() { return wrapperContained.hasRaid(); }
// public static boolean hasRaid() { return net.minecraft.entity.raid.RaiderEntity.hasRaid(); }
// public void method_67376(yarnwrap.storage.WriteView raidId) { wrapperContained.method_67376(raidId.wrapperContained); }
// public static void method_67376(yarnwrap.storage.WriteView raidId, ) { net.minecraft.entity.raid.RaiderEntity.method_67376(raidId.wrapperContained); }
// public void method_68278(yarnwrap.server.world.ServerWorld raidId) { wrapperContained.method_68278(raidId.wrapperContained); }
// public static void method_68278(yarnwrap.server.world.ServerWorld raidId, ) { net.minecraft.entity.raid.RaiderEntity.method_68278(raidId.wrapperContained); }

}