package yarnwrap.entity.passive;
public class WanderingTraderEntity { public net.minecraft.entity.passive.WanderingTraderEntity wrapperContained; public WanderingTraderEntity(net.minecraft.entity.passive.WanderingTraderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnDelay() { return wrapperContained.despawnDelay; }
// public yarnwrap.util.math.BlockPos wanderTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.wanderTarget); }
public void setDespawnDelay(int despawnDelay) { wrapperContained.setDespawnDelay(despawnDelay); }
public int getDespawnDelay() { return wrapperContained.getDespawnDelay(); }
// public yarnwrap.util.math.BlockPos getWanderTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getWanderTarget()); }
public void setWanderTarget(yarnwrap.util.math.BlockPos wanderTarget) { wrapperContained.setWanderTarget(wanderTarget.wrapperContained); }
// public void tickDespawnDelay() { wrapperContained.tickDespawnDelay(); }
// public void fillRebalancedRecipes() { wrapperContained.fillRebalancedRecipes(); }

}