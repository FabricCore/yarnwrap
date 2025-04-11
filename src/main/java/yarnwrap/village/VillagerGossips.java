package yarnwrap.village;
public class VillagerGossips { public net.minecraft.village.VillagerGossips wrapperContained; public VillagerGossips(net.minecraft.village.VillagerGossips wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entityReputation() { return wrapperContained.entityReputation; }
// public void entityReputation(java.util.Map value) { wrapperContained.entityReputation = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int max(int left,int right) { return wrapperContained.max(left,right); }
public void shareGossipFrom(yarnwrap.village.VillagerGossips from,yarnwrap.util.math.random.Random random,int count) { wrapperContained.shareGossipFrom(from.wrapperContained,random.wrapperContained,count); }
// public int mergeReputation(yarnwrap.village.VillageGossipType type,int left,int right) { return wrapperContained.mergeReputation(type.wrapperContained,left,right); }
public void deserialize(com.mojang.serialization.Dynamic dynamic) { wrapperContained.deserialize(dynamic); }
public java.lang.Object serialize(com.mojang.serialization.DynamicOps ops) { return wrapperContained.serialize(ops); }
// public java.util.Collection pickGossips(yarnwrap.util.math.random.Random random,int count) { return wrapperContained.pickGossips(random.wrapperContained,count); }
// public Object getReputationFor(java.util.UUID target) { return wrapperContained.getReputationFor(target); }
public void startGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value) { wrapperContained.startGossip(target,type.wrapperContained,value); }
public int getReputationFor(java.util.UUID target,java.util.function.Predicate gossipTypeFilter) { return wrapperContained.getReputationFor(target,gossipTypeFilter); }
// public java.util.stream.Stream entries() { return wrapperContained.entries(); }
public void decay() { wrapperContained.decay(); }
public java.util.Map getEntityReputationAssociatedGossips() { return wrapperContained.getEntityReputationAssociatedGossips(); }
public void remove(yarnwrap.village.VillageGossipType type) { wrapperContained.remove(type.wrapperContained); }
public long getReputationCount(yarnwrap.village.VillageGossipType type,java.util.function.DoublePredicate predicate) { return wrapperContained.getReputationCount(type.wrapperContained,predicate); }
public void remove(java.util.UUID target,yarnwrap.village.VillageGossipType type) { wrapperContained.remove(target,type.wrapperContained); }
public void removeGossip(java.util.UUID target,yarnwrap.village.VillageGossipType type,int value) { wrapperContained.removeGossip(target,type.wrapperContained,value); }

}