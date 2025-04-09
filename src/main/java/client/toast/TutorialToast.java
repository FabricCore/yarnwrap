package yarnwrap.client.toast;
public class TutorialToast { public net.minecraft.client.toast.TutorialToast wrapperContained; public TutorialToast(net.minecraft.client.toast.TutorialToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasProgressBar() { return wrapperContained.hasProgressBar; }
// public long lastTime() { return wrapperContained.lastTime; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public Object type() { return wrapperContained.type; }
// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public Object visibility() { return wrapperContained.visibility; }
// public float progress() { return wrapperContained.progress; }
// public float lastProgress() { return wrapperContained.lastProgress; }
public int PROGRESS_BAR_WIDTH() { return wrapperContained.PROGRESS_BAR_WIDTH; }
public int PROGRESS_BAR_HEIGHT() { return wrapperContained.PROGRESS_BAR_HEIGHT; }
public int PROGRESS_BAR_X() { return wrapperContained.PROGRESS_BAR_X; }
public int PROGRESS_BAR_Y() { return wrapperContained.PROGRESS_BAR_Y; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public void setProgress(float progress) { wrapperContained.setProgress(progress); }
public void hide() { wrapperContained.hide(); }

}