package yarnwrap.advancement.criterion;
public class EntityHurtPlayerCriterion { public net.minecraft.advancement.criterion.EntityHurtPlayerCriterion wrapperContained; public EntityHurtPlayerCriterion(net.minecraft.advancement.criterion.EntityHurtPlayerCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked) { wrapperContained.trigger(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked, ) { net.minecraft.advancement.criterion.EntityHurtPlayerCriterion.trigger(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }
// public boolean method_22468(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22468(conditions.wrapperContained); }
// public static boolean method_22468(yarnwrap.server.network.ServerPlayerEntity conditions, ) { return net.minecraft.advancement.criterion.EntityHurtPlayerCriterion.method_22468(conditions.wrapperContained); }

}