package yarnwrap.entity.projectile.thrown;
public class PotionEntity { public net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained; public PotionEntity(net.minecraft.entity.projectile.thrown.PotionEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public double WATER_POTION_EXPLOSION_SQUARED_RADIUS() { return wrapperContained.WATER_POTION_EXPLOSION_SQUARED_RADIUS; }
// public void WATER_POTION_EXPLOSION_SQUARED_RADIUS(double value) { wrapperContained.WATER_POTION_EXPLOSION_SQUARED_RADIUS = value; }
// public static double WATER_POTION_EXPLOSION_SQUARED_RADIUS() { return net.minecraft.entity.projectile.thrown.PotionEntity.WATER_POTION_EXPLOSION_SQUARED_RADIUS; }
// public static void WATER_POTION_EXPLOSION_SQUARED_RADIUS(double value, ) { net.minecraft.entity.projectile.thrown.PotionEntity.WATER_POTION_EXPLOSION_SQUARED_RADIUS = value; }

// public java.util.function.Predicate AFFECTED_BY_WATER() { return wrapperContained.AFFECTED_BY_WATER; }
// public void AFFECTED_BY_WATER(java.util.function.Predicate value) { wrapperContained.AFFECTED_BY_WATER = value; }
public static java.util.function.Predicate AFFECTED_BY_WATER() { return net.minecraft.entity.projectile.thrown.PotionEntity.AFFECTED_BY_WATER; }
// public static void AFFECTED_BY_WATER(java.util.function.Predicate value, ) { net.minecraft.entity.projectile.thrown.PotionEntity.AFFECTED_BY_WATER = value; }

// public PotionEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.PotionEntity(type.wrapperContained,world.wrapperContained,x,y,z,stack.wrapperContained); }
// public PotionEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.PotionEntity(type.wrapperContained,world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public void extinguishFire(yarnwrap.util.math.BlockPos pos) { wrapperContained.extinguishFire(pos.wrapperContained); }
// public static void extinguishFire(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.projectile.thrown.PotionEntity.extinguishFire(pos.wrapperContained); }
// public boolean method_46401(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_46401(entity.wrapperContained); }
// public static boolean method_46401(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.projectile.thrown.PotionEntity.method_46401(entity.wrapperContained); }
// public void spawnAreaEffectCloud(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.hit.HitResult hitResult) { wrapperContained.spawnAreaEffectCloud(world.wrapperContained,stack.wrapperContained,hitResult.wrapperContained); }
// public static void spawnAreaEffectCloud(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.hit.HitResult hitResult, ) { net.minecraft.entity.projectile.thrown.PotionEntity.spawnAreaEffectCloud(world.wrapperContained,stack.wrapperContained,hitResult.wrapperContained); }
// public void explodeWaterPotion(yarnwrap.server.world.ServerWorld world) { wrapperContained.explodeWaterPotion(world.wrapperContained); }
// public static void explodeWaterPotion(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.projectile.thrown.PotionEntity.explodeWaterPotion(world.wrapperContained); }

}