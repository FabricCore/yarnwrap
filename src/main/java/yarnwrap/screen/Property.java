package yarnwrap.screen;
public class Property { public net.minecraft.screen.Property wrapperContained; public Property(net.minecraft.screen.Property wrapperContained) { this.wrapperContained = wrapperContained; }

// public int oldValue() { return wrapperContained.oldValue; }
// public void oldValue(int value) { wrapperContained.oldValue = value; }
// public static int oldValue() { return net.minecraft.screen.Property.oldValue; }
// public static void oldValue(int value, ) { net.minecraft.screen.Property.oldValue = value; }

// public yarnwrap.screen.Property create() { return new yarnwrap.screen.Property(wrapperContained.create()); }
public static yarnwrap.screen.Property create() { return new yarnwrap.screen.Property(net.minecraft.screen.Property.create()); }
public void set(int value) { wrapperContained.set(value); }
// public static void set(int value, ) { net.minecraft.screen.Property.set(value); }
// public yarnwrap.screen.Property create(yarnwrap.screen.PropertyDelegate delegate,int index) { return new yarnwrap.screen.Property(wrapperContained.create(delegate.wrapperContained,index)); }
// public static yarnwrap.screen.Property create(yarnwrap.screen.PropertyDelegate delegate,int index, ) { return new yarnwrap.screen.Property(net.minecraft.screen.Property.create(delegate.wrapperContained,index)); }
// public yarnwrap.screen.Property create(int array,int index) { return new yarnwrap.screen.Property(wrapperContained.create(array,index)); }
// public static yarnwrap.screen.Property create(int array,int index, ) { return new yarnwrap.screen.Property(net.minecraft.screen.Property.create(array,index)); }
public int get() { return wrapperContained.get(); }
// public static int get() { return net.minecraft.screen.Property.get(); }
public boolean hasChanged() { return wrapperContained.hasChanged(); }
// public static boolean hasChanged() { return net.minecraft.screen.Property.hasChanged(); }

}