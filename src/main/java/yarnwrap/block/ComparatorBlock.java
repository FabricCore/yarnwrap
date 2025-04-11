package yarnwrap.block;
public class ComparatorBlock { public net.minecraft.block.ComparatorBlock wrapperContained; public ComparatorBlock(net.minecraft.block.ComparatorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty MODE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.MODE); }
// public void MODE(yarnwrap.state.property.EnumProperty value) { wrapperContained.MODE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean method_9772(yarnwrap.util.math.Direction itemFrame) { return wrapperContained.method_9772(itemFrame.wrapperContained); }
// public int calculateOutputSignal(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.calculateOutputSignal(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.entity.decoration.ItemFrameEntity getAttachedItemFrame(yarnwrap.world.World world,yarnwrap.util.math.Direction facing,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.decoration.ItemFrameEntity(wrapperContained.getAttachedItemFrame(world.wrapperContained,facing.wrapperContained,pos.wrapperContained)); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}