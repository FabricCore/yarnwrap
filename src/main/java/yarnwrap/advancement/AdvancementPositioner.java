package yarnwrap.advancement;
public class AdvancementPositioner { public net.minecraft.advancement.AdvancementPositioner wrapperContained; public AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementPositioner parent() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.parent); }
// public void parent(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.parent = value.wrapperContained; }
// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public yarnwrap.advancement.AdvancementPositioner previousSibling() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.previousSibling); }
// public void previousSibling(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.previousSibling = value.wrapperContained; }
// public int childrenSize() { return wrapperContained.childrenSize; }
// public void childrenSize(int value) { wrapperContained.childrenSize = value; }
// public yarnwrap.advancement.AdvancementPositioner optionalLast() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.optionalLast); }
// public void optionalLast(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.optionalLast = value.wrapperContained; }
// public yarnwrap.advancement.AdvancementPositioner substituteChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.substituteChild); }
// public void substituteChild(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.substituteChild = value.wrapperContained; }
// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public float relativeRowInSiblings() { return wrapperContained.relativeRowInSiblings; }
// public void relativeRowInSiblings(float value) { wrapperContained.relativeRowInSiblings = value; }
// public float row() { return wrapperContained.row; }
// public void row(float value) { wrapperContained.row = value; }
// public yarnwrap.advancement.PlacedAdvancement advancement() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.advancement); }
// public void advancement(yarnwrap.advancement.PlacedAdvancement value) { wrapperContained.advancement = value.wrapperContained; }
// public yarnwrap.advancement.AdvancementPositioner onFinishCalculation(yarnwrap.advancement.AdvancementPositioner last) { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.onFinishCalculation(last.wrapperContained)); }
// public float findMinRowRecursively(float deltaRow,int depth,float minRow) { return wrapperContained.findMinRowRecursively(deltaRow,depth,minRow); }
// public void increaseRowRecursively(float deltaRow) { wrapperContained.increaseRowRecursively(deltaRow); }
// public yarnwrap.advancement.AdvancementPositioner getLastChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getLastChild()); }
// public yarnwrap.advancement.AdvancementPositioner getLast() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getLast()); }
// public yarnwrap.advancement.AdvancementPositioner findChildrenRecursively(yarnwrap.advancement.PlacedAdvancement advancement,yarnwrap.advancement.AdvancementPositioner lastChild) { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.findChildrenRecursively(advancement.wrapperContained,lastChild.wrapperContained)); }
// public void calculateRecursively() { wrapperContained.calculateRecursively(); }
// public void pushDown(yarnwrap.advancement.AdvancementPositioner positioner,float extraRowDistance) { wrapperContained.pushDown(positioner.wrapperContained,extraRowDistance); }
// public yarnwrap.advancement.AdvancementPositioner getFirstChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getFirstChild()); }
// public void onFinishChildrenCalculation() { wrapperContained.onFinishChildrenCalculation(); }
// public void apply() { wrapperContained.apply(); }
public void arrangeForTree(yarnwrap.advancement.PlacedAdvancement root) { wrapperContained.arrangeForTree(root.wrapperContained); }

}