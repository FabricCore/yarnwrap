package yarnwrap.world.gen.feature;
public class EndPortalFeature { public net.minecraft.world.gen.feature.EndPortalFeature wrapperContained; public EndPortalFeature(net.minecraft.world.gen.feature.EndPortalFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean open() { return wrapperContained.open; }
// public void open(boolean value) { wrapperContained.open = value; }
// public static boolean open() { return net.minecraft.world.gen.feature.EndPortalFeature.open; }
// public static void open(boolean value, ) { net.minecraft.world.gen.feature.EndPortalFeature.open = value; }

// public yarnwrap.util.math.BlockPos ORIGIN() { return new yarnwrap.util.math.BlockPos(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.math.BlockPos value) { wrapperContained.ORIGIN = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos ORIGIN() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.EndPortalFeature.ORIGIN); }
// public static void ORIGIN(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.gen.feature.EndPortalFeature.ORIGIN = value.wrapperContained; }

public EndPortalFeature(boolean open) { this.wrapperContained = new net.minecraft.world.gen.feature.EndPortalFeature(open); }
// public yarnwrap.util.math.BlockPos offsetOrigin(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.offsetOrigin(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos offsetOrigin(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.EndPortalFeature.offsetOrigin(pos.wrapperContained)); }

}