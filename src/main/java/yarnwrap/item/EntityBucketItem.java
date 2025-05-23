package yarnwrap.item;
public class EntityBucketItem { public net.minecraft.item.EntityBucketItem wrapperContained; public EntityBucketItem(net.minecraft.item.EntityBucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public static yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(net.minecraft.item.EntityBucketItem.entityType); }
// public static void entityType(yarnwrap.entity.EntityType value, ) { net.minecraft.item.EntityBucketItem.entityType = value.wrapperContained; }

// public yarnwrap.sound.SoundEvent emptyingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.emptyingSound); }
// public void emptyingSound(yarnwrap.sound.SoundEvent value) { wrapperContained.emptyingSound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent emptyingSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.item.EntityBucketItem.emptyingSound); }
// public static void emptyingSound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.item.EntityBucketItem.emptyingSound = value.wrapperContained; }

// public EntityBucketItem(yarnwrap.entity.EntityType type,yarnwrap.fluid.Fluid fluid,yarnwrap.sound.SoundEvent emptyingSound,Object settings) { this.wrapperContained = new net.minecraft.item.EntityBucketItem(type.wrapperContained,fluid.wrapperContained,emptyingSound.wrapperContained,settings); }
// public void spawnEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnEntity(world.wrapperContained,stack.wrapperContained,pos.wrapperContained); }
// public static void spawnEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.item.EntityBucketItem.spawnEntity(world.wrapperContained,stack.wrapperContained,pos.wrapperContained); }

}