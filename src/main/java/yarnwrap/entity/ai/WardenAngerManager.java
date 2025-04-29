package yarnwrap.entity.ai;
public class WardenAngerManager { public net.minecraft.entity.ai.WardenAngerManager wrapperContained; public WardenAngerManager(net.minecraft.entity.ai.WardenAngerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxAnger() { return wrapperContained.maxAnger; }
// public void maxAnger(int value) { wrapperContained.maxAnger = value; }
// public static int maxAnger() { return net.minecraft.entity.ai.WardenAngerManager.maxAnger; }
// public static void maxAnger(int value, ) { net.minecraft.entity.ai.WardenAngerManager.maxAnger = value; }

// public int angerDecreasePerTick() { return wrapperContained.angerDecreasePerTick; }
// public void angerDecreasePerTick(int value) { wrapperContained.angerDecreasePerTick = value; }
// public static int angerDecreasePerTick() { return net.minecraft.entity.ai.WardenAngerManager.angerDecreasePerTick; }
// public static void angerDecreasePerTick(int value, ) { net.minecraft.entity.ai.WardenAngerManager.angerDecreasePerTick = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectsToAngerLevel() { return wrapperContained.suspectsToAngerLevel; }
// public void suspectsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.suspectsToAngerLevel = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap suspectsToAngerLevel() { return net.minecraft.entity.ai.WardenAngerManager.suspectsToAngerLevel; }
// public static void suspectsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.entity.ai.WardenAngerManager.suspectsToAngerLevel = value; }

// public java.util.ArrayList suspects() { return wrapperContained.suspects; }
// public void suspects(java.util.ArrayList value) { wrapperContained.suspects = value; }
// public static java.util.ArrayList suspects() { return net.minecraft.entity.ai.WardenAngerManager.suspects; }
// public static void suspects(java.util.ArrayList value, ) { net.minecraft.entity.ai.WardenAngerManager.suspects = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap suspectUuidsToAngerLevel() { return wrapperContained.suspectUuidsToAngerLevel; }
// public void suspectUuidsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.suspectUuidsToAngerLevel = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap suspectUuidsToAngerLevel() { return net.minecraft.entity.ai.WardenAngerManager.suspectUuidsToAngerLevel; }
// public static void suspectUuidsToAngerLevel(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.entity.ai.WardenAngerManager.suspectUuidsToAngerLevel = value; }

// public int updateTimer() { return wrapperContained.updateTimer; }
// public void updateTimer(int value) { wrapperContained.updateTimer = value; }
// public static int updateTimer() { return net.minecraft.entity.ai.WardenAngerManager.updateTimer; }
// public static void updateTimer(int value, ) { net.minecraft.entity.ai.WardenAngerManager.updateTimer = value; }

// public com.mojang.serialization.Codec SUSPECT_CODEC() { return wrapperContained.SUSPECT_CODEC; }
// public void SUSPECT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SUSPECT_CODEC = value; }
// public static com.mojang.serialization.Codec SUSPECT_CODEC() { return net.minecraft.entity.ai.WardenAngerManager.SUSPECT_CODEC; }
// public static void SUSPECT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.ai.WardenAngerManager.SUSPECT_CODEC = value; }

// public java.util.function.Predicate suspectPredicate() { return wrapperContained.suspectPredicate; }
// public void suspectPredicate(java.util.function.Predicate value) { wrapperContained.suspectPredicate = value; }
// public static java.util.function.Predicate suspectPredicate() { return net.minecraft.entity.ai.WardenAngerManager.suspectPredicate; }
// public static void suspectPredicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.WardenAngerManager.suspectPredicate = value; }

// public Object suspectComparator() { return wrapperContained.suspectComparator; }
// // public void suspectComparator(Object value) { wrapperContained.suspectComparator = value; }
// // public static Object suspectComparator() { return net.minecraft.entity.ai.WardenAngerManager.suspectComparator; }
// // public static void suspectComparator(Object value, ) { net.minecraft.entity.ai.WardenAngerManager.suspectComparator = value; }

// public int primeAnger() { return wrapperContained.primeAnger; }
// public void primeAnger(int value) { wrapperContained.primeAnger = value; }
// public static int primeAnger() { return net.minecraft.entity.ai.WardenAngerManager.primeAnger; }
// public static void primeAnger(int value, ) { net.minecraft.entity.ai.WardenAngerManager.primeAnger = value; }

public WardenAngerManager(java.util.function.Predicate suspectPredicate,java.util.List suspectUuidsToAngerLevel) { this.wrapperContained = new net.minecraft.entity.ai.WardenAngerManager(suspectPredicate,suspectUuidsToAngerLevel); }
public void tick(yarnwrap.server.world.ServerWorld world,java.util.function.Predicate suspectPredicate) { wrapperContained.tick(world.wrapperContained,suspectPredicate); }
// public static void tick(yarnwrap.server.world.ServerWorld world,java.util.function.Predicate suspectPredicate, ) { net.minecraft.entity.ai.WardenAngerManager.tick(world.wrapperContained,suspectPredicate); }
// public java.lang.Integer method_42177(int suspect,yarnwrap.entity.Entity anger) { return wrapperContained.method_42177(suspect,anger.wrapperContained); }
// public static java.lang.Integer method_42177(int suspect,yarnwrap.entity.Entity anger, ) { return net.minecraft.entity.ai.WardenAngerManager.method_42177(suspect,anger.wrapperContained); }
public void removeSuspect(yarnwrap.entity.Entity entity) { wrapperContained.removeSuspect(entity.wrapperContained); }
// public static void removeSuspect(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.ai.WardenAngerManager.removeSuspect(entity.wrapperContained); }
public int increaseAngerAt(yarnwrap.entity.Entity entity,int amount) { return wrapperContained.increaseAngerAt(entity.wrapperContained,amount); }
// public static int increaseAngerAt(yarnwrap.entity.Entity entity,int amount, ) { return net.minecraft.entity.ai.WardenAngerManager.increaseAngerAt(entity.wrapperContained,amount); }
public java.util.Optional getPrimeSuspect() { return wrapperContained.getPrimeSuspect(); }
// public static java.util.Optional getPrimeSuspect() { return net.minecraft.entity.ai.WardenAngerManager.getPrimeSuspect(); }
public int getAngerFor(yarnwrap.entity.Entity entity) { return wrapperContained.getAngerFor(entity.wrapperContained); }
// public static int getAngerFor(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.ai.WardenAngerManager.getAngerFor(entity.wrapperContained); }
// public yarnwrap.entity.LivingEntity method_42186(yarnwrap.entity.Entity suspect) { return new yarnwrap.entity.LivingEntity(wrapperContained.method_42186(suspect.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity method_42186(yarnwrap.entity.Entity suspect, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.WardenAngerManager.method_42186(suspect.wrapperContained)); }
// public yarnwrap.entity.Entity getPrimeSuspectInternal() { return new yarnwrap.entity.Entity(wrapperContained.getPrimeSuspectInternal()); }
// public static yarnwrap.entity.Entity getPrimeSuspectInternal() { return new yarnwrap.entity.Entity(net.minecraft.entity.ai.WardenAngerManager.getPrimeSuspectInternal()); }
// public boolean method_42188(yarnwrap.entity.Entity suspect) { return wrapperContained.method_42188(suspect.wrapperContained); }
// public static boolean method_42188(yarnwrap.entity.Entity suspect, ) { return net.minecraft.entity.ai.WardenAngerManager.method_42188(suspect.wrapperContained); }
// public void updateSuspectsMap(yarnwrap.server.world.ServerWorld world) { wrapperContained.updateSuspectsMap(world.wrapperContained); }
// public static void updateSuspectsMap(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.ai.WardenAngerManager.updateSuspectsMap(world.wrapperContained); }
// public void method_43105(com.mojang.datafixers.util.Pair suspect) { wrapperContained.method_43105(suspect); }
// public static void method_43105(com.mojang.datafixers.util.Pair suspect, ) { net.minecraft.entity.ai.WardenAngerManager.method_43105(suspect); }
// public com.mojang.datafixers.util.Pair method_43106(Object suspect) { return wrapperContained.method_43106(suspect); }
// public static com.mojang.datafixers.util.Pair method_43106(Object suspect, ) { return net.minecraft.entity.ai.WardenAngerManager.method_43106(suspect); }
// public com.mojang.datafixers.kinds.App method_43107(Object instance) { return wrapperContained.method_43107(instance); }
// public static com.mojang.datafixers.kinds.App method_43107(Object instance, ) { return net.minecraft.entity.ai.WardenAngerManager.method_43107(instance); }
// public java.util.List getSuspects() { return wrapperContained.getSuspects(); }
// public static java.util.List getSuspects() { return net.minecraft.entity.ai.WardenAngerManager.getSuspects(); }
// public com.mojang.datafixers.util.Pair method_43109(yarnwrap.entity.Entity suspect) { return wrapperContained.method_43109(suspect.wrapperContained); }
// public static com.mojang.datafixers.util.Pair method_43109(yarnwrap.entity.Entity suspect, ) { return net.minecraft.entity.ai.WardenAngerManager.method_43109(suspect.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(java.util.function.Predicate suspectPredicate) { return wrapperContained.createCodec(suspectPredicate); }
// public static com.mojang.serialization.Codec createCodec(java.util.function.Predicate suspectPredicate, ) { return net.minecraft.entity.ai.WardenAngerManager.createCodec(suspectPredicate); }
// public com.mojang.datafixers.kinds.App method_43693(java.util.function.Predicate instance) { return wrapperContained.method_43693(instance); }
// public static com.mojang.datafixers.kinds.App method_43693(java.util.function.Predicate instance, ) { return net.minecraft.entity.ai.WardenAngerManager.method_43693(instance); }
// public yarnwrap.entity.ai.WardenAngerManager method_43694(java.util.function.Predicate suspectUuidsToAngerLevel) { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.method_43694(suspectUuidsToAngerLevel)); }
// public static yarnwrap.entity.ai.WardenAngerManager method_43694(java.util.function.Predicate suspectUuidsToAngerLevel, ) { return new yarnwrap.entity.ai.WardenAngerManager(net.minecraft.entity.ai.WardenAngerManager.method_43694(suspectUuidsToAngerLevel)); }
// public void updatePrimeAnger() { wrapperContained.updatePrimeAnger(); }
// public static void updatePrimeAnger() { net.minecraft.entity.ai.WardenAngerManager.updatePrimeAnger(); }

}