package yarnwrap.block.enums;
public class TrialSpawnerState { public net.minecraft.block.enums.TrialSpawnerState wrapperContained; public TrialSpawnerState(net.minecraft.block.enums.TrialSpawnerState wrapperContained) { this.wrapperContained = wrapperContained; }

// public float START_EJECTING_REWARDS_COOLDOWN() { return wrapperContained.START_EJECTING_REWARDS_COOLDOWN; }
// public void START_EJECTING_REWARDS_COOLDOWN(float value) { wrapperContained.START_EJECTING_REWARDS_COOLDOWN = value; }
// public static float START_EJECTING_REWARDS_COOLDOWN() { return net.minecraft.block.enums.TrialSpawnerState.START_EJECTING_REWARDS_COOLDOWN; }
// public static void START_EJECTING_REWARDS_COOLDOWN(float value, ) { net.minecraft.block.enums.TrialSpawnerState.START_EJECTING_REWARDS_COOLDOWN = value; }

// public int BETWEEN_EJECTING_REWARDS_COOLDOWN() { return wrapperContained.BETWEEN_EJECTING_REWARDS_COOLDOWN; }
// public void BETWEEN_EJECTING_REWARDS_COOLDOWN(int value) { wrapperContained.BETWEEN_EJECTING_REWARDS_COOLDOWN = value; }
// public static int BETWEEN_EJECTING_REWARDS_COOLDOWN() { return net.minecraft.block.enums.TrialSpawnerState.BETWEEN_EJECTING_REWARDS_COOLDOWN; }
// public static void BETWEEN_EJECTING_REWARDS_COOLDOWN(int value, ) { net.minecraft.block.enums.TrialSpawnerState.BETWEEN_EJECTING_REWARDS_COOLDOWN = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.block.enums.TrialSpawnerState.id; }
// public static void id(java.lang.String value, ) { net.minecraft.block.enums.TrialSpawnerState.id = value; }

// public int luminance() { return wrapperContained.luminance; }
// public void luminance(int value) { wrapperContained.luminance = value; }
// public static int luminance() { return net.minecraft.block.enums.TrialSpawnerState.luminance; }
// public static void luminance(int value, ) { net.minecraft.block.enums.TrialSpawnerState.luminance = value; }

// public double displayRotationSpeed() { return wrapperContained.displayRotationSpeed; }
// public void displayRotationSpeed(double value) { wrapperContained.displayRotationSpeed = value; }
// public static double displayRotationSpeed() { return net.minecraft.block.enums.TrialSpawnerState.displayRotationSpeed; }
// public static void displayRotationSpeed(double value, ) { net.minecraft.block.enums.TrialSpawnerState.displayRotationSpeed = value; }

// public Object particleEmitter() { return wrapperContained.particleEmitter; }
// // public void particleEmitter(Object value) { wrapperContained.particleEmitter = value; }
// // public static Object particleEmitter() { return net.minecraft.block.enums.TrialSpawnerState.particleEmitter; }
// // public static void particleEmitter(Object value, ) { net.minecraft.block.enums.TrialSpawnerState.particleEmitter = value; }

// public boolean playsSound() { return wrapperContained.playsSound; }
// public void playsSound(boolean value) { wrapperContained.playsSound = value; }
// public static boolean playsSound() { return net.minecraft.block.enums.TrialSpawnerState.playsSound; }
// public static void playsSound(boolean value, ) { net.minecraft.block.enums.TrialSpawnerState.playsSound = value; }

// // public TrialSpawnerState(java.lang.String id,int luminance,java.lang.String particleEmitter,int displayRotationSpeed,Object playsSound) { this.wrapperContained = new net.minecraft.block.enums.TrialSpawnerState(id,luminance,particleEmitter,displayRotationSpeed,playsSound); }
public int getLuminance() { return wrapperContained.getLuminance(); }
// public static int getLuminance() { return net.minecraft.block.enums.TrialSpawnerState.getLuminance(); }
public void emitParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ominous) { wrapperContained.emitParticles(world.wrapperContained,pos.wrapperContained,ominous); }
// public static void emitParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean ominous, ) { net.minecraft.block.enums.TrialSpawnerState.emitParticles(world.wrapperContained,pos.wrapperContained,ominous); }
// public void method_55211(yarnwrap.block.spawner.TrialSpawnerLogic lootTable) { wrapperContained.method_55211(lootTable.wrapperContained); }
// public static void method_55211(yarnwrap.block.spawner.TrialSpawnerLogic lootTable, ) { net.minecraft.block.enums.TrialSpawnerState.method_55211(lootTable.wrapperContained); }
// public void method_55212(yarnwrap.block.spawner.TrialSpawnerData uuid) { wrapperContained.method_55212(uuid.wrapperContained); }
// public static void method_55212(yarnwrap.block.spawner.TrialSpawnerData uuid, ) { net.minecraft.block.enums.TrialSpawnerState.method_55212(uuid.wrapperContained); }
// public void method_55213(yarnwrap.block.spawner.TrialSpawnerData spawnData) { wrapperContained.method_55213(spawnData.wrapperContained); }
// public static void method_55213(yarnwrap.block.spawner.TrialSpawnerData spawnData, ) { net.minecraft.block.enums.TrialSpawnerState.method_55213(spawnData.wrapperContained); }
// public yarnwrap.block.enums.TrialSpawnerState tick(yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.block.enums.TrialSpawnerState(wrapperContained.tick(pos.wrapperContained,logic.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.block.enums.TrialSpawnerState tick(yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.block.enums.TrialSpawnerState(net.minecraft.block.enums.TrialSpawnerState.tick(pos.wrapperContained,logic.wrapperContained,world.wrapperContained)); }
public double getDisplayRotationSpeed() { return wrapperContained.getDisplayRotationSpeed(); }
// public static double getDisplayRotationSpeed() { return net.minecraft.block.enums.TrialSpawnerState.getDisplayRotationSpeed(); }
public boolean doesDisplayRotate() { return wrapperContained.doesDisplayRotate(); }
// public static boolean doesDisplayRotate() { return net.minecraft.block.enums.TrialSpawnerState.doesDisplayRotate(); }
// public boolean playsSound() { return wrapperContained.playsSound(); }
// // public static boolean playsSound() { return net.minecraft.block.enums.TrialSpawnerState.playsSound(); }
// public void method_58718(yarnwrap.server.world.ServerWorld pos) { wrapperContained.method_58718(pos.wrapperContained); }
// public static void method_58718(yarnwrap.server.world.ServerWorld pos, ) { net.minecraft.block.enums.TrialSpawnerState.method_58718(pos.wrapperContained); }
// public boolean shouldCooldownEnd(yarnwrap.server.world.ServerWorld world,yarnwrap.block.spawner.TrialSpawnerData data) { return wrapperContained.shouldCooldownEnd(world.wrapperContained,data.wrapperContained); }
// public static boolean shouldCooldownEnd(yarnwrap.server.world.ServerWorld world,yarnwrap.block.spawner.TrialSpawnerData data, ) { return net.minecraft.block.enums.TrialSpawnerState.shouldCooldownEnd(world.wrapperContained,data.wrapperContained); }
// public void spawnOminousItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic) { wrapperContained.spawnOminousItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained); }
// public static void spawnOminousItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic, ) { net.minecraft.block.enums.TrialSpawnerState.spawnOminousItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained); }
// public java.util.Optional getPosToSpawnItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.block.spawner.TrialSpawnerData data) { return wrapperContained.getPosToSpawnItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained,data.wrapperContained); }
// public static java.util.Optional getPosToSpawnItemSpawner(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.block.spawner.TrialSpawnerData data, ) { return net.minecraft.block.enums.TrialSpawnerState.getPosToSpawnItemSpawner(world.wrapperContained,pos.wrapperContained,logic.wrapperContained,data.wrapperContained); }
// public java.util.Optional getPosAbove(yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.getPosAbove(entity.wrapperContained,world.wrapperContained); }
// public static java.util.Optional getPosAbove(yarnwrap.entity.Entity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.block.enums.TrialSpawnerState.getPosAbove(entity.wrapperContained,world.wrapperContained); }
// public boolean method_58723(yarnwrap.util.math.BlockPos entity) { return wrapperContained.method_58723(entity.wrapperContained); }
// public static boolean method_58723(yarnwrap.util.math.BlockPos entity, ) { return net.minecraft.block.enums.TrialSpawnerState.method_58723(entity.wrapperContained); }
// public boolean method_58724(yarnwrap.util.math.BlockPos player) { return wrapperContained.method_58724(player.wrapperContained); }
// public static boolean method_58724(yarnwrap.util.math.BlockPos player, ) { return net.minecraft.block.enums.TrialSpawnerState.method_58724(player.wrapperContained); }
// public yarnwrap.entity.Entity getRandomEntity(java.util.List players,java.util.Set entityUuids,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return new yarnwrap.entity.Entity(wrapperContained.getRandomEntity(players,entityUuids,logic.wrapperContained,pos.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.entity.Entity getRandomEntity(java.util.List players,java.util.Set entityUuids,yarnwrap.block.spawner.TrialSpawnerLogic logic,yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.entity.Entity(net.minecraft.block.enums.TrialSpawnerState.getRandomEntity(players,entityUuids,logic.wrapperContained,pos.wrapperContained,world.wrapperContained)); }

}