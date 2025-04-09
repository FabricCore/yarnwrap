package yarnwrap.item;
public class BannerItem { public net.minecraft.item.BannerItem wrapperContained; public BannerItem(net.minecraft.item.BannerItem wrapperContained) { this.wrapperContained = wrapperContained; }

public void appendBannerTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip) { wrapperContained.appendBannerTooltip(stack.wrapperContained,tooltip); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }

}