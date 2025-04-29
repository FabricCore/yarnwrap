package yarnwrap.block;
public class RailBlock { public net.minecraft.block.RailBlock wrapperContained; public RailBlock(net.minecraft.block.RailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.RailBlock.SHAPE); }
// public static void SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.RailBlock.SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RailBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RailBlock.CODEC = value; }


}