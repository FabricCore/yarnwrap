package yarnwrap.item;
public class RangedWeaponItem { public net.minecraft.item.RangedWeaponItem wrapperContained; public RangedWeaponItem(net.minecraft.item.RangedWeaponItem wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate BOW_PROJECTILES() { return wrapperContained.BOW_PROJECTILES; }
public java.util.function.Predicate CROSSBOW_HELD_PROJECTILES() { return wrapperContained.CROSSBOW_HELD_PROJECTILES; }
public yarnwrap.item.ItemStack getHeldProjectile(yarnwrap.entity.LivingEntity entity,java.util.function.Predicate predicate) { return new yarnwrap.item.ItemStack(wrapperContained.getHeldProjectile(entity.wrapperContained,predicate)); }
public java.util.function.Predicate getProjectiles() { return wrapperContained.getProjectiles(); }
public java.util.function.Predicate getHeldProjectiles() { return wrapperContained.getHeldProjectiles(); }
public int getRange() { return wrapperContained.getRange(); }
// public yarnwrap.entity.projectile.ProjectileEntity createArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack weaponStack,yarnwrap.item.ItemStack projectileStack,boolean critical) { return new yarnwrap.entity.projectile.ProjectileEntity(wrapperContained.createArrowEntity(world.wrapperContained,shooter.wrapperContained,weaponStack.wrapperContained,projectileStack.wrapperContained,critical)); }
// public int getWeaponStackDamage(yarnwrap.item.ItemStack projectile) { return wrapperContained.getWeaponStackDamage(projectile.wrapperContained); }
// public java.util.List load(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter) { return wrapperContained.load(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained); }
// public yarnwrap.item.ItemStack getProjectile(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter,boolean multishot) { return new yarnwrap.item.ItemStack(wrapperContained.getProjectile(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained,multishot)); }
// public void shootAll(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,java.util.List projectiles,float speed,float divergence,boolean critical,yarnwrap.entity.LivingEntity target) { wrapperContained.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,projectiles,speed,divergence,critical,target.wrapperContained); }
// public void shoot(yarnwrap.entity.LivingEntity shooter,yarnwrap.entity.projectile.ProjectileEntity projectile,int index,float speed,float divergence,float yaw,yarnwrap.entity.LivingEntity target) { wrapperContained.shoot(shooter.wrapperContained,projectile.wrapperContained,index,speed,divergence,yaw,target.wrapperContained); }

}