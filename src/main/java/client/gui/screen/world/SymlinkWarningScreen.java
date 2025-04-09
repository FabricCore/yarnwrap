package yarnwrap.client.gui.screen.world;
public class SymlinkWarningScreen { public net.minecraft.client.gui.screen.world.SymlinkWarningScreen wrapperContained; public SymlinkWarningScreen(net.minecraft.client.gui.screen.world.SymlinkWarningScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text WORLD_TITLE() { return new yarnwrap.text.Text(wrapperContained.WORLD_TITLE); }
// public yarnwrap.text.Text WORLD_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.WORLD_MESSAGE); }
// public yarnwrap.text.Text PACK_TITLE() { return new yarnwrap.text.Text(wrapperContained.PACK_TITLE); }
// public yarnwrap.text.Text PACK_MESSAGE() { return new yarnwrap.text.Text(wrapperContained.PACK_MESSAGE); }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public java.net.URI link() { return wrapperContained.link; }
// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public java.lang.Runnable onClose() { return wrapperContained.onClose; }
public yarnwrap.client.gui.screen.Screen world(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.world(onClose)); }
public yarnwrap.client.gui.screen.Screen pack(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.Screen(wrapperContained.pack(onClose)); }

}