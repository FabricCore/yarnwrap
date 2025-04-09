package yarnwrap.client.realms;
public class SizeUnit { public net.minecraft.client.realms.SizeUnit wrapperContained; public SizeUnit(net.minecraft.client.realms.SizeUnit wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BASE() { return wrapperContained.BASE; }
public yarnwrap.client.realms.SizeUnit getLargestUnit(long bytes) { return new yarnwrap.client.realms.SizeUnit(wrapperContained.getLargestUnit(bytes)); }
public double convertToUnit(long bytes,yarnwrap.client.realms.SizeUnit unit) { return wrapperContained.convertToUnit(bytes,unit.wrapperContained); }
public java.lang.String getUserFriendlyString(long bytes) { return wrapperContained.getUserFriendlyString(bytes); }
public java.lang.String humanReadableSize(long bytes,yarnwrap.client.realms.SizeUnit unit) { return wrapperContained.humanReadableSize(bytes,unit.wrapperContained); }

}