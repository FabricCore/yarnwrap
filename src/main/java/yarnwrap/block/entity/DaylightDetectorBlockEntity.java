package yarnwrap.block.entity;
public class DaylightDetectorBlockEntity { public net.minecraft.block.entity.DaylightDetectorBlockEntity wrapperContained; public DaylightDetectorBlockEntity(net.minecraft.block.entity.DaylightDetectorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public DaylightDetectorBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.DaylightDetectorBlockEntity(pos.wrapperContained,state.wrapperContained); }

}