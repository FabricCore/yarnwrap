package yarnwrap.entity.projectile;
public class FireworkRocketEntity { public net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained; public FireworkRocketEntity(net.minecraft.entity.projectile.FireworkRocketEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SHOOTER_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOOTER_ENTITY_ID); }
// public void SHOOTER_ENTITY_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOOTER_ENTITY_ID = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SHOOTER_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.FireworkRocketEntity.SHOOTER_ENTITY_ID); }
// public static void SHOOTER_ENTITY_ID(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.SHOOTER_ENTITY_ID = value.wrapperContained; }

// public int lifeTime() { return wrapperContained.lifeTime; }
// public void lifeTime(int value) { wrapperContained.lifeTime = value; }
// public static int lifeTime() { return net.minecraft.entity.projectile.FireworkRocketEntity.lifeTime; }
// public static void lifeTime(int value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.lifeTime = value; }

// public int life() { return wrapperContained.life; }
// public void life(int value) { wrapperContained.life = value; }
// public static int life() { return net.minecraft.entity.projectile.FireworkRocketEntity.life; }
// public static void life(int value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.life = value; }

// public yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM); }
// public void ITEM(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.FireworkRocketEntity.ITEM); }
// public static void ITEM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.ITEM = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData SHOT_AT_ANGLE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOT_AT_ANGLE); }
// public void SHOT_AT_ANGLE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOT_AT_ANGLE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SHOT_AT_ANGLE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.projectile.FireworkRocketEntity.SHOT_AT_ANGLE); }
// public static void SHOT_AT_ANGLE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.SHOT_AT_ANGLE = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity shooter() { return new yarnwrap.entity.LivingEntity(wrapperContained.shooter); }
// public void shooter(yarnwrap.entity.LivingEntity value) { wrapperContained.shooter = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity shooter() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.projectile.FireworkRocketEntity.shooter); }
// public static void shooter(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.shooter = value.wrapperContained; }

// public int DEFAULT_LIFE() { return wrapperContained.DEFAULT_LIFE; }
// public void DEFAULT_LIFE(int value) { wrapperContained.DEFAULT_LIFE = value; }
// public static int DEFAULT_LIFE() { return net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_LIFE; }
// public static void DEFAULT_LIFE(int value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_LIFE = value; }

// public int DEFAULT_LIFE_TIME() { return wrapperContained.DEFAULT_LIFE_TIME; }
// public void DEFAULT_LIFE_TIME(int value) { wrapperContained.DEFAULT_LIFE_TIME = value; }
// public static int DEFAULT_LIFE_TIME() { return net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_LIFE_TIME; }
// public static void DEFAULT_LIFE_TIME(int value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_LIFE_TIME = value; }

// public boolean DEFAULT_SHOT_AT_ANGLE() { return wrapperContained.DEFAULT_SHOT_AT_ANGLE; }
// public void DEFAULT_SHOT_AT_ANGLE(boolean value) { wrapperContained.DEFAULT_SHOT_AT_ANGLE = value; }
// public static boolean DEFAULT_SHOT_AT_ANGLE() { return net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_SHOT_AT_ANGLE; }
// public static void DEFAULT_SHOT_AT_ANGLE(boolean value, ) { net.minecraft.entity.projectile.FireworkRocketEntity.DEFAULT_SHOT_AT_ANGLE = value; }

public FireworkRocketEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.FireworkRocketEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public FireworkRocketEntity(yarnwrap.world.World world,yarnwrap.entity.Entity entity,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.FireworkRocketEntity(world.wrapperContained,entity.wrapperContained,x,y,z,stack.wrapperContained); }
public FireworkRocketEntity(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,double x,double y,double z,boolean shotAtAngle) { this.wrapperContained = new net.minecraft.entity.projectile.FireworkRocketEntity(world.wrapperContained,stack.wrapperContained,x,y,z,shotAtAngle); }
public FireworkRocketEntity(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.Entity entity,double x,double y,double z,boolean shotAtAngle) { this.wrapperContained = new net.minecraft.entity.projectile.FireworkRocketEntity(world.wrapperContained,stack.wrapperContained,entity.wrapperContained,x,y,z,shotAtAngle); }
public FireworkRocketEntity(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity shooter) { this.wrapperContained = new net.minecraft.entity.projectile.FireworkRocketEntity(world.wrapperContained,stack.wrapperContained,shooter.wrapperContained); }
// public void explode(yarnwrap.server.world.ServerWorld world) { wrapperContained.explode(world.wrapperContained); }
// public static void explode(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.projectile.FireworkRocketEntity.explode(world.wrapperContained); }
// public boolean wasShotByEntity() { return wrapperContained.wasShotByEntity(); }
// public static boolean wasShotByEntity() { return net.minecraft.entity.projectile.FireworkRocketEntity.wasShotByEntity(); }
public boolean wasShotAtAngle() { return wrapperContained.wasShotAtAngle(); }
// public static boolean wasShotAtAngle() { return net.minecraft.entity.projectile.FireworkRocketEntity.wasShotAtAngle(); }
// public void explodeAndRemove(yarnwrap.server.world.ServerWorld world) { wrapperContained.explodeAndRemove(world.wrapperContained); }
// public static void explodeAndRemove(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.projectile.FireworkRocketEntity.explodeAndRemove(world.wrapperContained); }
// public void method_18072(int id) { wrapperContained.method_18072(id); }
// public static void method_18072(int id, ) { net.minecraft.entity.projectile.FireworkRocketEntity.method_18072(id); }
// public boolean hasExplosionEffects() { return wrapperContained.hasExplosionEffects(); }
// public static boolean hasExplosionEffects() { return net.minecraft.entity.projectile.FireworkRocketEntity.hasExplosionEffects(); }
// public yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(wrapperContained.getDefaultStack()); }
// public static yarnwrap.item.ItemStack getDefaultStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.projectile.FireworkRocketEntity.getDefaultStack()); }
// public java.util.List getExplosions() { return wrapperContained.getExplosions(); }
// public static java.util.List getExplosions() { return net.minecraft.entity.projectile.FireworkRocketEntity.getExplosions(); }

}