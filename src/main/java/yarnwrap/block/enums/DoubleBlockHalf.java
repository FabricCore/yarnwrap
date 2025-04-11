package yarnwrap.block.enums;
public class DoubleBlockHalf { public net.minecraft.block.enums.DoubleBlockHalf wrapperContained; public DoubleBlockHalf(net.minecraft.block.enums.DoubleBlockHalf wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction oppositeDirection() { return new yarnwrap.util.math.Direction(wrapperContained.oppositeDirection); }
// public void oppositeDirection(yarnwrap.util.math.Direction value) { wrapperContained.oppositeDirection = value.wrapperContained; }
public yarnwrap.util.math.Direction getOppositeDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getOppositeDirection()); }
public yarnwrap.block.enums.DoubleBlockHalf getOtherHalf() { return new yarnwrap.block.enums.DoubleBlockHalf(wrapperContained.getOtherHalf()); }

}