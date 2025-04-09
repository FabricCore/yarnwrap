package yarnwrap.entity;
public class ExperienceOrbEntity { public net.minecraft.entity.ExperienceOrbEntity wrapperContained; public ExperienceOrbEntity(net.minecraft.entity.ExperienceOrbEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pickingCount() { return wrapperContained.pickingCount; }
// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public int EXPENSIVE_UPDATE_INTERVAL() { return wrapperContained.EXPENSIVE_UPDATE_INTERVAL; }
// public int MERGING_CHANCE_FRACTION() { return wrapperContained.MERGING_CHANCE_FRACTION; }
// public int amount() { return wrapperContained.amount; }
// public int health() { return wrapperContained.health; }
// public yarnwrap.entity.player.PlayerEntity target() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.target); }
// public int orbAge() { return wrapperContained.orbAge; }
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