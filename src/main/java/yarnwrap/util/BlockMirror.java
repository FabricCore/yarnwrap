package yarnwrap.util;
public class BlockMirror { public net.minecraft.util.BlockMirror wrapperContained; public BlockMirror(net.minecraft.util.BlockMirror wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
// public void directionTransformation(yarnwrap.util.math.DirectionTransformation value) { wrapperContained.directionTransformation = value.wrapperContained; }
// public static yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.BlockMirror.directionTransformation); }
// public static void directionTransformation(yarnwrap.util.math.DirectionTransformation value, ) { net.minecraft.util.BlockMirror.directionTransformation = value.wrapperContained; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.util.BlockMirror.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.util.BlockMirror.name = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.BlockMirror.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.BlockMirror.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.util.BlockMirror.id; }
// public static void id(java.lang.String value, ) { net.minecraft.util.BlockMirror.id = value; }

// // public BlockMirror(java.lang.String id,int directionTransformation) { this.wrapperContained = new net.minecraft.util.BlockMirror(id,directionTransformation); }
public yarnwrap.util.math.Direction apply(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.apply(direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction apply(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.BlockMirror.apply(direction.wrapperContained)); }
public int mirror(int rotation,int fullTurn) { return wrapperContained.mirror(rotation,fullTurn); }
// public static int mirror(int rotation,int fullTurn, ) { return net.minecraft.util.BlockMirror.mirror(rotation,fullTurn); }
public yarnwrap.util.BlockRotation getRotation(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.BlockRotation(wrapperContained.getRotation(direction.wrapperContained)); }
// public static yarnwrap.util.BlockRotation getRotation(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.BlockRotation(net.minecraft.util.BlockMirror.getRotation(direction.wrapperContained)); }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
// public static yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.util.BlockMirror.getDirectionTransformation()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.util.BlockMirror.getName()); }

}