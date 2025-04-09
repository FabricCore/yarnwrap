package yarnwrap.block.entity;
public class BannerBlockEntity { public net.minecraft.block.entity.BannerBlockEntity wrapperContained; public BannerBlockEntity(net.minecraft.block.entity.BannerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(wrapperContained.baseColor); }
public int MAX_PATTERN_COUNT() { return wrapperContained.MAX_PATTERN_COUNT; }
// public java.lang.String PATTERNS_KEY() { return wrapperContained.PATTERNS_KEY; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
public yarnwrap.item.ItemStack getPickStack() { return new yarnwrap.item.ItemStack(wrapperContained.getPickStack()); }
public yarnwrap.util.DyeColor getColorForState() { return new yarnwrap.util.DyeColor(wrapperContained.getColorForState()); }
public void readFrom(yarnwrap.item.ItemStack stack,yarnwrap.util.DyeColor baseColor) { wrapperContained.readFrom(stack.wrapperContained,baseColor.wrapperContained); }
public yarnwrap.component.type.BannerPatternsComponent getPatterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.getPatterns()); }

}