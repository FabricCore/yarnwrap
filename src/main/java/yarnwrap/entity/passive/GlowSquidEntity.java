package yarnwrap.entity.passive;
public class GlowSquidEntity { public net.minecraft.entity.passive.GlowSquidEntity wrapperContained; public GlowSquidEntity(net.minecraft.entity.passive.GlowSquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData DARK_TICKS_REMAINING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DARK_TICKS_REMAINING); }
// public void DARK_TICKS_REMAINING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DARK_TICKS_REMAINING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData DARK_TICKS_REMAINING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.GlowSquidEntity.DARK_TICKS_REMAINING); }
// public static void DARK_TICKS_REMAINING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.GlowSquidEntity.DARK_TICKS_REMAINING = value.wrapperContained; }

// public int DEFAULT_DARK_TICKS_REMAINING() { return wrapperContained.DEFAULT_DARK_TICKS_REMAINING; }
// public void DEFAULT_DARK_TICKS_REMAINING(int value) { wrapperContained.DEFAULT_DARK_TICKS_REMAINING = value; }
// public static int DEFAULT_DARK_TICKS_REMAINING() { return net.minecraft.entity.passive.GlowSquidEntity.DEFAULT_DARK_TICKS_REMAINING; }
// public static void DEFAULT_DARK_TICKS_REMAINING(int value, ) { net.minecraft.entity.passive.GlowSquidEntity.DEFAULT_DARK_TICKS_REMAINING = value; }

// public void setDarkTicksRemaining(int ticks) { wrapperContained.setDarkTicksRemaining(ticks); }
// public static void setDarkTicksRemaining(int ticks, ) { net.minecraft.entity.passive.GlowSquidEntity.setDarkTicksRemaining(ticks); }
public int getDarkTicksRemaining() { return wrapperContained.getDarkTicksRemaining(); }
// public static int getDarkTicksRemaining() { return net.minecraft.entity.passive.GlowSquidEntity.getDarkTicksRemaining(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.GlowSquidEntity.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}