package yarnwrap.entity;
public class ExperienceOrbEntity { public net.minecraft.entity.ExperienceOrbEntity wrapperContained; public ExperienceOrbEntity(net.minecraft.entity.ExperienceOrbEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pickingCount() { return wrapperContained.pickingCount; }
// public void pickingCount(int value) { wrapperContained.pickingCount = value; }
// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public int EXPENSIVE_UPDATE_INTERVAL() { return wrapperContained.EXPENSIVE_UPDATE_INTERVAL; }
// public void EXPENSIVE_UPDATE_INTERVAL(int value) { wrapperContained.EXPENSIVE_UPDATE_INTERVAL = value; }
// public int MERGING_CHANCE_FRACTION() { return wrapperContained.MERGING_CHANCE_FRACTION; }
// public void MERGING_CHANCE_FRACTION(int value) { wrapperContained.MERGING_CHANCE_FRACTION = value; }
// public int amount() { return wrapperContained.amount; }
// public void amount(int value) { wrapperContained.amount = value; }
// public int health() { return wrapperContained.health; }
// public void health(int value) { wrapperContained.health = value; }
// public yarnwrap.entity.player.PlayerEntity target() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.target = value.wrapperContained; }
// public int orbAge() { return wrapperContained.orbAge; }
// public void orbAge(int value) { wrapperContained.orbAge = value; }
public void spawn(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount) { wrapperContained.spawn(world.wrapperContained,pos.wrapperContained,amount); }
// public boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity other) { return wrapperContained.isMergeable(other.wrapperContained); }
// public boolean isMergeable(yarnwrap.entity.ExperienceOrbEntity orb,int seed,int amount) { return wrapperContained.isMergeable(orb.wrapperContained,seed,amount); }
// public boolean wasMergedIntoExistingOrb(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int amount) { return wrapperContained.wasMergedIntoExistingOrb(world.wrapperContained,pos.wrapperContained,amount); }
// public void merge(yarnwrap.entity.ExperienceOrbEntity other) { wrapperContained.merge(other.wrapperContained); }
// public void expensiveUpdate() { wrapperContained.expensiveUpdate(); }
// public int repairPlayerGears(yarnwrap.server.network.ServerPlayerEntity player,int amount) { return wrapperContained.repairPlayerGears(player.wrapperContained,amount); }
public int roundToOrbSize(int value) { return wrapperContained.roundToOrbSize(value); }
public int getExperienceAmount() { return wrapperContained.getExperienceAmount(); }
public int getOrbSize() { return wrapperContained.getOrbSize(); }
// public void applyWaterMovement() { wrapperContained.applyWaterMovement(); }

}