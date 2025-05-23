package yarnwrap.block;
public class NetherWartBlock { public net.minecraft.block.NetherWartBlock wrapperContained; public NetherWartBlock(net.minecraft.block.NetherWartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return wrapperContained.SHAPES_BY_AGE; }
// public void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.SHAPES_BY_AGE = value; }
// public static net.minecraft.util.shape.VoxelShape[] SHAPES_BY_AGE() { return net.minecraft.block.NetherWartBlock.SHAPES_BY_AGE; }
// public static void SHAPES_BY_AGE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.NetherWartBlock.SHAPES_BY_AGE = value; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.NetherWartBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.NetherWartBlock.AGE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.NetherWartBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.NetherWartBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.NetherWartBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.NetherWartBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape method_66456(int age) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66456(age)); }
// public static yarnwrap.util.shape.VoxelShape method_66456(int age, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.NetherWartBlock.method_66456(age)); }

}