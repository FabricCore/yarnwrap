package yarnwrap.item;
public class OminousBottleItem { public net.minecraft.item.OminousBottleItem wrapperContained; public OminousBottleItem(net.minecraft.item.OminousBottleItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BAD_OMEN_LENGTH() { return wrapperContained.BAD_OMEN_LENGTH; }
// public void BAD_OMEN_LENGTH(int value) { wrapperContained.BAD_OMEN_LENGTH = value; }
public static int BAD_OMEN_LENGTH() { return net.minecraft.item.OminousBottleItem.BAD_OMEN_LENGTH; }
// public static void BAD_OMEN_LENGTH(int value, ) { net.minecraft.item.OminousBottleItem.BAD_OMEN_LENGTH = value; }

// public int MAX_USE_TIME() { return wrapperContained.MAX_USE_TIME; }
// public void MAX_USE_TIME(int value) { wrapperContained.MAX_USE_TIME = value; }
// public static int MAX_USE_TIME() { return net.minecraft.item.OminousBottleItem.MAX_USE_TIME; }
// public static void MAX_USE_TIME(int value, ) { net.minecraft.item.OminousBottleItem.MAX_USE_TIME = value; }


}