package yarnwrap.block.entity;
public class EndPortalBlockEntity { public net.minecraft.block.entity.EndPortalBlockEntity wrapperContained; public EndPortalBlockEntity(net.minecraft.block.entity.EndPortalBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public EndPortalBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.EndPortalBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean shouldDrawSide(yarnwrap.util.math.Direction direction) { return wrapperContained.shouldDrawSide(direction.wrapperContained); }

}