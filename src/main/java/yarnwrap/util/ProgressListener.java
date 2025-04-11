package yarnwrap.util;
public class ProgressListener { public net.minecraft.util.ProgressListener wrapperContained; public ProgressListener(net.minecraft.util.ProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void progressStagePercentage(int percentage) { wrapperContained.progressStagePercentage(percentage); }
public void setDone() { wrapperContained.setDone(); }
public void setTitle(yarnwrap.text.Text title) { wrapperContained.setTitle(title.wrapperContained); }
public void setTitleAndTask(yarnwrap.text.Text title) { wrapperContained.setTitleAndTask(title.wrapperContained); }
public void setTask(yarnwrap.text.Text task) { wrapperContained.setTask(task.wrapperContained); }

}