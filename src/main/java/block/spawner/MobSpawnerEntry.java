package yarnwrap.block.spawner;
public class MobSpawnerEntry { public net.minecraft.block.spawner.MobSpawnerEntry wrapperContained; public MobSpawnerEntry(net.minecraft.block.spawner.MobSpawnerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(wrapperContained.entity); }
// public java.util.Optional customSpawnRules() { return wrapperContained.customSpawnRules; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec DATA_POOL_CODEC() { return wrapperContained.DATA_POOL_CODEC; }
public java.lang.String ENTITY_KEY() { return wrapperContained.ENTITY_KEY; }
// public yarnwrap.nbt.NbtCompound entity() { return new yarnwrap.nbt.NbtCompound(wrapperContained.entity()); }
// public java.util.Optional customSpawnRules() { return wrapperContained.customSpawnRules(); }
public yarnwrap.nbt.NbtCompound getNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbt()); }
public java.util.Optional getCustomSpawnRules() { return wrapperContained.getCustomSpawnRules(); }
public java.util.Optional getEquipment() { return wrapperContained.getEquipment(); }

}