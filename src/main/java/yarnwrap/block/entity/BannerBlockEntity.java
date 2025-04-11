package yarnwrap.block.entity;
public class BannerBlockEntity { public net.minecraft.block.entity.BannerBlockEntity wrapperContained; public BannerBlockEntity(net.minecraft.block.entity.BannerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(wrapperContained.baseColor); }
// public void baseColor(yarnwrap.util.DyeColor value) { wrapperContained.baseColor = value.wrapperContained; }
public int MAX_PATTERN_COUNT() { return wrapperContained.MAX_PATTERN_COUNT; }
// public void MAX_PATTERN_COUNT(int value) { wrapperContained.MAX_PATTERN_COUNT = value; }
// public java.lang.String PATTERNS_KEY() { return wrapperContained.PATTERNS_KEY; }
// public void PATTERNS_KEY(java.lang.String value) { wrapperContained.PATTERNS_KEY = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
// public void patterns(yarnwrap.component.type.BannerPatternsComponent value) { wrapperContained.patterns = value.wrapperContained; }
public BannerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BannerBlockEntity(pos.wrapperContained,state.wrapperContained); }
public BannerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.DyeColor baseColor) { this.wrapperContained = new net.minecraft.block.entity.BannerBlockEntity(pos.wrapperContained,state.wrapperContained,baseColor.wrapperContained); }
public yarnwrap.item.ItemStack getPickStack() { return new yarnwrap.item.ItemStack(wrapperContained.getPickStack()); }
public yarnwrap.util.DyeColor getColorForState() { return new yarnwrap.util.DyeColor(wrapperContained.getColorForState()); }
public void readFrom(yarnwrap.item.ItemStack stack,yarnwrap.util.DyeColor baseColor) { wrapperContained.readFrom(stack.wrapperContained,baseColor.wrapperContained); }
// public void method_57566(java.lang.String patterns) { wrapperContained.method_57566(patterns); }
// public void method_58121(yarnwrap.component.type.BannerPatternsComponent patterns) { wrapperContained.method_58121(patterns.wrapperContained); }
public yarnwrap.component.type.BannerPatternsComponent getPatterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.getPatterns()); }

}