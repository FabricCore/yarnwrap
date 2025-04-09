package yarnwrap.advancement.criterion;
public class EntityHurtPlayerCriterion { public net.minecraft.advancement.criterion.EntityHurtPlayerCriterion wrapperContained; public EntityHurtPlayerCriterion(net.minecraft.advancement.criterion.EntityHurtPlayerCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked) { wrapperContained.trigger(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }

}