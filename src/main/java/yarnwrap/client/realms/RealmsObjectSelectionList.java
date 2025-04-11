package yarnwrap.client.realms;
public class RealmsObjectSelectionList { public net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained; public RealmsObjectSelectionList(net.minecraft.client.realms.RealmsObjectSelectionList wrapperContained) { this.wrapperContained = wrapperContained; }

public void setSelected(int index) { wrapperContained.setSelected(index); }
public void setSelectedItem(int index) { wrapperContained.setSelectedItem(index); }
public void clear() { wrapperContained.clear(); }

}