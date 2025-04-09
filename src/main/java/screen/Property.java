package yarnwrap.screen;
public class Property { public net.minecraft.screen.Property wrapperContained; public Property(net.minecraft.screen.Property wrapperContained) { this.wrapperContained = wrapperContained; }

// public int oldValue() { return wrapperContained.oldValue; }
public yarnwrap.screen.Property create() { return new yarnwrap.screen.Property(wrapperContained.create()); }
public void set(int value) { wrapperContained.set(value); }
public yarnwrap.screen.Property create(yarnwrap.screen.PropertyDelegate delegate,int index) { return new yarnwrap.screen.Property(wrapperContained.create(delegate.wrapperContained,index)); }
// public yarnwrap.screen.Property create(int array,int index) { return new yarnwrap.screen.Property(wrapperContained.create(array,index)); }
public int get() { return wrapperContained.get(); }
public boolean hasChanged() { return wrapperContained.hasChanged(); }

}