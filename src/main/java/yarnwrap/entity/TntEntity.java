package yarnwrap.entity;
public class TntEntity { public net.minecraft.entity.TntEntity wrapperContained; public TntEntity(net.minecraft.entity.TntEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_FUSE() { return wrapperContained.DEFAULT_FUSE; }
// public void DEFAULT_FUSE(int value) { wrapperContained.DEFAULT_FUSE = value; }
public java.lang.String FUSE_NBT_KEY() { return wrapperContained.FUSE_NBT_KEY; }
// public void FUSE_NBT_KEY(java.lang.String value) { wrapperContained.FUSE_NBT_KEY = value; }
// public yarnwrap.entity.data.TrackedData BLOCK_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_STATE); }
// public void BLOCK_STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLOCK_STATE = value.wrapperContained; }
// public java.lang.String BLOCK_STATE_NBT_KEY() { return wrapperContained.BLOCK_STATE_NBT_KEY; }
// public void BLOCK_STATE_NBT_KEY(java.lang.String value) { wrapperContained.BLOCK_STATE_NBT_KEY = value; }
// public yarnwrap.world.explosion.ExplosionBehavior TELEPORTED_EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.TELEPORTED_EXPLOSION_BEHAVIOR); }
// public void TELEPORTED_EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.TELEPORTED_EXPLOSION_BEHAVIOR = value.wrapperContained; }
// public boolean teleported() { return wrapperContained.teleported; }
// public void teleported(boolean value) { wrapperContained.teleported = value; }
// public yarnwrap.entity.data.TrackedData FUSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FUSE); }
// public void FUSE(yarnwrap.entity.data.TrackedData value) { wrapperContained.FUSE = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity causingEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.causingEntity); }
// public void causingEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.causingEntity = value.wrapperContained; }
public TntEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.entity.LivingEntity igniter) { this.wrapperContained = new net.minecraft.entity.TntEntity(world.wrapperContained,x,y,z,igniter.wrapperContained); }
public void setBlockState(yarnwrap.block.BlockState state) { wrapperContained.setBlockState(state.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public void setTeleported(boolean teleported) { wrapperContained.setTeleported(teleported); }
public void setFuse(int fuse) { wrapperContained.setFuse(fuse); }
public int getFuse() { return wrapperContained.getFuse(); }
// public void explode() { wrapperContained.explode(); }

}