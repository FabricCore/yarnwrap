package yarnwrap.entity.projectile;
public class PersistentProjectileEntity { public net.minecraft.entity.projectile.PersistentProjectileEntity wrapperContained; public PersistentProjectileEntity(net.minecraft.entity.projectile.PersistentProjectileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CRITICAL_FLAG() { return wrapperContained.CRITICAL_FLAG; }
// public int NO_CLIP_FLAG() { return wrapperContained.NO_CLIP_FLAG; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public yarnwrap.item.ItemStack weapon() { return new yarnwrap.item.ItemStack(wrapperContained.weapon); }
// public double damage() { return wrapperContained.damage; }
public Object pickupType() { return wrapperContained.pickupType; }
// public yarnwrap.entity.data.TrackedData PROJECTILE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PROJECTILE_FLAGS); }
public int shake() { return wrapperContained.shake; }
// public int inGroundTime() { return wrapperContained.inGroundTime; }
// public int life() { return wrapperContained.life; }
// public java.util.List piercingKilledEntities() { return wrapperContained.piercingKilledEntities; }
// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public yarnwrap.block.BlockState inBlockState() { return new yarnwrap.block.BlockState(wrapperContained.inBlockState); }
// public boolean inGround() { return wrapperContained.inGround; }
// public yarnwrap.entity.data.TrackedData PIERCE_LEVEL() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PIERCE_LEVEL); }
// public it.unimi.dsi.fastutil.ints.IntOpenHashSet piercedEntities() { return wrapperContained.piercedEntities; }
// public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }
// public boolean shouldFall() { return wrapperContained.shouldFall(); }
// public void fall() { wrapperContained.fall(); }
// public boolean tryPickup(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.tryPickup(player.wrapperContained); }
public yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack()); }
// public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getDefaultItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultItemStack()); }
public void applyDamageModifier(float damageModifier) { wrapperContained.applyDamageModifier(damageModifier); }
// public void onBlockHitEnchantmentEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.hit.BlockHitResult blockHitResult,yarnwrap.item.ItemStack weaponStack) { wrapperContained.onBlockHitEnchantmentEffects(world.wrapperContained,blockHitResult.wrapperContained,weaponStack.wrapperContained); }
// public void knockback(yarnwrap.entity.LivingEntity target,yarnwrap.entity.damage.DamageSource source) { wrapperContained.knockback(target.wrapperContained,source.wrapperContained); }
public void setNoClip(boolean noClip) { wrapperContained.setNoClip(noClip); }
// public yarnwrap.util.hit.EntityHitResult getEntityCollision(yarnwrap.util.math.Vec3d currentPosition,yarnwrap.util.math.Vec3d nextPosition) { return new yarnwrap.util.hit.EntityHitResult(wrapperContained.getEntityCollision(currentPosition.wrapperContained,nextPosition.wrapperContained)); }
// public float getDragInWater() { return wrapperContained.getDragInWater(); }
public void setDamage(double damage) { wrapperContained.setDamage(damage); }
public void setCritical(boolean critical) { wrapperContained.setCritical(critical); }
// public yarnwrap.sound.SoundEvent getHitSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getHitSound()); }
public boolean isNoClip() { return wrapperContained.isNoClip(); }
public boolean isCritical() { return wrapperContained.isCritical(); }
public void setSound(yarnwrap.sound.SoundEvent sound) { wrapperContained.setSound(sound.wrapperContained); }
// public yarnwrap.item.ItemStack asItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.asItemStack()); }
// public void age() { wrapperContained.age(); }
public byte getPierceLevel() { return wrapperContained.getPierceLevel(); }
public double getDamage() { return wrapperContained.getDamage(); }
// public void onHit(yarnwrap.entity.LivingEntity target) { wrapperContained.onHit(target.wrapperContained); }
// public void setPierceLevel(byte level) { wrapperContained.setPierceLevel(level); }
// public void clearPiercingStatus() { wrapperContained.clearPiercingStatus(); }
// public void setProjectileFlag(int index,boolean flag) { wrapperContained.setProjectileFlag(index,flag); }
public boolean isShotFromCrossbow() { return wrapperContained.isShotFromCrossbow(); }

}