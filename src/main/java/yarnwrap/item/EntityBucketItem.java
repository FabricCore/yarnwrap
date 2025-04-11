package yarnwrap.item;
public class EntityBucketItem { public net.minecraft.item.EntityBucketItem wrapperContained; public EntityBucketItem(net.minecraft.item.EntityBucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.sound.SoundEvent emptyingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.emptyingSound); }
// public void emptyingSound(yarnwrap.sound.SoundEvent value) { wrapperContained.emptyingSound = value.wrapperContained; }
// public com.mojang.serialization.MapCodec TROPICAL_FISH_VARIANT_MAP_CODEC() { return wrapperContained.TROPICAL_FISH_VARIANT_MAP_CODEC; }
// public void TROPICAL_FISH_VARIANT_MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.TROPICAL_FISH_VARIANT_MAP_CODEC = value; }
// public yarnwrap.entity.EntityType entityType() { return new yarnwrap.entity.EntityType(wrapperContained.entityType); }
// public void entityType(yarnwrap.entity.EntityType value) { wrapperContained.entityType = value.wrapperContained; }
// public EntityBucketItem(yarnwrap.entity.EntityType type,yarnwrap.fluid.Fluid fluid,yarnwrap.sound.SoundEvent emptyingSound,Object settings) { this.wrapperContained = new net.minecraft.item.EntityBucketItem(type.wrapperContained,fluid.wrapperContained,emptyingSound.wrapperContained,settings); }
// public void spawnEntity(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnEntity(world.wrapperContained,stack.wrapperContained,pos.wrapperContained); }

}