package yarnwrap.advancement;
public class AdvancementPositioner { public net.minecraft.advancement.AdvancementPositioner wrapperContained; public AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementPositioner parent() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.parent); }
// public int depth() { return wrapperContained.depth; }
// public yarnwrap.advancement.AdvancementPositioner previousSibling() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.previousSibling); }
// public int childrenSize() { return wrapperContained.childrenSize; }
// public yarnwrap.advancement.AdvancementPositioner optionalLast() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.optionalLast); }
// public yarnwrap.advancement.AdvancementPositioner substituteChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.substituteChild); }
// public java.util.List children() { return wrapperContained.children; }
// public float relativeRowInSiblings() { return wrapperContained.relativeRowInSiblings; }
// public float row() { return wrapperContained.row; }
// public yarnwrap.advancement.PlacedAdvancement advancement() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.advancement); }
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