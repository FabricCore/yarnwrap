package yarnwrap.item;
public class DiscFragmentItem { public net.minecraft.item.DiscFragmentItem wrapperContained; public DiscFragmentItem(net.minecraft.item.DiscFragmentItem wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(wrapperContained.getDescription()); }
// public static yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(net.minecraft.item.DiscFragmentItem.getDescription()); }

}