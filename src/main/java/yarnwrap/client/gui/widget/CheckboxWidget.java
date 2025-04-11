package yarnwrap.client.gui.widget;
public class CheckboxWidget { public net.minecraft.client.gui.widget.CheckboxWidget wrapperContained; public CheckboxWidget(net.minecraft.client.gui.widget.CheckboxWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean checked() { return wrapperContained.checked; }
// public void checked(boolean value) { wrapperContained.checked = value; }
// public int TEXT_COLOR() { return wrapperContained.TEXT_COLOR; }
// public void TEXT_COLOR(int value) { wrapperContained.TEXT_COLOR = value; }
// public yarnwrap.util.Identifier SELECTED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SELECTED_HIGHLIGHTED_TEXTURE); }
// public void SELECTED_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SELECTED_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SELECTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SELECTED_TEXTURE); }
// public void SELECTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SELECTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HIGHLIGHTED_TEXTURE); }
// public void HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public Object callback() { return wrapperContained.callback; }
// // public void callback(Object value) { wrapperContained.callback = value; }
// public yarnwrap.client.gui.widget.MultilineTextWidget textWidget() { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.textWidget); }
// public void textWidget(yarnwrap.client.gui.widget.MultilineTextWidget value) { wrapperContained.textWidget = value.wrapperContained; }
public boolean isChecked() { return wrapperContained.isChecked(); }
public int getCheckboxSize(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.getCheckboxSize(textRenderer.wrapperContained); }
public Object builder(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.builder(text.wrapperContained,textRenderer.wrapperContained); }
// public int calculateWidth(int max,yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateWidth(max,text.wrapperContained,textRenderer.wrapperContained); }
// public int calculateHeight(yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateHeight(textRenderer.wrapperContained); }
// public int calculateWidth(yarnwrap.text.Text text,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.calculateWidth(text.wrapperContained,textRenderer.wrapperContained); }

}