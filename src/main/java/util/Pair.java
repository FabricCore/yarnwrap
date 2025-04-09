package yarnwrap.util;
public class Pair { public net.minecraft.util.Pair wrapperContained; public Pair(net.minecraft.util.Pair wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object left() { return wrapperContained.left; }
// public java.lang.Object right() { return wrapperContained.right; }
public java.lang.Object getRight() { return wrapperContained.getRight(); }
public java.lang.Object getLeft() { return wrapperContained.getLeft(); }
public void setLeft(java.lang.Object left) { wrapperContained.setLeft(left); }
public void setRight(java.lang.Object right) { wrapperContained.setRight(right); }

}