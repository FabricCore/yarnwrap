package yarnwrap.advancement.criterion;
public class PlayerHurtEntityCriterion { public net.minecraft.advancement.criterion.PlayerHurtEntityCriterion wrapperContained; public PlayerHurtEntityCriterion(net.minecraft.advancement.criterion.PlayerHurtEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damage,float dealt,float taken,boolean blocked) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained,damage.wrapperContained,dealt,taken,blocked); }

}