package yarnwrap.entity;
public class SpawnGroup { public net.minecraft.entity.SpawnGroup wrapperContained; public SpawnGroup(net.minecraft.entity.SpawnGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnStartRange() { return wrapperContained.despawnStartRange; }
// public int immediateDespawnRange() { return wrapperContained.immediateDespawnRange; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public boolean rare() { return wrapperContained.rare; }
// public int capacity() { return wrapperContained.capacity; }
// public boolean peaceful() { return wrapperContained.peaceful; }
// public java.lang.String name() { return wrapperContained.name; }
public int getImmediateDespawnRange() { return wrapperContained.getImmediateDespawnRange(); }
public int getDespawnStartRange() { return wrapperContained.getDespawnStartRange(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getCapacity() { return wrapperContained.getCapacity(); }
public boolean isRare() { return wrapperContained.isRare(); }
public boolean isPeaceful() { return wrapperContained.isPeaceful(); }

}