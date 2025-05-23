package yarnwrap.block;
public class WallSkullBlock { public net.minecraft.block.WallSkullBlock wrapperContained; public WallSkullBlock(net.minecraft.block.WallSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.WallSkullBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.WallSkullBlock.FACING = value.wrapperContained; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
// public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.WallSkullBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.WallSkullBlock.SHAPES_BY_DIRECTION = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallSkullBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallSkullBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_54065(Object instance) { return wrapperContained.method_54065(instance); }
// public static com.mojang.datafixers.kinds.App method_54065(Object instance, ) { return net.minecraft.block.WallSkullBlock.method_54065(instance); }

}