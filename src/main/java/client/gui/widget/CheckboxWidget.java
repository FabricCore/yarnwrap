package yarnwrap.client.gui.widget;
public class CheckboxWidget { public net.minecraft.client.gui.widget.CheckboxWidget wrapperContained; public CheckboxWidget(net.minecraft.client.gui.widget.CheckboxWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean checked() { return wrapperContained.checked; }
// public int TEXT_COLOR() { return wrapperContained.TEXT_COLOR; }
// public yarnwrap.util.Identifier SELECTED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SELECTED_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier SELECTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SELECTED_TEXTURE); }
// public yarnwrap.util.Identifier HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public Object callback() { return wrapperContained.callback; }
// public yarnwrap.client.gui.widget.MultilineTextWidget textWidget() { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.textWidget); }
public boolean isChecked() { return wrapperContained.isChecked(); }
public int getCheckboxSize(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.getCheckboxSize(textRenderer.wrapperContained); }
public Object builder(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.builder(text.wrapperContained,textRenderer.wrapperContained); }
// public int calculateWidth(int max,yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateWidth(max,text.wrapperContained,textRenderer.wrapperContained); }
// public int calculateHeight(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateHeight(textRenderer.wrapperContained); }
// public int calculateWidth(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateWidth(text.wrapperContained,textRenderer.wrapperContained); }

}