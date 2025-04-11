package yarnwrap.world.gen.feature;
public class EndPortalFeature { public net.minecraft.world.gen.feature.EndPortalFeature wrapperContained; public EndPortalFeature(net.minecraft.world.gen.feature.EndPortalFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean open() { return wrapperContained.open; }
// public void open(boolean value) { wrapperContained.open = value; }
// public yarnwrap.util.math.BlockPos ORIGIN() { return new yarnwrap.util.math.BlockPos(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.math.BlockPos value) { wrapperContained.ORIGIN = value.wrapperContained; }
public yarnwrap.util.math.BlockPos offsetOrigin(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.offsetOrigin(pos.wrapperContained)); }

}