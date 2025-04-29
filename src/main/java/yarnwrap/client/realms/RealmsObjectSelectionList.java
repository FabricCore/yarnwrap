package yarnwrap.client.realms;
public class RealmsObjectSelectionList { public net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained; public RealmsObjectSelectionList(net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained) { this.wrapperContained = wrapperContained; }

// public RealmsObjectSelectionList(int width,int height,int top,int bottom) { this.wrapperContained = new net.minecraft.client.realms.RealmsObjectSelectionList(width,height,top,bottom); }
public void setSelected(int index) { wrapperContained.setSelected(index); }
// public static void setSelected(int index, ) { net.minecraft.client.realms.RealmsObjectSelectionList.setSelected(index); }
public void setSelectedItem(int index) { wrapperContained.setSelectedItem(index); }
// public static void setSelectedItem(int index, ) { net.minecraft.client.realms.RealmsObjectSelectionList.setSelectedItem(index); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.realms.RealmsObjectSelectionList.clear(); }

}