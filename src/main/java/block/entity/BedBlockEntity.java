package yarnwrap.block.entity;
public class BedBlockEntity { public net.minecraft.block.entity.BedBlockEntity wrapperContained; public BedBlockEntity(net.minecraft.block.entity.BedBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }

}