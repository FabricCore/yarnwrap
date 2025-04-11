package yarnwrap.block.entity;
public class FurnaceBlockEntity { public net.minecraft.block.entity.FurnaceBlockEntity wrapperContained; public FurnaceBlockEntity(net.minecraft.block.entity.FurnaceBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public FurnaceBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.FurnaceBlockEntity(pos.wrapperContained,state.wrapperContained); }

}