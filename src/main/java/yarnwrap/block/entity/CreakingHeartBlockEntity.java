package yarnwrap.block.entity;
public class CreakingHeartBlockEntity { public net.minecraft.block.entity.CreakingHeartBlockEntity wrapperContained; public CreakingHeartBlockEntity(net.minecraft.block.entity.CreakingHeartBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int creakingUpdateTimer() { return wrapperContained.creakingUpdateTimer; }
// public void creakingUpdateTimer(int value) { wrapperContained.creakingUpdateTimer = value; }
// public static int creakingUpdateTimer() { return net.minecraft.block.entity.CreakingHeartBlockEntity.creakingUpdateTimer; }
// public static void creakingUpdateTimer(int value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.creakingUpdateTimer = value; }

// public int trailParticlesSpawnTimer() { return wrapperContained.trailParticlesSpawnTimer; }
// public void trailParticlesSpawnTimer(int value) { wrapperContained.trailParticlesSpawnTimer = value; }
// public static int trailParticlesSpawnTimer() { return net.minecraft.block.entity.CreakingHeartBlockEntity.trailParticlesSpawnTimer; }
// public static void trailParticlesSpawnTimer(int value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.trailParticlesSpawnTimer = value; }

// public yarnwrap.util.math.Vec3d lastCreakingPuppetPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastCreakingPuppetPos); }
// public void lastCreakingPuppetPos(yarnwrap.util.math.Vec3d value) { wrapperContained.lastCreakingPuppetPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lastCreakingPuppetPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.block.entity.CreakingHeartBlockEntity.lastCreakingPuppetPos); }
// public static void lastCreakingPuppetPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.lastCreakingPuppetPos = value.wrapperContained; }

// public int comparatorOutput() { return wrapperContained.comparatorOutput; }
// public void comparatorOutput(int value) { wrapperContained.comparatorOutput = value; }
// public static int comparatorOutput() { return net.minecraft.block.entity.CreakingHeartBlockEntity.comparatorOutput; }
// public static void comparatorOutput(int value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.comparatorOutput = value; }

// public java.util.Optional DEFAULT_CREAKING_PUPPET() { return wrapperContained.DEFAULT_CREAKING_PUPPET; }
// public void DEFAULT_CREAKING_PUPPET(java.util.Optional value) { wrapperContained.DEFAULT_CREAKING_PUPPET = value; }
// public static java.util.Optional DEFAULT_CREAKING_PUPPET() { return net.minecraft.block.entity.CreakingHeartBlockEntity.DEFAULT_CREAKING_PUPPET; }
// public static void DEFAULT_CREAKING_PUPPET(java.util.Optional value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.DEFAULT_CREAKING_PUPPET = value; }

// public com.mojang.datafixers.util.Either creakingPuppet() { return wrapperContained.creakingPuppet; }
// public void creakingPuppet(com.mojang.datafixers.util.Either value) { wrapperContained.creakingPuppet = value; }
// public static com.mojang.datafixers.util.Either creakingPuppet() { return net.minecraft.block.entity.CreakingHeartBlockEntity.creakingPuppet; }
// public static void creakingPuppet(com.mojang.datafixers.util.Either value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.creakingPuppet = value; }

// public long ticks() { return wrapperContained.ticks; }
// public void ticks(long value) { wrapperContained.ticks = value; }
// public static long ticks() { return net.minecraft.block.entity.CreakingHeartBlockEntity.ticks; }
// public static void ticks(long value, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.ticks = value; }

public CreakingHeartBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CreakingHeartBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void spawnTrailParticles(yarnwrap.server.world.ServerWorld world,int count,boolean towardsPuppet) { wrapperContained.spawnTrailParticles(world.wrapperContained,count,towardsPuppet); }
// public static void spawnTrailParticles(yarnwrap.server.world.ServerWorld world,int count,boolean towardsPuppet, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.spawnTrailParticles(world.wrapperContained,count,towardsPuppet); }
// public yarnwrap.entity.mob.CreakingEntity spawnCreakingPuppet(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.CreakingHeartBlockEntity blockEntity) { return new yarnwrap.entity.mob.CreakingEntity(wrapperContained.spawnCreakingPuppet(world.wrapperContained,blockEntity.wrapperContained)); }
// public static yarnwrap.entity.mob.CreakingEntity spawnCreakingPuppet(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.CreakingHeartBlockEntity blockEntity, ) { return new yarnwrap.entity.mob.CreakingEntity(net.minecraft.block.entity.CreakingHeartBlockEntity.spawnCreakingPuppet(world.wrapperContained,blockEntity.wrapperContained)); }
public void killPuppet(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.killPuppet(damageSource.wrapperContained); }
// public static void killPuppet(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.killPuppet(damageSource.wrapperContained); }
public boolean isPuppet(yarnwrap.entity.mob.CreakingEntity creaking) { return wrapperContained.isPuppet(creaking.wrapperContained); }
// public static boolean isPuppet(yarnwrap.entity.mob.CreakingEntity creaking, ) { return net.minecraft.block.entity.CreakingHeartBlockEntity.isPuppet(creaking.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CreakingHeartBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CreakingHeartBlockEntity blockEntity, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void onPuppetDamage() { wrapperContained.onPuppetDamage(); }
// public static void onPuppetDamage() { net.minecraft.block.entity.CreakingHeartBlockEntity.onPuppetDamage(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }
// public static int getComparatorOutput() { return net.minecraft.block.entity.CreakingHeartBlockEntity.getComparatorOutput(); }
public int calcComparatorOutput() { return wrapperContained.calcComparatorOutput(); }
// public static int calcComparatorOutput() { return net.minecraft.block.entity.CreakingHeartBlockEntity.calcComparatorOutput(); }
// public double getDistanceToPuppet() { return wrapperContained.getDistanceToPuppet(); }
// public static double getDistanceToPuppet() { return net.minecraft.block.entity.CreakingHeartBlockEntity.getDistanceToPuppet(); }
// public void method_65167(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_65167(pos.wrapperContained); }
// public static void method_65167(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.method_65167(pos.wrapperContained); }
// public void method_65168(yarnwrap.util.math.BlockPos pos,java.util.function.Consumer consumer) { wrapperContained.method_65168(pos.wrapperContained,consumer); }
// public static void method_65168(yarnwrap.util.math.BlockPos pos,java.util.function.Consumer consumer, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.method_65168(pos.wrapperContained,consumer); }
// public Object method_65169(org.apache.commons.lang3.mutable.Mutable pos) { return wrapperContained.method_65169(pos); }
// public static Object method_65169(org.apache.commons.lang3.mutable.Mutable pos, ) { return net.minecraft.block.entity.CreakingHeartBlockEntity.method_65169(pos); }
// public java.util.Optional findResinGenerationPos() { return wrapperContained.findResinGenerationPos(); }
// public static java.util.Optional findResinGenerationPos() { return net.minecraft.block.entity.CreakingHeartBlockEntity.findResinGenerationPos(); }
// public java.lang.Boolean method_65801(yarnwrap.entity.mob.CreakingEntity puppet) { return wrapperContained.method_65801(puppet.wrapperContained); }
// public static java.lang.Boolean method_65801(yarnwrap.entity.mob.CreakingEntity puppet, ) { return net.minecraft.block.entity.CreakingHeartBlockEntity.method_65801(puppet.wrapperContained); }
// public void method_65802(yarnwrap.block.entity.CreakingHeartBlockEntity creaking) { wrapperContained.method_65802(creaking.wrapperContained); }
// public static void method_65802(yarnwrap.block.entity.CreakingHeartBlockEntity creaking, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.method_65802(creaking.wrapperContained); }
// public java.util.UUID method_65803(java.util.UUID uuid) { return wrapperContained.method_65803(uuid); }
// public static java.util.UUID method_65803(java.util.UUID uuid, ) { return net.minecraft.block.entity.CreakingHeartBlockEntity.method_65803(uuid); }
// public java.lang.Double method_65804(yarnwrap.entity.mob.CreakingEntity creaking) { return wrapperContained.method_65804(creaking.wrapperContained); }
// public static java.lang.Double method_65804(yarnwrap.entity.mob.CreakingEntity creaking, ) { return net.minecraft.block.entity.CreakingHeartBlockEntity.method_65804(creaking.wrapperContained); }
// public java.util.Optional getCreakingPuppet() { return wrapperContained.getCreakingPuppet(); }
// public static java.util.Optional getCreakingPuppet() { return net.minecraft.block.entity.CreakingHeartBlockEntity.getCreakingPuppet(); }
public void setCreakingPuppet(yarnwrap.entity.mob.CreakingEntity creakingPuppet) { wrapperContained.setCreakingPuppet(creakingPuppet.wrapperContained); }
// public static void setCreakingPuppet(yarnwrap.entity.mob.CreakingEntity creakingPuppet, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.setCreakingPuppet(creakingPuppet.wrapperContained); }
public void setCreakingPuppetFromUuid(java.util.UUID creakingPuppetUuid) { wrapperContained.setCreakingPuppetFromUuid(creakingPuppetUuid); }
// public static void setCreakingPuppetFromUuid(java.util.UUID creakingPuppetUuid, ) { net.minecraft.block.entity.CreakingHeartBlockEntity.setCreakingPuppetFromUuid(creakingPuppetUuid); }
// public void clearCreakingPuppet() { wrapperContained.clearCreakingPuppet(); }
// public static void clearCreakingPuppet() { net.minecraft.block.entity.CreakingHeartBlockEntity.clearCreakingPuppet(); }
// public yarnwrap.block.BlockState getBlockState(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.CreakingHeartBlockEntity creakingHeart) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(world.wrapperContained,state.wrapperContained,pos.wrapperContained,creakingHeart.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.CreakingHeartBlockEntity creakingHeart, ) { return new yarnwrap.block.BlockState(net.minecraft.block.entity.CreakingHeartBlockEntity.getBlockState(world.wrapperContained,state.wrapperContained,pos.wrapperContained,creakingHeart.wrapperContained)); }

}