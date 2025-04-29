package yarnwrap.client.gui.screen;
public class FatalErrorScreen { public net.minecraft.client.gui.screen.FatalErrorScreen wrapperContained; public FatalErrorScreen(net.minecraft.client.gui.screen.FatalErrorScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.FatalErrorScreen.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.FatalErrorScreen.message = value.wrapperContained; }

public FatalErrorScreen(yarnwrap.text.Text title,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.screen.FatalErrorScreen(title.wrapperContained,message.wrapperContained); }
// public void method_19818(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19818(button.wrapperContained); }
// public static void method_19818(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.FatalErrorScreen.method_19818(button.wrapperContained); }

}