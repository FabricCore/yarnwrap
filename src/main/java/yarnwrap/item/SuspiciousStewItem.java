package yarnwrap.item;
public class SuspiciousStewItem { public net.minecraft.item.SuspiciousStewItem wrapperContained; public SuspiciousStewItem(net.minecraft.item.SuspiciousStewItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_DURATION() { return wrapperContained.DEFAULT_DURATION; }
// public void DEFAULT_DURATION(int value) { wrapperContained.DEFAULT_DURATION = value; }
public static int DEFAULT_DURATION() { return net.minecraft.item.SuspiciousStewItem.DEFAULT_DURATION; }
// public static void DEFAULT_DURATION(int value, ) { net.minecraft.item.SuspiciousStewItem.DEFAULT_DURATION = value; }


}