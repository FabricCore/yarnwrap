package yarnwrap.entity.passive;
public class TurtleEntity { public net.minecraft.entity.passive.TurtleEntity wrapperContained; public TurtleEntity(net.minecraft.entity.passive.TurtleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sandDiggingCounter() { return wrapperContained.sandDiggingCounter; }
// public void sandDiggingCounter(int value) { wrapperContained.sandDiggingCounter = value; }
// public static int sandDiggingCounter() { return net.minecraft.entity.passive.TurtleEntity.sandDiggingCounter; }
// public static void sandDiggingCounter(int value, ) { net.minecraft.entity.passive.TurtleEntity.sandDiggingCounter = value; }

// public yarnwrap.entity.data.TrackedData HAS_EGG() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_EGG); }
// public void HAS_EGG(yarnwrap.entity.data.TrackedData value) { wrapperContained.HAS_EGG = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HAS_EGG() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.HAS_EGG); }
// public static void HAS_EGG(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.HAS_EGG = value.wrapperContained; }

// public Object BABY_TURTLE_ON_LAND_FILTER() { return wrapperContained.BABY_TURTLE_ON_LAND_FILTER; }
// // public void BABY_TURTLE_ON_LAND_FILTER(Object value) { wrapperContained.BABY_TURTLE_ON_LAND_FILTER = value; }
// public static Object BABY_TURTLE_ON_LAND_FILTER() { return net.minecraft.entity.passive.TurtleEntity.BABY_TURTLE_ON_LAND_FILTER; }
// // public static void BABY_TURTLE_ON_LAND_FILTER(Object value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_TURTLE_ON_LAND_FILTER = value; }

// public yarnwrap.entity.data.TrackedData DIGGING_SAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DIGGING_SAND); }
// public void DIGGING_SAND(yarnwrap.entity.data.TrackedData value) { wrapperContained.DIGGING_SAND = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DIGGING_SAND() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TurtleEntity.DIGGING_SAND); }
// public static void DIGGING_SAND(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TurtleEntity.DIGGING_SAND = value.wrapperContained; }

// public float BABY_SCALE() { return wrapperContained.BABY_SCALE; }
// public void BABY_SCALE(float value) { wrapperContained.BABY_SCALE = value; }
// public static float BABY_SCALE() { return net.minecraft.entity.passive.TurtleEntity.BABY_SCALE; }
// public static void BABY_SCALE(float value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_SCALE = value; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.TurtleEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.TurtleEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos homePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.homePos); }
// public void homePos(yarnwrap.util.math.BlockPos value) { wrapperContained.homePos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos homePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.TurtleEntity.homePos); }
// public static void homePos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.passive.TurtleEntity.homePos = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos travelPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.travelPos); }
// public void travelPos(yarnwrap.util.math.BlockPos value) { wrapperContained.travelPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos travelPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.TurtleEntity.travelPos); }
// public static void travelPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.passive.TurtleEntity.travelPos = value.wrapperContained; }

// public boolean landBound() { return wrapperContained.landBound; }
// public void landBound(boolean value) { wrapperContained.landBound = value; }
// public static boolean landBound() { return net.minecraft.entity.passive.TurtleEntity.landBound; }
// public static void landBound(boolean value, ) { net.minecraft.entity.passive.TurtleEntity.landBound = value; }

// public boolean DEFAULT_HAS_EGG() { return wrapperContained.DEFAULT_HAS_EGG; }
// public void DEFAULT_HAS_EGG(boolean value) { wrapperContained.DEFAULT_HAS_EGG = value; }
// public static boolean DEFAULT_HAS_EGG() { return net.minecraft.entity.passive.TurtleEntity.DEFAULT_HAS_EGG; }
// public static void DEFAULT_HAS_EGG(boolean value, ) { net.minecraft.entity.passive.TurtleEntity.DEFAULT_HAS_EGG = value; }

// public void setDiggingSand(boolean diggingSand) { wrapperContained.setDiggingSand(diggingSand); }
// public static void setDiggingSand(boolean diggingSand, ) { net.minecraft.entity.passive.TurtleEntity.setDiggingSand(diggingSand); }
public boolean hasEgg() { return wrapperContained.hasEgg(); }
// public static boolean hasEgg() { return net.minecraft.entity.passive.TurtleEntity.hasEgg(); }
// public void setHasEgg(boolean hasEgg) { wrapperContained.setHasEgg(hasEgg); }
// public static void setHasEgg(boolean hasEgg, ) { net.minecraft.entity.passive.TurtleEntity.setHasEgg(hasEgg); }
public void setHomePos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setHomePos(pos.wrapperContained); }
// public static void setHomePos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.passive.TurtleEntity.setHomePos(pos.wrapperContained); }
// public boolean method_6688(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_6688(entity.wrapperContained,world.wrapperContained); }
// public static boolean method_6688(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.passive.TurtleEntity.method_6688(entity.wrapperContained,world.wrapperContained); }
public boolean isDiggingSand() { return wrapperContained.isDiggingSand(); }
// public static boolean isDiggingSand() { return net.minecraft.entity.passive.TurtleEntity.isDiggingSand(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.TurtleEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createTurtleAttributes() { return wrapperContained.createTurtleAttributes(); }
public static Object createTurtleAttributes() { return net.minecraft.entity.passive.TurtleEntity.createTurtleAttributes(); }
// public boolean method_58376(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58376(stack.wrapperContained); }
// public static boolean method_58376(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.TurtleEntity.method_58376(stack.wrapperContained); }

}