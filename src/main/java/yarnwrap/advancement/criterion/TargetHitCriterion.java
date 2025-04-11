package yarnwrap.advancement.criterion;
public class TargetHitCriterion { public net.minecraft.advancement.criterion.TargetHitCriterion wrapperContained; public TargetHitCriterion(net.minecraft.advancement.criterion.TargetHitCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity projectile,yarnwrap.util.math.Vec3d hitPos,int signalStrength) { wrapperContained.trigger(player.wrapperContained,projectile.wrapperContained,hitPos.wrapperContained,signalStrength); }
// public boolean method_24951(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_24951(conditions.wrapperContained); }

}