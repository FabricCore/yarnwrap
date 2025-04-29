package yarnwrap.block.pattern;
public class BlockPatternBuilder { public net.minecraft.block.pattern.BlockPatternBuilder wrapperContained; public BlockPatternBuilder(net.minecraft.block.pattern.BlockPatternBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Joiner JOINER() { return wrapperContained.JOINER; }
// public void JOINER(com.google.common.base.Joiner value) { wrapperContained.JOINER = value; }
// public static com.google.common.base.Joiner JOINER() { return net.minecraft.block.pattern.BlockPatternBuilder.JOINER; }
// public static void JOINER(com.google.common.base.Joiner value, ) { net.minecraft.block.pattern.BlockPatternBuilder.JOINER = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.block.pattern.BlockPatternBuilder.width; }
// public static void width(int value, ) { net.minecraft.block.pattern.BlockPatternBuilder.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.block.pattern.BlockPatternBuilder.height; }
// public static void height(int value, ) { net.minecraft.block.pattern.BlockPatternBuilder.height = value; }

// public java.util.Map charMap() { return wrapperContained.charMap; }
// public void charMap(java.util.Map value) { wrapperContained.charMap = value; }
// public static java.util.Map charMap() { return net.minecraft.block.pattern.BlockPatternBuilder.charMap; }
// public static void charMap(java.util.Map value, ) { net.minecraft.block.pattern.BlockPatternBuilder.charMap = value; }

// public java.util.List aisles() { return wrapperContained.aisles; }
// public void aisles(java.util.List value) { wrapperContained.aisles = value; }
// public static java.util.List aisles() { return net.minecraft.block.pattern.BlockPatternBuilder.aisles; }
// public static void aisles(java.util.List value, ) { net.minecraft.block.pattern.BlockPatternBuilder.aisles = value; }

public yarnwrap.block.pattern.BlockPatternBuilder where(char key,java.util.function.Predicate predicate) { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.where(key,predicate)); }
// public static yarnwrap.block.pattern.BlockPatternBuilder where(char key,java.util.function.Predicate predicate, ) { return new yarnwrap.block.pattern.BlockPatternBuilder(net.minecraft.block.pattern.BlockPatternBuilder.where(key,predicate)); }
// public yarnwrap.block.pattern.BlockPatternBuilder start() { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.start()); }
public static yarnwrap.block.pattern.BlockPatternBuilder start() { return new yarnwrap.block.pattern.BlockPatternBuilder(net.minecraft.block.pattern.BlockPatternBuilder.start()); }
public yarnwrap.block.pattern.BlockPatternBuilder aisle(java.lang.String[] pattern) { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.aisle(pattern)); }
// public static yarnwrap.block.pattern.BlockPatternBuilder aisle(java.lang.String[] pattern, ) { return new yarnwrap.block.pattern.BlockPatternBuilder(net.minecraft.block.pattern.BlockPatternBuilder.aisle(pattern)); }
// public java.util.function.Predicate[][][] bakePredicates() { return wrapperContained.bakePredicates(); }
// public static java.util.function.Predicate[][][] bakePredicates() { return net.minecraft.block.pattern.BlockPatternBuilder.bakePredicates(); }
public yarnwrap.block.pattern.BlockPattern build() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.build()); }
// public static yarnwrap.block.pattern.BlockPattern build() { return new yarnwrap.block.pattern.BlockPattern(net.minecraft.block.pattern.BlockPatternBuilder.build()); }
// public void validate() { wrapperContained.validate(); }
// public static void validate() { net.minecraft.block.pattern.BlockPatternBuilder.validate(); }
// public boolean method_38861(yarnwrap.block.pattern.CachedBlockPosition pos) { return wrapperContained.method_38861(pos.wrapperContained); }
// public static boolean method_38861(yarnwrap.block.pattern.CachedBlockPosition pos, ) { return net.minecraft.block.pattern.BlockPatternBuilder.method_38861(pos.wrapperContained); }

}