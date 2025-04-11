package yarnwrap.entity.projectile;
public class ArrowEntity { public net.minecraft.entity.projectile.ArrowEntity wrapperContained; public ArrowEntity(net.minecraft.entity.projectile.ArrowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int NO_POTION_COLOR() { return wrapperContained.NO_POTION_COLOR; }
// public void NO_POTION_COLOR(int value) { wrapperContained.NO_POTION_COLOR = value; }
// public byte PARTICLE_EFFECT_STATUS() { return wrapperContained.PARTICLE_EFFECT_STATUS; }
// public void PARTICLE_EFFECT_STATUS(byte value) { wrapperContained.PARTICLE_EFFECT_STATUS = value; }
// public int MAX_POTION_DURATION_TICKS() { return wrapperContained.MAX_POTION_DURATION_TICKS; }
// public void MAX_POTION_DURATION_TICKS(int value) { wrapperContained.MAX_POTION_DURATION_TICKS = value; }
// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLOR = value.wrapperContained; }
public ArrowEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.ArrowEntity(world.wrapperContained,x,y,z,stack.wrapperContained,shotFrom.wrapperContained); }
public ArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.ArrowEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained,shotFrom.wrapperContained); }
// public yarnwrap.component.type.PotionContentsComponent getPotionContents() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.getPotionContents()); }
// public void setPotionContents(yarnwrap.component.type.PotionContentsComponent potionContentsComponent) { wrapperContained.setPotionContents(potionContentsComponent.wrapperContained); }
public int getColor() { return wrapperContained.getColor(); }
// public void spawnParticles(int amount) { wrapperContained.spawnParticles(amount); }
// public void initColor() { wrapperContained.initColor(); }
public void addEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.addEffect(effect.wrapperContained); }

}