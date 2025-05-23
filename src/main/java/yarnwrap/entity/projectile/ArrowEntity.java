package yarnwrap.entity.projectile;
public class ArrowEntity { public net.minecraft.entity.projectile.ArrowEntity wrapperContained; public ArrowEntity(net.minecraft.entity.projectile.ArrowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLOR = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.ArrowEntity.COLOR); }
// public static void COLOR(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.ArrowEntity.COLOR = value.wrapperContained; }

// public int NO_POTION_COLOR() { return wrapperContained.NO_POTION_COLOR; }
// public void NO_POTION_COLOR(int value) { wrapperContained.NO_POTION_COLOR = value; }
// public static int NO_POTION_COLOR() { return net.minecraft.entity.projectile.ArrowEntity.NO_POTION_COLOR; }
// public static void NO_POTION_COLOR(int value, ) { net.minecraft.entity.projectile.ArrowEntity.NO_POTION_COLOR = value; }

// public byte PARTICLE_EFFECT_STATUS() { return wrapperContained.PARTICLE_EFFECT_STATUS; }
// public void PARTICLE_EFFECT_STATUS(byte value) { wrapperContained.PARTICLE_EFFECT_STATUS = value; }
// public static byte PARTICLE_EFFECT_STATUS() { return net.minecraft.entity.projectile.ArrowEntity.PARTICLE_EFFECT_STATUS; }
// public static void PARTICLE_EFFECT_STATUS(byte value, ) { net.minecraft.entity.projectile.ArrowEntity.PARTICLE_EFFECT_STATUS = value; }

// public int MAX_POTION_DURATION_TICKS() { return wrapperContained.MAX_POTION_DURATION_TICKS; }
// public void MAX_POTION_DURATION_TICKS(int value) { wrapperContained.MAX_POTION_DURATION_TICKS = value; }
// public static int MAX_POTION_DURATION_TICKS() { return net.minecraft.entity.projectile.ArrowEntity.MAX_POTION_DURATION_TICKS; }
// public static void MAX_POTION_DURATION_TICKS(int value, ) { net.minecraft.entity.projectile.ArrowEntity.MAX_POTION_DURATION_TICKS = value; }

public ArrowEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.ArrowEntity(world.wrapperContained,x,y,z,stack.wrapperContained,shotFrom.wrapperContained); }
public ArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.ArrowEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained,shotFrom.wrapperContained); }
public int getColor() { return wrapperContained.getColor(); }
// public static int getColor() { return net.minecraft.entity.projectile.ArrowEntity.getColor(); }
// public void spawnParticles(int amount) { wrapperContained.spawnParticles(amount); }
// public static void spawnParticles(int amount, ) { net.minecraft.entity.projectile.ArrowEntity.spawnParticles(amount); }
// public void initColor() { wrapperContained.initColor(); }
// public static void initColor() { net.minecraft.entity.projectile.ArrowEntity.initColor(); }
public void addEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.addEffect(effect.wrapperContained); }
// public static void addEffect(yarnwrap.entity.effect.StatusEffectInstance effect, ) { net.minecraft.entity.projectile.ArrowEntity.addEffect(effect.wrapperContained); }
// public void method_48574(yarnwrap.entity.LivingEntity effect) { wrapperContained.method_48574(effect.wrapperContained); }
// public static void method_48574(yarnwrap.entity.LivingEntity effect, ) { net.minecraft.entity.projectile.ArrowEntity.method_48574(effect.wrapperContained); }
// public yarnwrap.component.type.PotionContentsComponent getPotionContents() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.getPotionContents()); }
// public static yarnwrap.component.type.PotionContentsComponent getPotionContents() { return new yarnwrap.component.type.PotionContentsComponent(net.minecraft.entity.projectile.ArrowEntity.getPotionContents()); }
// public void setPotionContents(yarnwrap.component.type.PotionContentsComponent potionContentsComponent) { wrapperContained.setPotionContents(potionContentsComponent.wrapperContained); }
// public static void setPotionContents(yarnwrap.component.type.PotionContentsComponent potionContentsComponent, ) { net.minecraft.entity.projectile.ArrowEntity.setPotionContents(potionContentsComponent.wrapperContained); }
// public float getPotionDurationScale() { return wrapperContained.getPotionDurationScale(); }
// public static float getPotionDurationScale() { return net.minecraft.entity.projectile.ArrowEntity.getPotionDurationScale(); }

}