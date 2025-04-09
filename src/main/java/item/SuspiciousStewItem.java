package yarnwrap.item;
public class SuspiciousStewItem { public net.minecraft.item.SuspiciousStewItem wrapperContained; public SuspiciousStewItem(net.minecraft.item.SuspiciousStewItem wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEFAULT_DURATION() { return wrapperContained.DEFAULT_DURATION; }

}