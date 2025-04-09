package yarnwrap.entity;
public class TntEntity { public net.minecraft.entity.TntEntity wrapperContained; public TntEntity(net.minecraft.entity.TntEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_FUSE() { return wrapperContained.DEFAULT_FUSE; }
public java.lang.String FUSE_NBT_KEY() { return wrapperContained.FUSE_NBT_KEY; }
// public yarnwrap.entity.data.TrackedData BLOCK_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_STATE); }
// public java.lang.String BLOCK_STATE_NBT_KEY() { return wrapperContained.BLOCK_STATE_NBT_KEY; }
// public yarnwrap.world.explosion.ExplosionBehavior TELEPORTED_EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.TELEPORTED_EXPLOSION_BEHAVIOR); }
// public boolean teleported() { return wrapperContained.teleported; }
// public yarnwrap.entity.data.TrackedData FUSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FUSE); }
// public yarnwrap.entity.LivingEntity causingEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.causingEntity); }
public void setBlockState(yarnwrap.block.BlockState state) { wrapperContained.setBlockState(state.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public void setTeleported(boolean teleported) { wrapperContained.setTeleported(teleported); }
public void setFuse(int fuse) { wrapperContained.setFuse(fuse); }
public int getFuse() { return wrapperContained.getFuse(); }
// public void explode() { wrapperContained.explode(); }

}