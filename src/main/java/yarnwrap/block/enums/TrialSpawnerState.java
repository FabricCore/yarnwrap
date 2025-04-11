package yarnwrap.block.enums;
public class TrialSpawnerState { public net.minecraft.block.enums.TrialSpawnerState wrapperContained; public TrialSpawnerState(net.minecraft.block.enums.TrialSpawnerState wrapperContained) { this.wrapperContained = wrapperContained; }

// public float START_EJECTING_REWARDS_COOLDOWN() { return wrapperContained.START_EJECTING_REWARDS_COOLDOWN; }
// public void START_EJECTING_REWARDS_COOLDOWN(float value) { wrapperContained.START_EJECTING_REWARDS_COOLDOWN = value; }
// public int BETWEEN_EJECTING_REWARDS_COOLDOWN() { return wrapperContained.BETWEEN_EJECTING_REWARDS_COOLDOWN; }
// public void BETWEEN_EJECTING_REWARDS_COOLDOWN(int value) { wrapperContained.BETWEEN_EJECTING_REWARDS_COOLDOWN = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public int luminance() { return wrapperContained.luminance; }
// public void luminance(int value) { wrapperContained.luminance = value; }
// public double displayRotationSpeed() { return wrapperContained.displayRotationSpeed; }
// public void displayRotationSpeed(double value) { wrapperContained.displayRotationSpeed = value; }
// public Object particleEmitter() { return wrapperContained.particleEmitter; }
// // public void particleEmitter(Object value) { wrapperContained.particleEmitter = value; }
// public boolean playsSound() { return wrapperContained.playsSound; }
// public void playsSound(boolean value) { wrapperContained.playsSound = value; }
public int getLuminance() { return wrapperContained.getLuminance(); }
public void emitParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ominous) { wrapperContained.emitParticles(world.wrapperContained,pos.wrapperContained,ominous); }
// public yarnwrap.block.enums.TrialSpawnerState tick(yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.block.enums.TrialSpawnerState(wrapperContained.tick(pos.wrapperContained,logic.wrapperContained,world.wrapperContained)); }
public double getDisplayRotationSpeed() { return wrapperContained.getDisplayRotationSpeed(); }
public boolean doesDisplayRotate() { return wrapperContained.doesDisplayRotate(); }
// public boolean playsSound() { return wrapperContained.playsSound(); }
// public boolean shouldCooldownEnd(yarnwrap.server.world.ServerWorld world,yarnwrap.block.spawner.TrialSpawnerData data) { return wrapperContained.shouldCooldownEnd(world.wrapperContained,data.wrapperContained); }
// public void spawnOminousItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic) { wrapperContained.spawnOminousItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained); }
// public java.util.Optional getPosToSpawnItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.block.spawner.TrialSpawnerData data) { return wrapperContained.getPosToSpawnItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained,data.wrapperContained); }
// public java.util.Optional getPosAbove(yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.getPosAbove(entity.wrapperContained,world.wrapperContained); }
// public yarnwrap.entity.Entity getRandomEntity(java.util.List players,java.util.Set entityUuids,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.entity.Entity(wrapperContained.getRandomEntity(players,entityUuids,logic.wrapperContained,pos.wrapperContained,world.wrapperContained)); }

}