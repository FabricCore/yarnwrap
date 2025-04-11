package yarnwrap.block.entity;
public class SmokerBlockEntity { public net.minecraft.block.entity.SmokerBlockEntity wrapperContained; public SmokerBlockEntity(net.minecraft.block.entity.SmokerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public SmokerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.SmokerBlockEntity(pos.wrapperContained,state.wrapperContained); }

}