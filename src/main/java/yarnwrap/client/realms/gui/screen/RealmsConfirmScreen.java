package yarnwrap.client.realms.gui.screen;
public class RealmsConfirmScreen { public net.minecraft.client.realms.gui.screen.RealmsConfirmScreen wrapperContained; public RealmsConfirmScreen(net.minecraft.client.realms.gui.screen.RealmsConfirmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text title1() { return new yarnwrap.text.Text(wrapperContained.title1); }
// public void title1(yarnwrap.text.Text value) { wrapperContained.title1 = value.wrapperContained; }
// public yarnwrap.text.Text title2() { return new yarnwrap.text.Text(wrapperContained.title2); }
// public void title2(yarnwrap.text.Text value) { wrapperContained.title2 = value.wrapperContained; }
// public it.unimi.dsi.fastutil.booleans.BooleanConsumer callback() { return wrapperContained.callback; }
// public void callback(it.unimi.dsi.fastutil.booleans.BooleanConsumer value) { wrapperContained.callback = value; }
public RealmsConfirmScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,yarnwrap.text.Text title1,yarnwrap.text.Text title2) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsConfirmScreen(callback,title1.wrapperContained,title2.wrapperContained); }
// public void method_25152(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25152(button.wrapperContained); }
// public void method_25153(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25153(button.wrapperContained); }

}