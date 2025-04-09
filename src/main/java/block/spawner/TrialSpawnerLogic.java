package yarnwrap.block.spawner;
public class TrialSpawnerLogic { public net.minecraft.block.spawner.TrialSpawnerLogic wrapperContained; public TrialSpawnerLogic(net.minecraft.block.spawner.TrialSpawnerLogic wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ENTITY_DISTANCE() { return wrapperContained.MAX_ENTITY_DISTANCE; }
// public int MAX_ENTITY_DISTANCE_SQUARED() { return wrapperContained.MAX_ENTITY_DISTANCE_SQUARED; }
// public yarnwrap.block.spawner.TrialSpawnerData data() { return new yarnwrap.block.spawner.TrialSpawnerData(wrapperContained.data); }
// public Object trialSpawner() { return wrapperContained.trialSpawner; }
// public yarnwrap.block.spawner.EntityDetector entityDetector() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.entityDetector); }
// public boolean forceActivate() { return wrapperContained.forceActivate; }
// public Object entitySelector() { return wrapperContained.entitySelector; }
public java.lang.String NORMAL_CONFIG_NBT_KEY() { return wrapperContained.NORMAL_CONFIG_NBT_KEY; }
public java.lang.String OMINOUS_CONFIG_NBT_KEY() { return wrapperContained.OMINOUS_CONFIG_NBT_KEY; }
// public yarnwrap.block.spawner.TrialSpawnerConfig normalConfig() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.normalConfig); }
// public yarnwrap.block.spawner.TrialSpawnerConfig ominousConfig() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.ominousConfig); }
// public int entityDetectionRange() { return wrapperContained.entityDetectionRange; }
// public int cooldownLength() { return wrapperContained.cooldownLength; }
// public boolean ominous() { return wrapperContained.ominous; }
public com.mojang.serialization.Codec codec() { return wrapperContained.codec(); }
public java.util.Optional trySpawnMob(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.trySpawnMob(world.wrapperContained,pos.wrapperContained); }
public void ejectLootTable(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.registry.RegistryKey lootTable) { wrapperContained.ejectLootTable(world.wrapperContained,pos.wrapperContained,lootTable.wrapperContained); }
// public boolean shouldRemoveMobFromData(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,java.util.UUID uuid) { return wrapperContained.shouldRemoveMobFromData(world.wrapperContained,pos.wrapperContained,uuid); }
public boolean canActivate(yarnwrap.world.World world) { return wrapperContained.canActivate(world.wrapperContained); }
public void setSpawnerState(yarnwrap.world.World world,yarnwrap.block.enums.TrialSpawnerState spawnerState) { wrapperContained.setSpawnerState(world.wrapperContained,spawnerState.wrapperContained); }
// public boolean hasLineOfSight(yarnwrap.world.World world,yarnwrap.util.math.Vec3d spawnerPos,yarnwrap.util.math.Vec3d spawnPos) { return wrapperContained.hasLineOfSight(world.wrapperContained,spawnerPos.wrapperContained,spawnPos.wrapperContained); }
public void tickClient(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ominous) { wrapperContained.tickClient(world.wrapperContained,pos.wrapperContained,ominous); }
public void addMobSpawnParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particle) { wrapperContained.addMobSpawnParticles(world.wrapperContained,pos.wrapperContained,random.wrapperContained,particle.wrapperContained); }
public void addDetectionParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int playerCount,yarnwrap.particle.ParticleEffect particle) { wrapperContained.addDetectionParticles(world.wrapperContained,pos.wrapperContained,random.wrapperContained,playerCount,particle.wrapperContained); }
// public void setEntityDetector(yarnwrap.block.spawner.EntityDetector detector) { wrapperContained.setEntityDetector(detector.wrapperContained); }
public yarnwrap.block.spawner.TrialSpawnerConfig getConfig() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.getConfig()); }
public void tickServer(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,boolean ominous) { wrapperContained.tickServer(world.wrapperContained,pos.wrapperContained,ominous); }
public void addEjectItemParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.addEjectItemParticles(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public yarnwrap.block.spawner.TrialSpawnerData getData() { return new yarnwrap.block.spawner.TrialSpawnerData(wrapperContained.getData()); }
public yarnwrap.block.enums.TrialSpawnerState getSpawnerState() { return new yarnwrap.block.enums.TrialSpawnerState(wrapperContained.getSpawnerState()); }
public void updateListeners() { wrapperContained.updateListeners(); }
public yarnwrap.block.spawner.EntityDetector getEntityDetector() { return new yarnwrap.block.spawner.EntityDetector(wrapperContained.getEntityDetector()); }
// // public void forceActivate() { wrapperContained.forceActivate(); }
public Object getEntitySelector() { return wrapperContained.getEntitySelector(); }
public void setOminous(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.setOminous(world.wrapperContained,pos.wrapperContained); }
public void addTrialOmenParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.addTrialOmenParticles(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public void setNotOminous(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.setNotOminous(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.block.spawner.TrialSpawnerConfig getNormalConfig() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.getNormalConfig()); }
public yarnwrap.block.spawner.TrialSpawnerConfig getOminousConfig() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.getOminousConfig()); }
public boolean isOminous() { return wrapperContained.isOminous(); }
public int getCooldownLength() { return wrapperContained.getCooldownLength(); }
public int getDetectionRadius() { return wrapperContained.getDetectionRadius(); }
// public yarnwrap.block.spawner.TrialSpawnerConfig getOminousConfigForSerialization() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.getOminousConfigForSerialization()); }

}