package yarnwrap.entity;
public class SpawnGroup { public net.minecraft.entity.SpawnGroup wrapperContained; public SpawnGroup(net.minecraft.entity.SpawnGroup wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnStartRange() { return wrapperContained.despawnStartRange; }
// public void despawnStartRange(int value) { wrapperContained.despawnStartRange = value; }
// public static int despawnStartRange() { return net.minecraft.entity.SpawnGroup.despawnStartRange; }
// public static void despawnStartRange(int value, ) { net.minecraft.entity.SpawnGroup.despawnStartRange = value; }

// public int immediateDespawnRange() { return wrapperContained.immediateDespawnRange; }
// public void immediateDespawnRange(int value) { wrapperContained.immediateDespawnRange = value; }
// public static int immediateDespawnRange() { return net.minecraft.entity.SpawnGroup.immediateDespawnRange; }
// public static void immediateDespawnRange(int value, ) { net.minecraft.entity.SpawnGroup.immediateDespawnRange = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.SpawnGroup.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.SpawnGroup.CODEC = value; }

// public boolean rare() { return wrapperContained.rare; }
// public void rare(boolean value) { wrapperContained.rare = value; }
// public static boolean rare() { return net.minecraft.entity.SpawnGroup.rare; }
// public static void rare(boolean value, ) { net.minecraft.entity.SpawnGroup.rare = value; }

// public int capacity() { return wrapperContained.capacity; }
// public void capacity(int value) { wrapperContained.capacity = value; }
// public static int capacity() { return net.minecraft.entity.SpawnGroup.capacity; }
// public static void capacity(int value, ) { net.minecraft.entity.SpawnGroup.capacity = value; }

// public boolean peaceful() { return wrapperContained.peaceful; }
// public void peaceful(boolean value) { wrapperContained.peaceful = value; }
// public static boolean peaceful() { return net.minecraft.entity.SpawnGroup.peaceful; }
// public static void peaceful(boolean value, ) { net.minecraft.entity.SpawnGroup.peaceful = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.SpawnGroup.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.SpawnGroup.name = value; }

// // public SpawnGroup(java.lang.String name,int spawnCap,java.lang.String peaceful,int rare,boolean immediateDespawnRange) { this.wrapperContained = new net.minecraft.entity.SpawnGroup(name,spawnCap,peaceful,rare,immediateDespawnRange); }
public int getImmediateDespawnRange() { return wrapperContained.getImmediateDespawnRange(); }
// public static int getImmediateDespawnRange() { return net.minecraft.entity.SpawnGroup.getImmediateDespawnRange(); }
public int getDespawnStartRange() { return wrapperContained.getDespawnStartRange(); }
// public static int getDespawnStartRange() { return net.minecraft.entity.SpawnGroup.getDespawnStartRange(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.SpawnGroup.getName(); }
public int getCapacity() { return wrapperContained.getCapacity(); }
// public static int getCapacity() { return net.minecraft.entity.SpawnGroup.getCapacity(); }
public boolean isRare() { return wrapperContained.isRare(); }
// public static boolean isRare() { return net.minecraft.entity.SpawnGroup.isRare(); }
public boolean isPeaceful() { return wrapperContained.isPeaceful(); }
// public static boolean isPeaceful() { return net.minecraft.entity.SpawnGroup.isPeaceful(); }

}