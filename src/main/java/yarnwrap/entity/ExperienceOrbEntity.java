package yarnwrap.entity;
public class ExperienceOrbEntity { public net.minecraft.entity.ExperienceOrbEntity wrapperContained; public ExperienceOrbEntity(net.minecraft.entity.ExperienceOrbEntity wrapperContained) { this.wrapperContained = wrapperContained; }

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

// public yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(wrapperContained.interpolator); }
// public void interpolator(yarnwrap.entity.PositionInterpolator value) { wrapperContained.interpolator = value.wrapperContained; }
// public static yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(net.minecraft.entity.ExperienceOrbEntity.interpolator); }
// public static void interpolator(yarnwrap.entity.PositionInterpolator value, ) { net.minecraft.entity.ExperienceOrbEntity.interpolator = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData VALUE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VALUE); }
// public void VALUE(yarnwrap.entity.data.TrackedData value) { wrapperContained.VALUE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VALUE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.ExperienceOrbEntity.VALUE); }
// public static void VALUE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.ExperienceOrbEntity.VALUE = value.wrapperContained; }

// public short DEFAULT_HEALTH() { return wrapperContained.DEFAULT_HEALTH; }
// public void DEFAULT_HEALTH(short value) { wrapperContained.DEFAULT_HEALTH = value; }
// public static short DEFAULT_HEALTH() { return net.minecraft.entity.ExperienceOrbEntity.DEFAULT_HEALTH; }
// public static void DEFAULT_HEALTH(short value, ) { net.minecraft.entity.ExperienceOrbEntity.DEFAULT_HEALTH = value; }

// public short DEFAULT_AGE() { return wrapperContained.DEFAULT_AGE; }
// public void DEFAULT_AGE(short value) { wrapperContained.DEFAULT_AGE = value; }
// public static short DEFAULT_AGE() { return net.minecraft.entity.ExperienceOrbEntity.DEFAULT_AGE; }
// public static void DEFAULT_AGE(short value, ) { net.minecraft.entity.ExperienceOrbEntity.DEFAULT_AGE = value; }

// public short DEFAULT_VALUE() { return wrapperContained.DEFAULT_VALUE; }
// public void DEFAULT_VALUE(short value) { wrapperContained.DEFAULT_VALUE = value; }
// public static short DEFAULT_VALUE() { return net.minecraft.entity.ExperienceOrbEntity.DEFAULT_VALUE; }
// public static void DEFAULT_VALUE(short value, ) { net.minecraft.entity.ExperienceOrbEntity.DEFAULT_VALUE = value; }

// public int DEFAULT_COUNT() { return wrapperContained.DEFAULT_COUNT; }
// public void DEFAULT_COUNT(int value) { wrapperContained.DEFAULT_COUNT = value; }
// public static int DEFAULT_COUNT() { return net.minecraft.entity.ExperienceOrbEntity.DEFAULT_COUNT; }
// public static void DEFAULT_COUNT(int value, ) { net.minecraft.entity.ExperienceOrbEntity.DEFAULT_COUNT = value; }

public ExperienceOrbEntity(yarnwrap.world.World world,double x,double y,double z,int amount) { this.wrapperContained = new net.minecraft.entity.ExperienceOrbEntity(world.wrapperContained,x,y,z,amount); }
// public ExperienceOrbEntity(yarnwrap.world.World world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity,int amount) { this.wrapperContained = new net.minecraft.entity.ExperienceOrbEntity(world.wrapperContained,pos.wrapperContained,velocity.wrapperContained,amount); }
// public int roundToOrbSize(int value) { return wrapperContained.roundToOrbSize(value); }
// public static int roundToOrbSize(int value, ) { return net.minecraft.entity.ExperienceOrbEntity.roundToOrbSize(value); }
public int getValue() { return wrapperContained.getValue(); }
// public static int getValue() { return net.minecraft.entity.ExperienceOrbEntity.getValue(); }
public int getOrbSize() { return wrapperContained.getOrbSize(); }
// public static int getOrbSize() { return net.minecraft.entity.ExperienceOrbEntity.getOrbSize(); }
// public void applyWaterMovement() { wrapperContained.applyWaterMovement(); }
// public static void applyWaterMovement() { net.minecraft.entity.ExperienceOrbEntity.applyWaterMovement(); }
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
// public void moveTowardsPlayer() { wrapperContained.moveTowardsPlayer(); }
// public static void moveTowardsPlayer() { net.minecraft.entity.ExperienceOrbEntity.moveTowardsPlayer(); }
// public void setValue(int value) { wrapperContained.setValue(value); }
// public static void setValue(int value, ) { net.minecraft.entity.ExperienceOrbEntity.setValue(value); }
// public void spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity,int amount) { wrapperContained.spawn(world.wrapperContained,pos.wrapperContained,velocity.wrapperContained,amount); }
// public static void spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity,int amount, ) { net.minecraft.entity.ExperienceOrbEntity.spawn(world.wrapperContained,pos.wrapperContained,velocity.wrapperContained,amount); }

}