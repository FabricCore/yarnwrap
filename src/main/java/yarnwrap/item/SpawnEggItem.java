package yarnwrap.item;
public class SpawnEggItem { public net.minecraft.item.SpawnEggItem wrapperContained; public SpawnEggItem(net.minecraft.item.SpawnEggItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec ENTITY_TYPE_MAP_CODEC() { return wrapperContained.ENTITY_TYPE_MAP_CODEC; }
// public void ENTITY_TYPE_MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.ENTITY_TYPE_MAP_CODEC = value; }
// public java.util.Map SPAWN_EGGS() { return wrapperContained.SPAWN_EGGS; }
// public void SPAWN_EGGS(java.util.Map value) { wrapperContained.SPAWN_EGGS = value; }
// public int secondaryColor() { return wrapperContained.secondaryColor; }
// public void secondaryColor(int value) { wrapperContained.secondaryColor = value; }
// public int primaryColor() { return wrapperContained.primaryColor; }
// public void primaryColor(int value) { wrapperContained.primaryColor = value; }
// public yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(wrapperContained.type); }
// public void type(yarnwrap.entity.EntityType value) { wrapperContained.type = value.wrapperContained; }
public java.util.Optional spawnBaby(yarnwrap.entity.player.PlayerEntity user,yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.EntityType entityType,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.item.ItemStack stack) { return wrapperContained.spawnBaby(user.wrapperContained,entity.wrapperContained,entityType.wrapperContained,world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
public yarnwrap.entity.EntityType getEntityType(yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.EntityType(wrapperContained.getEntityType(stack.wrapperContained)); }
public int getColor(int tintIndex) { return wrapperContained.getColor(tintIndex); }
public java.lang.Iterable getAll() { return wrapperContained.getAll(); }
public boolean isOfSameEntityType(yarnwrap.item.ItemStack stack,yarnwrap.entity.EntityType type) { return wrapperContained.isOfSameEntityType(stack.wrapperContained,type.wrapperContained); }
public yarnwrap.item.SpawnEggItem forEntity(yarnwrap.entity.EntityType type) { return new yarnwrap.item.SpawnEggItem(wrapperContained.forEntity(type.wrapperContained)); }

}