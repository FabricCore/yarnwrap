package yarnwrap.village;
public class VillagerGossips { public net.minecraft.village.VillagerGossips wrapperContained; public VillagerGossips(net.minecraft.village.VillagerGossips wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entityReputation() { return wrapperContained.entityReputation; }
// public void entityReputation(java.util.Map value) { wrapperContained.entityReputation = value; }
// public static java.util.Map entityReputation() { return net.minecraft.village.VillagerGossips.entityReputation; }
// public static void entityReputation(java.util.Map value, ) { net.minecraft.village.VillagerGossips.entityReputation = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.VillagerGossips.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.VillagerGossips.CODEC = value; }

// public VillagerGossips(java.util.List gossips) { this.wrapperContained = new net.minecraft.village.VillagerGossips(gossips); }
// public int max(int left,int right) { return wrapperContained.max(left,right); }
// public static int max(int left,int right, ) { return net.minecraft.village.VillagerGossips.max(left,right); }
public void shareGossipFrom(yarnwrap.village.VillagerGossips from,yarnwrap.util.math.random.Random random,int count) { wrapperContained.shareGossipFrom(from.wrapperContained,random.wrapperContained,count); }
// public static void shareGossipFrom(yarnwrap.village.VillagerGossips from,yarnwrap.util.math.random.Random random,int count, ) { net.minecraft.village.VillagerGossips.shareGossipFrom(from.wrapperContained,random.wrapperContained,count); }
// public int mergeReputation(yarnwrap.village.VillagerGossipType type,int left,int right) { return wrapperContained.mergeReputation(type.wrapperContained,left,right); }
// public static int mergeReputation(yarnwrap.village.VillagerGossipType type,int left,int right, ) { return net.minecraft.village.VillagerGossips.mergeReputation(type.wrapperContained,left,right); }
// public int method_19065(yarnwrap.village.VillagerGossipType left,int right) { return wrapperContained.method_19065(left.wrapperContained,right); }
// public static int method_19065(yarnwrap.village.VillagerGossipType left,int right, ) { return net.minecraft.village.VillagerGossips.method_19065(left.wrapperContained,right); }
// public java.util.stream.Stream method_19069(Object entry) { return wrapperContained.method_19069(entry); }
// public static java.util.stream.Stream method_19069(Object entry, ) { return net.minecraft.village.VillagerGossips.method_19069(entry); }
// public java.util.Collection pickGossips(yarnwrap.util.math.random.Random random,int count) { return wrapperContained.pickGossips(random.wrapperContained,count); }
// public static java.util.Collection pickGossips(yarnwrap.util.math.random.Random random,int count, ) { return net.minecraft.village.VillagerGossips.pickGossips(random.wrapperContained,count); }
// public Object getReputationFor(java.util.UUID target) { return wrapperContained.getReputationFor(target); }
// public static Object getReputationFor(java.util.UUID target, ) { return net.minecraft.village.VillagerGossips.getReputationFor(target); }
public void startGossip(java.util.UUID target,yarnwrap.village.VillagerGossipType type,int value) { wrapperContained.startGossip(target,type.wrapperContained,value); }
// public static void startGossip(java.util.UUID target,yarnwrap.village.VillagerGossipType type,int value, ) { net.minecraft.village.VillagerGossips.startGossip(target,type.wrapperContained,value); }
public int getReputationFor(java.util.UUID target,java.util.function.Predicate gossipTypeFilter) { return wrapperContained.getReputationFor(target,gossipTypeFilter); }
// public static int getReputationFor(java.util.UUID target,java.util.function.Predicate gossipTypeFilter, ) { return net.minecraft.village.VillagerGossips.getReputationFor(target,gossipTypeFilter); }
// public java.util.stream.Stream entries() { return wrapperContained.entries(); }
// public static java.util.stream.Stream entries() { return net.minecraft.village.VillagerGossips.entries(); }
// public void method_19075(Object gossip) { wrapperContained.method_19075(gossip); }
// public static void method_19075(Object gossip, ) { net.minecraft.village.VillagerGossips.method_19075(gossip); }
public void decay() { wrapperContained.decay(); }
// public static void decay() { net.minecraft.village.VillagerGossips.decay(); }
public java.util.Map getEntityReputationAssociatedGossips() { return wrapperContained.getEntityReputationAssociatedGossips(); }
// public static java.util.Map getEntityReputationAssociatedGossips() { return net.minecraft.village.VillagerGossips.getEntityReputationAssociatedGossips(); }
public void remove(yarnwrap.village.VillagerGossipType type) { wrapperContained.remove(type.wrapperContained); }
// public static void remove(yarnwrap.village.VillagerGossipType type, ) { net.minecraft.village.VillagerGossips.remove(type.wrapperContained); }
public long getReputationCount(yarnwrap.village.VillagerGossipType type,java.util.function.DoublePredicate predicate) { return wrapperContained.getReputationCount(type.wrapperContained,predicate); }
// public static long getReputationCount(yarnwrap.village.VillagerGossipType type,java.util.function.DoublePredicate predicate, ) { return net.minecraft.village.VillagerGossips.getReputationCount(type.wrapperContained,predicate); }
// public void method_35123(java.util.Map uuid) { wrapperContained.method_35123(uuid); }
// public static void method_35123(java.util.Map uuid, ) { net.minecraft.village.VillagerGossips.method_35123(uuid); }
public void remove(java.util.UUID target,yarnwrap.village.VillagerGossipType type) { wrapperContained.remove(target,type.wrapperContained); }
// public static void remove(java.util.UUID target,yarnwrap.village.VillagerGossipType type, ) { net.minecraft.village.VillagerGossips.remove(target,type.wrapperContained); }
// public boolean method_35125(java.util.function.DoublePredicate reputation) { return wrapperContained.method_35125(reputation); }
// public static boolean method_35125(java.util.function.DoublePredicate reputation, ) { return net.minecraft.village.VillagerGossips.method_35125(reputation); }
public void removeGossip(java.util.UUID target,yarnwrap.village.VillagerGossipType type,int value) { wrapperContained.removeGossip(target,type.wrapperContained,value); }
// public static void removeGossip(java.util.UUID target,yarnwrap.village.VillagerGossipType type,int value, ) { net.minecraft.village.VillagerGossips.removeGossip(target,type.wrapperContained,value); }
public void add(yarnwrap.village.VillagerGossips gossips) { wrapperContained.add(gossips.wrapperContained); }
// public static void add(yarnwrap.village.VillagerGossips gossips, ) { net.minecraft.village.VillagerGossips.add(gossips.wrapperContained); }
// public void method_67653(java.util.UUID target,Object reputation) { wrapperContained.method_67653(target,reputation); }
// public static void method_67653(java.util.UUID target,Object reputation, ) { net.minecraft.village.VillagerGossips.method_67653(target,reputation); }
// public void method_67654(Object gossip) { wrapperContained.method_67654(gossip); }
// public static void method_67654(Object gossip, ) { net.minecraft.village.VillagerGossips.method_67654(gossip); }
// public java.util.List method_67655(yarnwrap.village.VillagerGossips gossips) { return wrapperContained.method_67655(gossips.wrapperContained); }
// public static java.util.List method_67655(yarnwrap.village.VillagerGossips gossips, ) { return net.minecraft.village.VillagerGossips.method_67655(gossips.wrapperContained); }
// public Object method_67656(java.util.UUID uuid) { return wrapperContained.method_67656(uuid); }
// public static Object method_67656(java.util.UUID uuid, ) { return net.minecraft.village.VillagerGossips.method_67656(uuid); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.village.VillagerGossips.clear(); }
public yarnwrap.village.VillagerGossips copy() { return new yarnwrap.village.VillagerGossips(wrapperContained.copy()); }
// public static yarnwrap.village.VillagerGossips copy() { return new yarnwrap.village.VillagerGossips(net.minecraft.village.VillagerGossips.copy()); }

}