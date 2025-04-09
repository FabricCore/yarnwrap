package yarnwrap.entity.effect;
public class StatusEffectUtil { public net.minecraft.entity.effect.StatusEffectUtil wrapperContained; public StatusEffectUtil(net.minecraft.entity.effect.StatusEffectUtil wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List addEffectToPlayersWithinDistance(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d origin,double range,yarnwrap.entity.effect.StatusEffectInstance statusEffectInstance,int duration) { return wrapperContained.addEffectToPlayersWithinDistance(world.wrapperContained,entity.wrapperContained,origin.wrapperContained,range,statusEffectInstance.wrapperContained,duration); }
public boolean hasWaterBreathing(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasWaterBreathing(entity.wrapperContained); }
public int getHasteAmplifier(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getHasteAmplifier(entity.wrapperContained); }
public boolean hasHaste(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasHaste(entity.wrapperContained); }
public yarnwrap.text.Text getDurationText(yarnwrap.entity.effect.StatusEffectInstance effect,float multiplier,float tickRate) { return new yarnwrap.text.Text(wrapperContained.getDurationText(effect.wrapperContained,multiplier,tickRate)); }

}