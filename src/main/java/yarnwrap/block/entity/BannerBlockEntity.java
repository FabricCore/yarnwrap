package yarnwrap.block.entity;
public class BannerBlockEntity { public net.minecraft.block.entity.BannerBlockEntity wrapperContained; public BannerBlockEntity(net.minecraft.block.entity.BannerBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public static yarnwrap.text.Text customName() { return new yarnwrap.text.Text(net.minecraft.block.entity.BannerBlockEntity.customName); }
// public static void customName(yarnwrap.text.Text value, ) { net.minecraft.block.entity.BannerBlockEntity.customName = value.wrapperContained; }

// public yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(wrapperContained.baseColor); }
// public void baseColor(yarnwrap.util.DyeColor value) { wrapperContained.baseColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor baseColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.BannerBlockEntity.baseColor); }
// public static void baseColor(yarnwrap.util.DyeColor value, ) { net.minecraft.block.entity.BannerBlockEntity.baseColor = value.wrapperContained; }

// public int MAX_PATTERN_COUNT() { return wrapperContained.MAX_PATTERN_COUNT; }
// public void MAX_PATTERN_COUNT(int value) { wrapperContained.MAX_PATTERN_COUNT = value; }
public static int MAX_PATTERN_COUNT() { return net.minecraft.block.entity.BannerBlockEntity.MAX_PATTERN_COUNT; }
// public static void MAX_PATTERN_COUNT(int value, ) { net.minecraft.block.entity.BannerBlockEntity.MAX_PATTERN_COUNT = value; }

// public java.lang.String PATTERNS_KEY() { return wrapperContained.PATTERNS_KEY; }
// public void PATTERNS_KEY(java.lang.String value) { wrapperContained.PATTERNS_KEY = value; }
// public static java.lang.String PATTERNS_KEY() { return net.minecraft.block.entity.BannerBlockEntity.PATTERNS_KEY; }
// public static void PATTERNS_KEY(java.lang.String value, ) { net.minecraft.block.entity.BannerBlockEntity.PATTERNS_KEY = value; }

// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
// public void patterns(yarnwrap.component.type.BannerPatternsComponent value) { wrapperContained.patterns = value.wrapperContained; }
// public static yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.block.entity.BannerBlockEntity.patterns); }
// public static void patterns(yarnwrap.component.type.BannerPatternsComponent value, ) { net.minecraft.block.entity.BannerBlockEntity.patterns = value.wrapperContained; }

public BannerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BannerBlockEntity(pos.wrapperContained,state.wrapperContained); }
public BannerBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.DyeColor baseColor) { this.wrapperContained = new net.minecraft.block.entity.BannerBlockEntity(pos.wrapperContained,state.wrapperContained,baseColor.wrapperContained); }
public yarnwrap.item.ItemStack getPickStack() { return new yarnwrap.item.ItemStack(wrapperContained.getPickStack()); }
// public static yarnwrap.item.ItemStack getPickStack() { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.BannerBlockEntity.getPickStack()); }
public yarnwrap.util.DyeColor getColorForState() { return new yarnwrap.util.DyeColor(wrapperContained.getColorForState()); }
// public static yarnwrap.util.DyeColor getColorForState() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.BannerBlockEntity.getColorForState()); }
public yarnwrap.component.type.BannerPatternsComponent getPatterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.getPatterns()); }
// public static yarnwrap.component.type.BannerPatternsComponent getPatterns() { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.block.entity.BannerBlockEntity.getPatterns()); }

}