package yarnwrap.client.toast;
public class SystemToast { public net.minecraft.client.toast.SystemToast wrapperContained; public SystemToast(net.minecraft.client.toast.SystemToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public boolean justUpdated() { return wrapperContained.justUpdated; }
// public void justUpdated(boolean value) { wrapperContained.justUpdated = value; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public int MIN_WIDTH() { return wrapperContained.MIN_WIDTH; }
// public void MIN_WIDTH(int value) { wrapperContained.MIN_WIDTH = value; }
// public int LINE_HEIGHT() { return wrapperContained.LINE_HEIGHT; }
// public void LINE_HEIGHT(int value) { wrapperContained.LINE_HEIGHT = value; }
// public int PADDING_Y() { return wrapperContained.PADDING_Y; }
// public void PADDING_Y(int value) { wrapperContained.PADDING_Y = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public boolean hidden() { return wrapperContained.hidden; }
// public void hidden(boolean value) { wrapperContained.hidden = value; }
// public SystemToast(Object type,yarnwrap.text.Text title,java.util.List lines,int width) { this.wrapperContained = new net.minecraft.client.toast.SystemToast(type,title.wrapperContained,lines,width); }
// public SystemToast(Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { this.wrapperContained = new net.minecraft.client.toast.SystemToast(type,title.wrapperContained,description.wrapperContained); }
// public void show(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.show(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
public void setContent(yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.setContent(title.wrapperContained,description.wrapperContained); }
public void addWorldAccessFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName) { wrapperContained.addWorldAccessFailureToast(client.wrapperContained,worldName); }
// public void add(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.add(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
public void addWorldDeleteFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName) { wrapperContained.addWorldDeleteFailureToast(client.wrapperContained,worldName); }
// public void drawPart(yarnwrap.client.gui.DrawContext context) { wrapperContained.drawPart(context.wrapperContained); }
// public yarnwrap.client.toast.SystemToast create(yarnwrap.client.MinecraftClient client,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { return new yarnwrap.client.toast.SystemToast(wrapperContained.create(client.wrapperContained,type,title.wrapperContained,description.wrapperContained)); }
// public com.google.common.collect.ImmutableList getTextAsList(yarnwrap.text.Text text) { return wrapperContained.getTextAsList(text.wrapperContained); }
public void addPackCopyFailure(yarnwrap.client.MinecraftClient client,java.lang.String directory) { wrapperContained.addPackCopyFailure(client.wrapperContained,directory); }
// public void hide(yarnwrap.client.toast.ToastManager manager,Object type) { wrapperContained.hide(manager.wrapperContained,type); }
public void hide() { wrapperContained.hide(); }
public void addLowDiskSpace(yarnwrap.client.MinecraftClient client) { wrapperContained.addLowDiskSpace(client.wrapperContained); }
public void addChunkLoadFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addChunkLoadFailure(client.wrapperContained,pos.wrapperContained); }
public void addChunkSaveFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addChunkSaveFailure(client.wrapperContained,pos.wrapperContained); }
public void addFileDropFailure(yarnwrap.client.MinecraftClient client,int count) { wrapperContained.addFileDropFailure(client.wrapperContained,count); }

}