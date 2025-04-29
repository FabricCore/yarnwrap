package yarnwrap.entity;
public class TntEntity { public net.minecraft.entity.TntEntity wrapperContained; public TntEntity(net.minecraft.entity.TntEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_FUSE() { return wrapperContained.DEFAULT_FUSE; }
// public void DEFAULT_FUSE(int value) { wrapperContained.DEFAULT_FUSE = value; }
// public static int DEFAULT_FUSE() { return net.minecraft.entity.TntEntity.DEFAULT_FUSE; }
// public static void DEFAULT_FUSE(int value, ) { net.minecraft.entity.TntEntity.DEFAULT_FUSE = value; }

// public java.lang.String FUSE_NBT_KEY() { return wrapperContained.FUSE_NBT_KEY; }
// public void FUSE_NBT_KEY(java.lang.String value) { wrapperContained.FUSE_NBT_KEY = value; }
public static java.lang.String FUSE_NBT_KEY() { return net.minecraft.entity.TntEntity.FUSE_NBT_KEY; }
// public static void FUSE_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.TntEntity.FUSE_NBT_KEY = value; }

// public yarnwrap.entity.data.TrackedData BLOCK_STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_STATE); }
// public void BLOCK_STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLOCK_STATE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BLOCK_STATE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.TntEntity.BLOCK_STATE); }
// public static void BLOCK_STATE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.TntEntity.BLOCK_STATE = value.wrapperContained; }

// public java.lang.String BLOCK_STATE_NBT_KEY() { return wrapperContained.BLOCK_STATE_NBT_KEY; }
// public void BLOCK_STATE_NBT_KEY(java.lang.String value) { wrapperContained.BLOCK_STATE_NBT_KEY = value; }
// public static java.lang.String BLOCK_STATE_NBT_KEY() { return net.minecraft.entity.TntEntity.BLOCK_STATE_NBT_KEY; }
// public static void BLOCK_STATE_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.TntEntity.BLOCK_STATE_NBT_KEY = value; }

// public yarnwrap.world.explosion.ExplosionBehavior TELEPORTED_EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(wrapperContained.TELEPORTED_EXPLOSION_BEHAVIOR); }
// public void TELEPORTED_EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value) { wrapperContained.TELEPORTED_EXPLOSION_BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.world.explosion.ExplosionBehavior TELEPORTED_EXPLOSION_BEHAVIOR() { return new yarnwrap.world.explosion.ExplosionBehavior(net.minecraft.entity.TntEntity.TELEPORTED_EXPLOSION_BEHAVIOR); }
// public static void TELEPORTED_EXPLOSION_BEHAVIOR(yarnwrap.world.explosion.ExplosionBehavior value, ) { net.minecraft.entity.TntEntity.TELEPORTED_EXPLOSION_BEHAVIOR = value.wrapperContained; }

// public boolean teleported() { return wrapperContained.teleported; }
// public void teleported(boolean value) { wrapperContained.teleported = value; }
// public static boolean teleported() { return net.minecraft.entity.TntEntity.teleported; }
// public static void teleported(boolean value, ) { net.minecraft.entity.TntEntity.teleported = value; }

// public yarnwrap.entity.data.TrackedData FUSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FUSE); }
// public void FUSE(yarnwrap.entity.data.TrackedData value) { wrapperContained.FUSE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FUSE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.TntEntity.FUSE); }
// public static void FUSE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.TntEntity.FUSE = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity causingEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.causingEntity); }
// public void causingEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.causingEntity = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity causingEntity() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.TntEntity.causingEntity); }
// public static void causingEntity(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.TntEntity.causingEntity = value.wrapperContained; }

public TntEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.entity.LivingEntity igniter) { this.wrapperContained = new net.minecraft.entity.TntEntity(world.wrapperContained,x,y,z,igniter.wrapperContained); }
public void setBlockState(yarnwrap.block.BlockState state) { wrapperContained.setBlockState(state.wrapperContained); }
// public static void setBlockState(yarnwrap.block.BlockState state, ) { net.minecraft.entity.TntEntity.setBlockState(state.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.entity.TntEntity.getBlockState()); }
// public void setTeleported(boolean teleported) { wrapperContained.setTeleported(teleported); }
// public static void setTeleported(boolean teleported, ) { net.minecraft.entity.TntEntity.setTeleported(teleported); }
public void setFuse(int fuse) { wrapperContained.setFuse(fuse); }
// public static void setFuse(int fuse, ) { net.minecraft.entity.TntEntity.setFuse(fuse); }
public int getFuse() { return wrapperContained.getFuse(); }
// public static int getFuse() { return net.minecraft.entity.TntEntity.getFuse(); }
// public void explode() { wrapperContained.explode(); }
// public static void explode() { net.minecraft.entity.TntEntity.explode(); }

}