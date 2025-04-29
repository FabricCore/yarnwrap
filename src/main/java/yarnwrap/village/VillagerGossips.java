package yarnwrap.village;
public class VillagerGossips { public net.minecraft.village.VillagerGossips wrapperContained; public VillagerGossips(net.minecraft.village.VillagerGossips wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entityReputation() { return wrapperContained.entityReputation; }
// public void entityReputation(java.util.Map value) { wrapperContained.entityReputation = value; }
// public static java.util.Map entityReputation() { return net.minecraft.village.VillagerGossips.entityReputation; }
// public static void entityReputation(java.util.Map value, ) { net.minecraft.village.VillagerGossips.entityReputation = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.village.VillagerGossips.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.village.VillagerGossips.LOGGER = value; }

// public int max(int left,int right) { return wrapperContained.max(left,right); }
// public static int max(int left,int right, ) { return net.minecraft.village.VillagerGossips.max(left,right); }
// public void method_19060(Object entry) { wrapperContained.method_19060(entry); }
// public static void method_19060(Object entry, ) { net.minecraft.village.VillagerGossips.method_19060(entry); }
public void shareGossipFrom(yarnwrap.village.VillagerGossips from,yarnwrap.util.math.random.Random random,int count) { wrapperContained.shareGossipFrom(from.wrapperContained,random.wrapperContained,count); }
// public static void shareGossipFrom(yarnwrap.village.VillagerGossips from,yarnwrap.util.math.random.Random random,int count, ) { net.minecraft.village.VillagerGossips.shareGossipFrom(from.wrapperContained,random.wrapperContained,count); }
// public int mergeReputation(yarnwrap.village.VillageGossipType type,int left,int right) { return wrapperContained.mergeReputation(type.wrapperContained,left,right); }
// public static int mergeReputation(yarnwrap.village.VillageGossipType type,int left,int right, ) { return net.minecraft.village.VillagerGossips.mergeReputation(type.wrapperContained,left,right); }
// public int method_19065(yarnwrap.village.VillageGossipType left,int right) { return wrapperContained.method_19065(left.wrapperContained,right); }
// public static int method_19065(yarnwrap.village.VillageGossipType left,int right, ) { return net.minecraft.village.VillagerGossips.method_19065(left.wrapperContained,right); }
public void deserialize(com.mojang.serialization.Dynamic dynamic) { wrapperContained.deserialize(dynamic); }
// public static void deserialize(com.mojang.serialization.Dynamic dynamic, ) { net.minecraft.village.VillagerGossips.deserialize(dynamic); }
public java.lang.Object serialize(com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(ops); }
// public static java.lang.Object serialize(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.village.VillagerGossips.serialize(ops); }
// public java.util.stream.Stream method_19069(Object entry) { return wrapperContained.method_19069(entry); }
// public static java.util.stream.Stream method_19069(Object entry, ) { return net.minecraft.village.VillagerGossips.method_19069(entry); }
// public java.util.Collection pickGossips(yarnwrap.util.math.random.Random random,int count) { return wrapperContained.pickGossips(random.wrapperContained,count); }
// public static java.util.Collection pickGossips(yarnwrap.util.math.random.Random random,int count, ) { return net.minecraft.village.VillagerGossips.pickGossips(random.wrapperContained,count); }
// public Object getReputationFor(java.util.UUID target) { return wrapperContained.getReputationFor(target); }
// public static Object getReputationFor(java.util.UUID target, ) { return net.minecraft.village.VillagerGossips.getReputationFor(target); }
public void startGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value) { wrapperContained.startGossip(target,type.wrapperContained,value); }
// public static void startGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value, ) { net.minecraft.village.VillagerGossips.startGossip(target,type.wrapperContained,value); }
public int getReputationFor(java.util.UUID target,java.util.function.Predicate gossipTypeFilter) { return wrapperContained.getReputationFor(target,gossipTypeFilter); }
// public static int getReputationFor(java.util.UUID target,java.util.function.Predicate gossipTypeFilter, ) { return net.minecraft.village.VillagerGossips.getReputationFor(target,gossipTypeFilter); }
// public java.util.stream.Stream entries() { return wrapperContained.entries(); }
// public static java.util.stream.Stream entries() { return net.minecraft.village.VillagerGossips.entries(); }
// public void method_19075(Object gossip) { wrapperContained.method_19075(gossip); }
// public static void method_19075(Object gossip, ) { net.minecraft.village.VillagerGossips.method_19075(gossip); }
// public Object method_19076(java.util.UUID uuid) { return wrapperContained.method_19076(uuid); }
// public static Object method_19076(java.util.UUID uuid, ) { return net.minecraft.village.VillagerGossips.method_19076(uuid); }
public void decay() { wrapperContained.decay(); }
// public static void decay() { net.minecraft.village.VillagerGossips.decay(); }
public java.util.Map getEntityReputationAssociatedGossips() { return wrapperContained.getEntityReputationAssociatedGossips(); }
// public static java.util.Map getEntityReputationAssociatedGossips() { return net.minecraft.village.VillagerGossips.getEntityReputationAssociatedGossips(); }
public void remove(yarnwrap.village.VillageGossipType type) { wrapperContained.remove(type.wrapperContained); }
// public static void remove(yarnwrap.village.VillageGossipType type, ) { net.minecraft.village.VillagerGossips.remove(type.wrapperContained); }
public long getReputationCount(yarnwrap.village.VillageGossipType type,java.util.function.DoublePredicate predicate) { return wrapperContained.getReputationCount(type.wrapperContained,predicate); }
// public static long getReputationCount(yarnwrap.village.VillageGossipType type,java.util.function.DoublePredicate predicate, ) { return net.minecraft.village.VillagerGossips.getReputationCount(type.wrapperContained,predicate); }
// public void method_35123(java.util.Map uuid) { wrapperContained.method_35123(uuid); }
// public static void method_35123(java.util.Map uuid, ) { net.minecraft.village.VillagerGossips.method_35123(uuid); }
public void remove(java.util.UUID target,yarnwrap.village.VillageGossipType type) { wrapperContained.remove(target,type.wrapperContained); }
// public static void remove(java.util.UUID target,yarnwrap.village.VillageGossipType type, ) { net.minecraft.village.VillagerGossips.remove(target,type.wrapperContained); }
// public boolean method_35125(java.util.function.DoublePredicate reputation) { return wrapperContained.method_35125(reputation); }
// public static boolean method_35125(java.util.function.DoublePredicate reputation, ) { return net.minecraft.village.VillagerGossips.method_35125(reputation); }
public void removeGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value) { wrapperContained.removeGossip(target,type.wrapperContained,value); }
// public static void removeGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value, ) { net.minecraft.village.VillagerGossips.removeGossip(target,type.wrapperContained,value); }
// public void method_47925(java.lang.String error) { wrapperContained.method_47925(error); }
// public static void method_47925(java.lang.String error, ) { net.minecraft.village.VillagerGossips.method_47925(error); }
// public void method_47926(java.lang.String error) { wrapperContained.method_47926(error); }
// public static void method_47926(java.lang.String error, ) { net.minecraft.village.VillagerGossips.method_47926(error); }

}