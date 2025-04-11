package yarnwrap.entity.passive;
public class WanderingTraderEntity { public net.minecraft.entity.passive.WanderingTraderEntity wrapperContained; public WanderingTraderEntity(net.minecraft.entity.passive.WanderingTraderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnDelay() { return wrapperContained.despawnDelay; }
// public void despawnDelay(int value) { wrapperContained.despawnDelay = value; }
// public yarnwrap.util.math.BlockPos wanderTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.wanderTarget); }
// public void wanderTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.wanderTarget = value.wrapperContained; }
public void setDespawnDelay(int despawnDelay) { wrapperContained.setDespawnDelay(despawnDelay); }
public int getDespawnDelay() { return wrapperContained.getDespawnDelay(); }
// public yarnwrap.util.math.BlockPos getWanderTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getWanderTarget()); }
// public boolean method_18067(yarnwrap.entity.passive.WanderingTraderEntity wanderingTrader) { return wrapperContained.method_18067(wanderingTrader.wrapperContained); }
// public boolean method_18068(yarnwrap.entity.passive.WanderingTraderEntity wanderingTrader) { return wrapperContained.method_18068(wanderingTrader.wrapperContained); }
public void setWanderTarget(yarnwrap.util.math.BlockPos wanderTarget) { wrapperContained.setWanderTarget(wanderTarget.wrapperContained); }
// public void tickDespawnDelay() { wrapperContained.tickDespawnDelay(); }
// public void fillRebalancedRecipes() { wrapperContained.fillRebalancedRecipes(); }
// public void method_57006(yarnwrap.util.math.BlockPos wanderTarget) { wrapperContained.method_57006(wanderTarget.wrapperContained); }

}