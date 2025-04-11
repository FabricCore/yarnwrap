package yarnwrap.entity;
public class SpawnGroup { public net.minecraft.entity.SpawnGroup wrapperContained; public SpawnGroup(net.minecraft.entity.SpawnGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnStartRange() { return wrapperContained.despawnStartRange; }
// public void despawnStartRange(int value) { wrapperContained.despawnStartRange = value; }
// public int immediateDespawnRange() { return wrapperContained.immediateDespawnRange; }
// public void immediateDespawnRange(int value) { wrapperContained.immediateDespawnRange = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public boolean rare() { return wrapperContained.rare; }
// public void rare(boolean value) { wrapperContained.rare = value; }
// public int capacity() { return wrapperContained.capacity; }
// public void capacity(int value) { wrapperContained.capacity = value; }
// public boolean peaceful() { return wrapperContained.peaceful; }
// public void peaceful(boolean value) { wrapperContained.peaceful = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// // public SpawnGroup(java.lang.String name,int spawnCap,java.lang.String peaceful,int rare,boolean immediateDespawnRange) { this.wrapperContained = new net.minecraft.entity.SpawnGroup(name,spawnCap,peaceful,rare,immediateDespawnRange); }
public int getImmediateDespawnRange() { return wrapperContained.getImmediateDespawnRange(); }
public int getDespawnStartRange() { return wrapperContained.getDespawnStartRange(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getCapacity() { return wrapperContained.getCapacity(); }
public boolean isRare() { return wrapperContained.isRare(); }
public boolean isPeaceful() { return wrapperContained.isPeaceful(); }

}