package yarnwrap.advancement;
public class AdvancementPositioner { public net.minecraft.advancement.AdvancementPositioner wrapperContained; public AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementPositioner parent() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.parent); }
// public void parent(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementPositioner parent() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.parent); }
// public static void parent(yarnwrap.advancement.AdvancementPositioner value, ) { net.minecraft.advancement.AdvancementPositioner.parent = value.wrapperContained; }

// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public static int depth() { return net.minecraft.advancement.AdvancementPositioner.depth; }
// public static void depth(int value, ) { net.minecraft.advancement.AdvancementPositioner.depth = value; }

// public yarnwrap.advancement.AdvancementPositioner previousSibling() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.previousSibling); }
// public void previousSibling(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.previousSibling = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementPositioner previousSibling() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.previousSibling); }
// public static void previousSibling(yarnwrap.advancement.AdvancementPositioner value, ) { net.minecraft.advancement.AdvancementPositioner.previousSibling = value.wrapperContained; }

// public int childrenSize() { return wrapperContained.childrenSize; }
// public void childrenSize(int value) { wrapperContained.childrenSize = value; }
// public static int childrenSize() { return net.minecraft.advancement.AdvancementPositioner.childrenSize; }
// public static void childrenSize(int value, ) { net.minecraft.advancement.AdvancementPositioner.childrenSize = value; }

// public yarnwrap.advancement.AdvancementPositioner optionalLast() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.optionalLast); }
// public void optionalLast(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.optionalLast = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementPositioner optionalLast() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.optionalLast); }
// public static void optionalLast(yarnwrap.advancement.AdvancementPositioner value, ) { net.minecraft.advancement.AdvancementPositioner.optionalLast = value.wrapperContained; }

// public yarnwrap.advancement.AdvancementPositioner substituteChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.substituteChild); }
// public void substituteChild(yarnwrap.advancement.AdvancementPositioner value) { wrapperContained.substituteChild = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementPositioner substituteChild() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.substituteChild); }
// public static void substituteChild(yarnwrap.advancement.AdvancementPositioner value, ) { net.minecraft.advancement.AdvancementPositioner.substituteChild = value.wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public static java.util.List children() { return net.minecraft.advancement.AdvancementPositioner.children; }
// public static void children(java.util.List value, ) { net.minecraft.advancement.AdvancementPositioner.children = value; }

// public float relativeRowInSiblings() { return wrapperContained.relativeRowInSiblings; }
// public void relativeRowInSiblings(float value) { wrapperContained.relativeRowInSiblings = value; }
// public static float relativeRowInSiblings() { return net.minecraft.advancement.AdvancementPositioner.relativeRowInSiblings; }
// public static void relativeRowInSiblings(float value, ) { net.minecraft.advancement.AdvancementPositioner.relativeRowInSiblings = value; }

// public float row() { return wrapperContained.row; }
// public void row(float value) { wrapperContained.row = value; }
// public static float row() { return net.minecraft.advancement.AdvancementPositioner.row; }
// public static void row(float value, ) { net.minecraft.advancement.AdvancementPositioner.row = value; }

// public yarnwrap.advancement.PlacedAdvancement advancement() { return new yarnwrap.advancement.PlacedAdvancement(wrapperContained.advancement); }
// public void advancement(yarnwrap.advancement.PlacedAdvancement value) { wrapperContained.advancement = value.wrapperContained; }
// public static yarnwrap.advancement.PlacedAdvancement advancement() { return new yarnwrap.advancement.PlacedAdvancement(net.minecraft.advancement.AdvancementPositioner.advancement); }
// public static void advancement(yarnwrap.advancement.PlacedAdvancement value, ) { net.minecraft.advancement.AdvancementPositioner.advancement = value.wrapperContained; }

public AdvancementPositioner(yarnwrap.advancement.PlacedAdvancement advancement,yarnwrap.advancement.AdvancementPositioner parent,yarnwrap.advancement.AdvancementPositioner previousSibling,int childrenSize,int depth) { this.wrapperContained = new net.minecraft.advancement.AdvancementPositioner(advancement.wrapperContained,parent.wrapperContained,previousSibling.wrapperContained,childrenSize,depth); }
// public yarnwrap.advancement.AdvancementPositioner onFinishCalculation(yarnwrap.advancement.AdvancementPositioner last) { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.onFinishCalculation(last.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementPositioner onFinishCalculation(yarnwrap.advancement.AdvancementPositioner last, ) { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.onFinishCalculation(last.wrapperContained)); }
// public float findMinRowRecursively(float deltaRow,int depth,float minRow) { return wrapperContained.findMinRowRecursively(deltaRow,depth,minRow); }
// public static float findMinRowRecursively(float deltaRow,int depth,float minRow, ) { return net.minecraft.advancement.AdvancementPositioner.findMinRowRecursively(deltaRow,depth,minRow); }
// public void increaseRowRecursively(float deltaRow) { wrapperContained.increaseRowRecursively(deltaRow); }
// public static void increaseRowRecursively(float deltaRow, ) { net.minecraft.advancement.AdvancementPositioner.increaseRowRecursively(deltaRow); }
// public yarnwrap.advancement.AdvancementPositioner getLastChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getLastChild()); }
// public static yarnwrap.advancement.AdvancementPositioner getLastChild() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.getLastChild()); }
// public yarnwrap.advancement.AdvancementPositioner getLast() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getLast()); }
// public static yarnwrap.advancement.AdvancementPositioner getLast() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.getLast()); }
// public yarnwrap.advancement.AdvancementPositioner findChildrenRecursively(yarnwrap.advancement.PlacedAdvancement advancement,yarnwrap.advancement.AdvancementPositioner lastChild) { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.findChildrenRecursively(advancement.wrapperContained,lastChild.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementPositioner findChildrenRecursively(yarnwrap.advancement.PlacedAdvancement advancement,yarnwrap.advancement.AdvancementPositioner lastChild, ) { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.findChildrenRecursively(advancement.wrapperContained,lastChild.wrapperContained)); }
// public void calculateRecursively() { wrapperContained.calculateRecursively(); }
// public static void calculateRecursively() { net.minecraft.advancement.AdvancementPositioner.calculateRecursively(); }
// public void pushDown(yarnwrap.advancement.AdvancementPositioner positioner,float extraRowDistance) { wrapperContained.pushDown(positioner.wrapperContained,extraRowDistance); }
// public static void pushDown(yarnwrap.advancement.AdvancementPositioner positioner,float extraRowDistance, ) { net.minecraft.advancement.AdvancementPositioner.pushDown(positioner.wrapperContained,extraRowDistance); }
// public yarnwrap.advancement.AdvancementPositioner getFirstChild() { return new yarnwrap.advancement.AdvancementPositioner(wrapperContained.getFirstChild()); }
// public static yarnwrap.advancement.AdvancementPositioner getFirstChild() { return new yarnwrap.advancement.AdvancementPositioner(net.minecraft.advancement.AdvancementPositioner.getFirstChild()); }
// public void onFinishChildrenCalculation() { wrapperContained.onFinishChildrenCalculation(); }
// public static void onFinishChildrenCalculation() { net.minecraft.advancement.AdvancementPositioner.onFinishChildrenCalculation(); }
// public void apply() { wrapperContained.apply(); }
// public static void apply() { net.minecraft.advancement.AdvancementPositioner.apply(); }
// public void arrangeForTree(yarnwrap.advancement.PlacedAdvancement root) { wrapperContained.arrangeForTree(root.wrapperContained); }
// public static void arrangeForTree(yarnwrap.advancement.PlacedAdvancement root, ) { net.minecraft.advancement.AdvancementPositioner.arrangeForTree(root.wrapperContained); }
// public void method_53710(yarnwrap.advancement.AdvancementDisplay display) { wrapperContained.method_53710(display.wrapperContained); }
// public static void method_53710(yarnwrap.advancement.AdvancementDisplay display, ) { net.minecraft.advancement.AdvancementPositioner.method_53710(display.wrapperContained); }

}