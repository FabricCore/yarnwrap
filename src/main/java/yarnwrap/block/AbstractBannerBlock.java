package yarnwrap.block;
public class AbstractBannerBlock { public net.minecraft.block.AbstractBannerBlock wrapperContained; public AbstractBannerBlock(net.minecraft.block.AbstractBannerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }

}