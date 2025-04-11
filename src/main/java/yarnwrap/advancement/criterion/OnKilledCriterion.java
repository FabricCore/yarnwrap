package yarnwrap.advancement.criterion;
public class OnKilledCriterion { public net.minecraft.advancement.criterion.OnKilledCriterion wrapperContained; public OnKilledCriterion(net.minecraft.advancement.criterion.OnKilledCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22479(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22479(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource killingDamage) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained,killingDamage.wrapperContained); }

}