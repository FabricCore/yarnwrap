package yarnwrap.block.entity;
public class BlastFurnaceBlockEntity { public net.minecraft.block.entity.BlastFurnaceBlockEntity wrapperContained; public BlastFurnaceBlockEntity(net.minecraft.block.entity.BlastFurnaceBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public BlastFurnaceBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BlastFurnaceBlockEntity(pos.wrapperContained,state.wrapperContained); }

}