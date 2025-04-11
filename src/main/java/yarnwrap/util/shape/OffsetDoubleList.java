package yarnwrap.util.shape;
public class OffsetDoubleList { public net.minecraft.util.shape.OffsetDoubleList wrapperContained; public OffsetDoubleList(net.minecraft.util.shape.OffsetDoubleList wrapperContained) { this.wrapperContained = wrapperContained; }

// public double offset() { return wrapperContained.offset; }
// public void offset(double value) { wrapperContained.offset = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList oldList() { return wrapperContained.oldList; }
// public void oldList(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.oldList = value; }
public OffsetDoubleList(it.unimi.dsi.fastutil.doubles.DoubleList oldList,double offset) { this.wrapperContained = new net.minecraft.util.shape.OffsetDoubleList(oldList,offset); }
public double getDouble(int position) { return wrapperContained.getDouble(position); }

}