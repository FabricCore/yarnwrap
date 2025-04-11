package yarnwrap.block.entity;
public class BedBlockEntity { public net.minecraft.block.entity.BedBlockEntity wrapperContained; public BedBlockEntity(net.minecraft.block.entity.BedBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public BedBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BedBlockEntity(pos.wrapperContained,state.wrapperContained); }
public BedBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.DyeColor color) { this.wrapperContained = new net.minecraft.block.entity.BedBlockEntity(pos.wrapperContained,state.wrapperContained,color.wrapperContained); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }

}