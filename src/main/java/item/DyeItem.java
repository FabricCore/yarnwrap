package yarnwrap.item;
public class DyeItem { public net.minecraft.item.DyeItem wrapperContained; public DyeItem(net.minecraft.item.DyeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map DYES() { return wrapperContained.DYES; }
// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public yarnwrap.item.DyeItem byColor(yarnwrap.util.DyeColor color) { return new yarnwrap.item.DyeItem(wrapperContained.byColor(color.wrapperContained)); }

}