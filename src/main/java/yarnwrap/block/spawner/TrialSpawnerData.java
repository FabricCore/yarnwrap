package yarnwrap.block.spawner;
public class TrialSpawnerData { public net.minecraft.block.spawner.TrialSpawnerData wrapperContained; public TrialSpawnerData(net.minecraft.block.spawner.TrialSpawnerData wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String SPAWN_DATA_KEY() { return wrapperContained.SPAWN_DATA_KEY; }
// public void SPAWN_DATA_KEY(java.lang.String value) { wrapperContained.SPAWN_DATA_KEY = value; }
public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public java.util.Set players() { return wrapperContained.players; }
// public void players(java.util.Set value) { wrapperContained.players = value; }
// public java.util.Set spawnedMobsAlive() { return wrapperContained.spawnedMobsAlive; }
// public void spawnedMobsAlive(java.util.Set value) { wrapperContained.spawnedMobsAlive = value; }
// public long cooldownEnd() { return wrapperContained.cooldownEnd; }
// public void cooldownEnd(long value) { wrapperContained.cooldownEnd = value; }
// public long nextMobSpawnsAt() { return wrapperContained.nextMobSpawnsAt; }
// public void nextMobSpawnsAt(long value) { wrapperContained.nextMobSpawnsAt = value; }
// public int totalSpawnedMobs() { return wrapperContained.totalSpawnedMobs; }
// public void totalSpawnedMobs(int value) { wrapperContained.totalSpawnedMobs = value; }
// public java.util.Optional spawnData() { return wrapperContained.spawnData; }
// public void spawnData(java.util.Optional value) { wrapperContained.spawnData = value; }
// public java.util.Optional rewardLootTable() { return wrapperContained.rewardLootTable; }
// public void rewardLootTable(java.util.Optional value) { wrapperContained.rewardLootTable = value; }
// public yarnwrap.entity.Entity displayEntity() { return new yarnwrap.entity.Entity(wrapperContained.displayEntity); }
// public void displayEntity(yarnwrap.entity.Entity value) { wrapperContained.displayEntity = value.wrapperContained; }
// public double displayEntityRotation() { return wrapperContained.displayEntityRotation; }
// public void displayEntityRotation(double value) { wrapperContained.displayEntityRotation = value; }
// public double lastDisplayEntityRotation() { return wrapperContained.lastDisplayEntityRotation; }
// public void lastDisplayEntityRotation(double value) { wrapperContained.lastDisplayEntityRotation = value; }
// public java.lang.String NEXT_MOB_SPAWNS_AT_KEY() { return wrapperContained.NEXT_MOB_SPAWNS_AT_KEY; }
// public void NEXT_MOB_SPAWNS_AT_KEY(java.lang.String value) { wrapperContained.NEXT_MOB_SPAWNS_AT_KEY = value; }
// public yarnwrap.util.collection.DataPool itemsToDropWhenOminous() { return new yarnwrap.util.collection.DataPool(wrapperContained.itemsToDropWhenOminous); }
// public void itemsToDropWhenOminous(yarnwrap.util.collection.DataPool value) { wrapperContained.itemsToDropWhenOminous = value.wrapperContained; }
public void reset() { wrapperContained.reset(); }
public boolean isCooldownOver(yarnwrap.server.world.ServerWorld world) { return wrapperContained.isCooldownOver(world.wrapperContained); }
// public boolean isCooldownPast(yarnwrap.server.world.ServerWorld world) { return wrapperContained.isCooldownPast(world.wrapperContained); }
public boolean canSpawnMore(yarnwrap.server.world.ServerWorld world,yarnwrap.block.spawner.TrialSpawnerConfig config,int additionalPlayers) { return wrapperContained.canSpawnMore(world.wrapperContained,config.wrapperContained,additionalPlayers); }
public void updatePlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic) { wrapperContained.updatePlayers(world.wrapperContained,pos.wrapperContained,logic.wrapperContained); }
// public yarnwrap.block.spawner.MobSpawnerEntry getSpawnData(yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.spawner.MobSpawnerEntry(wrapperContained.getSpawnData(logic.wrapperContained,random.wrapperContained)); }
public void setEntityType(yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.random.Random random,yarnwrap.entity.EntityType type) { wrapperContained.setEntityType(logic.wrapperContained,random.wrapperContained,type.wrapperContained); }
public yarnwrap.entity.Entity setDisplayEntity(yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.world.World world,yarnwrap.block.enums.TrialSpawnerState state) { return new yarnwrap.entity.Entity(wrapperContained.setDisplayEntity(logic.wrapperContained,world.wrapperContained,state.wrapperContained)); }
public boolean hasSpawnedAllMobs(yarnwrap.block.spawner.TrialSpawnerConfig config,int additionalPlayers) { return wrapperContained.hasSpawnedAllMobs(config.wrapperContained,additionalPlayers); }
public yarnwrap.nbt.NbtCompound getSpawnDataNbt(yarnwrap.block.enums.TrialSpawnerState state) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getSpawnDataNbt(state.wrapperContained)); }
public int getAdditionalPlayers(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAdditionalPlayers(pos.wrapperContained); }
public boolean hasSpawnData(yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.random.Random random) { return wrapperContained.hasSpawnData(logic.wrapperContained,random.wrapperContained); }
// public boolean isCooldownAtRepeating(yarnwrap.server.world.ServerWorld world) { return wrapperContained.isCooldownAtRepeating(world.wrapperContained); }
public boolean areMobsDead() { return wrapperContained.areMobsDead(); }
public double getDisplayEntityRotation() { return wrapperContained.getDisplayEntityRotation(); }
public double getLastDisplayEntityRotation() { return wrapperContained.getLastDisplayEntityRotation(); }
// public yarnwrap.util.collection.DataPool getItemsToDropWhenOminous(yarnwrap.server.world.ServerWorld world,yarnwrap.block.spawner.TrialSpawnerConfig config,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.collection.DataPool(wrapperContained.getItemsToDropWhenOminous(world.wrapperContained,config.wrapperContained,pos.wrapperContained)); }
// public long getLootSeed(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLootSeed(world.wrapperContained,pos.wrapperContained); }
// public void applyTrialOmen(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.applyTrialOmen(player.wrapperContained); }
public void resetAndClearMobs(yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.server.world.ServerWorld world) { wrapperContained.resetAndClearMobs(logic.wrapperContained,world.wrapperContained); }
// public java.util.Optional findPlayerWithOmen(yarnwrap.server.world.ServerWorld world,java.util.List players) { return wrapperContained.findPlayerWithOmen(world.wrapperContained,players); }

}