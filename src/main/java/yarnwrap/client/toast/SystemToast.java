package yarnwrap.client.toast;
public class SystemToast { public net.minecraft.client.toast.SystemToast wrapperContained; public SystemToast(net.minecraft.client.toast.SystemToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.toast.SystemToast.type; }
// // public static void type(Object value, ) { net.minecraft.client.toast.SystemToast.type = value; }

// public boolean justUpdated() { return wrapperContained.justUpdated; }
// public void justUpdated(boolean value) { wrapperContained.justUpdated = value; }
// public static boolean justUpdated() { return net.minecraft.client.toast.SystemToast.justUpdated; }
// public static void justUpdated(boolean value, ) { net.minecraft.client.toast.SystemToast.justUpdated = value; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.client.toast.SystemToast.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.client.toast.SystemToast.title = value.wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.client.toast.SystemToast.startTime; }
// public static void startTime(long value, ) { net.minecraft.client.toast.SystemToast.startTime = value; }

// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public static java.util.List lines() { return net.minecraft.client.toast.SystemToast.lines; }
// public static void lines(java.util.List value, ) { net.minecraft.client.toast.SystemToast.lines = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.client.toast.SystemToast.width; }
// public static void width(int value, ) { net.minecraft.client.toast.SystemToast.width = value; }

// public int MIN_WIDTH() { return wrapperContained.MIN_WIDTH; }
// public void MIN_WIDTH(int value) { wrapperContained.MIN_WIDTH = value; }
// public static int MIN_WIDTH() { return net.minecraft.client.toast.SystemToast.MIN_WIDTH; }
// public static void MIN_WIDTH(int value, ) { net.minecraft.client.toast.SystemToast.MIN_WIDTH = value; }

// public int LINE_HEIGHT() { return wrapperContained.LINE_HEIGHT; }
// public void LINE_HEIGHT(int value) { wrapperContained.LINE_HEIGHT = value; }
// public static int LINE_HEIGHT() { return net.minecraft.client.toast.SystemToast.LINE_HEIGHT; }
// public static void LINE_HEIGHT(int value, ) { net.minecraft.client.toast.SystemToast.LINE_HEIGHT = value; }

// public int PADDING_Y() { return wrapperContained.PADDING_Y; }
// public void PADDING_Y(int value) { wrapperContained.PADDING_Y = value; }
// public static int PADDING_Y() { return net.minecraft.client.toast.SystemToast.PADDING_Y; }
// public static void PADDING_Y(int value, ) { net.minecraft.client.toast.SystemToast.PADDING_Y = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.toast.SystemToast.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.toast.SystemToast.TEXTURE = value.wrapperContained; }

// public boolean hidden() { return wrapperContained.hidden; }
// public void hidden(boolean value) { wrapperContained.hidden = value; }
// public static boolean hidden() { return net.minecraft.client.toast.SystemToast.hidden; }
// public static void hidden(boolean value, ) { net.minecraft.client.toast.SystemToast.hidden = value; }

// public Object visibility() { return wrapperContained.visibility; }
// // public void visibility(Object value) { wrapperContained.visibility = value; }
// // public static Object visibility() { return net.minecraft.client.toast.SystemToast.visibility; }
// // public static void visibility(Object value, ) { net.minecraft.client.toast.SystemToast.visibility = value; }

// public SystemToast(Object type,yarnwrap.text.Text title,java.util.List lines,int width) { this.wrapperContained = new net.minecraft.client.toast.SystemToast(type,title.wrapperContained,lines,width); }
// public SystemToast(Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { this.wrapperContained = new net.minecraft.client.toast.SystemToast(type,title.wrapperContained,description.wrapperContained); }
// public void show(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.show(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
// public static void show(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description, ) { net.minecraft.client.toast.SystemToast.show(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
public void setContent(yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.setContent(title.wrapperContained,description.wrapperContained); }
// public static void setContent(yarnwrap.text.Text title,yarnwrap.text.Text description, ) { net.minecraft.client.toast.SystemToast.setContent(title.wrapperContained,description.wrapperContained); }
// public void addWorldAccessFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName) { wrapperContained.addWorldAccessFailureToast(client.wrapperContained,worldName); }
// public static void addWorldAccessFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName, ) { net.minecraft.client.toast.SystemToast.addWorldAccessFailureToast(client.wrapperContained,worldName); }
// public void add(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { wrapperContained.add(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
// public static void add(yarnwrap.client.toast.ToastManager manager,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description, ) { net.minecraft.client.toast.SystemToast.add(manager.wrapperContained,type,title.wrapperContained,description.wrapperContained); }
// public void addWorldDeleteFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName) { wrapperContained.addWorldDeleteFailureToast(client.wrapperContained,worldName); }
// public static void addWorldDeleteFailureToast(yarnwrap.client.MinecraftClient client,java.lang.String worldName, ) { net.minecraft.client.toast.SystemToast.addWorldDeleteFailureToast(client.wrapperContained,worldName); }
// public yarnwrap.client.toast.SystemToast create(yarnwrap.client.MinecraftClient client,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description) { return new yarnwrap.client.toast.SystemToast(wrapperContained.create(client.wrapperContained,type,title.wrapperContained,description.wrapperContained)); }
// public static yarnwrap.client.toast.SystemToast create(yarnwrap.client.MinecraftClient client,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description, ) { return new yarnwrap.client.toast.SystemToast(net.minecraft.client.toast.SystemToast.create(client.wrapperContained,type,title.wrapperContained,description.wrapperContained)); }
// public com.google.common.collect.ImmutableList getTextAsList(yarnwrap.text.Text text) { return wrapperContained.getTextAsList(text.wrapperContained); }
// public static com.google.common.collect.ImmutableList getTextAsList(yarnwrap.text.Text text, ) { return net.minecraft.client.toast.SystemToast.getTextAsList(text.wrapperContained); }
// public void addPackCopyFailure(yarnwrap.client.MinecraftClient client,java.lang.String directory) { wrapperContained.addPackCopyFailure(client.wrapperContained,directory); }
// public static void addPackCopyFailure(yarnwrap.client.MinecraftClient client,java.lang.String directory, ) { net.minecraft.client.toast.SystemToast.addPackCopyFailure(client.wrapperContained,directory); }
// public void hide(yarnwrap.client.toast.ToastManager manager,Object type) { wrapperContained.hide(manager.wrapperContained,type); }
// public static void hide(yarnwrap.client.toast.ToastManager manager,Object type, ) { net.minecraft.client.toast.SystemToast.hide(manager.wrapperContained,type); }
public void hide() { wrapperContained.hide(); }
// public static void hide() { net.minecraft.client.toast.SystemToast.hide(); }
// public void addLowDiskSpace(yarnwrap.client.MinecraftClient client) { wrapperContained.addLowDiskSpace(client.wrapperContained); }
// public static void addLowDiskSpace(yarnwrap.client.MinecraftClient client, ) { net.minecraft.client.toast.SystemToast.addLowDiskSpace(client.wrapperContained); }
// public void addChunkLoadFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addChunkLoadFailure(client.wrapperContained,pos.wrapperContained); }
// public static void addChunkLoadFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.client.toast.SystemToast.addChunkLoadFailure(client.wrapperContained,pos.wrapperContained); }
// public void addChunkSaveFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos) { wrapperContained.addChunkSaveFailure(client.wrapperContained,pos.wrapperContained); }
// public static void addChunkSaveFailure(yarnwrap.client.MinecraftClient client,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.client.toast.SystemToast.addChunkSaveFailure(client.wrapperContained,pos.wrapperContained); }
// public void addFileDropFailure(yarnwrap.client.MinecraftClient client,int count) { wrapperContained.addFileDropFailure(client.wrapperContained,count); }
// public static void addFileDropFailure(yarnwrap.client.MinecraftClient client,int count, ) { net.minecraft.client.toast.SystemToast.addFileDropFailure(client.wrapperContained,count); }

}