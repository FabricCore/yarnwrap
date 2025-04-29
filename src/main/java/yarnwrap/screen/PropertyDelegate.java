package yarnwrap.screen;
public class PropertyDelegate { public net.minecraft.screen.PropertyDelegate wrapperContained; public PropertyDelegate(net.minecraft.screen.PropertyDelegate wrapperContained) { this.wrapperContained = wrapperContained; }

public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.screen.PropertyDelegate.size(); }
public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.screen.PropertyDelegate.get(index); }
public void set(int index,int value) { wrapperContained.set(index,value); }
// public static void set(int index,int value, ) { net.minecraft.screen.PropertyDelegate.set(index,value); }

}