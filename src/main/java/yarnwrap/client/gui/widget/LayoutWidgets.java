package yarnwrap.client.gui.widget;
public class LayoutWidgets { public net.minecraft.client.gui.widget.LayoutWidgets wrapperContained; public LayoutWidgets(net.minecraft.client.gui.widget.LayoutWidgets wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SPACING() { return wrapperContained.SPACING; }
// public void SPACING(int value) { wrapperContained.SPACING = value; }
public yarnwrap.client.gui.widget.LayoutWidget createLabeledWidget(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.client.gui.widget.Widget widget,yarnwrap.text.Text label) { return new yarnwrap.client.gui.widget.LayoutWidget(wrapperContained.createLabeledWidget(textRenderer.wrapperContained,widget.wrapperContained,label.wrapperContained)); }
public yarnwrap.client.gui.widget.LayoutWidget createLabeledWidget(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.client.gui.widget.Widget widget,yarnwrap.text.Text label,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.LayoutWidget(wrapperContained.createLabeledWidget(textRenderer.wrapperContained,widget.wrapperContained,label.wrapperContained,callback)); }
// public void method_53551(yarnwrap.client.gui.widget.Positioner positioner) { wrapperContained.method_53551(positioner.wrapperContained); }

}