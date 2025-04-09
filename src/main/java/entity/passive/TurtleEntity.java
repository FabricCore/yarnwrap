package yarnwrap.entity.passive;
public class TurtleEntity { public net.minecraft.entity.passive.TurtleEntity wrapperContained; public TurtleEntity(net.minecraft.entity.passive.TurtleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float BABY_SCALE() { return wrapperContained.BABY_SCALE; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public int sandDiggingCounter() { return wrapperContained.sandDiggingCounter; }
// public yarnwrap.entity.data.TrackedData HAS_EGG() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_EGG); }
// public yarnwrap.entity.data.TrackedData HOME_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HOME_POS); }
public java.util.function.Predicate BABY_TURTLE_ON_LAND_FILTER() { return wrapperContained.BABY_TURTLE_ON_LAND_FILTER; }
// public yarnwrap.entity.data.TrackedData TRAVEL_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRAVEL_POS); }
// public yarnwrap.entity.data.TrackedData DIGGING_SAND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DIGGING_SAND); }
// public yarnwrap.entity.data.TrackedData LAND_BOUND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAND_BOUND); }
// public yarnwrap.entity.data.TrackedData ACTIVELY_TRAVELING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ACTIVELY_TRAVELING); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createTurtleAttributes() { return wrapperContained.createTurtleAttributes(); }
// public void setDiggingSand(boolean diggingSand) { wrapperContained.setDiggingSand(diggingSand); }
public boolean hasEgg() { return wrapperContained.hasEgg(); }
// public void setHasEgg(boolean hasEgg) { wrapperContained.setHasEgg(hasEgg); }
public void setHomePos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setHomePos(pos.wrapperContained); }
// public boolean isLandBound() { return wrapperContained.isLandBound(); }
// public yarnwrap.util.math.BlockPos getTravelPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTravelPos()); }
// public boolean isActivelyTraveling() { return wrapperContained.isActivelyTraveling(); }
// public yarnwrap.util.math.BlockPos getHomePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getHomePos()); }
public boolean isDiggingSand() { return wrapperContained.isDiggingSand(); }
// public void setActivelyTraveling(boolean traveling) { wrapperContained.setActivelyTraveling(traveling); }
// public void setLandBound(boolean landBound) { wrapperContained.setLandBound(landBound); }
// public void setTravelPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setTravelPos(pos.wrapperContained); }

}