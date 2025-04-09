package yarnwrap.entity.passive;
public class GlowSquidEntity { public net.minecraft.entity.passive.GlowSquidEntity wrapperContained; public GlowSquidEntity(net.minecraft.entity.passive.GlowSquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData DARK_TICKS_REMAINING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DARK_TICKS_REMAINING); }
// public void setDarkTicksRemaining(int ticks) { wrapperContained.setDarkTicksRemaining(ticks); }
public int getDarkTicksRemaining() { return wrapperContained.getDarkTicksRemaining(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}