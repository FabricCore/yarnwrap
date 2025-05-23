package yarnwrap.block;
public class LeafLitterBlock { public net.minecraft.block.LeafLitterBlock wrapperContained; public LeafLitterBlock(net.minecraft.block.LeafLitterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LeafLitterBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LeafLitterBlock.CODEC = value; }

// public yarnwrap.state.property.EnumProperty HORIZONTAL_FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HORIZONTAL_FACING); }
// public void HORIZONTAL_FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.HORIZONTAL_FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HORIZONTAL_FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.LeafLitterBlock.HORIZONTAL_FACING); }
// public static void HORIZONTAL_FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.LeafLitterBlock.HORIZONTAL_FACING = value.wrapperContained; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.LeafLitterBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.LeafLitterBlock.shapeFunction = value; }

// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.LeafLitterBlock.createShapeFunction(); }

}