package yarnwrap.client.gui.screen;
public class WarningScreen { public net.minecraft.client.gui.screen.WarningScreen wrapperContained; public WarningScreen(net.minecraft.client.gui.screen.WarningScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.CheckboxWidget checkbox() { return new yarnwrap.client.gui.widget.CheckboxWidget(wrapperContained.checkbox); }
// public yarnwrap.text.Text checkMessage() { return new yarnwrap.text.Text(wrapperContained.checkMessage); }
// public yarnwrap.text.Text narratedText() { return new yarnwrap.text.Text(wrapperContained.narratedText); }
// public yarnwrap.text.Text messageText() { return new yarnwrap.text.Text(wrapperContained.messageText); }
// public yarnwrap.client.gui.widget.NarratedMultilineTextWidget textWidget() { return new yarnwrap.client.gui.widget.NarratedMultilineTextWidget(wrapperContained.textWidget); }
// public yarnwrap.client.gui.widget.SimplePositioningWidget positioningWidget() { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.positioningWidget); }
// public yarnwrap.client.gui.widget.LayoutWidget getLayout() { return new yarnwrap.client.gui.widget.LayoutWidget(wrapperContained.getLayout()); }

}