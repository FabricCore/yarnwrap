package yarnwrap.item;
public class BannerItem { public net.minecraft.item.BannerItem wrapperContained; public BannerItem(net.minecraft.item.BannerItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public BannerItem(yarnwrap.block.Block bannerBlock,yarnwrap.block.Block wallBannerBlock,Object settings) { this.wrapperContained = new net.minecraft.item.BannerItem(bannerBlock.wrapperContained,wallBannerBlock.wrapperContained,settings); }
// public void appendBannerTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip) { wrapperContained.appendBannerTooltip(stack.wrapperContained,tooltip); }
// public static void appendBannerTooltip(yarnwrap.item.ItemStack stack,java.util.List tooltip, ) { net.minecraft.item.BannerItem.appendBannerTooltip(stack.wrapperContained,tooltip); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.item.BannerItem.getColor()); }

}