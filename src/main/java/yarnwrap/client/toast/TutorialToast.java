package yarnwrap.client.toast;
public class TutorialToast { public net.minecraft.client.toast.TutorialToast wrapperContained; public TutorialToast(net.minecraft.client.toast.TutorialToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasProgressBar() { return wrapperContained.hasProgressBar; }
// public void hasProgressBar(boolean value) { wrapperContained.hasProgressBar = value; }
// public static boolean hasProgressBar() { return net.minecraft.client.toast.TutorialToast.hasProgressBar; }
// public static void hasProgressBar(boolean value, ) { net.minecraft.client.toast.TutorialToast.hasProgressBar = value; }

// public long lastTime() { return wrapperContained.lastTime; }
// public void lastTime(long value) { wrapperContained.lastTime = value; }
// public static long lastTime() { return net.minecraft.client.toast.TutorialToast.lastTime; }
// public static void lastTime(long value, ) { net.minecraft.client.toast.TutorialToast.lastTime = value; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.client.toast.TutorialToast.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.client.toast.TutorialToast.title = value.wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.toast.TutorialToast.type; }
// // public static void type(Object value, ) { net.minecraft.client.toast.TutorialToast.type = value; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.client.toast.TutorialToast.description); }
// public static void description(yarnwrap.text.Text value, ) { net.minecraft.client.toast.TutorialToast.description = value.wrapperContained; }

// public Object visibility() { return wrapperContained.visibility; }
// // public void visibility(Object value) { wrapperContained.visibility = value; }
// // public static Object visibility() { return net.minecraft.client.toast.TutorialToast.visibility; }
// // public static void visibility(Object value, ) { net.minecraft.client.toast.TutorialToast.visibility = value; }

// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public static float progress() { return net.minecraft.client.toast.TutorialToast.progress; }
// public static void progress(float value, ) { net.minecraft.client.toast.TutorialToast.progress = value; }

// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
// public static float lastProgress() { return net.minecraft.client.toast.TutorialToast.lastProgress; }
// public static void lastProgress(float value, ) { net.minecraft.client.toast.TutorialToast.lastProgress = value; }

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

// public int PROGRESS_BAR_Y() { return wrapperContained.PROGRESS_BAR_Y; }
// public void PROGRESS_BAR_Y(int value) { wrapperContained.PROGRESS_BAR_Y = value; }
public static int PROGRESS_BAR_Y() { return net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_Y; }
// public static void PROGRESS_BAR_Y(int value, ) { net.minecraft.client.toast.TutorialToast.PROGRESS_BAR_Y = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.toast.TutorialToast.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.toast.TutorialToast.TEXTURE = value.wrapperContained; }

// public TutorialToast(Object type,yarnwrap.text.Text title,yarnwrap.text.Text description,boolean hasProgressBar) { this.wrapperContained = new net.minecraft.client.toast.TutorialToast(type,title.wrapperContained,description.wrapperContained,hasProgressBar); }
public void setProgress(float progress) { wrapperContained.setProgress(progress); }
// public static void setProgress(float progress, ) { net.minecraft.client.toast.TutorialToast.setProgress(progress); }
public void hide() { wrapperContained.hide(); }
// public static void hide() { net.minecraft.client.toast.TutorialToast.hide(); }

}