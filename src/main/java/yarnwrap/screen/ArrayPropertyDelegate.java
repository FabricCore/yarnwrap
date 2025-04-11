package yarnwrap.screen;
public class ArrayPropertyDelegate { public net.minecraft.screen.ArrayPropertyDelegate wrapperContained; public ArrayPropertyDelegate(net.minecraft.screen.ArrayPropertyDelegate wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] data() { return wrapperContained.data; }
// public void data(int[] value) { wrapperContained.data = value; }
public ArrayPropertyDelegate(int size) { this.wrapperContained = new net.minecraft.screen.ArrayPropertyDelegate(size); }

}