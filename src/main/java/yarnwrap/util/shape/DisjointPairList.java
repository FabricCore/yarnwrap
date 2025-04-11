package yarnwrap.util.shape;
public class DisjointPairList { public net.minecraft.util.shape.DisjointPairList wrapperContained; public DisjointPairList(net.minecraft.util.shape.DisjointPairList wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.doubles.DoubleList second() { return wrapperContained.second; }
// public void second(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.second = value; }
// public boolean inverted() { return wrapperContained.inverted; }
// public void inverted(boolean value) { wrapperContained.inverted = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList first() { return wrapperContained.first; }
// public void first(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.first = value; }
// public DisjointPairList(it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean inverted) { this.wrapperContained = new net.minecraft.util.shape.DisjointPairList(first,second,inverted); }
public double getDouble(int position) { return wrapperContained.getDouble(position); }
// public boolean iterateSections(Object predicate) { return wrapperContained.iterateSections(predicate); }
// public boolean method_1068(Object x,int y,int index) { return wrapperContained.method_1068(x,y,index); }

}