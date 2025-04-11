package yarnwrap.item;
public class DyeItem { public net.minecraft.item.DyeItem wrapperContained; public DyeItem(net.minecraft.item.DyeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map DYES() { return wrapperContained.DYES; }
// public void DYES(java.util.Map value) { wrapperContained.DYES = value; }
// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public DyeItem(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.item.DyeItem(color.wrapperContained,settings); }
// public yarnwrap.block.entity.SignText method_49799(yarnwrap.block.entity.SignText text) { return new yarnwrap.block.entity.SignText(wrapperContained.method_49799(text.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public yarnwrap.item.DyeItem byColor(yarnwrap.util.DyeColor color) { return new yarnwrap.item.DyeItem(wrapperContained.byColor(color.wrapperContained)); }

}