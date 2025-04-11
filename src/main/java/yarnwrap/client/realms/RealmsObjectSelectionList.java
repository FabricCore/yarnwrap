package yarnwrap.client.realms;
public class RealmsObjectSelectionList { public net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained; public RealmsObjectSelectionList(net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained) { this.wrapperContained = wrapperContained; }

// public RealmsObjectSelectionList(int width,int height,int top,int bottom) { this.wrapperContained = new net.minecraft.client.realms.RealmsObjectSelectionList(width,height,top,bottom); }
public void setSelected(int index) { wrapperContained.setSelected(index); }
public void setSelectedItem(int index) { wrapperContained.setSelectedItem(index); }
public void clear() { wrapperContained.clear(); }

}