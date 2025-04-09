package yarnwrap.client.gui.screen;
public class OutOfMemoryScreen { public net.minecraft.client.gui.screen.OutOfMemoryScreen wrapperContained; public OutOfMemoryScreen(net.minecraft.client.gui.screen.OutOfMemoryScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public yarnwrap.text.Text MESSAGE() { return new yarnwrap.text.Text(wrapperContained.MESSAGE); }
// public int MAX_TEXT_WIDTH() { return wrapperContained.MAX_TEXT_WIDTH; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }

}