package yarnwrap.screen;
public class PropertyDelegate { public net.minecraft.screen.PropertyDelegate wrapperContained; public PropertyDelegate(net.minecraft.screen.PropertyDelegate wrapperContained) { this.wrapperContained = wrapperContained; }

public int size() { return wrapperContained.size(); }
public int get(int index) { return wrapperContained.get(index); }
public void set(int index,int value) { wrapperContained.set(index,value); }

}