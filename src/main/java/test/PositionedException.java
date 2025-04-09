package yarnwrap.test;
public class PositionedException { public net.minecraft.test.PositionedException wrapperContained; public PositionedException(net.minecraft.test.PositionedException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.util.math.BlockPos relativePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.relativePos); }
// public long tick() { return wrapperContained.tick; }
public java.lang.String getDebugMessage() { return wrapperContained.getDebugMessage(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.util.math.BlockPos getRelativePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getRelativePos()); }

}