package yarnwrap.block.entity;
public class EndPortalBlockEntity { public net.minecraft.block.entity.EndPortalBlockEntity wrapperContained; public EndPortalBlockEntity(net.minecraft.block.entity.EndPortalBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean shouldDrawSide(yarnwrap.util.math.Direction direction) { return wrapperContained.shouldDrawSide(direction.wrapperContained); }

}