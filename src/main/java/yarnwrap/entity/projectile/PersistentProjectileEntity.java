package yarnwrap.entity.projectile;
public class PersistentProjectileEntity { public net.minecraft.entity.projectile.PersistentProjectileEntity wrapperContained; public PersistentProjectileEntity(net.minecraft.entity.projectile.PersistentProjectileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public double damage() { return wrapperContained.damage; }
// public void damage(double value) { wrapperContained.damage = value; }
// public static double damage() { return net.minecraft.entity.projectile.PersistentProjectileEntity.damage; }
// public static void damage(double value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.damage = value; }

public Object pickupType() { return wrapperContained.pickupType; }
// public void pickupType(Object value) { wrapperContained.pickupType = value; }
// // public static Object pickupType() { return net.minecraft.entity.projectile.PersistentProjectileEntity.pickupType; }
// // public static void pickupType(Object value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.pickupType = value; }

// public yarnwrap.entity.data.TrackedData PROJECTILE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PROJECTILE_FLAGS); }
// public void PROJECTILE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.PROJECTILE_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData PROJECTILE_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.PersistentProjectileEntity.PROJECTILE_FLAGS); }
// public static void PROJECTILE_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.PROJECTILE_FLAGS = value.wrapperContained; }

public int shake() { return wrapperContained.shake; }
public void shake(int value) { wrapperContained.shake = value; }
// public static int shake() { return net.minecraft.entity.projectile.PersistentProjectileEntity.shake; }
// public static void shake(int value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.shake = value; }

// public int inGroundTime() { return wrapperContained.inGroundTime; }
// public void inGroundTime(int value) { wrapperContained.inGroundTime = value; }
// public static int inGroundTime() { return net.minecraft.entity.projectile.PersistentProjectileEntity.inGroundTime; }
// public static void inGroundTime(int value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.inGroundTime = value; }

// public int life() { return wrapperContained.life; }
// public void life(int value) { wrapperContained.life = value; }
// public static int life() { return net.minecraft.entity.projectile.PersistentProjectileEntity.life; }
// public static void life(int value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.life = value; }

// public java.util.List piercingKilledEntities() { return wrapperContained.piercingKilledEntities; }
// public void piercingKilledEntities(java.util.List value) { wrapperContained.piercingKilledEntities = value; }
// public static java.util.List piercingKilledEntities() { return net.minecraft.entity.projectile.PersistentProjectileEntity.piercingKilledEntities; }
// public static void piercingKilledEntities(java.util.List value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.piercingKilledEntities = value; }

// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.projectile.PersistentProjectileEntity.sound); }
// public static void sound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.sound = value.wrapperContained; }

// public yarnwrap.block.BlockState inBlockState() { return new yarnwrap.block.BlockState(wrapperContained.inBlockState); }
// public void inBlockState(yarnwrap.block.BlockState value) { wrapperContained.inBlockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState inBlockState() { return new yarnwrap.block.BlockState(net.minecraft.entity.projectile.PersistentProjectileEntity.inBlockState); }
// public static void inBlockState(yarnwrap.block.BlockState value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.inBlockState = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData PIERCE_LEVEL() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PIERCE_LEVEL); }
// public void PIERCE_LEVEL(yarnwrap.entity.data.TrackedData value) { wrapperContained.PIERCE_LEVEL = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData PIERCE_LEVEL() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.PersistentProjectileEntity.PIERCE_LEVEL); }
// public static void PIERCE_LEVEL(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.PIERCE_LEVEL = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntOpenHashSet piercedEntities() { return wrapperContained.piercedEntities; }
// public void piercedEntities(it.unimi.dsi.fastutil.ints.IntOpenHashSet value) { wrapperContained.piercedEntities = value; }
// public static it.unimi.dsi.fastutil.ints.IntOpenHashSet piercedEntities() { return net.minecraft.entity.projectile.PersistentProjectileEntity.piercedEntities; }
// public static void piercedEntities(it.unimi.dsi.fastutil.ints.IntOpenHashSet value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.piercedEntities = value; }

// public int CRITICAL_FLAG() { return wrapperContained.CRITICAL_FLAG; }
// public void CRITICAL_FLAG(int value) { wrapperContained.CRITICAL_FLAG = value; }
// public static int CRITICAL_FLAG() { return net.minecraft.entity.projectile.PersistentProjectileEntity.CRITICAL_FLAG; }
// public static void CRITICAL_FLAG(int value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.CRITICAL_FLAG = value; }

// public int NO_CLIP_FLAG() { return wrapperContained.NO_CLIP_FLAG; }
// public void NO_CLIP_FLAG(int value) { wrapperContained.NO_CLIP_FLAG = value; }
// public static int NO_CLIP_FLAG() { return net.minecraft.entity.projectile.PersistentProjectileEntity.NO_CLIP_FLAG; }
// public static void NO_CLIP_FLAG(int value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.NO_CLIP_FLAG = value; }

// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.PersistentProjectileEntity.stack); }
// public static void stack(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.stack = value.wrapperContained; }

// public yarnwrap.item.ItemStack weapon() { return new yarnwrap.item.ItemStack(wrapperContained.weapon); }
// public void weapon(yarnwrap.item.ItemStack value) { wrapperContained.weapon = value.wrapperContained; }
// public static yarnwrap.item.ItemStack weapon() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.PersistentProjectileEntity.weapon); }
// public static void weapon(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.weapon = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData IN_GROUND() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IN_GROUND); }
// public void IN_GROUND(yarnwrap.entity.data.TrackedData value) { wrapperContained.IN_GROUND = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData IN_GROUND() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.PersistentProjectileEntity.IN_GROUND); }
// public static void IN_GROUND(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.IN_GROUND = value.wrapperContained; }

// public float DEFAULT_DRAG() { return wrapperContained.DEFAULT_DRAG; }
// public void DEFAULT_DRAG(float value) { wrapperContained.DEFAULT_DRAG = value; }
// public static float DEFAULT_DRAG() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_DRAG; }
// public static void DEFAULT_DRAG(float value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_DRAG = value; }

// public short DEFAULT_LIFE() { return wrapperContained.DEFAULT_LIFE; }
// public void DEFAULT_LIFE(short value) { wrapperContained.DEFAULT_LIFE = value; }
// public static short DEFAULT_LIFE() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_LIFE; }
// public static void DEFAULT_LIFE(short value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_LIFE = value; }

// public byte DEFAULT_SHAKE() { return wrapperContained.DEFAULT_SHAKE; }
// public void DEFAULT_SHAKE(byte value) { wrapperContained.DEFAULT_SHAKE = value; }
// public static byte DEFAULT_SHAKE() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_SHAKE; }
// public static void DEFAULT_SHAKE(byte value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_SHAKE = value; }

// public boolean DEFAULT_IN_GROUND() { return wrapperContained.DEFAULT_IN_GROUND; }
// public void DEFAULT_IN_GROUND(boolean value) { wrapperContained.DEFAULT_IN_GROUND = value; }
// public static boolean DEFAULT_IN_GROUND() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_IN_GROUND; }
// public static void DEFAULT_IN_GROUND(boolean value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_IN_GROUND = value; }

// public boolean DEFAULT_CRITICAL() { return wrapperContained.DEFAULT_CRITICAL; }
// public void DEFAULT_CRITICAL(boolean value) { wrapperContained.DEFAULT_CRITICAL = value; }
// public static boolean DEFAULT_CRITICAL() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_CRITICAL; }
// public static void DEFAULT_CRITICAL(boolean value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_CRITICAL = value; }

// public byte DEFAULT_PIERCE_LEVEL() { return wrapperContained.DEFAULT_PIERCE_LEVEL; }
// public void DEFAULT_PIERCE_LEVEL(byte value) { wrapperContained.DEFAULT_PIERCE_LEVEL = value; }
// public static byte DEFAULT_PIERCE_LEVEL() { return net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_PIERCE_LEVEL; }
// public static void DEFAULT_PIERCE_LEVEL(byte value, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.DEFAULT_PIERCE_LEVEL = value; }

// public PersistentProjectileEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack weapon) { this.wrapperContained = new net.minecraft.entity.projectile.PersistentProjectileEntity(type.wrapperContained,x,y,z,world.wrapperContained,stack.wrapperContained,weapon.wrapperContained); }
// public PersistentProjectileEntity(yarnwrap.entity.EntityType type,yarnwrap.entity.LivingEntity owner,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack shotFrom) { this.wrapperContained = new net.minecraft.entity.projectile.PersistentProjectileEntity(type.wrapperContained,owner.wrapperContained,world.wrapperContained,stack.wrapperContained,shotFrom.wrapperContained); }
public void setNoClip(boolean noClip) { wrapperContained.setNoClip(noClip); }
// public static void setNoClip(boolean noClip, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setNoClip(noClip); }
// public yarnwrap.util.hit.EntityHitResult getEntityCollision(yarnwrap.util.math.Vec3d currentPosition,yarnwrap.util.math.Vec3d nextPosition) { return new yarnwrap.util.hit.EntityHitResult(wrapperContained.getEntityCollision(currentPosition.wrapperContained,nextPosition.wrapperContained)); }
// public static yarnwrap.util.hit.EntityHitResult getEntityCollision(yarnwrap.util.math.Vec3d currentPosition,yarnwrap.util.math.Vec3d nextPosition, ) { return new yarnwrap.util.hit.EntityHitResult(net.minecraft.entity.projectile.PersistentProjectileEntity.getEntityCollision(currentPosition.wrapperContained,nextPosition.wrapperContained)); }
// public float getDragInWater() { return wrapperContained.getDragInWater(); }
// public static float getDragInWater() { return net.minecraft.entity.projectile.PersistentProjectileEntity.getDragInWater(); }
public void setDamage(double damage) { wrapperContained.setDamage(damage); }
// public static void setDamage(double damage, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setDamage(damage); }
public void setCritical(boolean critical) { wrapperContained.setCritical(critical); }
// public static void setCritical(boolean critical, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setCritical(critical); }
// public yarnwrap.sound.SoundEvent getHitSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getHitSound()); }
// public static yarnwrap.sound.SoundEvent getHitSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.projectile.PersistentProjectileEntity.getHitSound()); }
public boolean isNoClip() { return wrapperContained.isNoClip(); }
// public static boolean isNoClip() { return net.minecraft.entity.projectile.PersistentProjectileEntity.isNoClip(); }
public boolean isCritical() { return wrapperContained.isCritical(); }
// public static boolean isCritical() { return net.minecraft.entity.projectile.PersistentProjectileEntity.isCritical(); }
public void setSound(yarnwrap.sound.SoundEvent sound) { wrapperContained.setSound(sound.wrapperContained); }
// public static void setSound(yarnwrap.sound.SoundEvent sound, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setSound(sound.wrapperContained); }
// public yarnwrap.item.ItemStack asItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.asItemStack()); }
// public static yarnwrap.item.ItemStack asItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.PersistentProjectileEntity.asItemStack()); }
// public void age() { wrapperContained.age(); }
// public static void age() { net.minecraft.entity.projectile.PersistentProjectileEntity.age(); }
public byte getPierceLevel() { return wrapperContained.getPierceLevel(); }
// public static byte getPierceLevel() { return net.minecraft.entity.projectile.PersistentProjectileEntity.getPierceLevel(); }
// public void onHit(yarnwrap.entity.LivingEntity target) { wrapperContained.onHit(target.wrapperContained); }
// public static void onHit(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.onHit(target.wrapperContained); }
// public void setPierceLevel(byte level) { wrapperContained.setPierceLevel(level); }
// public static void setPierceLevel(byte level, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setPierceLevel(level); }
// public void clearPiercingStatus() { wrapperContained.clearPiercingStatus(); }
// public static void clearPiercingStatus() { net.minecraft.entity.projectile.PersistentProjectileEntity.clearPiercingStatus(); }
// public void setProjectileFlag(int index,boolean flag) { wrapperContained.setProjectileFlag(index,flag); }
// public static void setProjectileFlag(int index,boolean flag, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setProjectileFlag(index,flag); }
// public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }
// public static yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.projectile.PersistentProjectileEntity.getSound()); }
// public boolean shouldFall() { return wrapperContained.shouldFall(); }
// public static boolean shouldFall() { return net.minecraft.entity.projectile.PersistentProjectileEntity.shouldFall(); }
// public void fall() { wrapperContained.fall(); }
// public static void fall() { net.minecraft.entity.projectile.PersistentProjectileEntity.fall(); }
// public boolean tryPickup(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.tryPickup(player.wrapperContained); }
// public static boolean tryPickup(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.projectile.PersistentProjectileEntity.tryPickup(player.wrapperContained); }
public yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack()); }
// public static yarnwrap.item.ItemStack getItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.PersistentProjectileEntity.getItemStack()); }
// public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
// public static void setStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setStack(stack.wrapperContained); }
// public yarnwrap.item.ItemStack getDefaultItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultItemStack()); }
// public static yarnwrap.item.ItemStack getDefaultItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.PersistentProjectileEntity.getDefaultItemStack()); }
// public void method_59953(yarnwrap.item.Item item) { wrapperContained.method_59953(item.wrapperContained); }
// public static void method_59953(yarnwrap.item.Item item, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.method_59953(item.wrapperContained); }
public void applyDamageModifier(float damageModifier) { wrapperContained.applyDamageModifier(damageModifier); }
// public static void applyDamageModifier(float damageModifier, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.applyDamageModifier(damageModifier); }
// public void onBlockHitEnchantmentEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.hit.BlockHitResult blockHitResult,yarnwrap.item.ItemStack weaponStack) { wrapperContained.onBlockHitEnchantmentEffects(world.wrapperContained,blockHitResult.wrapperContained,weaponStack.wrapperContained); }
// public static void onBlockHitEnchantmentEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.hit.BlockHitResult blockHitResult,yarnwrap.item.ItemStack weaponStack, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.onBlockHitEnchantmentEffects(world.wrapperContained,blockHitResult.wrapperContained,weaponStack.wrapperContained); }
// public void knockback(yarnwrap.entity.LivingEntity target,yarnwrap.entity.damage.DamageSource source) { wrapperContained.knockback(target.wrapperContained,source.wrapperContained); }
// public static void knockback(yarnwrap.entity.LivingEntity target,yarnwrap.entity.damage.DamageSource source, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.knockback(target.wrapperContained,source.wrapperContained); }
// public void applyDrag(float drag) { wrapperContained.applyDrag(drag); }
// public static void applyDrag(float drag, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.applyDrag(drag); }
// public void applyCollision(yarnwrap.util.hit.BlockHitResult blockHitResult) { wrapperContained.applyCollision(blockHitResult.wrapperContained); }
// public static void applyCollision(yarnwrap.util.hit.BlockHitResult blockHitResult, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.applyCollision(blockHitResult.wrapperContained); }
// public void spawnBubbleParticles(yarnwrap.util.math.Vec3d pos) { wrapperContained.spawnBubbleParticles(pos.wrapperContained); }
// public static void spawnBubbleParticles(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.spawnBubbleParticles(pos.wrapperContained); }
// public void setInGround(boolean inGround) { wrapperContained.setInGround(inGround); }
// public static void setInGround(boolean inGround, ) { net.minecraft.entity.projectile.PersistentProjectileEntity.setInGround(inGround); }
// public boolean isInGround() { return wrapperContained.isInGround(); }
// public static boolean isInGround() { return net.minecraft.entity.projectile.PersistentProjectileEntity.isInGround(); }

}