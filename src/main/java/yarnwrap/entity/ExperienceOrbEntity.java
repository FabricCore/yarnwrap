package yarnwrap.entity;
public class ExperienceOrbEntity { public net.minecraft.entity.ExperienceOrbEntity wrapperContained; public ExperienceOrbEntity(net.minecraft.entity.ExperienceOrbEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pickingCount() { return wrapperContained.pickingCount; }
// public void pickingCount(int value) { wrapperContained.pickingCount = value; }
// public static int pickingCount() { return net.minecraft.entity.ExperienceOrbEntity.pickingCount; }
// public static void pickingCount(int value, ) { net.minecraft.entity.ExperienceOrbEntity.pickingCount = value; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public static int DESPAWN_AGE() { return net.minecraft.entity.ExperienceOrbEntity.DESPAWN_AGE; }
// public static void DESPAWN_AGE(int value, ) { net.minecraft.entity.ExperienceOrbEntity.DESPAWN_AGE = value; }

// public int EXPENSIVE_UPDATE_INTERVAL() { return wrapperContained.EXPENSIVE_UPDATE_INTERVAL; }
// public void EXPENSIVE_UPDATE_INTERVAL(int value) { wrapperContained.EXPENSIVE_UPDATE_INTERVAL = value; }
// public static int EXPENSIVE_UPDATE_INTERVAL() { return net.minecraft.entity.ExperienceOrbEntity.EXPENSIVE_UPDATE_INTERVAL; }
// public static void EXPENSIVE_UPDATE_INTERVAL(int value, ) { net.minecraft.entity.ExperienceOrbEntity.EXPENSIVE_UPDATE_INTERVAL = value; }

// public int MERGING_CHANCE_FRACTION() { return wrapperContained.MERGING_CHANCE_FRACTION; }
// public void MERGING_CHANCE_FRACTION(int value) { wrapperContained.MERGING_CHANCE_FRACTION = value; }
// public static int MERGING_CHANCE_FRACTION() { return net.minecraft.entity.ExperienceOrbEntity.MERGING_CHANCE_FRACTION; }
// public static void MERGING_CHANCE_FRACTION(int value, ) { net.minecraft.entity.ExperienceOrbEntity.MERGING_CHANCE_FRACTION = value; }

// public int amount() { return wrapperContained.amount; }
// public void amount(int value) { wrapperContained.amount = value; }
// public static int amount() { return net.minecraft.entity.ExperienceOrbEntity.amount; }
// public static void amount(int value, ) { net.minecraft.entity.ExperienceOrbEntity.amount = value; }

// public int health() { return wrapperContained.health; }
// public void health(int value) { wrapperContained.health = value; }
// public static int health() { return net.minecraft.entity.ExperienceOrbEntity.health; }
// public static void health(int value, ) { net.minecraft.entity.ExperienceOrbEntity.health = value; }

// public yarnwrap.entity.player.PlayerEntity target() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity target() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.ExperienceOrbEntity.target); }
// public static void target(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.ExperienceOrbEntity.target = value.wrapperContained; }

// public int orbAge() { return wrapperContained.orbAge; }
// public void orbAge(int value) { wrapperContained.orbAge = value; }
// public static int orbAge() { return net.minecraft.entity.ExperienceOrbEntity.orbAge; }
// public static void orbAge(int value, ) { net.minecraft.entity.ExperienceOrbEntity.orbAge = value; }

public ExperienceOrbEntity(yarnwrap.world.World world,double x,double y,double z,int amount) { this.wrapperContained = new net.minecraft.entity.ExperienceOrbEntity(world.wrapperContained,x,y,z,amount); }
// public boolean method_31492(int orb) { return wrapperContained.method_31492(orb); }
// public static boolean method_31492(int orb, ) { return net.minecraft.entity.ExperienceOrbEntity.method_31492(orb); }
// public void spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount) { wrapperContained.spawn(world.wrapperContained,pos.wrapperContained,amount); }
// public static void spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount, ) { net.minecraft.entity.ExperienceOrbEntity.spawn(world.wrapperContained,pos.wrapperContained,amount); }
// public boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity other) { return wrapperContained.isMergeable(other.wrapperContained); }
// public static boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity other, ) { return net.minecraft.entity.ExperienceOrbEntity.isMergeable(other.wrapperContained); }
// public boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity orb,int seed,int amount) { return wrapperContained.isMergeable(orb.wrapperContained,seed,amount); }
// public static boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity orb,int seed,int amount, ) { return net.minecraft.entity.ExperienceOrbEntity.isMergeable(orb.wrapperContained,seed,amount); }
// public boolean wasMergedIntoExistingOrb(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount) { return wrapperContained.wasMergedIntoExistingOrb(world.wrapperContained,pos.wrapperContained,amount); }
// public static boolean wasMergedIntoExistingOrb(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount, ) { return net.minecraft.entity.ExperienceOrbEntity.wasMergedIntoExistingOrb(world.wrapperContained,pos.wrapperContained,amount); }
// public void merge(yarnwrap.entity.ExperienceOrbEntity other) { wrapperContained.merge(other.wrapperContained); }
// public static void merge(yarnwrap.entity.ExperienceOrbEntity other, ) { net.minecraft.entity.ExperienceOrbEntity.merge(other.wrapperContained); }
// public void expensiveUpdate() { wrapperContained.expensiveUpdate(); }
// public static void expensiveUpdate() { net.minecraft.entity.ExperienceOrbEntity.expensiveUpdate(); }
// public int repairPlayerGears(yarnwrap.server.network.ServerPlayerEntity player,int amount) { return wrapperContained.repairPlayerGears(player.wrapperContained,amount); }
// public static int repairPlayerGears(yarnwrap.server.network.ServerPlayerEntity player,int amount, ) { return net.minecraft.entity.ExperienceOrbEntity.repairPlayerGears(player.wrapperContained,amount); }
// public int roundToOrbSize(int value) { return wrapperContained.roundToOrbSize(value); }
// public static int roundToOrbSize(int value, ) { return net.minecraft.entity.ExperienceOrbEntity.roundToOrbSize(value); }
public int getExperienceAmount() { return wrapperContained.getExperienceAmount(); }
// public static int getExperienceAmount() { return net.minecraft.entity.ExperienceOrbEntity.getExperienceAmount(); }
public int getOrbSize() { return wrapperContained.getOrbSize(); }
// public static int getOrbSize() { return net.minecraft.entity.ExperienceOrbEntity.getOrbSize(); }
// public void applyWaterMovement() { wrapperContained.applyWaterMovement(); }
// public static void applyWaterMovement() { net.minecraft.entity.ExperienceOrbEntity.applyWaterMovement(); }

}