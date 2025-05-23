package yarnwrap.client.toast;
public class TutorialToast { public net.minecraft.client.toast.TutorialToast wrapperContained; public TutorialToast(net.minecraft.client.toast.TutorialToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasProgressBar() { return wrapperContained.hasProgressBar; }
// public void hasProgressBar(boolean value) { wrapperContained.hasProgressBar = value; }
// public static boolean hasProgressBar() { return net.minecraft.client.toast.TutorialToast.hasProgressBar; }
// public static void hasProgressBar(boolean value, ) { net.minecraft.client.toast.TutorialToast.hasProgressBar = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.toast.TutorialToast.type; }
// // public static void type(Object value, ) { net.minecraft.client.toast.TutorialToast.type = value; }

// public Object visibility() { return wrapperContained.visibility; }
// // public void visibility(Object value) { wrapperContained.visibility = value; }
// // public static Object visibility() { return net.minecraft.client.toast.TutorialToast.visibility; }
// // public static void visibility(Object value, ) { net.minecraft.client.toast.TutorialToast.visibility = value; }

// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public static float progress() { return net.minecraft.client.toast.TutorialToast.progress; }
// public static void progress(float value, ) { net.minecraft.client.toast.TutorialToast.progress = value; }

// public int PROGRESS_BAR_WIDTH() { return wrapperContained.PROGRESS_BAR_WIDTH; }
// public void PROGRESS_BAR_WIDTH(int value) { wrapperContained.PROGRESS_BAR_WIDTH = value; }
public static int PROGRESS_BAR_WIDTH() { return net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_WIDTH; }
// public static void PROGRESS_BAR_WIDTH(int value, ) { net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_WIDTH = value; }

// public int PROGRESS_BAR_HEIGHT() { return wrapperContained.PROGRESS_BAR_HEIGHT; }
// public void PROGRESS_BAR_HEIGHT(int value) { wrapperContained.PROGRESS_BAR_HEIGHT = value; }
public static int PROGRESS_BAR_HEIGHT() { return net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_HEIGHT; }
// public static void PROGRESS_BAR_HEIGHT(int value, ) { net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_HEIGHT = value; }

// public int PROGRESS_BAR_X() { return wrapperContained.PROGRESS_BAR_X; }
// public void PROGRESS_BAR_X(int value) { wrapperContained.PROGRESS_BAR_X = value; }
public static int PROGRESS_BAR_X() { return net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_X; }
// public static void PROGRESS_BAR_X(int value, ) { net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_X = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.toast.TutorialToast.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.toast.TutorialToast.TEXTURE = value.wrapperContained; }

// public long lastTime() { return wrapperContained.lastTime; }
// public void lastTime(long value) { wrapperContained.lastTime = value; }
// public static long lastTime() { return net.minecraft.client.toast.TutorialToast.lastTime; }
// public static void lastTime(long value, ) { net.minecraft.client.toast.TutorialToast.lastTime = value; }

// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
// public static float lastProgress() { return net.minecraft.client.toast.TutorialToast.lastProgress; }
// public static void lastProgress(float value, ) { net.minecraft.client.toast.TutorialToast.lastProgress = value; }

// public int displayDuration() { return wrapperContained.displayDuration; }
// public void displayDuration(int value) { wrapperContained.displayDuration = value; }
// public static int displayDuration() { return net.minecraft.client.toast.TutorialToast.displayDuration; }
// public static void displayDuration(int value, ) { net.minecraft.client.toast.TutorialToast.displayDuration = value; }

// public java.util.List text() { return wrapperContained.text; }
// public void text(java.util.List value) { wrapperContained.text = value; }
// public static java.util.List text() { return net.minecraft.client.toast.TutorialToast.text; }
// public static void text(java.util.List value, ) { net.minecraft.client.toast.TutorialToast.text = value; }

// public TutorialToast(yarnwrap.client.font.TextRenderer textRenderer,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description,boolean hasProgressBar) { this.wrapperContained = new net.minecraft.client.toast.TutorialToast(textRenderer.wrapperContained,type,title.wrapperContained,description.wrapperContained,hasProgressBar); }
// public TutorialToast(yarnwrap.client.font.TextRenderer textRenderer,Object type,yarnwrap.text.Text title,yarnwrap.text.Text description,boolean hasProgressBar,int displayDuration) { this.wrapperContained = new net.minecraft.client.toast.TutorialToast(textRenderer.wrapperContained,type,title.wrapperContained,description.wrapperContained,hasProgressBar,displayDuration); }
public void setProgress(float progress) { wrapperContained.setProgress(progress); }
// public static void setProgress(float progress, ) { net.minecraft.client.toast.TutorialToast.setProgress(progress); }
public void hide() { wrapperContained.hide(); }
// public static void hide() { net.minecraft.client.toast.TutorialToast.hide(); }
// public int getTextHeight() { return wrapperContained.getTextHeight(); }
// public static int getTextHeight() { return net.minecraft.client.toast.TutorialToast.getTextHeight(); }

}