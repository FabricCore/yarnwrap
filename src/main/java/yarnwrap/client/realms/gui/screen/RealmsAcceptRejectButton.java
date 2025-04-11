package yarnwrap.client.realms.gui.screen;
public class RealmsAcceptRejectButton { public net.minecraft.client.realms.gui.screen.RealmsAcceptRejectButton wrapperContained; public RealmsAcceptRejectButton(net.minecraft.client.realms.gui.screen.RealmsAcceptRejectButton wrapperContained) { this.wrapperContained = wrapperContained; }

public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
public int getRight() { return wrapperContained.getRight(); }
public void handleClick(int index) { wrapperContained.handleClick(index); }
public void render(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY) { wrapperContained.render(context.wrapperContained,x,y,mouseX,mouseY); }
// public void render(yarnwrap.client.gui.DrawContext context,int x,int y,boolean showTooltip) { wrapperContained.render(context.wrapperContained,x,y,showTooltip); }
public void render(yarnwrap.client.gui.DrawContext context,java.util.List buttons,yarnwrap.client.realms.RealmsObjectSelectionList selectionList,int x,int y,int mouseX,int mouseY) { wrapperContained.render(context.wrapperContained,buttons,selectionList.wrapperContained,x,y,mouseX,mouseY); }
// public void handleClick(yarnwrap.client.realms.RealmsObjectSelectionList selectionList,Object entry,java.util.List buttons,int button,double mouseX,double mouseY) { wrapperContained.handleClick(selectionList.wrapperContained,entry,buttons,button,mouseX,mouseY); }
public int getBottom() { return wrapperContained.getBottom(); }

}