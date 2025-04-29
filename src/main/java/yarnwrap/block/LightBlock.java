package yarnwrap.block;
public class LightBlock { public net.minecraft.block.LightBlock wrapperContained; public LightBlock(net.minecraft.block.LightBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty LEVEL_15() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL_15); }
// public void LEVEL_15(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL_15 = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty LEVEL_15() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.LightBlock.LEVEL_15); }
// public static void LEVEL_15(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.LightBlock.LEVEL_15 = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LightBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LightBlock.WATERLOGGED = value.wrapperContained; }

// public java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return wrapperContained.STATE_TO_LUMINANCE; }
// public void STATE_TO_LUMINANCE(java.util.function.ToIntFunction value) { wrapperContained.STATE_TO_LUMINANCE = value; }
public static java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return net.minecraft.block.LightBlock.STATE_TO_LUMINANCE; }
// public static void STATE_TO_LUMINANCE(java.util.function.ToIntFunction value, ) { net.minecraft.block.LightBlock.STATE_TO_LUMINANCE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LightBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LightBlock.CODEC = value; }

// public int method_35281(yarnwrap.block.BlockState state) { return wrapperContained.method_35281(state.wrapperContained); }
// public static int method_35281(yarnwrap.block.BlockState state, ) { return net.minecraft.block.LightBlock.method_35281(state.wrapperContained); }
// public yarnwrap.item.ItemStack addNbtForLevel(yarnwrap.item.ItemStack stack,int level) { return new yarnwrap.item.ItemStack(wrapperContained.addNbtForLevel(stack.wrapperContained,level)); }
// public static yarnwrap.item.ItemStack addNbtForLevel(yarnwrap.item.ItemStack stack,int level, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.LightBlock.addNbtForLevel(stack.wrapperContained,level)); }

}