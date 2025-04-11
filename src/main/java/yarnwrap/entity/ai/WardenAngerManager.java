package yarnwrap.entity.ai;
public class WardenAngerManager { public net.minecraft.entity.ai.WardenAngerManager wrapperContained; public WardenAngerManager(net.minecraft.entity.ai.WardenAngerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxAnger() { return wrapperContained.maxAnger; }
// public void maxAnger(int value) { wrapperContained.maxAnger = value; }
// public int angerDecreasePerTick() { return wrapperContained.angerDecreasePerTick; }
// public void angerDecreasePerTick(int value) { wrapperContained.angerDecreasePerTick = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectsToAngerLevel() { return wrapperContained.suspectsToAngerLevel; }
// public void suspectsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.suspectsToAngerLevel = value; }
// public java.util.ArrayList suspects() { return wrapperContained.suspects; }
// public void suspects(java.util.ArrayList value) { wrapperContained.suspects = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectUuidsToAngerLevel() { return wrapperContained.suspectUuidsToAngerLevel; }
// public void suspectUuidsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.suspectUuidsToAngerLevel = value; }
// public int updateTimer() { return wrapperContained.updateTimer; }
// public void updateTimer(int value) { wrapperContained.updateTimer = value; }
// public com.mojang.serialization.Codec SUSPECT_CODEC() { return wrapperContained.SUSPECT_CODEC; }
// public void SUSPECT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SUSPECT_CODEC = value; }
// public java.util.function.Predicate suspectPredicate() { return wrapperContained.suspectPredicate; }
// public void suspectPredicate(java.util.function.Predicate value) { wrapperContained.suspectPredicate = value; }
// public Object suspectComparator() { return wrapperContained.suspectComparator; }
// // public void suspectComparator(Object value) { wrapperContained.suspectComparator = value; }
// public int primeAnger() { return wrapperContained.primeAnger; }
// public void primeAnger(int value) { wrapperContained.primeAnger = value; }
public void tick(yarnwrap.server.world.ServerWorld world,java.util.function.Predicate suspectPredicate) { wrapperContained.tick(world.wrapperContained,suspectPredicate); }
public void removeSuspect(yarnwrap.entity.Entity entity) { wrapperContained.removeSuspect(entity.wrapperContained); }
public int increaseAngerAt(yarnwrap.entity.Entity entity,int amount) { return wrapperContained.increaseAngerAt(entity.wrapperContained,amount); }
public java.util.Optional getPrimeSuspect() { return wrapperContained.getPrimeSuspect(); }
public int getAngerFor(yarnwrap.entity.Entity entity) { return wrapperContained.getAngerFor(entity.wrapperContained); }
// public yarnwrap.entity.Entity getPrimeSuspectInternal() { return new yarnwrap.entity.Entity(wrapperContained.getPrimeSuspectInternal()); }
// public void updateSuspectsMap(yarnwrap.server.world.ServerWorld world) { wrapperContained.updateSuspectsMap(world.wrapperContained); }
// public java.util.List getSuspects() { return wrapperContained.getSuspects(); }
public com.mojang.serialization.Codec createCodec(java.util.function.Predicate suspectPredicate) { return wrapperContained.createCodec(suspectPredicate); }
// public void updatePrimeAnger() { wrapperContained.updatePrimeAnger(); }

}