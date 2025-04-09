package yarnwrap.block.spawner;
public class MobSpawnerLogic { public net.minecraft.block.spawner.MobSpawnerLogic wrapperContained; public MobSpawnerLogic(net.minecraft.block.spawner.MobSpawnerLogic wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String SPAWN_DATA_KEY() { return wrapperContained.SPAWN_DATA_KEY; }
// public int spawnCount() { return wrapperContained.spawnCount; }
// public int maxSpawnDelay() { return wrapperContained.maxSpawnDelay; }
// public int minSpawnDelay() { return wrapperContained.minSpawnDelay; }
// public yarnwrap.util.collection.DataPool spawnPotentials() { return new yarnwrap.util.collection.DataPool(wrapperContained.spawnPotentials); }
// public yarnwrap.entity.Entity renderedEntity() { return new yarnwrap.entity.Entity(wrapperContained.renderedEntity); }
// public int spawnDelay() { return wrapperContained.spawnDelay; }
// public yarnwrap.block.spawner.MobSpawnerEntry spawnEntry() { return new yarnwrap.block.spawner.MobSpawnerEntry(wrapperContained.spawnEntry); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int spawnRange() { return wrapperContained.spawnRange; }
// public int requiredPlayerRange() { return wrapperContained.requiredPlayerRange; }
// public double lastRotation() { return wrapperContained.lastRotation; }
// public int maxNearbyEntities() { return wrapperContained.maxNearbyEntities; }
// public double rotation() { return wrapperContained.rotation; }
public void serverTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.serverTick(world.wrapperContained,pos.wrapperContained); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.spawner.MobSpawnerEntry getSpawnEntry(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.spawner.MobSpawnerEntry(wrapperContained.getSpawnEntry(world.wrapperContained,random.wrapperContained,pos.wrapperContained)); }
public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained)); }
public void sendStatus(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int status) { wrapperContained.sendStatus(world.wrapperContained,pos.wrapperContained,status); }
public void setEntityId(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { wrapperContained.setEntityId(type.wrapperContained,world.wrapperContained,random.wrapperContained,pos.wrapperContained); }
public boolean handleStatus(yarnwrap.world.World world,int status) { return wrapperContained.handleStatus(world.wrapperContained,status); }
// public void setSpawnEntry(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.MobSpawnerEntry spawnEntry) { wrapperContained.setSpawnEntry(world.wrapperContained,pos.wrapperContained,spawnEntry.wrapperContained); }
public double getRotation() { return wrapperContained.getRotation(); }
public double getLastRotation() { return wrapperContained.getLastRotation(); }
public void readNbt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(world.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public void updateSpawns(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateSpawns(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.Entity getRenderedEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.Entity(wrapperContained.getRenderedEntity(world.wrapperContained,pos.wrapperContained)); }
// public boolean isPlayerInRange(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isPlayerInRange(world.wrapperContained,pos.wrapperContained); }

}