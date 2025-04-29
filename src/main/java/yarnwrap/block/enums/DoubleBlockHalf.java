package yarnwrap.block.enums;
public class DoubleBlockHalf { public net.minecraft.block.enums.DoubleBlockHalf wrapperContained; public DoubleBlockHalf(net.minecraft.block.enums.DoubleBlockHalf wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction oppositeDirection() { return new yarnwrap.util.math.Direction(wrapperContained.oppositeDirection); }
// public void oppositeDirection(yarnwrap.util.math.Direction value) { wrapperContained.oppositeDirection = value.wrapperContained; }
// public static yarnwrap.util.math.Direction oppositeDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.enums.DoubleBlockHalf.oppositeDirection); }
// public static void oppositeDirection(yarnwrap.util.math.Direction value, ) { net.minecraft.block.enums.DoubleBlockHalf.oppositeDirection = value.wrapperContained; }

// // public DoubleBlockHalf(java.lang.String oppositeDirection) { this.wrapperContained = new net.minecraft.block.enums.DoubleBlockHalf(oppositeDirection); }
public yarnwrap.util.math.Direction getOppositeDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getOppositeDirection()); }
// public static yarnwrap.util.math.Direction getOppositeDirection() { return new yarnwrap.util.math.Direction(net.minecraft.block.enums.DoubleBlockHalf.getOppositeDirection()); }
public yarnwrap.block.enums.DoubleBlockHalf getOtherHalf() { return new yarnwrap.block.enums.DoubleBlockHalf(wrapperContained.getOtherHalf()); }
// public static yarnwrap.block.enums.DoubleBlockHalf getOtherHalf() { return new yarnwrap.block.enums.DoubleBlockHalf(net.minecraft.block.enums.DoubleBlockHalf.getOtherHalf()); }

}