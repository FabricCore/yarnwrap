package yarnwrap.entity.passive;
public class TurtleEntity { public net.minecraft.entity.passive.TurtleEntity wrapperContained; public TurtleEntity(net.minecraft.entity.passive.TurtleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float BABY_SCALE() { return wrapperContained.BABY_SCALE; }
// public void BABY_SCALE(float value) { wrapperContained.BABY_SCALE = value; }
// public static float BABY_SCALE() { return net.minecraft.entity.passive.TurtleEntity.BABY_SCALE; }
// public static void BABY_SCALE(float value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_SCALE = value; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.TurtleEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public int sandDiggingCounter() { return wrapperContained.sandDiggingCounter; }
// public void sandDiggingCounter(int value) { wrapperContained.sandDiggingCounter = value; }
// public static int sandDiggingCounter() { return net.minecraft.entity.passive.TurtleEntity.sandDiggingCounter; }
// public static void sandDiggingCounter(int value, ) { net.minecraft.entity.passive.TurtleEntity.sandDiggingCounter = value; }

// public yarnwrap.entity.data.TrackedData HAS_EGG() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_EGG); }
// public void HAS_EGG(yarnwrap.entity.data.TrackedData value) { wrapperContained.HAS_EGG = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HAS_EGG() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.HAS_EGG); }
// public static void HAS_EGG(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.HAS_EGG = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData HOME_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HOME_POS); }
// public void HOME_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.HOME_POS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HOME_POS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.HOME_POS); }
// public static void HOME_POS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.HOME_POS = value.wrapperContained; }

// public java.util.function.Predicate BABY_TURTLE_ON_LAND_FILTER() { return wrapperContained.BABY_TURTLE_ON_LAND_FILTER; }
// public void BABY_TURTLE_ON_LAND_FILTER(java.util.function.Predicate value) { wrapperContained.BABY_TURTLE_ON_LAND_FILTER = value; }
public static java.util.function.Predicate BABY_TURTLE_ON_LAND_FILTER() { return net.minecraft.entity.passive.TurtleEntity.BABY_TURTLE_ON_LAND_FILTER; }
// public static void BABY_TURTLE_ON_LAND_FILTER(java.util.function.Predicate value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_TURTLE_ON_LAND_FILTER = value; }

// public yarnwrap.entity.data.TrackedData TRAVEL_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRAVEL_POS); }
// public void TRAVEL_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRAVEL_POS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData TRAVEL_POS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.TRAVEL_POS); }
// public static void TRAVEL_POS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.TRAVEL_POS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData DIGGING_SAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DIGGING_SAND); }
// public void DIGGING_SAND(yarnwrap.entity.data.TrackedData value) { wrapperContained.DIGGING_SAND = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DIGGING_SAND() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.DIGGING_SAND); }
// public static void DIGGING_SAND(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.DIGGING_SAND = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData LAND_BOUND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAND_BOUND); }
// public void LAND_BOUND(yarnwrap.entity.data.TrackedData value) { wrapperContained.LAND_BOUND = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LAND_BOUND() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.LAND_BOUND); }
// public static void LAND_BOUND(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.LAND_BOUND = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData ACTIVELY_TRAVELING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ACTIVELY_TRAVELING); }
// public void ACTIVELY_TRAVELING(yarnwrap.entity.data.TrackedData value) { wrapperContained.ACTIVELY_TRAVELING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ACTIVELY_TRAVELING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.ACTIVELY_TRAVELING); }
// public static void ACTIVELY_TRAVELING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.ACTIVELY_TRAVELING = value.wrapperContained; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.TurtleEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createTurtleAttributes() { return wrapperContained.createTurtleAttributes(); }
public static Object createTurtleAttributes() { return net.minecraft.entity.passive.TurtleEntity.createTurtleAttributes(); }
// public boolean method_58376(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58376(stack.wrapperContained); }
// public static boolean method_58376(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.TurtleEntity.method_58376(stack.wrapperContained); }
// public void setDiggingSand(boolean diggingSand) { wrapperContained.setDiggingSand(diggingSand); }
// public static void setDiggingSand(boolean diggingSand, ) { net.minecraft.entity.passive.TurtleEntity.setDiggingSand(diggingSand); }
public boolean hasEgg() { return wrapperContained.hasEgg(); }
// public static boolean hasEgg() { return net.minecraft.entity.passive.TurtleEntity.hasEgg(); }
// public void setHasEgg(boolean hasEgg) { wrapperContained.setHasEgg(hasEgg); }
// public static void setHasEgg(boolean hasEgg, ) { net.minecraft.entity.passive.TurtleEntity.setHasEgg(hasEgg); }
public void setHomePos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setHomePos(pos.wrapperContained); }
// public static void setHomePos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.passive.TurtleEntity.setHomePos(pos.wrapperContained); }
// public boolean isLandBound() { return wrapperContained.isLandBound(); }
// public static boolean isLandBound() { return net.minecraft.entity.passive.TurtleEntity.isLandBound(); }
// public yarnwrap.util.math.BlockPos getTravelPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTravelPos()); }
// public static yarnwrap.util.math.BlockPos getTravelPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.TurtleEntity.getTravelPos()); }
// public boolean method_6688(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_6688(entity.wrapperContained); }
// public static boolean method_6688(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.TurtleEntity.method_6688(entity.wrapperContained); }
// public boolean isActivelyTraveling() { return wrapperContained.isActivelyTraveling(); }
// public static boolean isActivelyTraveling() { return net.minecraft.entity.passive.TurtleEntity.isActivelyTraveling(); }
// public yarnwrap.util.math.BlockPos getHomePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getHomePos()); }
// public static yarnwrap.util.math.BlockPos getHomePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.TurtleEntity.getHomePos()); }
public boolean isDiggingSand() { return wrapperContained.isDiggingSand(); }
// public static boolean isDiggingSand() { return net.minecraft.entity.passive.TurtleEntity.isDiggingSand(); }
// public void setActivelyTraveling(boolean traveling) { wrapperContained.setActivelyTraveling(traveling); }
// public static void setActivelyTraveling(boolean traveling, ) { net.minecraft.entity.passive.TurtleEntity.setActivelyTraveling(traveling); }
// public void setLandBound(boolean landBound) { wrapperContained.setLandBound(landBound); }
// public static void setLandBound(boolean landBound, ) { net.minecraft.entity.passive.TurtleEntity.setLandBound(landBound); }
// public void setTravelPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setTravelPos(pos.wrapperContained); }
// public static void setTravelPos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.passive.TurtleEntity.setTravelPos(pos.wrapperContained); }

}