package yarnwrap.block;
public class FlowerbedBlock { public net.minecraft.block.FlowerbedBlock wrapperContained; public FlowerbedBlock(net.minecraft.block.FlowerbedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FlowerbedBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FlowerbedBlock.CODEC = value; }

// public yarnwrap.state.property.EnumProperty HORIZONTAL_FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HORIZONTAL_FACING); }
// public void HORIZONTAL_FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.HORIZONTAL_FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty HORIZONTAL_FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.FlowerbedBlock.HORIZONTAL_FACING); }
// public static void HORIZONTAL_FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.FlowerbedBlock.HORIZONTAL_FACING = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(wrapperContained.FLOWER_AMOUNT); }
// public void FLOWER_AMOUNT(yarnwrap.state.property.IntProperty value) { wrapperContained.FLOWER_AMOUNT = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty FLOWER_AMOUNT() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.FlowerbedBlock.FLOWER_AMOUNT); }
// public static void FLOWER_AMOUNT(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.FlowerbedBlock.FLOWER_AMOUNT = value.wrapperContained; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.FlowerbedBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.FlowerbedBlock.shapeFunction = value; }

// public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.FlowerbedBlock.createShapeFunction(); }

}