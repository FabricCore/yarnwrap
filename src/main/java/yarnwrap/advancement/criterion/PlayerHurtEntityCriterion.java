package yarnwrap.advancement.criterion;
public class PlayerHurtEntityCriterion { public net.minecraft.advancement.criterion.PlayerHurtEntityCriterion wrapperContained; public PlayerHurtEntityCriterion(net.minecraft.advancement.criterion.PlayerHurtEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damage,float dealt,float taken,boolean blocked) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained,damage.wrapperContained,dealt,taken,blocked); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damage,float dealt,float taken,boolean blocked, ) { net.minecraft.advancement.criterion.PlayerHurtEntityCriterion.trigger(player.wrapperContained,entity.wrapperContained,damage.wrapperContained,dealt,taken,blocked); }
// public boolean method_22493(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22493(conditions.wrapperContained); }
// public static boolean method_22493(yarnwrap.server.network.ServerPlayerEntity conditions, ) { return net.minecraft.advancement.criterion.PlayerHurtEntityCriterion.method_22493(conditions.wrapperContained); }

}