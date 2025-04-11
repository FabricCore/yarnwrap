package yarnwrap.client.realms.util;
public class RealmsUtil { public net.minecraft.client.realms.util.RealmsUtil wrapperContained; public RealmsUtil(net.minecraft.client.realms.util.RealmsUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SECONDS_PER_MINUTE() { return wrapperContained.SECONDS_PER_MINUTE; }
// public void SECONDS_PER_MINUTE(int value) { wrapperContained.SECONDS_PER_MINUTE = value; }
// public int SECONDS_PER_HOUR() { return wrapperContained.SECONDS_PER_HOUR; }
// public void SECONDS_PER_HOUR(int value) { wrapperContained.SECONDS_PER_HOUR = value; }
// public int SECONDS_PER_DAY() { return wrapperContained.SECONDS_PER_DAY; }
// public void SECONDS_PER_DAY(int value) { wrapperContained.SECONDS_PER_DAY = value; }
// public yarnwrap.text.Text NOW_TEXT() { return new yarnwrap.text.Text(wrapperContained.NOW_TEXT); }
// public void NOW_TEXT(yarnwrap.text.Text value) { wrapperContained.NOW_TEXT = value.wrapperContained; }
public yarnwrap.text.Text convertToAgePresentation(long milliseconds) { return new yarnwrap.text.Text(wrapperContained.convertToAgePresentation(milliseconds)); }
public yarnwrap.text.Text convertToAgePresentation(java.util.Date date) { return new yarnwrap.text.Text(wrapperContained.convertToAgePresentation(date)); }
public void drawPlayerHead(yarnwrap.client.gui.DrawContext context,int x,int y,int size,java.util.UUID playerUuid) { wrapperContained.drawPlayerHead(context.wrapperContained,x,y,size,playerUuid); }

}