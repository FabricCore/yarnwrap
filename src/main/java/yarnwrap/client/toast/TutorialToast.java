package yarnwrap.client.toast;
public class TutorialToast { public net.minecraft.client.toast.TutorialToast wrapperContained; public TutorialToast(net.minecraft.client.toast.TutorialToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasProgressBar() { return wrapperContained.hasProgressBar; }
// public void hasProgressBar(boolean value) { wrapperContained.hasProgressBar = value; }
// public long lastTime() { return wrapperContained.lastTime; }
// public void lastTime(long value) { wrapperContained.lastTime = value; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public Object visibility() { return wrapperContained.visibility; }
// // public void visibility(Object value) { wrapperContained.visibility = value; }
// public float progress() { return wrapperContained.progress; }
// public void progress(float value) { wrapperContained.progress = value; }
// public float lastProgress() { return wrapperContained.lastProgress; }
// public void lastProgress(float value) { wrapperContained.lastProgress = value; }
public int PROGRESS_BAR_WIDTH() { return wrapperContained.PROGRESS_BAR_WIDTH; }
// public void PROGRESS_BAR_WIDTH(int value) { wrapperContained.PROGRESS_BAR_WIDTH = value; }
public int PROGRESS_BAR_HEIGHT() { return wrapperContained.PROGRESS_BAR_HEIGHT; }
// public void PROGRESS_BAR_HEIGHT(int value) { wrapperContained.PROGRESS_BAR_HEIGHT = value; }
public int PROGRESS_BAR_X() { return wrapperContained.PROGRESS_BAR_X; }
// public void PROGRESS_BAR_X(int value) { wrapperContained.PROGRESS_BAR_X = value; }
public int PROGRESS_BAR_Y() { return wrapperContained.PROGRESS_BAR_Y; }
// public void PROGRESS_BAR_Y(int value) { wrapperContained.PROGRESS_BAR_Y = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public void setProgress(float progress) { wrapperContained.setProgress(progress); }
public void hide() { wrapperContained.hide(); }

}