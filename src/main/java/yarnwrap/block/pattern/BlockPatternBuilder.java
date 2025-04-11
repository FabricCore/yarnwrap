package yarnwrap.block.pattern;
public class BlockPatternBuilder { public net.minecraft.block.pattern.BlockPatternBuilder wrapperContained; public BlockPatternBuilder(net.minecraft.block.pattern.BlockPatternBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Joiner JOINER() { return wrapperContained.JOINER; }
// public void JOINER(com.google.common.base.Joiner value) { wrapperContained.JOINER = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public java.util.Map charMap() { return wrapperContained.charMap; }
// public void charMap(java.util.Map value) { wrapperContained.charMap = value; }
// public java.util.List aisles() { return wrapperContained.aisles; }
// public void aisles(java.util.List value) { wrapperContained.aisles = value; }
public yarnwrap.block.pattern.BlockPatternBuilder where(char key,java.util.function.Predicate predicate) { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.where(key,predicate)); }
public yarnwrap.block.pattern.BlockPatternBuilder start() { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.start()); }
public yarnwrap.block.pattern.BlockPatternBuilder aisle(java.lang.String[] pattern) { return new yarnwrap.block.pattern.BlockPatternBuilder(wrapperContained.aisle(pattern)); }
// public java.util.function.Predicate[][][] bakePredicates() { return wrapperContained.bakePredicates(); }
public yarnwrap.block.pattern.BlockPattern build() { return new yarnwrap.block.pattern.BlockPattern(wrapperContained.build()); }
// public void validate() { wrapperContained.validate(); }

}