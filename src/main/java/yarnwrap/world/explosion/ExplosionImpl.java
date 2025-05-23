package yarnwrap.world.explosion;
public class ExplosionImpl { public net.minecraft.world.explosion.ExplosionImpl wrapperContained; public ExplosionImpl(net.minecraft.world.explosion.ExplosionImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.DEFAULT_BEHAVIOR); }
// public void DEFAULT_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.DEFAULT_BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.world.explosion.ExplosionBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.world.explosion.ExplosionImpl.DEFAULT_BEHAVIOR); }
// public static void DEFAULT_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value, ) { net.minecraft.world.explosion.ExplosionImpl.DEFAULT_BEHAVIOR = value.wrapperContained; }

// public boolean createFire() { return wrapperContained.createFire; }
// public void createFire(boolean value) { wrapperContained.createFire = value; }
// public static boolean createFire() { return net.minecraft.world.explosion.ExplosionImpl.createFire; }
// public static void createFire(boolean value, ) { net.minecraft.world.explosion.ExplosionImpl.createFire = value; }

// public Object destructionType() { return wrapperContained.destructionType; }
// // public void destructionType(Object value) { wrapperContained.destructionType = value; }
// // public static Object destructionType() { return net.minecraft.world.explosion.ExplosionImpl.destructionType; }
// // public static void destructionType(Object value, ) { net.minecraft.world.explosion.ExplosionImpl.destructionType = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.explosion.ExplosionImpl.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.explosion.ExplosionImpl.world = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.explosion.ExplosionImpl.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.world.explosion.ExplosionImpl.pos = value.wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.world.explosion.ExplosionImpl.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.world.explosion.ExplosionImpl.entity = value.wrapperContained; }

// public float power() { return wrapperContained.power; }
// public void power(float value) { wrapperContained.power = value; }
// public static float power() { return net.minecraft.world.explosion.ExplosionImpl.power; }
// public static void power(float value, ) { net.minecraft.world.explosion.ExplosionImpl.power = value; }

// public yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.damageSource); }
// public void damageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.damageSource = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource damageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.world.explosion.ExplosionImpl.damageSource); }
// public static void damageSource(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.world.explosion.ExplosionImpl.damageSource = value.wrapperContained; }

// public yarnwrap.world.explosion.ExplosionBehavior behavior() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.behavior); }
// public void behavior(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.behavior = value.wrapperContained; }
// public static yarnwrap.world.explosion.ExplosionBehavior behavior() { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.world.explosion.ExplosionImpl.behavior); }
// public static void behavior(yarnwrap.world.explosion.ExplosionBehavior value, ) { net.minecraft.world.explosion.ExplosionImpl.behavior = value.wrapperContained; }

// public java.util.Map knockbackByPlayer() { return wrapperContained.knockbackByPlayer; }
// public void knockbackByPlayer(java.util.Map value) { wrapperContained.knockbackByPlayer = value; }
// public static java.util.Map knockbackByPlayer() { return net.minecraft.world.explosion.ExplosionImpl.knockbackByPlayer; }
// public static void knockbackByPlayer(java.util.Map value, ) { net.minecraft.world.explosion.ExplosionImpl.knockbackByPlayer = value; }

// public ExplosionImpl(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource,yarnwrap.world.explosion.ExplosionBehavior behavior,yarnwrap.util.math.Vec3d pos,float power,boolean createFire,Object destructionType) { this.wrapperContained = new net.minecraft.world.explosion.ExplosionImpl(world.wrapperContained,entity.wrapperContained,damageSource.wrapperContained,behavior.wrapperContained,pos.wrapperContained,power,createFire,destructionType); }
// public float calculateReceivedDamage(yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity) { return wrapperContained.calculateReceivedDamage(pos.wrapperContained,entity.wrapperContained); }
// public static float calculateReceivedDamage(yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity, ) { return net.minecraft.world.explosion.ExplosionImpl.calculateReceivedDamage(pos.wrapperContained,entity.wrapperContained); }
// public void destroyBlocks(java.util.List positions) { wrapperContained.destroyBlocks(positions); }
// public static void destroyBlocks(java.util.List positions, ) { net.minecraft.world.explosion.ExplosionImpl.destroyBlocks(positions); }
// public void addDroppedItem(java.util.List droppedItemsOut,yarnwrap.item.ItemStack item,yarnwrap.util.math.BlockPos pos) { wrapperContained.addDroppedItem(droppedItemsOut,item.wrapperContained,pos.wrapperContained); }
// public static void addDroppedItem(java.util.List droppedItemsOut,yarnwrap.item.ItemStack item,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.explosion.ExplosionImpl.addDroppedItem(droppedItemsOut,item.wrapperContained,pos.wrapperContained); }
// public yarnwrap.world.explosion.ExplosionBehavior makeBehavior(yarnwrap.entity.Entity entity) { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.makeBehavior(entity.wrapperContained)); }
// public static yarnwrap.world.explosion.ExplosionBehavior makeBehavior(yarnwrap.entity.Entity entity, ) { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.world.explosion.ExplosionImpl.makeBehavior(entity.wrapperContained)); }
// public void createFire(java.util.List positions) { wrapperContained.createFire(positions); }
// public static void createFire(java.util.List positions, ) { net.minecraft.world.explosion.ExplosionImpl.createFire(positions); }
// public void method_61736(java.util.List item,yarnwrap.item.ItemStack pos) { wrapperContained.method_61736(item,pos.wrapperContained); }
// public static void method_61736(java.util.List item,yarnwrap.item.ItemStack pos, ) { net.minecraft.world.explosion.ExplosionImpl.method_61736(item,pos.wrapperContained); }
public void explode() { wrapperContained.explode(); }
// public static void explode() { net.minecraft.world.explosion.ExplosionImpl.explode(); }
public java.util.Map getKnockbackByPlayer() { return wrapperContained.getKnockbackByPlayer(); }
// public static java.util.Map getKnockbackByPlayer() { return net.minecraft.world.explosion.ExplosionImpl.getKnockbackByPlayer(); }
public boolean isSmall() { return wrapperContained.isSmall(); }
// public static boolean isSmall() { return net.minecraft.world.explosion.ExplosionImpl.isSmall(); }
// public java.util.List getBlocksToDestroy() { return wrapperContained.getBlocksToDestroy(); }
// public static java.util.List getBlocksToDestroy() { return net.minecraft.world.explosion.ExplosionImpl.getBlocksToDestroy(); }
// public void damageEntities() { wrapperContained.damageEntities(); }
// public static void damageEntities() { net.minecraft.world.explosion.ExplosionImpl.damageEntities(); }
// public boolean shouldDestroyBlocks() { return wrapperContained.shouldDestroyBlocks(); }
// public static boolean shouldDestroyBlocks() { return net.minecraft.world.explosion.ExplosionImpl.shouldDestroyBlocks(); }
public yarnwrap.entity.damage.DamageSource getDamageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getDamageSource()); }
// public static yarnwrap.entity.damage.DamageSource getDamageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.world.explosion.ExplosionImpl.getDamageSource()); }

}