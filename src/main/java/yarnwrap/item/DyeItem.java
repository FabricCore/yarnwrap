package yarnwrap.item;
public class DyeItem { public net.minecraft.item.DyeItem wrapperContained; public DyeItem(net.minecraft.item.DyeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map DYES() { return wrapperContained.DYES; }
// public void DYES(java.util.Map value) { wrapperContained.DYES = value; }
// public static java.util.Map DYES() { return net.minecraft.item.DyeItem.DYES; }
// public static void DYES(java.util.Map value, ) { net.minecraft.item.DyeItem.DYES = value; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.item.DyeItem.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.item.DyeItem.color = value.wrapperContained; }

// public DyeItem(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.item.DyeItem(color.wrapperContained,settings); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.item.DyeItem.getColor()); }
// public yarnwrap.item.DyeItem byColor(yarnwrap.util.DyeColor color) { return new yarnwrap.item.DyeItem(wrapperContained.byColor(color.wrapperContained)); }
// public static yarnwrap.item.DyeItem byColor(yarnwrap.util.DyeColor color, ) { return new yarnwrap.item.DyeItem(net.minecraft.item.DyeItem.byColor(color.wrapperContained)); }
// public yarnwrap.block.entity.SignText method_49799(yarnwrap.block.entity.SignText text) { return new yarnwrap.block.entity.SignText(wrapperContained.method_49799(text.wrapperContained)); }
// public static yarnwrap.block.entity.SignText method_49799(yarnwrap.block.entity.SignText text, ) { return new yarnwrap.block.entity.SignText(net.minecraft.item.DyeItem.method_49799(text.wrapperContained)); }

}