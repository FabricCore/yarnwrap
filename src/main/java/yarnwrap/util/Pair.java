package yarnwrap.util;
public class Pair { public net.minecraft.util.Pair wrapperContained; public Pair(net.minecraft.util.Pair wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object left() { return wrapperContained.left; }
// public void left(java.lang.Object value) { wrapperContained.left = value; }
// public java.lang.Object right() { return wrapperContained.right; }
// public void right(java.lang.Object value) { wrapperContained.right = value; }
public java.lang.Object getRight() { return wrapperContained.getRight(); }
public java.lang.Object getLeft() { return wrapperContained.getLeft(); }
public void setLeft(java.lang.Object left) { wrapperContained.setLeft(left); }
public void setRight(java.lang.Object right) { wrapperContained.setRight(right); }

}