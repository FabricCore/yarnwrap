package yarnwrap.util;
public class ClickType { public net.minecraft.util.ClickType wrapperContained; public ClickType(net.minecraft.util.ClickType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ClickType LEFT() { return new yarnwrap.util.ClickType(wrapperContained.LEFT); }
// public void LEFT(yarnwrap.util.ClickType value) { wrapperContained.LEFT = value.wrapperContained; }
public static yarnwrap.util.ClickType LEFT() { return new yarnwrap.util.ClickType(net.minecraft.util.ClickType.LEFT); }
// public static void LEFT(yarnwrap.util.ClickType value, ) { net.minecraft.util.ClickType.LEFT = value.wrapperContained; }

// public yarnwrap.util.ClickType RIGHT() { return new yarnwrap.util.ClickType(wrapperContained.RIGHT); }
// public void RIGHT(yarnwrap.util.ClickType value) { wrapperContained.RIGHT = value.wrapperContained; }
public static yarnwrap.util.ClickType RIGHT() { return new yarnwrap.util.ClickType(net.minecraft.util.ClickType.RIGHT); }
// public static void RIGHT(yarnwrap.util.ClickType value, ) { net.minecraft.util.ClickType.RIGHT = value.wrapperContained; }


}