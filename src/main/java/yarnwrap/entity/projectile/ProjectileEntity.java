package yarnwrap.entity.projectile;
public class ProjectileEntity { public net.minecraft.entity.projectile.ProjectileEntity wrapperContained; public ProjectileEntity(net.minecraft.entity.projectile.ProjectileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public void ownerUuid(java.util.UUID value) { wrapperContained.ownerUuid = value; }
// public static java.util.UUID ownerUuid() { return net.minecraft.entity.projectile.ProjectileEntity.ownerUuid; }
// public static void ownerUuid(java.util.UUID value, ) { net.minecraft.entity.projectile.ProjectileEntity.ownerUuid = value; }

// public boolean leftOwner() { return wrapperContained.leftOwner; }
// public void leftOwner(boolean value) { wrapperContained.leftOwner = value; }
// public static boolean leftOwner() { return net.minecraft.entity.projectile.ProjectileEntity.leftOwner; }
// public static void leftOwner(boolean value, ) { net.minecraft.entity.projectile.ProjectileEntity.leftOwner = value; }

// public boolean shot() { return wrapperContained.shot; }
// public void shot(boolean value) { wrapperContained.shot = value; }
// public static boolean shot() { return net.minecraft.entity.projectile.ProjectileEntity.shot; }
// public static void shot(boolean value, ) { net.minecraft.entity.projectile.ProjectileEntity.shot = value; }

// public yarnwrap.entity.Entity owner() { return new yarnwrap.entity.Entity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.Entity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.Entity owner() { return new yarnwrap.entity.Entity(net.minecraft.entity.projectile.ProjectileEntity.owner); }
// public static void owner(yarnwrap.entity.Entity value, ) { net.minecraft.entity.projectile.ProjectileEntity.owner = value.wrapperContained; }

// public yarnwrap.entity.Entity lastDeflectedEntity() { return new yarnwrap.entity.Entity(wrapperContained.lastDeflectedEntity); }
// public void lastDeflectedEntity(yarnwrap.entity.Entity value) { wrapperContained.lastDeflectedEntity = value.wrapperContained; }
// public static yarnwrap.entity.Entity lastDeflectedEntity() { return new yarnwrap.entity.Entity(net.minecraft.entity.projectile.ProjectileEntity.lastDeflectedEntity); }
// public static void lastDeflectedEntity(yarnwrap.entity.Entity value, ) { net.minecraft.entity.projectile.ProjectileEntity.lastDeflectedEntity = value.wrapperContained; }

public void setVelocity(yarnwrap.entity.Entity shooter,float pitch,float yaw,float roll,float speed,float divergence) { wrapperContained.setVelocity(shooter.wrapperContained,pitch,yaw,roll,speed,divergence); }
// public static void setVelocity(yarnwrap.entity.Entity shooter,float pitch,float yaw,float roll,float speed,float divergence, ) { net.minecraft.entity.projectile.ProjectileEntity.setVelocity(shooter.wrapperContained,pitch,yaw,roll,speed,divergence); }
// public void onBlockHit(yarnwrap.util.hit.BlockHitResult blockHitResult) { wrapperContained.onBlockHit(blockHitResult.wrapperContained); }
// public static void onBlockHit(yarnwrap.util.hit.BlockHitResult blockHitResult, ) { net.minecraft.entity.projectile.ProjectileEntity.onBlockHit(blockHitResult.wrapperContained); }
// public boolean canHit(yarnwrap.entity.Entity entity) { return wrapperContained.canHit(entity.wrapperContained); }
// public static boolean canHit(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.projectile.ProjectileEntity.canHit(entity.wrapperContained); }
// public boolean method_26959(yarnwrap.entity.Entity entity) { return wrapperContained.method_26959(entity.wrapperContained); }
// public static boolean method_26959(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.projectile.ProjectileEntity.method_26959(entity.wrapperContained); }
// public float updateRotation(float prevRot,float newRot) { return wrapperContained.updateRotation(prevRot,newRot); }
// public static float updateRotation(float prevRot,float newRot, ) { return net.minecraft.entity.projectile.ProjectileEntity.updateRotation(prevRot,newRot); }
// public boolean shouldLeaveOwner() { return wrapperContained.shouldLeaveOwner(); }
// public static boolean shouldLeaveOwner() { return net.minecraft.entity.projectile.ProjectileEntity.shouldLeaveOwner(); }
// public void updateRotation() { wrapperContained.updateRotation(); }
// public static void updateRotation() { net.minecraft.entity.projectile.ProjectileEntity.updateRotation(); }
// public boolean isOwner(yarnwrap.entity.Entity entity) { return wrapperContained.isOwner(entity.wrapperContained); }
// public static boolean isOwner(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.projectile.ProjectileEntity.isOwner(entity.wrapperContained); }
public yarnwrap.entity.Entity getEffectCause() { return new yarnwrap.entity.Entity(wrapperContained.getEffectCause()); }
// public static yarnwrap.entity.Entity getEffectCause() { return new yarnwrap.entity.Entity(net.minecraft.entity.projectile.ProjectileEntity.getEffectCause()); }
public boolean canBreakBlocks(yarnwrap.world.World world) { return wrapperContained.canBreakBlocks(world.wrapperContained); }
// public static boolean canBreakBlocks(yarnwrap.world.World world, ) { return net.minecraft.entity.projectile.ProjectileEntity.canBreakBlocks(world.wrapperContained); }
public yarnwrap.util.math.Vec3d calculateVelocity(double x,double y,double z,float power,float uncertainty) { return new yarnwrap.util.math.Vec3d(wrapperContained.calculateVelocity(x,y,z,power,uncertainty)); }
// public static yarnwrap.util.math.Vec3d calculateVelocity(double x,double y,double z,float power,float uncertainty, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.projectile.ProjectileEntity.calculateVelocity(x,y,z,power,uncertainty)); }
// public void onDeflected(yarnwrap.entity.Entity deflector,boolean fromAttack) { wrapperContained.onDeflected(deflector.wrapperContained,fromAttack); }
// public static void onDeflected(yarnwrap.entity.Entity deflector,boolean fromAttack, ) { net.minecraft.entity.projectile.ProjectileEntity.onDeflected(deflector.wrapperContained,fromAttack); }
public boolean deflect(yarnwrap.entity.ProjectileDeflection deflection,yarnwrap.entity.Entity deflector,yarnwrap.entity.Entity owner,boolean fromAttack) { return wrapperContained.deflect(deflection.wrapperContained,deflector.wrapperContained,owner.wrapperContained,fromAttack); }
// public static boolean deflect(yarnwrap.entity.ProjectileDeflection deflection,yarnwrap.entity.Entity deflector,yarnwrap.entity.Entity owner,boolean fromAttack, ) { return net.minecraft.entity.projectile.ProjectileEntity.deflect(deflection.wrapperContained,deflector.wrapperContained,owner.wrapperContained,fromAttack); }
// public yarnwrap.entity.ProjectileDeflection hitOrDeflect(yarnwrap.util.hit.HitResult hitResult) { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.hitOrDeflect(hitResult.wrapperContained)); }
// public static yarnwrap.entity.ProjectileDeflection hitOrDeflect(yarnwrap.util.hit.HitResult hitResult, ) { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.projectile.ProjectileEntity.hitOrDeflect(hitResult.wrapperContained)); }
public it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair getKnockback(yarnwrap.entity.LivingEntity target,yarnwrap.entity.damage.DamageSource source) { return wrapperContained.getKnockback(target.wrapperContained,source.wrapperContained); }
// public static it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair getKnockback(yarnwrap.entity.LivingEntity target,yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.projectile.ProjectileEntity.getKnockback(target.wrapperContained,source.wrapperContained); }
public void setOwner(yarnwrap.entity.Entity entity) { wrapperContained.setOwner(entity.wrapperContained); }
// public static void setOwner(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.projectile.ProjectileEntity.setOwner(entity.wrapperContained); }
// public void onEntityHit(yarnwrap.util.hit.EntityHitResult entityHitResult) { wrapperContained.onEntityHit(entityHitResult.wrapperContained); }
// public static void onEntityHit(yarnwrap.util.hit.EntityHitResult entityHitResult, ) { net.minecraft.entity.projectile.ProjectileEntity.onEntityHit(entityHitResult.wrapperContained); }
public void setVelocity(double x,double y,double z,float power,float uncertainty) { wrapperContained.setVelocity(x,y,z,power,uncertainty); }
// public static void setVelocity(double x,double y,double z,float power,float uncertainty, ) { net.minecraft.entity.projectile.ProjectileEntity.setVelocity(x,y,z,power,uncertainty); }
// public void onCollision(yarnwrap.util.hit.HitResult hitResult) { wrapperContained.onCollision(hitResult.wrapperContained); }
// public static void onCollision(yarnwrap.util.hit.HitResult hitResult, ) { net.minecraft.entity.projectile.ProjectileEntity.onCollision(hitResult.wrapperContained); }

}