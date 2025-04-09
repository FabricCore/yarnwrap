package yarnwrap.item;
public class EntityBucketItem { public net.minecraft.item.EntityBucketItem wrapperContained; public EntityBucketItem(net.minecraft.item.EntityBucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.sound.SoundEvent emptyingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.emptyingSound); }
// public com.mojang.serialization.MapCodec TROPICAL_FISH_VARIANT_MAP_CODEC() { return wrapperContained.TROPICAL_FISH_VARIANT_MAP_CODEC; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void spawnEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnEntity(world.wrapperContained,stack.wrapperContained,pos.wrapperContained); }

}