package yarnwrap.entity.decoration;
public class EndCrystalEntity { public net.minecraft.entity.decoration.EndCrystalEntity wrapperContained; public EndCrystalEntity(net.minecraft.entity.decoration.EndCrystalEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData BEAM_TARGET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEAM_TARGET); }
// public void BEAM_TARGET(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEAM_TARGET = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BEAM_TARGET() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.EndCrystalEntity.BEAM_TARGET); }
// public static void BEAM_TARGET(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.EndCrystalEntity.BEAM_TARGET = value.wrapperContained; }

public int endCrystalAge() { return wrapperContained.endCrystalAge; }
public void endCrystalAge(int value) { wrapperContained.endCrystalAge = value; }
// public static int endCrystalAge() { return net.minecraft.entity.decoration.EndCrystalEntity.endCrystalAge; }
// public static void endCrystalAge(int value, ) { net.minecraft.entity.decoration.EndCrystalEntity.endCrystalAge = value; }

// public yarnwrap.entity.data.TrackedData SHOW_BOTTOM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOW_BOTTOM); }
// public void SHOW_BOTTOM(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOW_BOTTOM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SHOW_BOTTOM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.EndCrystalEntity.SHOW_BOTTOM); }
// public static void SHOW_BOTTOM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.EndCrystalEntity.SHOW_BOTTOM = value.wrapperContained; }

// public boolean DEFAULT_SHOW_BOTTOM() { return wrapperContained.DEFAULT_SHOW_BOTTOM; }
// public void DEFAULT_SHOW_BOTTOM(boolean value) { wrapperContained.DEFAULT_SHOW_BOTTOM = value; }
// public static boolean DEFAULT_SHOW_BOTTOM() { return net.minecraft.entity.decoration.EndCrystalEntity.DEFAULT_SHOW_BOTTOM; }
// public static void DEFAULT_SHOW_BOTTOM(boolean value, ) { net.minecraft.entity.decoration.EndCrystalEntity.DEFAULT_SHOW_BOTTOM = value; }

public EndCrystalEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.decoration.EndCrystalEntity(world.wrapperContained,x,y,z); }
// public void crystalDestroyed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source) { wrapperContained.crystalDestroyed(world.wrapperContained,source.wrapperContained); }
// public static void crystalDestroyed(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source, ) { net.minecraft.entity.decoration.EndCrystalEntity.crystalDestroyed(world.wrapperContained,source.wrapperContained); }
public boolean shouldShowBottom() { return wrapperContained.shouldShowBottom(); }
// public static boolean shouldShowBottom() { return net.minecraft.entity.decoration.EndCrystalEntity.shouldShowBottom(); }
public void setBeamTarget(yarnwrap.util.math.BlockPos beamTarget) { wrapperContained.setBeamTarget(beamTarget.wrapperContained); }
// public static void setBeamTarget(yarnwrap.util.math.BlockPos beamTarget, ) { net.minecraft.entity.decoration.EndCrystalEntity.setBeamTarget(beamTarget.wrapperContained); }
public yarnwrap.util.math.BlockPos getBeamTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBeamTarget()); }
// public static yarnwrap.util.math.BlockPos getBeamTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.decoration.EndCrystalEntity.getBeamTarget()); }
public void setShowBottom(boolean showBottom) { wrapperContained.setShowBottom(showBottom); }
// public static void setShowBottom(boolean showBottom, ) { net.minecraft.entity.decoration.EndCrystalEntity.setShowBottom(showBottom); }

}