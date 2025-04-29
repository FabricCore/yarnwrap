package yarnwrap.item;
public class BowItem { public net.minecraft.item.BowItem wrapperContained; public BowItem(net.minecraft.item.BowItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
// public void TICKS_PER_SECOND(int value) { wrapperContained.TICKS_PER_SECOND = value; }
public static int TICKS_PER_SECOND() { return net.minecraft.item.BowItem.TICKS_PER_SECOND; }
// public static void TICKS_PER_SECOND(int value, ) { net.minecraft.item.BowItem.TICKS_PER_SECOND = value; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
public static int RANGE() { return net.minecraft.item.BowItem.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.item.BowItem.RANGE = value; }

// public float getPullProgress(int useTicks) { return wrapperContained.getPullProgress(useTicks); }
// public static float getPullProgress(int useTicks, ) { return net.minecraft.item.BowItem.getPullProgress(useTicks); }

}