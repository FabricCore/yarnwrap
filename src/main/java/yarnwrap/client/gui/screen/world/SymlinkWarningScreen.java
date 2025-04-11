package yarnwrap.client.gui.screen.world;
public class SymlinkWarningScreen { public net.minecraft.client.gui.screen.world.SymlinkWarningScreen wrapperContained; public SymlinkWarningScreen(net.minecraft.client.gui.screen.world.SymlinkWarningScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text WORLD_TITLE() { return new yarnwrap.text.Text(wrapperContained.WORLD_TITLE); }
// public void WORLD_TITLE(yarnwrap.text.Text value) { wrapperContained.WORLD_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text WORLD_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.WORLD_MESSAGE); }
// public void WORLD_MESSAGE(yarnwrap.text.Text value) { wrapperContained.WORLD_MESSAGE = value.wrapperContained; }
// public yarnwrap.text.Text PACK_TITLE() { return new yarnwrap.text.Text(wrapperContained.PACK_TITLE); }
// public void PACK_TITLE(yarnwrap.text.Text value) { wrapperContained.PACK_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text PACK_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.PACK_MESSAGE); }
// public void PACK_MESSAGE(yarnwrap.text.Text value) { wrapperContained.PACK_MESSAGE = value.wrapperContained; }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public java.net.URI link() { return wrapperContained.link; }
// public void link(java.net.URI value) { wrapperContained.link = value; }
// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.GridWidget value) { wrapperContained.grid = value.wrapperContained; }
// public java.lang.Runnable onClose() { return wrapperContained.onClose; }
// public void onClose(java.lang.Runnable value) { wrapperContained.onClose = value; }
public SymlinkWarningScreen(yarnwrap.text.Text title,yarnwrap.text.Text message,java.net.URI link,java.lang.Runnable onClose) { this.wrapperContained = new net.minecraft.client.gui.screen.world.SymlinkWarningScreen(title.wrapperContained,message.wrapperContained,link,onClose); }
// public void method_52747(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52747(button.wrapperContained); }
public yarnwrap.client.gui.screen.Screen world(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.world(onClose)); }
// public void method_52749(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52749(button.wrapperContained); }
public yarnwrap.client.gui.screen.Screen pack(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.pack(onClose)); }
// public void method_52751(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52751(button.wrapperContained); }

}