package yarnwrap.block;
public class TestBlock { public net.minecraft.block.TestBlock wrapperContained; public TestBlock(net.minecraft.block.TestBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TestBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TestBlock.CODEC = value; }

// public yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.MODE); }
// public void MODE(yarnwrap.state.property.EnumProperty value) { wrapperContained.MODE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.TestBlock.MODE); }
// public static void MODE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.TestBlock.MODE = value.wrapperContained; }

// public yarnwrap.item.ItemStack applyBlockStateToStack(yarnwrap.item.ItemStack stack,yarnwrap.block.enums.TestBlockMode mode) { return new yarnwrap.item.ItemStack(wrapperContained.applyBlockStateToStack(stack.wrapperContained,mode.wrapperContained)); }
// public static yarnwrap.item.ItemStack applyBlockStateToStack(yarnwrap.item.ItemStack stack,yarnwrap.block.enums.TestBlockMode mode, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.TestBlock.applyBlockStateToStack(stack.wrapperContained,mode.wrapperContained)); }
// public yarnwrap.block.entity.TestBlockEntity getBlockEntityOnServer(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.TestBlockEntity(wrapperContained.getBlockEntityOnServer(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.entity.TestBlockEntity getBlockEntityOnServer(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.entity.TestBlockEntity(net.minecraft.block.TestBlock.getBlockEntityOnServer(world.wrapperContained,pos.wrapperContained)); }

}