package yarnwrap.entity.decoration;
public class EndCrystalEntity { public net.minecraft.entity.decoration.EndCrystalEntity wrapperContained; public EndCrystalEntity(net.minecraft.entity.decoration.EndCrystalEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData BEAM_TARGET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEAM_TARGET); }
// public void BEAM_TARGET(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEAM_TARGET = value.wrapperContained; }
public int endCrystalAge() { return wrapperContained.endCrystalAge; }
public void endCrystalAge(int value) { wrapperContained.endCrystalAge = value; }
// public yarnwrap.entity.data.TrackedData SHOW_BOTTOM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOW_BOTTOM); }
// public void SHOW_BOTTOM(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOW_BOTTOM = value.wrapperContained; }
// public void crystalDestroyed(yarnwrap.entity.damage.DamageSource source) { wrapperContained.crystalDestroyed(source.wrapperContained); }
public boolean shouldShowBottom() { return wrapperContained.shouldShowBottom(); }
public void setBeamTarget(yarnwrap.util.math.BlockPos beamTarget) { wrapperContained.setBeamTarget(beamTarget.wrapperContained); }
public yarnwrap.util.math.BlockPos getBeamTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBeamTarget()); }
public void setShowBottom(boolean showBottom) { wrapperContained.setShowBottom(showBottom); }

}