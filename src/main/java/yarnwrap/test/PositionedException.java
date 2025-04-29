package yarnwrap.test;
public class PositionedException { public net.minecraft.test.PositionedException wrapperContained; public PositionedException(net.minecraft.test.PositionedException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.test.PositionedException.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.test.PositionedException.pos = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos relativePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.relativePos); }
// public void relativePos(yarnwrap.util.math.BlockPos value) { wrapperContained.relativePos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos relativePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.test.PositionedException.relativePos); }
// public static void relativePos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.test.PositionedException.relativePos = value.wrapperContained; }

// public long tick() { return wrapperContained.tick; }
// public void tick(long value) { wrapperContained.tick = value; }
// public static long tick() { return net.minecraft.test.PositionedException.tick; }
// public static void tick(long value, ) { net.minecraft.test.PositionedException.tick = value; }

public PositionedException(java.lang.String message,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos relativePos,long tick) { this.wrapperContained = new net.minecraft.test.PositionedException(message,pos.wrapperContained,relativePos.wrapperContained,tick); }
public java.lang.String getDebugMessage() { return wrapperContained.getDebugMessage(); }
// public static java.lang.String getDebugMessage() { return net.minecraft.test.PositionedException.getDebugMessage(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.test.PositionedException.getPos()); }
public yarnwrap.util.math.BlockPos getRelativePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getRelativePos()); }
// public static yarnwrap.util.math.BlockPos getRelativePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.test.PositionedException.getRelativePos()); }

}