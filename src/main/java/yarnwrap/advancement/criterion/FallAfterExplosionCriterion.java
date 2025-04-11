package yarnwrap.advancement.criterion;
public class FallAfterExplosionCriterion { public net.minecraft.advancement.criterion.FallAfterExplosionCriterion wrapperContained; public FallAfterExplosionCriterion(net.minecraft.advancement.criterion.FallAfterExplosionCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.Vec3d startPosition,yarnwrap.entity.Entity cause) { wrapperContained.trigger(player.wrapperContained,startPosition.wrapperContained,cause.wrapperContained); }
// public boolean method_58359(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_58359(conditions.wrapperContained); }

}