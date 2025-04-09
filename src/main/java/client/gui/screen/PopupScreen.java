package yarnwrap.client.gui.screen;
public class PopupScreen { public net.minecraft.client.gui.screen.PopupScreen wrapperContained; public PopupScreen(net.minecraft.client.gui.screen.PopupScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BACKGROUND_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BACKGROUND_TEXTURE); }
// public int VERTICAL_SPACING() { return wrapperContained.VERTICAL_SPACING; }
// public int MARGIN_WIDTH() { return wrapperContained.MARGIN_WIDTH; }
// public int BUTTON_HORIZONTAL_SPACING() { return wrapperContained.BUTTON_HORIZONTAL_SPACING; }
// public int IMAGE_WIDTH() { return wrapperContained.IMAGE_WIDTH; }
// public int IMAGE_HEIGHT() { return wrapperContained.IMAGE_HEIGHT; }
// public int DEFAULT_WIDTH() { return wrapperContained.DEFAULT_WIDTH; }
// public yarnwrap.client.gui.screen.Screen backgroundScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.backgroundScreen); }
// public yarnwrap.util.Identifier image() { return new yarnwrap.util.Identifier(wrapperContained.image); }
// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public java.lang.Runnable onClosed() { return wrapperContained.onClosed; }
// public int innerWidth() { return wrapperContained.innerWidth; }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget createButtonLayout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.createButtonLayout()); }

}