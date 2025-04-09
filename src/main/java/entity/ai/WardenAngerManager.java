package yarnwrap.entity.ai;
public class WardenAngerManager { public net.minecraft.entity.ai.WardenAngerManager wrapperContained; public WardenAngerManager(net.minecraft.entity.ai.WardenAngerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxAnger() { return wrapperContained.maxAnger; }
// public int angerDecreasePerTick() { return wrapperContained.angerDecreasePerTick; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectsToAngerLevel() { return wrapperContained.suspectsToAngerLevel; }
// public java.util.ArrayList suspects() { return wrapperContained.suspects; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectUuidsToAngerLevel() { return wrapperContained.suspectUuidsToAngerLevel; }
// public int updateTimer() { return wrapperContained.updateTimer; }
// public com.mojang.serialization.Codec SUSPECT_CODEC() { return wrapperContained.SUSPECT_CODEC; }
// public java.util.function.Predicate suspectPredicate() { return wrapperContained.suspectPredicate; }
// public Object suspectComparator() { return wrapperContained.suspectComparator; }
// public int primeAnger() { return wrapperContained.primeAnger; }
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