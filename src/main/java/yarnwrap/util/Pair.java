package yarnwrap.util;
public class Pair { public net.minecraft.util.Pair wrapperContained; public Pair(net.minecraft.util.Pair wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object left() { return wrapperContained.left; }
// public void left(java.lang.Object value) { wrapperContained.left = value; }
// // public static java.lang.Object left() { return net.minecraft.util.Pair.left; }
// public static void left(java.lang.Object value, ) { net.minecraft.util.Pair.left = value; }

// public java.lang.Object right() { return wrapperContained.right; }
// public void right(java.lang.Object value) { wrapperContained.right = value; }
// // public static java.lang.Object right() { return net.minecraft.util.Pair.right; }
// public static void right(java.lang.Object value, ) { net.minecraft.util.Pair.right = value; }

public Pair(java.lang.Object left,java.lang.Object right) { this.wrapperContained = new net.minecraft.util.Pair(left,right); }
public java.lang.Object getRight() { return wrapperContained.getRight(); }
// public static java.lang.Object getRight() { return net.minecraft.util.Pair.getRight(); }
public java.lang.Object getLeft() { return wrapperContained.getLeft(); }
// public static java.lang.Object getLeft() { return net.minecraft.util.Pair.getLeft(); }
public void setLeft(java.lang.Object left) { wrapperContained.setLeft(left); }
// public static void setLeft(java.lang.Object left, ) { net.minecraft.util.Pair.setLeft(left); }
public void setRight(java.lang.Object right) { wrapperContained.setRight(right); }
// public static void setRight(java.lang.Object right, ) { net.minecraft.util.Pair.setRight(right); }

}