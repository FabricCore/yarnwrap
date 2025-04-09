package yarnwrap.util;
public class BlockRotation { public net.minecraft.util.BlockRotation wrapperContained; public BlockRotation(net.minecraft.util.BlockRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }
public yarnwrap.util.BlockRotation rotate(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.BlockRotation(wrapperContained.rotate(rotation.wrapperContained)); }
public int rotate(int rotation,int fullTurn) { return wrapperContained.rotate(rotation,fullTurn); }
public yarnwrap.util.math.Direction rotate(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.rotate(direction.wrapperContained)); }
public java.util.List randomRotationOrder(yarnwrap.util.math.random.Random random) { return wrapperContained.randomRotationOrder(random.wrapperContained); }
public yarnwrap.util.BlockRotation random(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.BlockRotation(wrapperContained.random(random.wrapperContained)); }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }

}