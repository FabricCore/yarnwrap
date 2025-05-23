package yarnwrap.item;
public class RangedWeaponItem { public net.minecraft.item.RangedWeaponItem wrapperContained; public RangedWeaponItem(net.minecraft.item.RangedWeaponItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate BOW_PROJECTILES() { return wrapperContained.BOW_PROJECTILES; }
// public void BOW_PROJECTILES(java.util.function.Predicate value) { wrapperContained.BOW_PROJECTILES = value; }
public static java.util.function.Predicate BOW_PROJECTILES() { return net.minecraft.item.RangedWeaponItem.BOW_PROJECTILES; }
// public static void BOW_PROJECTILES(java.util.function.Predicate value, ) { net.minecraft.item.RangedWeaponItem.BOW_PROJECTILES = value; }

// public java.util.function.Predicate CROSSBOW_HELD_PROJECTILES() { return wrapperContained.CROSSBOW_HELD_PROJECTILES; }
// public void CROSSBOW_HELD_PROJECTILES(java.util.function.Predicate value) { wrapperContained.CROSSBOW_HELD_PROJECTILES = value; }
public static java.util.function.Predicate CROSSBOW_HELD_PROJECTILES() { return net.minecraft.item.RangedWeaponItem.CROSSBOW_HELD_PROJECTILES; }
// public static void CROSSBOW_HELD_PROJECTILES(java.util.function.Predicate value, ) { net.minecraft.item.RangedWeaponItem.CROSSBOW_HELD_PROJECTILES = value; }

// public void shoot(yarnwrap.entity.LivingEntity shooter,yarnwrap.entity.projectile.ProjectileEntity projectile,int index,float speed,float divergence,float yaw,yarnwrap.entity.LivingEntity target) { wrapperContained.shoot(shooter.wrapperContained,projectile.wrapperContained,index,speed,divergence,yaw,target.wrapperContained); }
// public static void shoot(yarnwrap.entity.LivingEntity shooter,yarnwrap.entity.projectile.ProjectileEntity projectile,int index,float speed,float divergence,float yaw,yarnwrap.entity.LivingEntity target, ) { net.minecraft.item.RangedWeaponItem.shoot(shooter.wrapperContained,projectile.wrapperContained,index,speed,divergence,yaw,target.wrapperContained); }
// public yarnwrap.item.ItemStack getHeldProjectile(yarnwrap.entity.LivingEntity entity,java.util.function.Predicate predicate) { return new yarnwrap.item.ItemStack(wrapperContained.getHeldProjectile(entity.wrapperContained,predicate)); }
// public static yarnwrap.item.ItemStack getHeldProjectile(yarnwrap.entity.LivingEntity entity,java.util.function.Predicate predicate, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.RangedWeaponItem.getHeldProjectile(entity.wrapperContained,predicate)); }
// public boolean method_18816(yarnwrap.item.ItemStack stack) { return wrapperContained.method_18816(stack.wrapperContained); }
// public static boolean method_18816(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.RangedWeaponItem.method_18816(stack.wrapperContained); }
// public boolean method_18817(yarnwrap.item.ItemStack stack) { return wrapperContained.method_18817(stack.wrapperContained); }
// public static boolean method_18817(yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.RangedWeaponItem.method_18817(stack.wrapperContained); }
public java.util.function.Predicate getProjectiles() { return wrapperContained.getProjectiles(); }
// public static java.util.function.Predicate getProjectiles() { return net.minecraft.item.RangedWeaponItem.getProjectiles(); }
public java.util.function.Predicate getHeldProjectiles() { return wrapperContained.getHeldProjectiles(); }
// public static java.util.function.Predicate getHeldProjectiles() { return net.minecraft.item.RangedWeaponItem.getHeldProjectiles(); }
public int getRange() { return wrapperContained.getRange(); }
// public static int getRange() { return net.minecraft.item.RangedWeaponItem.getRange(); }
// public yarnwrap.entity.projectile.ProjectileEntity createArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack weaponStack,yarnwrap.item.ItemStack projectileStack,boolean critical) { return new yarnwrap.entity.projectile.ProjectileEntity(wrapperContained.createArrowEntity(world.wrapperContained,shooter.wrapperContained,weaponStack.wrapperContained,projectileStack.wrapperContained,critical)); }
// public static yarnwrap.entity.projectile.ProjectileEntity createArrowEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity shooter,yarnwrap.item.ItemStack weaponStack,yarnwrap.item.ItemStack projectileStack,boolean critical, ) { return new yarnwrap.entity.projectile.ProjectileEntity(net.minecraft.item.RangedWeaponItem.createArrowEntity(world.wrapperContained,shooter.wrapperContained,weaponStack.wrapperContained,projectileStack.wrapperContained,critical)); }
// public int getWeaponStackDamage(yarnwrap.item.ItemStack projectile) { return wrapperContained.getWeaponStackDamage(projectile.wrapperContained); }
// public static int getWeaponStackDamage(yarnwrap.item.ItemStack projectile, ) { return net.minecraft.item.RangedWeaponItem.getWeaponStackDamage(projectile.wrapperContained); }
// public java.util.List load(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter) { return wrapperContained.load(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained); }
// public static java.util.List load(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter, ) { return net.minecraft.item.RangedWeaponItem.load(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained); }
// public yarnwrap.item.ItemStack getProjectile(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter,boolean multishot) { return new yarnwrap.item.ItemStack(wrapperContained.getProjectile(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained,multishot)); }
// public static yarnwrap.item.ItemStack getProjectile(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack projectileStack,yarnwrap.entity.LivingEntity shooter,boolean multishot, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.RangedWeaponItem.getProjectile(stack.wrapperContained,projectileStack.wrapperContained,shooter.wrapperContained,multishot)); }
// public void shootAll(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,java.util.List projectiles,float speed,float divergence,boolean critical,yarnwrap.entity.LivingEntity target) { wrapperContained.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,projectiles,speed,divergence,critical,target.wrapperContained); }
// public static void shootAll(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity shooter,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,java.util.List projectiles,float speed,float divergence,boolean critical,yarnwrap.entity.LivingEntity target, ) { net.minecraft.item.RangedWeaponItem.shootAll(world.wrapperContained,shooter.wrapperContained,hand.wrapperContained,stack.wrapperContained,projectiles,speed,divergence,critical,target.wrapperContained); }
// public void method_61659(yarnwrap.entity.LivingEntity projectile) { wrapperContained.method_61659(projectile.wrapperContained); }
// public static void method_61659(yarnwrap.entity.LivingEntity projectile, ) { net.minecraft.item.RangedWeaponItem.method_61659(projectile.wrapperContained); }

}