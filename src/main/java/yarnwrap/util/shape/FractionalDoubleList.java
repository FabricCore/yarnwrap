package yarnwrap.util.shape;
public class FractionalDoubleList { public net.minecraft.util.shape.FractionalDoubleList wrapperContained; public FractionalDoubleList(net.minecraft.util.shape.FractionalDoubleList wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sectionCount() { return wrapperContained.sectionCount; }
// public void sectionCount(int value) { wrapperContained.sectionCount = value; }
// public static int sectionCount() { return net.minecraft.util.shape.FractionalDoubleList.sectionCount; }
// public static void sectionCount(int value, ) { net.minecraft.util.shape.FractionalDoubleList.sectionCount = value; }

public FractionalDoubleList(int sectionCount) { this.wrapperContained = new net.minecraft.util.shape.FractionalDoubleList(sectionCount); }
public double getDouble(int position) { return wrapperContained.getDouble(position); }
// public static double getDouble(int position, ) { return net.minecraft.util.shape.FractionalDoubleList.getDouble(position); }

}