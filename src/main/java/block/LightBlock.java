package yarnwrap.block;
public class LightBlock { public net.minecraft.block.LightBlock wrapperContained; public LightBlock(net.minecraft.block.LightBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty LEVEL_15() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL_15); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public java.util.function.ToIntFunction STATE_TO_LUMINANCE() { return wrapperContained.STATE_TO_LUMINANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.item.ItemStack addNbtForLevel(yarnwrap.item.ItemStack stack,int level) { return new yarnwrap.item.ItemStack(wrapperContained.addNbtForLevel(stack.wrapperContained,level)); }

}