package yarnwrap.item;
public class SpawnEggItem { public net.minecraft.item.SpawnEggItem wrapperContained; public SpawnEggItem(net.minecraft.item.SpawnEggItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map SPAWN_EGGS() { return wrapperContained.SPAWN_EGGS; }
// public void SPAWN_EGGS(java.util.Map value) { wrapperContained.SPAWN_EGGS = value; }
// public static java.util.Map SPAWN_EGGS() { return net.minecraft.item.SpawnEggItem.SPAWN_EGGS; }
// public static void SPAWN_EGGS(java.util.Map value, ) { net.minecraft.item.SpawnEggItem.SPAWN_EGGS = value; }

// public yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(wrapperContained.type); }
// public void type(yarnwrap.entity.EntityType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(net.minecraft.item.SpawnEggItem.type); }
// public static void type(yarnwrap.entity.EntityType value, ) { net.minecraft.item.SpawnEggItem.type = value.wrapperContained; }

// public SpawnEggItem(yarnwrap.entity.EntityType type,Object settings) { this.wrapperContained = new net.minecraft.item.SpawnEggItem(type.wrapperContained,settings); }
// public yarnwrap.entity.EntityType getEntityType(Object registries,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.EntityType(wrapperContained.getEntityType(registries,stack.wrapperContained)); }
// public static yarnwrap.entity.EntityType getEntityType(Object registries,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.entity.EntityType(net.minecraft.item.SpawnEggItem.getEntityType(registries,stack.wrapperContained)); }
// public java.lang.Iterable getAll() { return wrapperContained.getAll(); }
public static java.lang.Iterable getAll() { return net.minecraft.item.SpawnEggItem.getAll(); }
// public boolean isOfSameEntityType(Object registries,yarnwrap.item.ItemStack stack,yarnwrap.entity.EntityType type) { return wrapperContained.isOfSameEntityType(registries,stack.wrapperContained,type.wrapperContained); }
// public static boolean isOfSameEntityType(Object registries,yarnwrap.item.ItemStack stack,yarnwrap.entity.EntityType type, ) { return net.minecraft.item.SpawnEggItem.isOfSameEntityType(registries,stack.wrapperContained,type.wrapperContained); }
// public yarnwrap.item.SpawnEggItem forEntity(yarnwrap.entity.EntityType type) { return new yarnwrap.item.SpawnEggItem(wrapperContained.forEntity(type.wrapperContained)); }
// public static yarnwrap.item.SpawnEggItem forEntity(yarnwrap.entity.EntityType type, ) { return new yarnwrap.item.SpawnEggItem(net.minecraft.item.SpawnEggItem.forEntity(type.wrapperContained)); }
public java.util.Optional spawnBaby(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.EntityType entityType,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.item.ItemStack stack) { return wrapperContained.spawnBaby(user.wrapperContained,entity.wrapperContained,entityType.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public static java.util.Optional spawnBaby(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.EntityType entityType,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.SpawnEggItem.spawnBaby(user.wrapperContained,entity.wrapperContained,entityType.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}