package yarnwrap.entity;
public class DamageUtil { public net.minecraft.entity.DamageUtil wrapperContained; public DamageUtil(net.minecraft.entity.DamageUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public float getDamageLeft(yarnwrap.entity.LivingEntity armorWearer,float damageAmount,yarnwrap.entity.damage.DamageSource damageSource,float armor,float armorToughness) { return wrapperContained.getDamageLeft(armorWearer.wrapperContained,damageAmount,damageSource.wrapperContained,armor,armorToughness); }
// public static float getDamageLeft(yarnwrap.entity.LivingEntity armorWearer,float damageAmount,yarnwrap.entity.damage.DamageSource damageSource,float armor,float armorToughness, ) { return net.minecraft.entity.DamageUtil.getDamageLeft(armorWearer.wrapperContained,damageAmount,damageSource.wrapperContained,armor,armorToughness); }
// public float getInflictedDamage(float damageDealt,float protection) { return wrapperContained.getInflictedDamage(damageDealt,protection); }
// public static float getInflictedDamage(float damageDealt,float protection, ) { return net.minecraft.entity.DamageUtil.getInflictedDamage(damageDealt,protection); }

}