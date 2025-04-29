package yarnwrap.entity.effect;
public class StatusEffectUtil { public net.minecraft.entity.effect.StatusEffectUtil wrapperContained; public StatusEffectUtil(net.minecraft.entity.effect.StatusEffectUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List addEffectToPlayersWithinDistance(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d origin,double range,yarnwrap.entity.effect.StatusEffectInstance statusEffectInstance,int duration) { return wrapperContained.addEffectToPlayersWithinDistance(world.wrapperContained,entity.wrapperContained,origin.wrapperContained,range,statusEffectInstance.wrapperContained,duration); }
// public static java.util.List addEffectToPlayersWithinDistance(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d origin,double range,yarnwrap.entity.effect.StatusEffectInstance statusEffectInstance,int duration, ) { return net.minecraft.entity.effect.StatusEffectUtil.addEffectToPlayersWithinDistance(world.wrapperContained,entity.wrapperContained,origin.wrapperContained,range,statusEffectInstance.wrapperContained,duration); }
// public void method_42144(yarnwrap.entity.effect.StatusEffectInstance player) { wrapperContained.method_42144(player.wrapperContained); }
// public static void method_42144(yarnwrap.entity.effect.StatusEffectInstance player, ) { net.minecraft.entity.effect.StatusEffectUtil.method_42144(player.wrapperContained); }
// public boolean method_42145(yarnwrap.entity.Entity player) { return wrapperContained.method_42145(player.wrapperContained); }
// public static boolean method_42145(yarnwrap.entity.Entity player, ) { return net.minecraft.entity.effect.StatusEffectUtil.method_42145(player.wrapperContained); }
// public boolean hasWaterBreathing(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasWaterBreathing(entity.wrapperContained); }
// public static boolean hasWaterBreathing(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.effect.StatusEffectUtil.hasWaterBreathing(entity.wrapperContained); }
// public int getHasteAmplifier(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getHasteAmplifier(entity.wrapperContained); }
// public static int getHasteAmplifier(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.effect.StatusEffectUtil.getHasteAmplifier(entity.wrapperContained); }
// public boolean hasHaste(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasHaste(entity.wrapperContained); }
// public static boolean hasHaste(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.effect.StatusEffectUtil.hasHaste(entity.wrapperContained); }
// public yarnwrap.text.Text getDurationText(yarnwrap.entity.effect.StatusEffectInstance effect,float multiplier,float tickRate) { return new yarnwrap.text.Text(wrapperContained.getDurationText(effect.wrapperContained,multiplier,tickRate)); }
// public static yarnwrap.text.Text getDurationText(yarnwrap.entity.effect.StatusEffectInstance effect,float multiplier,float tickRate, ) { return new yarnwrap.text.Text(net.minecraft.entity.effect.StatusEffectUtil.getDurationText(effect.wrapperContained,multiplier,tickRate)); }

}