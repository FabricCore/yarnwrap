package yarnwrap.client.gui.tooltip;
public class OrderedTextTooltipComponent { public net.minecraft.client.gui.tooltip.OrderedTextTooltipComponent wrapperContained; public OrderedTextTooltipComponent(net.minecraft.client.gui.tooltip.OrderedTextTooltipComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.OrderedText text() { return new yarnwrap.text.OrderedText(wrapperContained.text); }
// public void text(yarnwrap.text.OrderedText value) { wrapperContained.text = value.wrapperContained; }
public OrderedTextTooltipComponent(yarnwrap.text.OrderedText text) { this.wrapperContained = new net.minecraft.client.gui.tooltip.OrderedTextTooltipComponent(text.wrapperContained); }

}